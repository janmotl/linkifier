
package main;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

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

	@Test
    public void isJunctionTable2() throws Exception {
        List<Table> tables = new ArrayList<>();
        tables.add(new Table("schema", "employee"));
        tables.add(new Table("schema", "address"));
        tables.add(new Table("schema", "employee_address"));
        tables.add(new Table("schema", "irrelevant"));
        tables.add(new Table("schema", "phony_table"));
        tables.add(new Table("schema", "apple_banana_cherry"));
        tables.add(new Table("schema", "employee_copy"));
        tables.add(new Table("schema", "long_name"));
        tables.add(new Table("schema", "phony_long_name"));
        tables.add(new Table("schema", "employee_addressU"));
        tables.add(new Table("schema", "Amsterdam"));
        tables.add(new Table("schema", "Barcelona"));
        tables.add(new Table("schema", "AmsterdamBarcelona"));
        tables.add(new Table("schema", "employee2"));

        for (Table table : tables) {
            table.setLowerCaseTrimmedName(table.getName().toLowerCase());
        }

        assertTrue(tables.get(0).isJunctionTable2(tables) < 0.1);
        assertTrue(tables.get(1).isJunctionTable2(tables) < 0.1);
        assertTrue(tables.get(2).isJunctionTable2(tables) > 0.9);    // Two exactly matching tokens
        assertTrue(tables.get(3).isJunctionTable2(tables) < 0.1);
        assertTrue(tables.get(4).isJunctionTable2(tables) < 0.1);    // Two not matching tokens
        assertTrue(tables.get(5).isJunctionTable2(tables) < 0.1);    // Three not matching tokens
        assertTrue(tables.get(6).isJunctionTable2(tables) < 0.1);    // A copy
        assertTrue(tables.get(7).isJunctionTable2(tables) < 0.1);    // Two not matching tokens
        assertTrue(tables.get(8).isJunctionTable2(tables) < 0.1);
        assertTrue(tables.get(9).isJunctionTable2(tables) > 0.9);    // Small typo/plural form should be ignored
        assertTrue(tables.get(10).isJunctionTable2(tables) < 0.1);
        assertTrue(tables.get(11).isJunctionTable2(tables) < 0.1);
        assertTrue(tables.get(12).isJunctionTable2(tables) > 0.9);   // Just different separator
        assertTrue(tables.get(13).isJunctionTable2(tables) < 0.1);
    }
}
