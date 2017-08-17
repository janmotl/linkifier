package example;

import export.Justification;
import export.SQL;
import main.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

// Public API
public class Linkifier {
	private final Connection connection;
	private final String schemaName;
	private final char leftQuote;
	private final char rightQuote;
	private List<Table> tables;
	private List<Relationship> relationships;
	private int fkCount;
	private List<CompoundRelationship> compoundRelationships;

	// Note: The constructor could directly call private estimatePk() and estimateFk().
	// That way we could be sure no one gets null-pointer exception just because they forgot to call these
	// two methods in the correct order.
	public Linkifier(Connection connection, String schemaName) throws SQLException {
		this.connection = connection;
		this.schemaName = schemaName;

		String identifierQuote = "\"\"";
		identifierQuote = connection.getMetaData().getIdentifierQuoteString();
		leftQuote = identifierQuote.charAt(0);
		if (identifierQuote.length() > 1) {
			rightQuote = identifierQuote.charAt(1);
		} else {
			rightQuote = identifierQuote.charAt(0);
		}
	}

	// Estimation
	public void estimatePk() throws SQLException {
		tables = Schema.getPrimaryKeys(connection, connection.getCatalog(), schemaName);
		tables = Optimization.optimize(tables);
	}

	public void estimateFk() throws SQLException, InterruptedException {
		relationships = Schema.getRelationships(connection, connection.getCatalog(), schemaName, tables, false);
		fkCount = OptimizationRelationship.optimize(relationships, tables);
		compoundRelationships = CompoundRelationship.buildFrom(relationships);
	}

	// Export
	public void export(File file, String description) throws FileNotFoundException, UnsupportedEncodingException {
		if (file.getName().endsWith(".tgf")) {
			export.TGF.writeGraph(file, tables, compoundRelationships);
		} else if (file.getName().endsWith(".graphml")) {
			export.GraphML.writeGraph(file, tables, relationships);
		} else if (file.getName().endsWith(".ddl")) {
			export.DDL.writeGraph(file, tables, compoundRelationships);
		} else if (file.getName().endsWith(".sql")) {
			SQL.writeGraph(file, tables, compoundRelationships, leftQuote, rightQuote);
		} else if (file.getName().endsWith(".csv") && "CSV for PK".equals(description)) {
			export.CSV.writePk(file, tables);
		} else if (file.getName().endsWith(".csv") && "CSV for FK".equals(description)) {
			export.CSV.writeFk(file, relationships);
		} else if (file.getName().endsWith(".csv") && "Decision justification for PK".equals(description)) {
			Justification.writePk(file, tables);
		} else if (file.getName().endsWith(".csv") && "Decision justification for FK".equals(description)) {
			Justification.writeFk(file, relationships);
		}
	}


	// Boring getters
	public int getFkCount() {
		return fkCount;
	}

	public int getPkCount() {
		return tables.size();
	}

	public List<Relationship> getRelationships() {
		return relationships;
	}

	public List<Table> getTables() {
		return tables;
	}
}
