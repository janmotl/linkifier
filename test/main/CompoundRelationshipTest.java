package main;

import export.SQL;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CompoundRelationshipTest {

	@Test
	public void simpleFkTest() {
		List<Relationship> relationships = new ArrayList<>();

		Table t1 = new Table("schema", "t1");
		Column c1 = new Column("t1", "c1", t1);
		c1.setBestAttemptPk(true);
		t1.getColumnList().add(c1);

		Table t2 = new Table("schema", "t2");
		Column c2 = new Column("t2", "c1", t2);
		c2.setBestAttemptPk(true);
		t2.getColumnList().add(c2);
		Column c3 = new Column("t2", "c3", t2);
		t2.getColumnList().add(c3);

		Relationship r1 = new Relationship();
		r1.setFkTable(t1);
		r1.setPkTable(t2);
		r1.setFk(c1);
		r1.setPk(c2);
		r1.setForeignKeyProbability(0.98);
		r1.setEstimatedFk(true);
		relationships.add(r1);

		// Run
		List<CompoundRelationship> compoundRelationships = CompoundRelationship.buildFrom(relationships);
		String actual = SQL.getFkQuery(compoundRelationships, '`', '`');
		String expected = "ALTER TABLE `t1` ADD FOREIGN KEY (`c1`) REFERENCES `t2`(`c1`);";
		assertEquals(expected.trim(), actual.trim());
	}

	@Test
	public void compoundFkTest() {
		List<Relationship> relationships = new ArrayList<>();

		Table t3 = new Table("schema", "t3");
		Column c4 = new Column("t3", "c1", t3);
		c4.setBestAttemptPk(true);
		t3.getColumnList().add(c4);
		Column c5 = new Column("t3", "c3", t3);
		c5.setBestAttemptPk(true);
		t3.getColumnList().add(c5);

		Table t4 = new Table("schema", "t4");
		Column c6 = new Column("t4", "c1", t4);
		c6.setBestAttemptPk(true);
		t4.getColumnList().add(c4);
		Column c7 = new Column("t4", "c3", t4);
		c7.setBestAttemptPk(true);
		t4.getColumnList().add(c7);

		Relationship r2 = new Relationship();
		r2.setFkTable(t3);
		r2.setPkTable(t4);
		r2.setFk(c4);
		r2.setPk(c6);
		r2.setForeignKeyProbability(0.98);
		r2.setEstimatedFk(true);
		relationships.add(r2);

		Relationship r3 = new Relationship();
		r3.setFkTable(t3);
		r3.setPkTable(t4);
		r3.setFk(c5);
		r3.setPk(c7);
		r3.setForeignKeyProbability(0.98);
		r3.setEstimatedFk(true);
		relationships.add(r3);

		// Run
		List<CompoundRelationship> compoundRelationships = CompoundRelationship.buildFrom(relationships);
		String actual = SQL.getFkQuery(compoundRelationships, '`', '`');
		String expected = "ALTER TABLE `t3` ADD FOREIGN KEY (`c1`, `c3`) REFERENCES `t4`(`c1`, `c3`);";
		assertEquals(expected.trim(), actual.trim());
	}



}
