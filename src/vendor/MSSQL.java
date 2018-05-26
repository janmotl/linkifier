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
	// Nulls in MSSQL affect UniqueRatio. But nulls in MySQL are excluded from calculation of UniqueRatio.
	public void getColumnStatistics(String databaseName, String schemaName, List<Table> tables, Connection connection) throws SQLException {

		String query = "-- For each loop.\n" +
				"-- It executes queries for each row in a table. The results are stored into temporary tables.   \n" +
//				"DROP TABLE #Histogram\n" +
				"CREATE TABLE #Histogram\n" +
				"(\n" +
				"-- The output table\n" +
				"  RangeHiKey sql_variant,\n" +
				"  RangeRow REAL,\n" +
				"  EqRows REAL,\n" +
				"  DistinctRangeRow BIGINT,\n" +
				"  AvgRangeRow REAL\n" +
				"-- End\n" +
				")\n" +
				"\n" +
//				"DROP TABLE #Density\n" +
				"CREATE TABLE #Density\n" +
				"(\n" +
				"-- The result table\n" +
				"  AllDensity REAL,\n" +
				"  AvgLength REAL,\n" +
				"  COLUMNS NVARCHAR(4000)\n" +
				"-- End\n" +
				")\n" +
				"\n" +
//				"DROP TABLE #Result\n" +
				"CREATE TABLE #Result\n" +
				"(\n" +
				"-- The result table\n" +
				"  TableName NVARCHAR(255),\n" +
				"  COLUMNS NVARCHAR(255),\n" +
				"  StatName NVARCHAR(255),\n" +
				"  MinValue NVARCHAR(255),\n" +
				"  MaxValue NVARCHAR(255),\n" +
				"  NullCount INT,\n" +
				"  AllDensity REAL,\n" +
				"  AvgLength REAL\n" +
				"-- End\n" +
				")\n" +
				"\n" +
				"DECLARE @TABLE_NAME VARCHAR(255)\n" +
				"DECLARE @STAT_NAME VARCHAR(255)  \n" +
				"DECLARE MY_CURSOR CURSOR  \n" +
				"LOCAL STATIC READ_ONLY FORWARD_ONLY\n" +
				"FOR\n" +
				"-- The table with the variable\n" +
				"  SELECT TABLES.TABLE_NAME\n" +
				"    , stats.name\n" +
				"  FROM sys.stats\n" +
				"  JOIN INFORMATION_SCHEMA.TABLES\n" +
				"  ON OBJECT_NAME(stats.object_id)=TABLES.TABLE_NAME\n" +
				"  WHERE TABLES.TABLE_SCHEMA = '" + schemaName +"'\n" +
				"  AND TABLES.TABLE_CATALOG = '" + databaseName +"'\n" +
				"-- End\n" +
				"\n" +
				"OPEN MY_CURSOR\n" +
				"FETCH NEXT FROM MY_CURSOR INTO @TABLE_NAME, @STAT_NAME\n" +
				"WHILE @@FETCH_STATUS = 0 \n" +
				"BEGIN\n" +
				"-- Our select statement \n" +
				"  INSERT INTO #Density \n" +
				"  exec('DBCC SHOW_STATISTICS (\"" + schemaName + ".' + @TABLE_NAME + '\", ' + @STAT_NAME + ') with DENSITY_VECTOR')\n" +
				"\n" +
				"  INSERT INTO #Histogram \n" +
				"  exec('DBCC SHOW_STATISTICS (\"" + schemaName + ".' + @TABLE_NAME + '\", ' + @STAT_NAME + ') with HISTOGRAM')\n" +
				"\n" +
				"   INSERT INTO #Result\n" +
				"   SELECT @TABLE_NAME AS TableName\n" +
				"     , #Density.Columns\n" +
				"     , @STAT_NAME AS StatName\n" +
				"     , cast(minimum.minValue as nvarchar(255))\n" +
				"     , cast(maximum.maxValue as nvarchar(255))\n" +
				"     , coalesce(nullCounter.nullCount, 0)\n" +
				"    , #Density.AllDensity\n" +
				"    , #Density.AvgLength\n" +
				"   FROM #Density, (\n" +
				"     select top 1 RangeHiKey AS minValue\n" +
				"     FROM #Histogram where RangeHiKey is not null \n" +
				"   ) minimum, (\n" +
				"     SELECT max(RangeHiKey) AS MAXVALUE\n" +
				"     FROM #Histogram\n" +
				"   ) maximum , (\n" +
				"    select coalesce((\n" +
				"      select EqRows \n" +
				"      FROM #Histogram\n" +
				"      where RangeHiKey is null)\n" +
				"    , 0) AS nullCount\n" +
				"  ) nullCounter\n" +
				"\n" +
				"   DELETE FROM #Density\n" +
				"   DELETE FROM #Histogram\n" +
				"-- End\n" +
				"FETCH NEXT FROM MY_CURSOR INTO @TABLE_NAME, @STAT_NAME\n" +
				"END\n" +
				"CLOSE MY_CURSOR  \n" +
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
		query = "SELECT DISTINCT  " +
				"   result.TableName, " +
				"   result.Columns, " +
				"   result.MinValue, " +
				"   result.MaxValue, " +
				"   result.NullCount, " +
				"   result.AllDensity, " +
				"   result.AvgLength " +
				"FROM #Result result " +
				"JOIN INFORMATION_SCHEMA.COLUMNS " +
				"ON result.TableName=COLUMNS.TABLE_NAME AND result.Columns=COLUMNS.COLUMN_NAME " +
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
				column.setNullRatio((column.getRowCount()==null || column.getRowCount()==0) ? null : rs.getDouble(5) / column.getRowCount());
				column.setUniqueRatio(column.getRowCount()==null || column.getRowCount()==0 ? null : (1/rs.getDouble(6)) / column.getRowCount());
				// Azure counts nulls in widthAvg. But for FK-PK match detection it is better to exclude nulls from widthAvg
				// as PK should not contain nulls but FK may contain nulls.
				// WidthAvgWithoutNulls = widthAvg/(1-nullRatio)
				column.setWidthAvg(column.getNullRatio()==null || column.getNullRatio()==1 ? null : rs.getDouble(7)/(1-column.getNullRatio()));
			}
		}

		// Output quality control (if something turns sour, we want to know about that)
		QualityControl.qcNumericalValues(tables);
	}
}