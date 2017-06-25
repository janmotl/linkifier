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

public class Oracle implements Vendor {

	public void getTableStatistics(String databaseName, String schemaName, List<Table> tables, Connection connection) throws SQLException {
		String query = "select TABLE_NAME, NUM_ROWS from ALL_TABLES where OWNER = '" + schemaName + "'";

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

	// Note when comparing to financial dataset from MySQL:
	// 	1) Oracle treats empty strings as nulls (at least during import)... -> order.k_symbol contains nulls on Oracle
	//	2) All numbers are ported as numeric(*) -> numbers are not constrained and detection of decimals does not work
	public void getColumnStatistics(String databaseName, String schemaName, List<Table> tables, Connection connection) throws SQLException {

		// Create raw->data_type conversion stored functions.
		// See:
		// 	https://jonathanlewis.wordpress.com/2006/11/29/low_value-high_value/
		//  https://ardentperf.com/2013/11/19/convert-rawhex-to-timestamp/
		//	http://dbcrusade.blogspot.cz/2008/08/oracle-resolving-ora-29275-partial.html
		// NOTE: It is unpleasing that we have to have a privilege to create the stored functions.
		String query = "create or replace function raw_to_num(i_raw raw)\n" +
				"return number\n" +
				"as\n" +
				"    m_n number;\n" +
				"begin\n" +
				"    dbms_stats.convert_raw_value(i_raw,m_n);\n" +
				"    return m_n;\n" +
				"end;\n" +
				"  ";

		try (Statement stmt = connection.createStatement()) {
			stmt.execute(query);
		}

		query = "create or replace function raw_to_date(i_raw raw)\n" +
				"return date\n" +
				"as\n" +
				"    m_n date;\n" +
				"begin\n" +
				"    dbms_stats.convert_raw_value(i_raw,m_n);\n" +
				"    return m_n;\n" +
				"end;\n" +
				" ";

		try (Statement stmt = connection.createStatement()) {
			stmt.execute(query);
		}

		query = "create or replace function raw_to_varchar2(i_raw raw)\n" +
				"return varchar2\n" +
				"as\n" +
				"    m_n varchar2(40);\n" +
				"begin\n" +
				"    dbms_stats.convert_raw_value(i_raw,m_n);\n" +
				"    return m_n;\n" +
				"end;\n" +
				" ";

		try (Statement stmt = connection.createStatement()) {
			stmt.execute(query);
		}

		query = "create or replace function raw_to_nvarchar2(i_raw raw)\n" +
				"return nvarchar2\n" +
				"as\n" +
				"    m_n nvarchar2(20);\n" +
				"begin\n" +
				"    dbms_stats.convert_raw_value_nvarchar(i_raw,m_n);\n" +
				"    return m_n;\n" +
				"end;\n" +
				" ";

		try (Statement stmt = connection.createStatement()) {
			stmt.execute(query);
		}

		query = "create or replace function raw_to_float(i_raw raw)\n" +
				"return float\n" +
				"as\n" +
				"    m_n float;\n" +
				"begin\n" +
				"    dbms_stats.convert_raw_value(i_raw,m_n);\n" +
				"    return m_n;\n" +
				"end;\n" +
				"";

		try (Statement stmt = connection.createStatement()) {
			stmt.execute(query);
		}

		query = "create or replace function raw_to_timestamp(p_str in VARCHAR2)\n" +
				"return timestamp\n" +
				"as\n" +
				"begin\n" +
				"\t\t\t\treturn to_timestamp(\n" +
				"        to_char( to_number( substr( p_str, 1, 2 ), 'xx' ) - 100, 'fm00' ) ||\n" +
				"        to_char( to_number( substr( p_str, 3, 2 ), 'xx' ) - 100, 'fm00' ) ||\n" +
				"        to_char( to_number( substr( p_str, 5, 2 ), 'xx' ), 'fm00' ) ||\n" +
				"        to_char( to_number( substr( p_str, 7, 2 ), 'xx' ), 'fm00' ) ||\n" +
				"        to_char( to_number( substr( p_str,9, 2 ), 'xx' )-1, 'fm00' ) ||\n" +
				"        to_char( to_number( substr( p_str,11, 2 ), 'xx' )-1, 'fm00' ) ||\n" +
				"        to_char( to_number( substr( p_str,13, 2 ), 'xx' )-1, 'fm00' ), 'yyyymmddhh24miss' );\n" +
				"end;\n" +
				" ";

		try (Statement stmt = connection.createStatement()) {
			stmt.execute(query);
		}



		// All to string
		String decodeLow = "case \n" +
				"\t\t\t\t\t\t\t\twhen data_type = 'NVARCHAR2' then to_char(raw_to_nvarchar2(low_value))\n" +
				"                when data_type = 'VARCHAR2' then to_char(raw_to_varchar2(low_value)||'')\n" +
				"\t\t\t\t\t\t\t\twhen data_type = 'CHAR' then to_char(raw_to_varchar2(low_value))\n" +
				"                when data_type = 'DATE' then to_char(raw_to_date(low_value), 'YYYYMMDD')\n" +
				"                when data_type = 'NUMBER' then to_char(raw_to_num(low_value))\n" +
				"\t\t\t\t\t\t\t\twhen data_type = 'FLOAT' then to_char(raw_to_float(low_value))\n" +
				"\t\t\t\t\t\t\t\twhen data_type like 'TIMESTAMP%' then to_char(raw_to_timestamp(low_value), 'YYYYMMDDHH24MISS')\n" +
				" \t\t\t\t\t\t\t\telse to_char(raw_to_nvarchar2(low_value))\n" +
				"\t\t\t\tend";
		String decodeHigh = "case \n" +
				"\t\t\t\t\t\t\t\twhen data_type = 'NVARCHAR2' then to_char(raw_to_nvarchar2(high_value))\n" +
				"                when data_type = 'VARCHAR2' then to_char(raw_to_varchar2(high_value)||'')\n" +
				"\t\t\t\t\t\t\t\twhen data_type = 'CHAR' then to_char(raw_to_varchar2(high_value))\n" +
				"                when data_type = 'DATE' then to_char(raw_to_date(high_value), 'YYYYMMDD')\n" +
				"                when data_type = 'NUMBER' then to_char(raw_to_num(high_value))\n" +
				"\t\t\t\t\t\t\t\twhen data_type = 'FLOAT' then to_char(raw_to_float(high_value))\n" +
				"\t\t\t\t\t\t\t\twhen data_type like 'TIMESTAMP%' then to_char(raw_to_timestamp(high_value), 'YYYYMMDDHH24MISS')\n" +
				" \t\t\t\t\t\t\t\telse to_char(raw_to_nvarchar2(high_value))\n" +
				"\t\t\t\tend";

		query = "select TABLE_NAME, COLUMN_NAME, NUM_DISTINCT, " + decodeLow + " LOW_VALUE, " + decodeHigh + " HIGH_VALUE, NUM_NULLS, AVG_COL_LEN from SYS.ALL_TAB_COLUMNS where OWNER = '" + schemaName + "'";

		Map<String, Table> tableMap = new HashMap<>();
		for (Table table : tables) {
			tableMap.put(table.getName(), table);
		}

		try (Statement stmt = connection.createStatement();
		     ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				Table table = tableMap.get(rs.getString(1));
				Column column = table.getColumn(rs.getString(2));
				column.setUniqueRatio(rs.getDouble(3) / column.getRowCount());
				column.setTextMin(rs.getString(4));
				column.setTextMax(rs.getString(5));
				column.setNullRatio(rs.getDouble(6) / column.getRowCount());
				column.setWidthAvg(rs.getDouble(7));
			}
		}

	}
}
