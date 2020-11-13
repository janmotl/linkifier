package example;

import main.*;
import vendor.Vendor;
import vendor.VendorFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidParameterException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Pattern;

// Public API
public class Linkifier {
	private final Connection connection;
	private final String schemaName;
	private final Pattern tableBlacklist;
	private final boolean ignoreKnownFK;
	private final char leftQuote;
	private final char rightQuote;
	private List<Table> tables;
	private List<Relationship> relationships;
	private int fkCount;
	private List<CompoundRelationship> compoundRelationships;
	private final static Logger LOGGER = Logger.getLogger(Linkifier.class.getName());

	// Note: The constructor could directly call private estimatePk() and estimateFk().
	// That way we could be sure no one gets null-pointer exception just because they forgot to call these
	// two methods in the correct order.
	public Linkifier(Connection connection, String schemaName, Pattern tableBlacklist, boolean ignoreKnownFK) throws SQLException {
		this.connection = connection;
		this.schemaName = schemaName;
		this.tableBlacklist = tableBlacklist;
		this.ignoreKnownFK = ignoreKnownFK;

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
		relationships = Schema.getRelationships(connection, connection.getCatalog(), schemaName, tables, ignoreKnownFK, false);
		fkCount = OptimizationRelationship.optimize(relationships, tables);
		compoundRelationships = CompoundRelationship.buildFrom(relationships);
	}

	public void validateFk() throws SQLException, InterruptedException {
		Vendor vendor = VendorFactory.getVendor(connection.getMetaData().getDatabaseProductName());

		for (int i = 0; i < 10; i++) {
			LOGGER.info("Validating the candidate foreign key constraints. This may take a while. Iteration " + i + ".");
			boolean isOk = true;
			for (Relationship relationship : relationships) {
				if (relationship.isEstimatedFk() && "untested".equals(relationship.getSatisfiesFKConstraint())) {
					vendor.validateFkConstraint(relationship, connection, leftQuote, rightQuote, 20);
					if ("false".equals(relationship.getSatisfiesFKConstraint())) {
						LOGGER.info(String.format(Locale.ROOT, "Found a foreign key violation (estimated prob: %1.3f) in %s.", relationship.getForeignKeyProbability(), relationship));
						relationship.setEstimatedFk(false);
						isOk = false;
					}
				}
			}
			if (isOk) {
				return;
			} else {
				fkCount = OptimizationRelationship.optimize(relationships, tables);
				compoundRelationships = CompoundRelationship.buildFrom(relationships);
			}
		}

		LOGGER.warning("Exhausted the limit of validation repeats. It looks like we have at least one false positive FKC, which has high probability of being FKC and which cannot be ruled out by the validation. Since this portable implementation of Linkifier uses greedy optimization instead of ILP, we do not have the means to find that false positive.");
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
