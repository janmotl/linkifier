package example;

import main.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidParameterException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.regex.Pattern;

// Public API
public class Linkifier {
	private final Connection connection;
	private final String schemaName;
	private final Pattern tableBlacklist;
	private final char leftQuote;
	private final char rightQuote;
	private List<Table> tables;
	private List<Relationship> relationships;
	private int fkCount;
	private List<CompoundRelationship> compoundRelationships;

	// Note: The constructor could directly call private estimatePk() and estimateFk().
	// That way we could be sure no one gets null-pointer exception just because they forgot to call these
	// two methods in the correct order.
	public Linkifier(Connection connection, String schemaName, Pattern tableBlacklist) throws SQLException {
		this.connection = connection;
		this.schemaName = schemaName;
		this.tableBlacklist = tableBlacklist;

		String identifierQuote = connection.getMetaData().getIdentifierQuoteString();
		leftQuote = identifierQuote.charAt(0);
		if (identifierQuote.length() > 1) {
			rightQuote = identifierQuote.charAt(1);
		} else {
			rightQuote = identifierQuote.charAt(0);
		}
	}

	// Estimation
	public void estimatePk() throws SQLException {
		tables = Schema.getPrimaryKeys(connection, connection.getCatalog(), schemaName, tableBlacklist);
		Optimization.optimize(tables);
	}

	public void estimateFk() throws SQLException, InterruptedException {
		relationships = Schema.getRelationships(connection, connection.getCatalog(), schemaName, tables, false);
		fkCount = OptimizationRelationship.optimize(relationships, tables);
		compoundRelationships = CompoundRelationship.buildFrom(relationships);
	}

	// Export
	public void export(File file, String description) throws FileNotFoundException, UnsupportedEncodingException {
		if ("GraphML (yEd)".equals(description)) {
			export.GraphML.writeGraph(file, tables, relationships);
		} else if ("TGF (yEd)".equals(description)) {
			export.TGF.writeGraph(file, tables, compoundRelationships);
		} else if ("DDL (Oracle Data Modeler)".equals(description)) {
			export.DDL.writeGraph(file, tables, compoundRelationships);
		} else if ("SQL with alter queries".equals(description)) {
			export.SQL.writeGraph(file, tables, compoundRelationships, leftQuote, rightQuote);
		} else if ("CSV for PK".equals(description)) {
			export.CSV.writePk(file, tables);
		} else if ("CSV for FK".equals(description)) {
			export.CSV.writeFk(file, relationships);
		} else if ("Decision justification for PK".equals(description)) {
			export.Justification.writePk(file, tables);
		} else if ("Decision justification for FK".equals(description)) {
			export.Justification.writeFk(file, relationships);
		} else {
			throw new InvalidParameterException("The description: " + description + " is not among the supported descriptions.");
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
