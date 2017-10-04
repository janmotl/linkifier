package vendor;

import main.Column;
import main.Table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MSSQL implements Vendor {

	public void getTableStatistics(String databaseName, String schemaName, List<Table> tables, Connection connection) throws SQLException {

		// Requires VIEW DATABASE STATE permission
		// Other approaches how to get an estimate exist. But this approach is fast and reasonably accurate.
		String query = "SELECT OBJECT_NAME(object_id), sum(row_count) " +
				"FROM sys.dm_db_partition_stats " +
				"WHERE index_id < 2 " +
				"AND OBJECT_SCHEMA_NAME(object_id) = '" + schemaName + "' " +
				"GROUP BY object_id ";

		Map<String, Table> map = new HashMap<>();
		for (Table table : tables) {
			map.put(table.getName(), table);
		}

		try (Statement stmt = connection.createStatement();
		     ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				for (Column column : map.get(rs.getString(1)).getColumnList()) {
					column.setEstimatedRowCount(rs.getInt(2));
				}
			}
		}
	}

	// SLOW. Could use sys.dm_db_stats_histogram together with cross apply to get everything (with exception of avgWidth)..
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
				"\tRangeHiKey sql_variant,\n" +
				"\tRangeRow REAL,\n" +
				"\tEqRows REAL,\n" +
				"\tDistinctRangeRow BIGINT,\n" +
				"\tAvgRangeRow REAL\n" +
				"-- End\n" +
				")\n" +
				"\n" +
//				"DROP TABLE #Density\n" +
				"CREATE TABLE #Density\n" +
				"(\n" +
				"-- The result table\n" +
				"\tAllDensity REAL,\n" +
				"\tAvgLength REAL,\n" +
				"\tCOLUMNS NVARCHAR(4000)\n" +
				"-- End\n" +
				")\n" +
				"\n" +
//				"DROP TABLE #Result\n" +
				"CREATE TABLE #Result\n" +
				"(\n" +
				"-- The result table\n" +
				"\tTableName NVARCHAR(255),\n" +
				"\tCOLUMNS NVARCHAR(255),\n" +
				"\tStatName NVARCHAR(255),\n" +
				"\tMinValue NVARCHAR(255),\n" +
				"\tMaxValue NVARCHAR(255),\n" +
				"\tNullCount INT,\n" +
				"\tAllDensity REAL,\n" +
				"\tAvgLength REAL\n" +
				"-- End\n" +
				")\n" +
				"\n" +
				"DECLARE @TABLE_NAME VARCHAR(255)\n" +
				"DECLARE @STAT_NAME VARCHAR(255)  \n" +
				"DECLARE MY_CURSOR CURSOR  \n" +
				"LOCAL STATIC READ_ONLY FORWARD_ONLY\n" +
				"FOR\n" +
				"-- The table with the variable\n" +
				"\tSELECT TABLES.TABLE_NAME\n" +
				"\t\t, stats.name\n" +
				"\tFROM sys.stats\n" +
				"\tJOIN INFORMATION_SCHEMA.TABLES\n" +
				"\tON OBJECT_NAME(stats.object_id)=TABLES.TABLE_NAME\n" +
				"\tWHERE TABLES.TABLE_SCHEMA = '" + schemaName +"'\n" +
				"\tAND TABLES.TABLE_CATALOG = '" + databaseName +"'\n" +
				"-- End\n" +
				"\n" +
				"OPEN MY_CURSOR\n" +
				"FETCH NEXT FROM MY_CURSOR INTO @TABLE_NAME, @STAT_NAME\n" +
				"WHILE @@FETCH_STATUS = 0 \n" +
				"BEGIN\n" +
				"-- Our select statement (here you can do whatever work you wish)\n" +
				"\tINSERT INTO #Density \n" +
				"\texec('DBCC SHOW_STATISTICS (\"" + schemaName + ".' + @TABLE_NAME + '\", ' + @STAT_NAME + ') with DENSITY_VECTOR')\n" +
				"\n" +
				"\tINSERT INTO #Histogram \n" +
				"\texec('DBCC SHOW_STATISTICS (\"" + schemaName + ".' + @TABLE_NAME + '\", ' + @STAT_NAME + ') with HISTOGRAM')\n" +
				"\n" +
				" \tINSERT INTO #Result\n" +
				" \tSELECT @TABLE_NAME AS TableName\n" +
				" \t\t, #Density.Columns\n" +
				" \t\t, @STAT_NAME AS StatName\n" +
				" \t\t, cast(minimum.minValue as nvarchar(255))\n" +
				" \t\t, cast(maximum.maxValue as nvarchar(255))\n" +
				" \t\t, coalesce(nullCounter.nullCount, 0)\n" +
				"\t\t, #Density.AllDensity\n" +
				"\t\t, #Density.AvgLength\n" +
				" \tFROM #Density, (\n" +
				" \t\tselect top 1 RangeHiKey AS minValue\n" +
				" \t\tFROM #Histogram where RangeHiKey is not null \n" +
				" \t) minimum, (\n" +
				" \t\tSELECT max(RangeHiKey) AS MAXVALUE\n" +
				" \t\tFROM #Histogram\n" +
				" \t) maximum , (\n" +
				"\t\tselect coalesce((\n" +
				"\t\t\tselect EqRows \n" +
				"\t\t\tFROM #Histogram\n" +
				"\t\t\twhere RangeHiKey is null)\n" +
				"\t\t, 0) AS nullCount\n" +
				"\t) nullCounter\n" +
				"\n" +
				" \tDELETE FROM #Density\n" +
				" \tdelete FROM #Histogram\n" +
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
		query = "SELECT DISTINCT \n" +
				"\t   result.TableName,\n" +
				"\t   result.Columns,\n" +
				"\t   result.MinValue,\n" +
				"\t   result.MaxValue,\n" +
				"\t   result.NullCount,\n" +
				"\t   result.AllDensity,\n" +
				"\t   result.AvgLength\n" +
				"FROM #Result result\n" +
				"JOIN INFORMATION_SCHEMA.COLUMNS\n" +
				"ON result.TableName=COLUMNS.TABLE_NAME AND result.Columns=COLUMNS.COLUMN_NAME\n" +
				"ORDER BY 1,2";

		try (Statement stmt = connection.createStatement();
		     ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				Table table = tableMap.get(rs.getString(1));
				Column column = table.getColumn(rs.getString(2));
				column.setTextMin(rs.getString(3));
				column.setTextMax(rs.getString(4));
				column.setNullRatio(rs.getDouble(5) / column.getRowCount());
				column.setUniqueRatio((1/rs.getDouble(6)) / column.getRowCount());
				column.setWidthAvg(rs.getDouble(7));
			}
		}

		// Output quality control (if something turns sour, we want to know about that)
		QualityControl.qcNumericalValues(tables);
	}








}