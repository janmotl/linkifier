package utility;

import main.Column;
import main.Relationship;
import org.junit.Test;
import utility.Histogram;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static utility.Histogram.jaccard;

public class HistogramTest {

	@Test
	public void half() {
		double[] h1 = {0, 2};
		double[] h2 = {1, 3};
		assertEquals(0.3333, jaccard(h1, h2), 0.0001);
	}

	@Test
	public void duplicateMiddle() {
		double[] h1 = {0, 1, 2, 2, 3};
		double[] h2 = {1, 2};
		assertEquals(0.3333, jaccard(h1, h2), 0.0001);
	}

//		@Test
//	public void duplicateBeginning() {
//		double[] h1 = {1, 1, 2};
//		double[] h2 = {1, 3, 5};
//		assertEquals(0.6666, jaccard(h1, h2), 0.0001);
//	}

//	@Test
//	public void constant() {
//		double[] h1 = {1, 1, 1};
//		double[] h2 = {2, 2, 2};
//		System.out.println(jaccard(h1, h2));
//		assertEquals(0, jaccard(h1, h2), 0.0001);
//	}

	@Test
	public void random() {
		double[] h1 = {5, 8, 10, 11, 13, 14};
		double[] h2 = {1, 2, 3, 4, 5, 7};
		assertEquals(0.0714285714, jaccard(h1, h2), 0.0001);
	}




	@Test
	public void rel2abs_uniform() {
		double[] hist = {0.2, 0.2, 0.2, 0.2, 0.2};
		double[] expected = {0, 0.2, 0.4, 0.6, 0.8, 1};
		assertArrayEquals(expected, Histogram.rel2abs(hist, 0.0, 1.0), 0.0001);
	}

	@Test
	public void rel2abs_skewed() {
		double[] hist = {0.2, 0.8};
		double[] expected = {0, 0.2, 1};
		assertArrayEquals(expected, Histogram.rel2abs(hist, 0.0, 1.0), 0.0001);
	}

	@Test
	public void rel2abs_shifted() {
		double[] hist = {0.2, 0.8};
		double[] expected = {10, 10.2, 11};
		assertArrayEquals(expected, Histogram.rel2abs(hist, 10.0, 11.0), 0.0001);
	}

	@Test
	public void rel2abs_scaled() {
		double[] hist = {0.2, 0.8};
		double[] expected = {10, 10.4, 12};
		assertArrayEquals(expected, Histogram.rel2abs(hist, 10.0, 12.0), 0.0001);
	}

	@Test
	public void rel2abs_extremelySkewed() {
		double[] hist = {1, 0, 0};
		double[] expected = {10, 12, 12, 12};
		assertArrayEquals(expected, Histogram.rel2abs(hist, 10.0, 12.0), 0.1);
	}

//	@Test
//	public void rel2abs_constant() {
//		double[] hist = {1.000,0.000,0.000,0.000,0.000,0.000,0.000,0.000,0.000,0.000,0.000};
//		System.out.println(Arrays.toString(Histogram.rel2abs(hist, 10.0, 12.0)));
//		double[] expected = {10, 12, 12, 12};
//		assertArrayEquals(expected, Histogram.rel2abs(hist, 10.0, 12.0), 0.1);
//	}

	@Test
	public void sandbox() {
		double[] hist = {1, 0, 0};
		double[] expected = {10, 12, 12, 12};
		String pkMin = "alzheimer";
		String pkMax = "zimbabwe";
		String fkMin = "dude";
		String fkMax = "mum";
//
		Relationship relationship = new Relationship();
		relationship.setFk(new Column("t1", "c1"));
		relationship.setPk(new Column("t1", "c1"));
		relationship.getPk().setTextMax("7.0");
		relationship.getPk().setTextMin("1.0");
		relationship.getFk().setTextMax("14224.0");
		relationship.getFk().setTextMin("6644.0");
		System.out.println(relationship.getRangeCoverage());

		assertArrayEquals(expected, Histogram.rel2abs(hist, 10.0, 12.0), 0.1);
	}



}
