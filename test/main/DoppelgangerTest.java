package main;

import main.Column;
import main.Table;
import org.junit.Before;
import org.junit.Test;

import static main.Doppelganger.isDoppelganger;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DoppelgangerTest {

	private Table table;

	@Before
	public void init() {
		table = new Table("schema", "table");
		table.getColumnList().add(new Column("table", "atom_id1"));
		table.getColumnList().add(new Column("table", "atom_id2"));
		table.getColumnList().add(new Column("table", "chair_id"));
		table.getColumnList().add(new Column("table", "chair_id2"));
		table.getColumnList().add(new Column("table", "busIdA"));
		table.getColumnList().add(new Column("table", "busIdB"));
		table.getColumnList().add(new Column("table", "cop1_id"));
		table.getColumnList().add(new Column("table", "cop2_id"));
		table.getColumnList().add(new Column("table", "AddressLine1"));
		table.getColumnList().add(new Column("table", "AddressLine2"));
		table.getColumnList().add(new Column("table", "fish"));
		table.getColumnList().add(new Column("table", "fish_2"));
		table.getColumnList().add(new Column("table", "unique"));
		table.getColumnList().add(new Column("table", "kid"));
		table.getColumnList().add(new Column("table", "kids"));
		table.getColumnList().add(new Column("table", "molecule_1"));
		table.getColumnList().add(new Column("table", "molecule_2"));
		table.getColumnList().add(new Column("table", "molecule_3"));
		table.getColumnList().add(new Column("table", "molecule_4"));
		table.getColumnList().add(new Column("table", "molecule_5"));
		table.getColumnList().add(new Column("table", "molecule_6"));
		table.getColumnList().add(new Column("table", "molecule_7"));
		table.getColumnList().add(new Column("table", "molecule_8"));
		table.getColumnList().add(new Column("table", "molecule_9"));
		table.getColumnList().add(new Column("table", "molecule_10"));
		table.getColumnList().add(new Column("table", "molecule_11"));
		table.getColumnList().add(new Column("table", "molecule_12"));
		table.getColumnList().add(new Column("table", "HO"));
		table.getColumnList().add(new Column("table", "BO"));
	}

	@Test
	public void doppelganger() {
		assertTrue(isDoppelganger(table, new Column("table", "atom_id1")));
		assertTrue(isDoppelganger(table, new Column("table", "atom_id2")));
		assertTrue(isDoppelganger(table, new Column("table", "chair_id")));
		assertTrue(isDoppelganger(table, new Column("table", "chair_id2")));
		assertTrue(isDoppelganger(table, new Column("table", "busIdA")));
		assertTrue(isDoppelganger(table, new Column("table", "busIdB")));
		assertTrue(isDoppelganger(table, new Column("table", "cop1_id")));
		assertTrue(isDoppelganger(table, new Column("table", "cop2_id")));
		assertTrue(isDoppelganger(table, new Column("table", "AddressLine1")));
		assertTrue(isDoppelganger(table, new Column("table", "AddressLine2")));
		assertTrue(isDoppelganger(table, new Column("table", "fish")));
		assertTrue(isDoppelganger(table, new Column("table", "fish_2")));
		assertFalse(isDoppelganger(table, new Column("table", "unique")));
		assertFalse(isDoppelganger(table, new Column("table", "kid")));
		assertFalse(isDoppelganger(table, new Column("table", "kids")));
		assertFalse(isDoppelganger(table, new Column("table", "molecule_1")));
		assertFalse(isDoppelganger(table, new Column("table", "molecule_2")));
		assertFalse(isDoppelganger(table, new Column("table", "molecule_3")));
		assertFalse(isDoppelganger(table, new Column("table", "molecule_4")));
		assertFalse(isDoppelganger(table, new Column("table", "molecule_5")));
		assertFalse(isDoppelganger(table, new Column("table", "molecule_6")));
		assertFalse(isDoppelganger(table, new Column("table", "molecule_7")));
		assertFalse(isDoppelganger(table, new Column("table", "molecule_8")));
		assertFalse(isDoppelganger(table, new Column("table", "molecule_9")));
		assertFalse(isDoppelganger(table, new Column("table", "molecule_10")));
		assertFalse(isDoppelganger(table, new Column("table", "molecule_11")));
		assertFalse(isDoppelganger(table, new Column("table", "molecule_12")));
		assertFalse(isDoppelganger(table, new Column("table", "HO")));
		assertFalse(isDoppelganger(table, new Column("table", "BO")));
	}
}
