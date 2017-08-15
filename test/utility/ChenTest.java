package utility;

import main.Column;
import main.Table;
import org.junit.Test;
import utility.Chen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ChenTest {

	@Test
	public void batteryTest() {
		List<Table> tables = new ArrayList<>();

		Table t1 = new Table("schema", "t1");
		t1.setTokenizedLowerCaseTrimmedName(Arrays.asList("t", "1"));
		Column c1 = new Column("t1", "c1");
		c1.setTokenizedLowerCaseTrimmedName(Arrays.asList("c", "1"));
		t1.getColumnList().add(c1);
		tables.add(t1);

		Table t2 = new Table("schema", "t2");
		t2.setTokenizedLowerCaseTrimmedName(Arrays.asList("t", "2"));
		Column c2 = new Column("t2", "c1");
		c2.setTokenizedLowerCaseTrimmedName(Arrays.asList("c", "1"));
		t2.getColumnList().add(c2);
		Column c3 = new Column("t2", "c3");
		c3.setTokenizedLowerCaseTrimmedName(Arrays.asList("c", "3"));
		t2.getColumnList().add(c3);
		tables.add(t2);

		// Run
		Chen chen = new Chen(tables);
		assertEquals(1.0, chen.getChenSimilarity(c1, c2), 0.0001);
		assertEquals(0.5, chen.getChenSimilarity(c1, c3), 0.0001);
	}



}
