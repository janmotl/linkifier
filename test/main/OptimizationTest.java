package main;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class OptimizationTest {

	// True: 2->1->3
	// False: 1->2, 1->1
	@Test
	public void isAcyclic() {

		Relationship relationshipTrue = new Relationship();
		relationshipTrue.setFkTable(new Table("schema", "tab2"));
		relationshipTrue.setFk(new Column("tab2", "col2"));
		relationshipTrue.setPkTable(new Table("schema", "tab1"));
		relationshipTrue.setPk(new Column("tab1", "col1"));
		relationshipTrue.setForeignKeyProbability(0.9);

		Relationship relationship2 = new Relationship();
		relationship2.setFkTable(new Table("schema", "tab1"));
		relationship2.setFk(new Column("tab1", "col1"));
		relationship2.setPkTable(new Table("schema", "tab3"));
		relationship2.setPk(new Column("tab3", "col1"));
		relationship2.setForeignKeyProbability(0.95);

		Relationship relationshipFalse = new Relationship();
		relationshipFalse.setFkTable(new Table("schema", "tab1"));
		relationshipFalse.setFk(new Column("tab1", "col1"));
		relationshipFalse.setPkTable(new Table("schema", "tab2"));
		relationshipFalse.setPk(new Column("tab2", "col2"));
		relationshipFalse.setForeignKeyProbability(0.4);

		Relationship relationshipSelf = new Relationship();
		relationshipSelf.setFkTable(new Table("schema", "tab1"));
		relationshipSelf.setFk(new Column("tab1", "col1"));
		relationshipSelf.setPkTable(new Table("schema", "tab1"));
		relationshipSelf.setPk(new Column("tab1", "col1"));
		relationshipSelf.setForeignKeyProbability(0.8);


		// Single acyclic
		Stack<Relationship> single = new Stack<>();
		single.add(relationshipTrue);
		Assert.assertTrue(OptimizationRelationship.isAcyclic(single));

		// Single cyclic
		Stack<Relationship> singleCyclic = new Stack<>();
		singleCyclic.add(relationshipSelf);
		Assert.assertFalse(OptimizationRelationship.isAcyclic(singleCyclic));

		// Cyclic
		Stack<Relationship> cyclic = new Stack<>();
		cyclic.add(relationshipTrue);
		cyclic.add(relationshipFalse);
		Assert.assertFalse(OptimizationRelationship.isAcyclic(cyclic));

		// Acyclic
		Stack<Relationship> acyclic = new Stack<>();
		acyclic.add(relationshipTrue);
		acyclic.add(relationship2);
		Assert.assertTrue(OptimizationRelationship.isAcyclic(acyclic));

		// Cyclic reverse
		Stack<Relationship> cyclicReverse = new Stack<>();
		cyclicReverse.add(relationshipFalse);
		cyclicReverse.add(relationshipTrue);
		Assert.assertFalse(OptimizationRelationship.isAcyclic(cyclicReverse));

		// Cyclic with blind ends (still, the last relationship must be a part of the cycle to make the cycle detectable)
		Stack<Relationship> cyclicMisleading = new Stack<>();
		cyclicMisleading.add(relationship2);
		cyclicMisleading.add(relationshipFalse);
		cyclicMisleading.add(relationship2);
		cyclicMisleading.add(relationshipTrue);
		Assert.assertFalse(OptimizationRelationship.isAcyclic(cyclicMisleading));
	}

	@Test
	public void piecewise() {
		OptimizationRelationship.lowerEstimate = 3;
		OptimizationRelationship.expectedCount = 5;
		OptimizationRelationship.upperEstimate = 7;

		for (int i = 0; i < 10; i++) {
			System.out.println(i + "  " + -OptimizationRelationship.piecewise(i) + "  " + (OptimizationRelationship.piecewise(i)- OptimizationRelationship.piecewise(i+1)) );
		}
	}

	@Test
	public void piecewise2() {
		OptimizationRelationship.lowerEstimate = 3.5;
		OptimizationRelationship.expectedCount = 5.5;
		OptimizationRelationship.upperEstimate = 7.5;

		for (int i = 0; i < 10; i++) {
			System.out.println(i + "  " + -OptimizationRelationship.piecewise(i) + "  " + (OptimizationRelationship.piecewise(i)- OptimizationRelationship.piecewise(i+1)) );
		}
	}
}
