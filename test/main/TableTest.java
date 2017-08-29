
package main;

import org.junit.Test;

public class TableTest {

	// Note: This method should be private or refactored if possible to NOT throw the exceptions.
	@Test (expected = IllegalStateException.class)
	public void toQuery() {
		Table table0 = new Table("schemaName", "tableName");
		table0.toQuery('`', '`');
	}

	@Test (expected = IllegalArgumentException.class)
	public void getHeader() {
		Table.getHeader(null);
	}
}
