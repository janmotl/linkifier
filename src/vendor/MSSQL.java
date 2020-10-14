package vendor;

import main.Column;
import main.Table;

import javax.annotation.Nullable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class MSSQL implements Vendor {

	private final static Logger LOGGER = Logger.getLogger(MSSQL.class.getName());

	public void getTableStatistics(String databaseName, String schemaName, List<Table> tables, Connection connection) throws SQLException {

		// Worse alternatives:
		// 1) sys.dm_db_partition_stats requires VIEW DATABASE STATE permission.
		// 2) sys.sysindexes is not supported by Azure.
		String query = "SELECT OBJECT_NAME(object_id), Rows " +
				       "FROM sys.partitions " +
				       "WHERE OBJECT_SCHEMA_NAME(object_id) = '" + schemaName + "' " +
				       "AND index_id < 2";

		Map<String, Table> map = new HashMap<>();
		for (Table table : tables) {
			map.put(table.getName(), table);
		}

		try (Statement stmt = connection.createStatement();
		     ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				Table table = map.get(rs.getString(1));
				if (table == null) continue; // The table is blacklisted -> skip it
				for (Column column : table.getColumnList()) {
					column.setEstimatedRowCount(rs.getLong(2));
				}
			}
		}
	}

	// SLOW. Could use sys.dm_db_stats_histogram together with cross apply to get everything (with exception of avgWidth).
	// But sys.dm_db_stats_histogram requires VIEW DATABASE STATE permission.
	// It returns different values than MySQL for columns containing null values (e.g. financial.trans.account).
	// Nulls in MSSQL decrease AvgWidth. But nulls in MySQL do not decrease AvgWidth.
	// We correct that by using: WidthAvgWithoutNulls = widthAvg/(1-nullRatio)
	// Note: Starting with MSSQL 2016, stat_header returns one more column: Persisted Sample Percent. That breaks
	// compatibility with the code for older versions of MSSQL -> I do not collect it.
	public void getColumnStatistics(String databaseName, String schemaName, List<Table> tables, Connection connection) throws SQLException {

		// We execute DBCC queries for each row in sys.stats.
		// Intermediate results are stored into temporary tables.
		String query = 
				"CREATE TABLE #Histogram " +
				"( " +
				"  RangeHiKey sql_variant, " +
				"  RangeRow REAL, " +
				"  EqRows REAL, " +
				"  DistinctRangeRow BIGINT, " +
				"  AvgRangeRow REAL " +
				") " +
						
				"CREATE TABLE #Density " +
				"( " +
				"  AllDensity REAL, " +
				"  AvgLength REAL, " +
				"  Columns NVARCHAR(4000) " +
				") " +

//				"CREATE TABLE #StatHeader  " +
//				"( " +
//				"    [Name]                  NVARCHAR(128), " +
//				"    [Updated]               NVARCHAR(20), " +
//				"    [Rows]                  BIGINT, " +
//				"    [Rows Sampled]          BIGINT, " +
//				"    [Steps]                 SMALLINT, " +
//				"    [Density]               REAL, " +
//				"    [Average key length]    REAL, " +
//				"    [String Index]          NCHAR(3), " +
//				"    [Filter Expression]     NVARCHAR(MAX), " +
//				"    [Unfiltered Rows]       BIGINT, " +
//				"    [Persisted Sample Percent] REAL " +
//				") " +

				"CREATE TABLE #Result " +
				"( " +
				"  TableName NVARCHAR(255), " +
				"  Columns NVARCHAR(255), " +
				"  StatName NVARCHAR(255), " +
				"  MinValue NVARCHAR(255), " +
				"  MaxValue NVARCHAR(255), " +
				"  NullCount INT, " +
				"  AllDensity REAL, " +
				"  AvgLength REAL " +
//				"  Updated DATETIME2," +
//              "  [Rows Sampled] BIGINT " +
				") " +
						
				"DECLARE @TABLE_NAME VARCHAR(255) " +
				"DECLARE @STAT_NAME VARCHAR(255)   " +
				"DECLARE MY_CURSOR CURSOR   " +
				"LOCAL STATIC READ_ONLY FORWARD_ONLY " +
				"FOR " +

				"  SELECT TABLES.TABLE_NAME " +
				"    , stats.name " +
				"  FROM sys.stats AS stats " +   // We have to define the alias (or use full sys.stats.name in the select). See issue #6.
				"  JOIN INFORMATION_SCHEMA.TABLES AS TABLES " +
				"  ON OBJECT_NAME(stats.object_id) = TABLES.TABLE_NAME " +
				"  WHERE TABLES.TABLE_SCHEMA = '" + schemaName +"' " +
				"  AND TABLES.TABLE_CATALOG = '" + databaseName +"' " +
						
				"OPEN MY_CURSOR " +
				"FETCH NEXT FROM MY_CURSOR INTO @TABLE_NAME, @STAT_NAME " +
				"WHILE @@FETCH_STATUS = 0  " +
				"BEGIN " +
				"  INSERT INTO #Density  " +
				"  exec('DBCC SHOW_STATISTICS (\"" + schemaName + ".' + @TABLE_NAME + '\", ' + @STAT_NAME + ') with DENSITY_VECTOR') " +
				
				"  INSERT INTO #Histogram  " +
				"  exec('DBCC SHOW_STATISTICS (\"" + schemaName + ".' + @TABLE_NAME + '\", ' + @STAT_NAME + ') with HISTOGRAM') " +

//				"  INSERT INTO #StatHeader  " +
//				"  exec('DBCC SHOW_STATISTICS (\"" + schemaName + ".' + @TABLE_NAME + '\", ' + @STAT_NAME + ') with STAT_HEADER') " +

				"   INSERT INTO #Result " +
				"   SELECT @TABLE_NAME AS TableName " +
				"     , #Density.Columns " +
				"     , @STAT_NAME AS StatName " +
				"     , cast(minimum.minValue as nvarchar(255)) " +
				"     , cast(maximum.maxValue as nvarchar(255)) " +
				"     , coalesce(nullCounter.nullCount, 0) " +
				"     , #Density.AllDensity " +
				"     , #Density.AvgLength " +
//				"     , cast(#StatHeader.Updated as datetime2) " +
//				"     , #StatHeader.[Rows Sampled] " +
				"   FROM #Density, ( " +
				"     select top 1 RangeHiKey AS minValue " +          // Histogram is sorted in ascending order with nulls at the top -> faster min()
				"     FROM #Histogram where RangeHiKey is not null  " +
				"   ) minimum, ( " +
				"     SELECT max(RangeHiKey) AS MAXVALUE " +
				"     FROM #Histogram " +
				"   ) maximum , ( " +
				"    select coalesce(( " +
				"      select EqRows  " +
				"      FROM #Histogram " +
				"      where RangeHiKey is null) " +
				"    , 0) AS nullCount " +
				"  ) nullCounter " +
				" " +
				"   DELETE FROM #Density " +
				"   DELETE FROM #Histogram " +
//				"   DELETE FROM #StatHeader " +

				"FETCH NEXT FROM MY_CURSOR INTO @TABLE_NAME, @STAT_NAME " +
				"END " +
				"CLOSE MY_CURSOR   " +
				"DEALLOCATE MY_CURSOR";

		Map<String, Table> tableMap = new HashMap<>();
		for (Table table : tables) {
			tableMap.put(table.getName(), table);
		}

		try (Statement stmt = connection.createStatement()){
			stmt.executeUpdate(query);
		}

		// Since statistics can be calculated for a set of columns, select only statistics at individual columns.
		// Since multiple statistics can be available for a single column, deduplicate the result.
		// Note: When the default database collation is different from the server default collation,
		//  system tables like INFORMATION_SCHEMA.COLUMNS are using server default collation,
		//  but newly created tables like #Result are using database default collation.
		//  An attempt to join varchar columns with different collation results into error:
		//      Cannot resolve the collation conflict between ...  in the equal to operation.
		//  A solution is to tell the database to read system tables with the database default collation.
		query = "SELECT DISTINCT  " +
				"   result.TableName, " +
				"   result.Columns, " +
				"   result.MinValue, " +
				"   result.MaxValue, " +
				"   result.NullCount, " +
				"   result.AllDensity, " +
				"   result.AvgLength " +
//				"   result.[Updated], " +
//				"   result.[Rows Sampled] " +
				"FROM #Result AS result " +
				"JOIN INFORMATION_SCHEMA.COLUMNS AS COLUMNS " +
				"ON result.TableName = COLUMNS.TABLE_NAME COLLATE DATABASE_DEFAULT " +
				"AND result.Columns = COLUMNS.COLUMN_NAME COLLATE DATABASE_DEFAULT " +
				"ORDER BY 1,2";

		try (Statement stmt = connection.createStatement();
		     ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				Table table = tableMap.get(rs.getString(1));
				if (table == null) continue; // The table is blacklisted -> skip it
				@Nullable Column column = table.getColumn(rs.getString(2));
				if (column == null) {
					LOGGER.fine("The database returned a column name that was not previously observed with getColumns() JDBC call");
					continue;
				}
				column.setTextMin(rs.getString(3));
				column.setTextMax(rs.getString(4));
				// We are working with estimates.
				// And MSSQL sometimes returns the estimated count of nulls > estimated count of rows.
				// This causes troubles in the estimate of WidthAvgWithoutNulls -> we cap the estimate.
				Double nullRatio = (column.getRowCount()==null || column.getRowCount()==0) ? null : rs.getDouble(5) / column.getRowCount();
				nullRatio = Math.min(Math.max(nullRatio, 0.0), 1.0);
				column.setNullRatio(nullRatio);
				// We preventively cap the unique ratio as well.
				Double uniqueRatio = column.getRowCount()==null || column.getRowCount()==0 ? null : (1/rs.getDouble(6)) / column.getRowCount();
				uniqueRatio = Math.min(Math.max(uniqueRatio, 0.0), 1.0);
				column.setUniqueRatio(uniqueRatio);
				// Azure counts nulls in widthAvg. But for FK-PK match detection it is better to exclude nulls from widthAvg
				// as PK should not contain nulls but FK may contain nulls.
				// WidthAvgWithoutNulls = widthAvg/(1-nullRatio)
				column.setWidthAvg(column.getNullRatio()==null || column.getNullRatio()==1 ? null : rs.getDouble(7)/(1-column.getNullRatio()));
//				column.setLastUpdated(rs.getTimestamp(8));
//				column.setRowsSampled(rs.getLong(9));
			}
		}

		// Output quality control (if something turns sour, we want to know about that)
		QualityControl.qcNumericalValues(tables);
	}
}