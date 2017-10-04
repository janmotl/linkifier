package utility;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Double d1 = utility.String2Num.getNumericValue("hi!");
        org.junit.Assert.assertTrue("'" + d1 + "' != '" + 17.1799d + "'", d1.equals(17.1799d));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        double[] d_array6 = new double[] { (short) 100, (byte) 1, (byte) 1, 100, (byte) -1, (byte) -1 };
        double[] d_array7 = null;
        try {
            double d9 = utility.Logistic.classify(d_array6, d_array7, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(d_array6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        try {
            utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        double[] d_array5 = new double[] { 1.0d, '4', (byte) 10, (short) 1, '#' };
        double[] d_array9 = new double[] { 1, (byte) 1, (short) -1 };
        try {
            java.lang.Double d10 = utility.Histogram.jaccard(d_array5, d_array9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(d_array5);
        org.junit.Assert.assertNotNull(d_array9);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        utility.ValidatorText validatorText0 = new utility.ValidatorText();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        double[] d_array2 = new double[] { (byte) 10, (-1.0d) };
        double[] d_array3 = null;
        try {
            double d5 = utility.Logistic.classify(d_array2, d_array3, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(d_array2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        double[][] d_array_array0 = null;
        try {
            utility.Hungarian hungarian1 = new utility.Hungarian(d_array_array0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        javafx.scene.control.TextField textField0 = null;
        try {
            utility.ValidatorText.addNumericValidation(textField0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        try {
            java.lang.String str2 = heapwithfixedsize_str1.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        utility.Multiplication multiplication0 = new utility.Multiplication();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String[] str_array2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<>();
        boolean b4 = java.util.Collections.addAll(arraylist_str3, str_array2);
        java.util.stream.Stream<java.lang.String> stream_str5 = arraylist_str3.stream();
        java.util.stream.Stream<java.lang.String> stream_str6 = arraylist_str3.parallelStream();
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(stream_str5);
        org.junit.Assert.assertNotNull(stream_str6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        javafx.scene.control.TextField textField0 = null;
        try {
            utility.ValidatorText.addNumericValidation(textField0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        utility.Logistic logistic0 = new utility.Logistic();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        utility.Tpc tpc0 = new utility.Tpc();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        double[] d_array1 = new double[] { 0.0d };
        double[] d_array5 = new double[] { '#', (byte) 1, (short) -1 };
        try {
            double[] d_array6 = utility.Multiplication.elementWise(d_array1, d_array5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(d_array1);
        org.junit.Assert.assertNotNull(d_array5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        utility.LCS lCS0 = new utility.LCS();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Double d1 = utility.String2Num.getNumericValue("");
        org.junit.Assert.assertTrue("'" + d1 + "' != '" + 0.0d + "'", d1.equals(0.0d));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        int i2 = utility.Levenshtein.getDistance("hi!", "");
        org.junit.Assert.assertTrue(i2 == 3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        try {
            java.lang.String str2 = heapwithfixedsize_str1.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Properties properties0 = null;
        try {
            javax.sql.DataSource dataSource2 = utility.DataSourceFactory.getConfiguredDataSource(properties0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        utility.Tokenization tokenization0 = new utility.Tokenization();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        main.Table[] table_array0 = new main.Table[] {};
        java.util.ArrayList<main.Table> arraylist_table1 = new java.util.ArrayList<>();
        boolean b2 = java.util.Collections.addAll(arraylist_table1, table_array0);
        utility.Chen chen3 = new utility.Chen(arraylist_table1);
        main.Column column4 = null;
        main.Column column5 = null;
        try {
            double d6 = chen3.getChenSimilarity(column4, column5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(table_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str2 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        java.lang.String[] str_array5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<>();
        boolean b7 = java.util.Collections.addAll(arraylist_str6, str_array5);
        java.util.stream.Stream<java.lang.String> stream_str8 = arraylist_str6.stream();
        java.util.stream.Stream<java.lang.String> stream_str9 = arraylist_str6.parallelStream();
        java.lang.String[] str_array12 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str13 = new java.util.ArrayList<>();
        boolean b14 = java.util.Collections.addAll(arraylist_str13, str_array12);
        java.util.stream.Stream<java.lang.String> stream_str15 = arraylist_str13.stream();
        java.lang.String[] str_array18 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<>();
        boolean b20 = java.util.Collections.addAll(arraylist_str19, str_array18);
        java.util.stream.Stream<java.lang.String> stream_str21 = arraylist_str19.stream();
        java.util.stream.Stream<java.lang.String> stream_str22 = arraylist_str19.parallelStream();
        java.lang.String[] str_array25 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str26 = new java.util.ArrayList<>();
        boolean b27 = java.util.Collections.addAll(arraylist_str26, str_array25);
        java.util.stream.Stream<java.lang.String> stream_str28 = arraylist_str26.stream();
        java.util.stream.Stream<java.lang.String> stream_str29 = arraylist_str26.parallelStream();
        java.lang.String[] str_array32 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str33 = new java.util.ArrayList<>();
        boolean b34 = java.util.Collections.addAll(arraylist_str33, str_array32);
        java.util.stream.Stream<java.lang.String> stream_str35 = arraylist_str33.stream();
        java.lang.String[] str_array38 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str39 = new java.util.ArrayList<>();
        boolean b40 = java.util.Collections.addAll(arraylist_str39, str_array38);
        java.util.stream.Stream<java.lang.String> stream_str41 = arraylist_str39.stream();
        java.util.stream.Stream<java.lang.String> stream_str42 = arraylist_str39.parallelStream();
        java.util.stream.Stream[] stream_array44 = new java.util.stream.Stream[6];
        @SuppressWarnings("unchecked") java.util.stream.Stream<java.lang.String>[] stream_str_array45 = (java.util.stream.Stream<java.lang.String>[]) stream_array44;
        stream_str_array45[0] = stream_str9;
        stream_str_array45[1] = stream_str15;
        stream_str_array45[2] = stream_str22;
        stream_str_array45[3] = stream_str29;
        stream_str_array45[4] = stream_str35;
        stream_str_array45[5] = stream_str42;
        java.util.stream.Stream<java.lang.String>[] stream_str_array58 = heapwithfixedsize_str2.toArray(stream_str_array45);
        boolean b59 = multiset_histogram0.containsValue(stream_str_array58);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(stream_str8);
        org.junit.Assert.assertNotNull(stream_str9);
        org.junit.Assert.assertNotNull(str_array12);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(stream_str15);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(stream_str21);
        org.junit.Assert.assertNotNull(stream_str22);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(stream_str28);
        org.junit.Assert.assertNotNull(stream_str29);
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(stream_str35);
        org.junit.Assert.assertNotNull(str_array38);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(stream_str41);
        org.junit.Assert.assertNotNull(stream_str42);
        org.junit.Assert.assertNotNull(stream_array44);
        org.junit.Assert.assertNotNull(stream_str_array45);
        org.junit.Assert.assertNotNull(stream_str_array58);
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        utility.Otsu otsu0 = new utility.Otsu();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        boolean b1 = multiset_histogram0.isEmpty();
        boolean b3 = multiset_histogram0.equals((short) 0);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        double[] d_array0 = new double[] {};
        double[] d_array3 = new double[] { (byte) 1, (short) 1 };
        double[] d_array6 = utility.Histogram.rel2abs(d_array3, (double) 100.0f, (double) ' ');
        double[] d_array9 = new double[] { (byte) 1, (short) 1 };
        double[] d_array12 = utility.Histogram.rel2abs(d_array9, (double) 100.0f, (double) ' ');
        double[] d_array15 = new double[] { (byte) 1, (short) 1 };
        double[] d_array18 = utility.Histogram.rel2abs(d_array15, (double) 100.0f, (double) ' ');
        double d20 = utility.Logistic.classify(d_array12, d_array18, (double) 100.0f);
        java.lang.Double d21 = utility.Histogram.jaccard(d_array6, d_array12);
        try {
            double[] d_array22 = utility.Multiplication.elementWise(d_array0, d_array6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(d_array0);
        org.junit.Assert.assertNotNull(d_array3);
        org.junit.Assert.assertNotNull(d_array6);
        org.junit.Assert.assertNotNull(d_array9);
        org.junit.Assert.assertNotNull(d_array12);
        org.junit.Assert.assertNotNull(d_array15);
        org.junit.Assert.assertNotNull(d_array18);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertEquals(d21, Double.NaN, 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        int i2 = utility.Levenshtein.getDistance("", "hi!");
        org.junit.Assert.assertTrue(i2 == 3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = utility.Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = utility.Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double d13 = utility.Logistic.classify(d_array5, d_array11, (double) 100.0f);
        double[] d_array16 = new double[] { (byte) 1, (short) 1 };
        double[] d_array19 = utility.Histogram.rel2abs(d_array16, (double) 100.0f, (double) ' ');
        double[] d_array22 = new double[] { (byte) 1, (short) 1 };
        double[] d_array25 = utility.Histogram.rel2abs(d_array22, (double) 100.0f, (double) ' ');
        double[] d_array28 = new double[] { (byte) 1, (short) 1 };
        double[] d_array31 = utility.Histogram.rel2abs(d_array28, (double) 100.0f, (double) ' ');
        double d33 = utility.Logistic.classify(d_array25, d_array31, (double) 100.0f);
        java.lang.Double d34 = utility.Histogram.jaccard(d_array19, d_array25);
        double[] d_array37 = utility.Histogram.rel2abs(d_array25, (double) 4, (double) 4);
        try {
            double d39 = utility.Logistic.classify(d_array5, d_array37, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(d_array2);
        org.junit.Assert.assertNotNull(d_array5);
        org.junit.Assert.assertNotNull(d_array8);
        org.junit.Assert.assertNotNull(d_array11);
        org.junit.Assert.assertTrue(d13 == 1.0d);
        org.junit.Assert.assertNotNull(d_array16);
        org.junit.Assert.assertNotNull(d_array19);
        org.junit.Assert.assertNotNull(d_array22);
        org.junit.Assert.assertNotNull(d_array25);
        org.junit.Assert.assertNotNull(d_array28);
        org.junit.Assert.assertNotNull(d_array31);
        org.junit.Assert.assertTrue(d33 == 1.0d);
        org.junit.Assert.assertEquals(d34, Double.NaN, 0);
        org.junit.Assert.assertNotNull(d_array37);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        try {
            utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str3 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i4 = heapwithfixedsize_str3.size();
        boolean b5 = heapwithfixedsize_str1.retainAll(heapwithfixedsize_str3);
        java.util.Iterator<java.lang.String> iterator_str6 = heapwithfixedsize_str1.iterator();
        try {
            java.lang.String str7 = heapwithfixedsize_str1.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(iterator_str6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = utility.Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = utility.Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double[] d_array14 = new double[] { (byte) 1, (short) 1 };
        double[] d_array17 = utility.Histogram.rel2abs(d_array14, (double) 100.0f, (double) ' ');
        double d19 = utility.Logistic.classify(d_array11, d_array17, (double) 100.0f);
        java.lang.Double d20 = utility.Histogram.jaccard(d_array5, d_array11);
        double[] d_array23 = new double[] { (byte) 1, (short) 1 };
        double[] d_array26 = utility.Histogram.rel2abs(d_array23, (double) 100.0f, (double) ' ');
        double[] d_array29 = new double[] { (byte) 1, (short) 1 };
        double[] d_array32 = utility.Histogram.rel2abs(d_array29, (double) 100.0f, (double) ' ');
        double[] d_array35 = new double[] { (byte) 1, (short) 1 };
        double[] d_array38 = utility.Histogram.rel2abs(d_array35, (double) 100.0f, (double) ' ');
        double d40 = utility.Logistic.classify(d_array32, d_array38, (double) 100.0f);
        java.lang.Double d41 = utility.Histogram.jaccard(d_array26, d_array32);
        double[] d_array44 = utility.Histogram.rel2abs(d_array32, (double) 4, (double) 4);
        try {
            java.lang.Double d45 = utility.Histogram.jaccard(d_array5, d_array44);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(d_array2);
        org.junit.Assert.assertNotNull(d_array5);
        org.junit.Assert.assertNotNull(d_array8);
        org.junit.Assert.assertNotNull(d_array11);
        org.junit.Assert.assertNotNull(d_array14);
        org.junit.Assert.assertNotNull(d_array17);
        org.junit.Assert.assertTrue(d19 == 1.0d);
        org.junit.Assert.assertEquals(d20, Double.NaN, 0);
        org.junit.Assert.assertNotNull(d_array23);
        org.junit.Assert.assertNotNull(d_array26);
        org.junit.Assert.assertNotNull(d_array29);
        org.junit.Assert.assertNotNull(d_array32);
        org.junit.Assert.assertNotNull(d_array35);
        org.junit.Assert.assertNotNull(d_array38);
        org.junit.Assert.assertTrue(d40 == 1.0d);
        org.junit.Assert.assertEquals(d41, Double.NaN, 0);
        org.junit.Assert.assertNotNull(d_array44);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (short) 100);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = utility.Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = utility.Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double[] d_array14 = new double[] { (byte) 1, (short) 1 };
        double[] d_array17 = utility.Histogram.rel2abs(d_array14, (double) 100.0f, (double) ' ');
        double d19 = utility.Logistic.classify(d_array11, d_array17, (double) 100.0f);
        java.lang.Double d20 = utility.Histogram.jaccard(d_array5, d_array11);
        double[] d_array23 = utility.Histogram.rel2abs(d_array11, (double) 4, (double) 4);
        try {
            float[] f_array24 = utility.Otsu.otsuThreshold(d_array11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(d_array2);
        org.junit.Assert.assertNotNull(d_array5);
        org.junit.Assert.assertNotNull(d_array8);
        org.junit.Assert.assertNotNull(d_array11);
        org.junit.Assert.assertNotNull(d_array14);
        org.junit.Assert.assertNotNull(d_array17);
        org.junit.Assert.assertTrue(d19 == 1.0d);
        org.junit.Assert.assertEquals(d20, Double.NaN, 0);
        org.junit.Assert.assertNotNull(d_array23);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.util.Set<java.util.Map.Entry<utility.Histogram, java.lang.Integer>> set_entry_histogram_i6 = multiset_histogram0.entrySet();
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(set_entry_histogram_i6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = utility.Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = utility.Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double d13 = utility.Logistic.classify(d_array5, d_array11, (double) 100.0f);
        try {
            float[] f_array14 = utility.Otsu.otsuThreshold(d_array11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(d_array2);
        org.junit.Assert.assertNotNull(d_array5);
        org.junit.Assert.assertNotNull(d_array8);
        org.junit.Assert.assertNotNull(d_array11);
        org.junit.Assert.assertTrue(d13 == 1.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram14 = new utility.MultiSet<>();
        utility.Histogram histogram15 = new utility.Histogram();
        java.lang.Integer i17 = multiset_histogram14.put(histogram15, 0);
        utility.Histogram histogram18 = new utility.Histogram();
        multiset_histogram14.add(histogram18);
        java.lang.Integer i21 = multiset_histogram0.replace(histogram18, 2);
        multiset_histogram0.clear();
        multiset_histogram0.clear();
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(i17);
        org.junit.Assert.assertNull(i21);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        int i2 = utility.LCS.getLongestCommonSubsequence("[, hi!]", "[, hi!]");
        org.junit.Assert.assertTrue(i2 == 7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.Properties properties0 = null;
        try {
            javax.sql.DataSource dataSource2 = utility.DataSourceFactory.getConfiguredDataSource(properties0, "[, hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        boolean b1 = multiset_histogram0.isEmpty();
        utility.MultiSet<utility.Histogram> multiset_histogram2 = new utility.MultiSet<>();
        utility.Histogram histogram3 = new utility.Histogram();
        java.lang.Integer i5 = multiset_histogram2.put(histogram3, 0);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str7 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str9 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i10 = heapwithfixedsize_str9.size();
        boolean b11 = heapwithfixedsize_str7.retainAll(heapwithfixedsize_str9);
        boolean b12 = multiset_histogram0.remove(i5, b11);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        double[] d_array3 = new double[] { 0.0f, 10, (-1) };
        double[][] d_array_array4 = new double[][] { d_array3 };
        utility.Hungarian hungarian5 = new utility.Hungarian(d_array_array4);
        utility.Hungarian hungarian6 = new utility.Hungarian(d_array_array4);
        org.junit.Assert.assertNotNull(d_array3);
        org.junit.Assert.assertNotNull(d_array_array4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.Properties properties0 = null;
        try {
            javax.sql.DataSource dataSource2 = utility.DataSourceFactory.getConfiguredDataSource(properties0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        utility.MultiMap multiMap0 = new utility.MultiMap();
        multiMap0.put("", "hi!");
        java.util.List<java.lang.String> list_str5 = multiMap0.get("hi!");
        java.util.stream.Stream<java.lang.String> stream_str6 = list_str5.parallelStream();
        org.junit.Assert.assertNotNull(list_str5);
        org.junit.Assert.assertNotNull(stream_str6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.String[] str_array2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<>();
        boolean b4 = java.util.Collections.addAll(arraylist_str3, str_array2);
        java.util.stream.Stream<java.lang.String> stream_str5 = arraylist_str3.stream();
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<>();
        boolean b10 = java.util.Collections.addAll(arraylist_str9, str_array8);
        java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<>();
        boolean b15 = java.util.Collections.addAll(arraylist_str14, str_array13);
        java.lang.Boolean b16 = utility.Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str19 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str21 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i22 = heapwithfixedsize_str21.size();
        boolean b23 = heapwithfixedsize_str19.retainAll(heapwithfixedsize_str21);
        boolean b24 = arraylist_str14.removeAll(heapwithfixedsize_str21);
        main.Table[] table_array25 = new main.Table[] {};
        java.util.ArrayList<main.Table> arraylist_table26 = new java.util.ArrayList<>();
        boolean b27 = java.util.Collections.addAll(arraylist_table26, table_array25);
        utility.Chen chen28 = new utility.Chen(arraylist_table26);
        java.lang.String[] str_array31 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<>();
        boolean b33 = java.util.Collections.addAll(arraylist_str32, str_array31);
        java.lang.String[] str_array36 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str37 = new java.util.ArrayList<>();
        boolean b38 = java.util.Collections.addAll(arraylist_str37, str_array36);
        java.lang.Boolean b39 = utility.Tokenization.contains(arraylist_str32, arraylist_str37);
        boolean b40 = arraylist_str37.isEmpty();
        java.lang.String[] str_array43 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str44 = new java.util.ArrayList<>();
        boolean b45 = java.util.Collections.addAll(arraylist_str44, str_array43);
        java.util.stream.Stream<java.lang.String> stream_str46 = arraylist_str44.stream();
        java.lang.String[] str_array49 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str50 = new java.util.ArrayList<>();
        boolean b51 = java.util.Collections.addAll(arraylist_str50, str_array49);
        java.lang.String[] str_array54 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str55 = new java.util.ArrayList<>();
        boolean b56 = java.util.Collections.addAll(arraylist_str55, str_array54);
        java.lang.Boolean b57 = utility.Tokenization.contains(arraylist_str50, arraylist_str55);
        boolean b58 = arraylist_str44.containsAll(arraylist_str55);
        boolean b59 = arraylist_str37.removeAll(arraylist_str55);
        java.lang.String[] str_array62 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str63 = new java.util.ArrayList<>();
        boolean b64 = java.util.Collections.addAll(arraylist_str63, str_array62);
        java.util.stream.Stream<java.lang.String> stream_str65 = arraylist_str63.stream();
        double d66 = chen28.getTableChenSimilarity(arraylist_str55, arraylist_str63);
        double d67 = utility.TokenShareRatio.setTokenShareRatioFkLD(arraylist_str14, arraylist_str63);
        java.util.List<java.lang.String> list_str69 = utility.Tokenization.lowercaseSplit("hi!");
        boolean b70 = arraylist_str63.retainAll(list_str69);
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(stream_str5);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(table_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(str_array31);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(str_array36);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + b39 + "' != '" + true + "'", b39.equals(true));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(str_array43);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(stream_str46);
        org.junit.Assert.assertNotNull(str_array49);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(str_array54);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue("'" + b57 + "' != '" + true + "'", b57.equals(true));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(str_array62);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(stream_str65);
        org.junit.Assert.assertEquals(d66, Double.NaN, 0);
        org.junit.Assert.assertEquals(d67, Double.NaN, 0);
        org.junit.Assert.assertNotNull(list_str69);
        org.junit.Assert.assertTrue(b70 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        java.util.Set<utility.Histogram> set_histogram14 = multiset_histogram0.keySet();
        int i15 = multiset_histogram0.totalCount();
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str17 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        java.lang.String[] str_array20 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<>();
        boolean b22 = java.util.Collections.addAll(arraylist_str21, str_array20);
        java.util.stream.Stream<java.lang.String> stream_str23 = arraylist_str21.stream();
        java.util.stream.Stream<java.lang.String> stream_str24 = arraylist_str21.parallelStream();
        java.lang.String[] str_array27 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<>();
        boolean b29 = java.util.Collections.addAll(arraylist_str28, str_array27);
        java.util.stream.Stream<java.lang.String> stream_str30 = arraylist_str28.stream();
        java.lang.String[] str_array33 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str34 = new java.util.ArrayList<>();
        boolean b35 = java.util.Collections.addAll(arraylist_str34, str_array33);
        java.util.stream.Stream<java.lang.String> stream_str36 = arraylist_str34.stream();
        java.util.stream.Stream<java.lang.String> stream_str37 = arraylist_str34.parallelStream();
        java.lang.String[] str_array40 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str41 = new java.util.ArrayList<>();
        boolean b42 = java.util.Collections.addAll(arraylist_str41, str_array40);
        java.util.stream.Stream<java.lang.String> stream_str43 = arraylist_str41.stream();
        java.util.stream.Stream<java.lang.String> stream_str44 = arraylist_str41.parallelStream();
        java.lang.String[] str_array47 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str48 = new java.util.ArrayList<>();
        boolean b49 = java.util.Collections.addAll(arraylist_str48, str_array47);
        java.util.stream.Stream<java.lang.String> stream_str50 = arraylist_str48.stream();
        java.lang.String[] str_array53 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str54 = new java.util.ArrayList<>();
        boolean b55 = java.util.Collections.addAll(arraylist_str54, str_array53);
        java.util.stream.Stream<java.lang.String> stream_str56 = arraylist_str54.stream();
        java.util.stream.Stream<java.lang.String> stream_str57 = arraylist_str54.parallelStream();
        java.util.stream.Stream[] stream_array59 = new java.util.stream.Stream[6];
        @SuppressWarnings("unchecked") java.util.stream.Stream<java.lang.String>[] stream_str_array60 = (java.util.stream.Stream<java.lang.String>[]) stream_array59;
        stream_str_array60[0] = stream_str24;
        stream_str_array60[1] = stream_str30;
        stream_str_array60[2] = stream_str37;
        stream_str_array60[3] = stream_str44;
        stream_str_array60[4] = stream_str50;
        stream_str_array60[5] = stream_str57;
        java.util.stream.Stream<java.lang.String>[] stream_str_array73 = heapwithfixedsize_str17.toArray(stream_str_array60);
        java.util.Iterator<java.lang.String> iterator_str74 = heapwithfixedsize_str17.iterator();
        boolean b76 = heapwithfixedsize_str17.offer("hi!");
        java.lang.Integer i77 = multiset_histogram0.remove(b76);
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNotNull(set_histogram14);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(stream_str23);
        org.junit.Assert.assertNotNull(stream_str24);
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(stream_str30);
        org.junit.Assert.assertNotNull(str_array33);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(stream_str36);
        org.junit.Assert.assertNotNull(stream_str37);
        org.junit.Assert.assertNotNull(str_array40);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(stream_str43);
        org.junit.Assert.assertNotNull(stream_str44);
        org.junit.Assert.assertNotNull(str_array47);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(stream_str50);
        org.junit.Assert.assertNotNull(str_array53);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(stream_str56);
        org.junit.Assert.assertNotNull(stream_str57);
        org.junit.Assert.assertNotNull(stream_array59);
        org.junit.Assert.assertNotNull(stream_str_array60);
        org.junit.Assert.assertNotNull(stream_str_array73);
        org.junit.Assert.assertNotNull(iterator_str74);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNull(i77);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.List<java.lang.String> list_str0 = null;
        java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<>();
        boolean b6 = java.util.Collections.addAll(arraylist_str5, str_array4);
        java.lang.String[] str_array9 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str10 = new java.util.ArrayList<>();
        boolean b11 = java.util.Collections.addAll(arraylist_str10, str_array9);
        java.util.stream.Stream<java.lang.String> stream_str12 = arraylist_str10.stream();
        java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<>();
        boolean b17 = java.util.Collections.addAll(arraylist_str16, str_array15);
        java.lang.String[] str_array20 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<>();
        boolean b22 = java.util.Collections.addAll(arraylist_str21, str_array20);
        java.lang.Boolean b23 = utility.Tokenization.contains(arraylist_str16, arraylist_str21);
        boolean b24 = arraylist_str10.containsAll(arraylist_str21);
        java.lang.String[] str_array27 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<>();
        boolean b29 = java.util.Collections.addAll(arraylist_str28, str_array27);
        java.util.stream.Stream<java.lang.String> stream_str30 = arraylist_str28.stream();
        java.lang.String[] str_array33 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str34 = new java.util.ArrayList<>();
        boolean b35 = java.util.Collections.addAll(arraylist_str34, str_array33);
        java.lang.String[] str_array38 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str39 = new java.util.ArrayList<>();
        boolean b40 = java.util.Collections.addAll(arraylist_str39, str_array38);
        java.lang.Boolean b41 = utility.Tokenization.contains(arraylist_str34, arraylist_str39);
        boolean b42 = arraylist_str28.containsAll(arraylist_str39);
        double d43 = utility.TokenShareRatio.setTokenShareRatioFkLD(arraylist_str10, arraylist_str28);
        double d44 = utility.TokenShareRatio.setTokenShareRatioFkLD(arraylist_str5, arraylist_str28);
        try {
            java.lang.Boolean b45 = utility.Tokenization.contains(list_str0, arraylist_str28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(str_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(stream_str12);
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + b23 + "' != '" + true + "'", b23.equals(true));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(stream_str30);
        org.junit.Assert.assertNotNull(str_array33);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(str_array38);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + b41 + "' != '" + true + "'", b41.equals(true));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(d43 == 1.0d);
        org.junit.Assert.assertTrue(d44 == 1.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) '#');
        boolean b3 = heapwithfixedsize_str1.add("");
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        java.lang.Object obj14 = null;
        boolean b15 = multiset_histogram0.containsValue(obj14);
        utility.MultiSet<utility.Histogram> multiset_histogram16 = new utility.MultiSet<>();
        utility.Histogram histogram17 = new utility.Histogram();
        java.lang.Integer i19 = multiset_histogram16.put(histogram17, 0);
        utility.Histogram histogram20 = new utility.Histogram();
        multiset_histogram16.add(histogram20);
        java.lang.String[] str_array24 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str25 = new java.util.PriorityQueue<>();
        boolean b26 = java.util.Collections.addAll(priorityqueue_str25, str_array24);
        boolean b28 = priorityqueue_str25.offer("");
        java.lang.Integer i29 = multiset_histogram16.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram30 = new utility.MultiSet<>();
        utility.Histogram histogram31 = new utility.Histogram();
        java.lang.Integer i33 = multiset_histogram30.put(histogram31, 0);
        utility.Histogram histogram34 = new utility.Histogram();
        multiset_histogram30.add(histogram34);
        java.lang.Integer i37 = multiset_histogram16.replace(histogram34, 2);
        utility.MultiSet<utility.Histogram> multiset_histogram38 = new utility.MultiSet<>();
        utility.Histogram histogram39 = new utility.Histogram();
        java.lang.Integer i41 = multiset_histogram38.put(histogram39, 0);
        utility.Histogram histogram42 = new utility.Histogram();
        multiset_histogram38.add(histogram42);
        java.lang.String[] str_array46 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str47 = new java.util.PriorityQueue<>();
        boolean b48 = java.util.Collections.addAll(priorityqueue_str47, str_array46);
        boolean b50 = priorityqueue_str47.offer("");
        java.lang.Integer i51 = multiset_histogram38.remove("");
        java.util.Set<utility.Histogram> set_histogram52 = multiset_histogram38.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram53 = new utility.MultiSet<>();
        utility.Histogram histogram54 = new utility.Histogram();
        java.lang.Integer i56 = multiset_histogram53.put(histogram54, 0);
        utility.Histogram histogram57 = new utility.Histogram();
        multiset_histogram53.add(histogram57);
        int i59 = multiset_histogram38.count(histogram57);
        int i60 = multiset_histogram16.count(histogram57);
        multiset_histogram0.add(histogram57);
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(i19);
        org.junit.Assert.assertNotNull(str_array24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(i29);
        org.junit.Assert.assertNull(i33);
        org.junit.Assert.assertNull(i37);
        org.junit.Assert.assertNull(i41);
        org.junit.Assert.assertNotNull(str_array46);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNull(i51);
        org.junit.Assert.assertNotNull(set_histogram52);
        org.junit.Assert.assertNull(i56);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(i60 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        double[] d_array3 = new double[] { 10L, 2, 7 };
        try {
            float[] f_array4 = utility.Otsu.otsuThreshold(d_array3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(d_array3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        java.util.Set<utility.Histogram> set_histogram14 = multiset_histogram0.keySet();
        boolean b15 = multiset_histogram0.isEmpty();
        java.util.Set<java.util.Map.Entry<utility.Histogram, java.lang.Integer>> set_entry_histogram_i16 = multiset_histogram0.entrySet();
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNotNull(set_histogram14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set_entry_histogram_i16);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.List<java.lang.String> list_str1 = utility.Tokenization.lowercaseSplit("{}");
        org.junit.Assert.assertNotNull(list_str1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.Double d1 = utility.String2Num.getNumericValue("[, hi!]");
        org.junit.Assert.assertTrue("'" + d1 + "' != '" + (-1.0100828201010001d) + "'", d1.equals((-1.0100828201010001d)));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        javafx.scene.control.TextField textField0 = null;
        try {
            utility.ValidatorText.addNumericValidation(textField0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        javafx.scene.control.TextArea textArea0 = null;
        utility.TextAreaAppender textAreaAppender1 = new utility.TextAreaAppender(textArea0);
        java.util.logging.Filter filter2 = textAreaAppender1.getFilter();
        java.util.logging.Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        textAreaAppender1.flush();
        org.junit.Assert.assertNull(filter2);
        org.junit.Assert.assertNotNull(level3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.MultiSet<utility.Histogram> multiset_histogram1 = new utility.MultiSet<>();
        utility.Histogram histogram2 = new utility.Histogram();
        java.lang.Integer i4 = multiset_histogram1.put(histogram2, 0);
        utility.Histogram histogram5 = new utility.Histogram();
        multiset_histogram1.add(histogram5);
        java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str10 = new java.util.PriorityQueue<>();
        boolean b11 = java.util.Collections.addAll(priorityqueue_str10, str_array9);
        boolean b13 = priorityqueue_str10.offer("");
        java.lang.Integer i14 = multiset_histogram1.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram15 = new utility.MultiSet<>();
        utility.Histogram histogram16 = new utility.Histogram();
        java.lang.Integer i18 = multiset_histogram15.put(histogram16, 0);
        utility.Histogram histogram19 = new utility.Histogram();
        multiset_histogram15.add(histogram19);
        java.lang.Integer i22 = multiset_histogram1.replace(histogram19, 2);
        boolean b25 = multiset_histogram0.replace(histogram19, 100, -1);
        org.junit.Assert.assertNull(i4);
        org.junit.Assert.assertNotNull(str_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(i18);
        org.junit.Assert.assertNull(i22);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str3 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i4 = heapwithfixedsize_str3.size();
        boolean b5 = heapwithfixedsize_str1.retainAll(heapwithfixedsize_str3);
        java.lang.String str6 = heapwithfixedsize_str1.peek();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        double[] d_array3 = new double[] { 0.0f, 10, (-1) };
        double[][] d_array_array4 = new double[][] { d_array3 };
        utility.Hungarian hungarian5 = new utility.Hungarian(d_array_array4);
        int[] i_array6 = hungarian5.execute();
        org.junit.Assert.assertNotNull(d_array3);
        org.junit.Assert.assertNotNull(d_array_array4);
        org.junit.Assert.assertNotNull(i_array6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        java.lang.String[] str_array4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<>();
        boolean b6 = java.util.Collections.addAll(arraylist_str5, str_array4);
        java.util.stream.Stream<java.lang.String> stream_str7 = arraylist_str5.stream();
        java.util.stream.Stream<java.lang.String> stream_str8 = arraylist_str5.parallelStream();
        java.lang.String[] str_array11 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<>();
        boolean b13 = java.util.Collections.addAll(arraylist_str12, str_array11);
        java.util.stream.Stream<java.lang.String> stream_str14 = arraylist_str12.stream();
        java.lang.String[] str_array17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<>();
        boolean b19 = java.util.Collections.addAll(arraylist_str18, str_array17);
        java.util.stream.Stream<java.lang.String> stream_str20 = arraylist_str18.stream();
        java.util.stream.Stream<java.lang.String> stream_str21 = arraylist_str18.parallelStream();
        java.lang.String[] str_array24 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<>();
        boolean b26 = java.util.Collections.addAll(arraylist_str25, str_array24);
        java.util.stream.Stream<java.lang.String> stream_str27 = arraylist_str25.stream();
        java.util.stream.Stream<java.lang.String> stream_str28 = arraylist_str25.parallelStream();
        java.lang.String[] str_array31 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<>();
        boolean b33 = java.util.Collections.addAll(arraylist_str32, str_array31);
        java.util.stream.Stream<java.lang.String> stream_str34 = arraylist_str32.stream();
        java.lang.String[] str_array37 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<>();
        boolean b39 = java.util.Collections.addAll(arraylist_str38, str_array37);
        java.util.stream.Stream<java.lang.String> stream_str40 = arraylist_str38.stream();
        java.util.stream.Stream<java.lang.String> stream_str41 = arraylist_str38.parallelStream();
        java.util.stream.Stream[] stream_array43 = new java.util.stream.Stream[6];
        @SuppressWarnings("unchecked") java.util.stream.Stream<java.lang.String>[] stream_str_array44 = (java.util.stream.Stream<java.lang.String>[]) stream_array43;
        stream_str_array44[0] = stream_str8;
        stream_str_array44[1] = stream_str14;
        stream_str_array44[2] = stream_str21;
        stream_str_array44[3] = stream_str28;
        stream_str_array44[4] = stream_str34;
        stream_str_array44[5] = stream_str41;
        java.util.stream.Stream<java.lang.String>[] stream_str_array57 = heapwithfixedsize_str1.toArray(stream_str_array44);
        boolean b59 = heapwithfixedsize_str1.offer("{}");
        org.junit.Assert.assertNotNull(str_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(stream_str7);
        org.junit.Assert.assertNotNull(stream_str8);
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(stream_str14);
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(stream_str20);
        org.junit.Assert.assertNotNull(stream_str21);
        org.junit.Assert.assertNotNull(str_array24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(stream_str27);
        org.junit.Assert.assertNotNull(stream_str28);
        org.junit.Assert.assertNotNull(str_array31);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(stream_str34);
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(stream_str40);
        org.junit.Assert.assertNotNull(stream_str41);
        org.junit.Assert.assertNotNull(stream_array43);
        org.junit.Assert.assertNotNull(stream_str_array44);
        org.junit.Assert.assertNotNull(stream_str_array57);
        org.junit.Assert.assertTrue(b59 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int i2 = utility.Levenshtein.getDistance("hi!", "{}");
        org.junit.Assert.assertTrue(i2 == 3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        int i2 = utility.Levenshtein.getDistance("{}", "{}");
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        utility.MultiMap multiMap0 = new utility.MultiMap();
        multiMap0.put("hi!", "hi!");
        multiMap0.put("{}", "hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) '#');
        boolean b3 = heapwithfixedsize_str1.offer("[, hi!]");
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = utility.Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = utility.Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double[] d_array14 = new double[] { (byte) 1, (short) 1 };
        double[] d_array17 = utility.Histogram.rel2abs(d_array14, (double) 100.0f, (double) ' ');
        double d19 = utility.Logistic.classify(d_array11, d_array17, (double) 100.0f);
        java.lang.Double d20 = utility.Histogram.jaccard(d_array5, d_array11);
        double[] d_array23 = utility.Histogram.rel2abs(d_array11, (double) 4, (double) 4);
        try {
            float[] f_array24 = utility.Otsu.otsuThreshold(d_array23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(d_array2);
        org.junit.Assert.assertNotNull(d_array5);
        org.junit.Assert.assertNotNull(d_array8);
        org.junit.Assert.assertNotNull(d_array11);
        org.junit.Assert.assertNotNull(d_array14);
        org.junit.Assert.assertNotNull(d_array17);
        org.junit.Assert.assertTrue(d19 == 1.0d);
        org.junit.Assert.assertEquals(d20, Double.NaN, 0);
        org.junit.Assert.assertNotNull(d_array23);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        int i2 = utility.Levenshtein.getDistance("[, hi!]", "");
        org.junit.Assert.assertTrue(i2 == 7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.String[] str_array2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<>();
        boolean b4 = java.util.Collections.addAll(arraylist_str3, str_array2);
        java.util.stream.Stream<java.lang.String> stream_str5 = arraylist_str3.stream();
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<>();
        boolean b10 = java.util.Collections.addAll(arraylist_str9, str_array8);
        java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<>();
        boolean b15 = java.util.Collections.addAll(arraylist_str14, str_array13);
        java.lang.Boolean b16 = utility.Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str19 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str21 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i22 = heapwithfixedsize_str21.size();
        boolean b23 = heapwithfixedsize_str19.retainAll(heapwithfixedsize_str21);
        boolean b24 = arraylist_str14.removeAll(heapwithfixedsize_str21);
        java.lang.String str25 = heapwithfixedsize_str21.poll();
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str27 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str29 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i30 = heapwithfixedsize_str29.size();
        boolean b31 = heapwithfixedsize_str27.retainAll(heapwithfixedsize_str29);
        java.util.Iterator<java.lang.String> iterator_str32 = heapwithfixedsize_str27.iterator();
        int i33 = heapwithfixedsize_str27.size();
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str35 = new utility.HeapWithFixedSize<>((int) '#');
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str37 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        boolean b39 = heapwithfixedsize_str37.offer("hi!");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str41 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str43 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i44 = heapwithfixedsize_str43.size();
        boolean b45 = heapwithfixedsize_str41.retainAll(heapwithfixedsize_str43);
        java.util.Queue[] queue_array47 = new java.util.Queue[3];
        @SuppressWarnings("unchecked") java.util.Queue<java.lang.String>[] queue_str_array48 = (java.util.Queue<java.lang.String>[]) queue_array47;
        queue_str_array48[0] = heapwithfixedsize_str35;
        queue_str_array48[1] = heapwithfixedsize_str37;
        queue_str_array48[2] = heapwithfixedsize_str41;
        java.util.Queue<java.lang.String>[] queue_str_array55 = heapwithfixedsize_str27.toArray(queue_str_array48);
        boolean b56 = heapwithfixedsize_str21.remove(queue_str_array55);
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(stream_str5);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(iterator_str32);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(queue_array47);
        org.junit.Assert.assertNotNull(queue_str_array48);
        org.junit.Assert.assertNotNull(queue_str_array55);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        utility.TokenShareRatio tokenShareRatio0 = new utility.TokenShareRatio();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        javafx.scene.control.TextArea textArea0 = null;
        utility.TextAreaAppender textAreaAppender1 = new utility.TextAreaAppender(textArea0);
        java.util.logging.LogRecord logRecord2 = null;
        try {
            textAreaAppender1.publish(logRecord2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        java.util.Set<utility.Histogram> set_histogram14 = multiset_histogram0.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram15 = new utility.MultiSet<>();
        utility.Histogram histogram16 = new utility.Histogram();
        java.lang.Integer i18 = multiset_histogram15.put(histogram16, 0);
        utility.Histogram histogram19 = new utility.Histogram();
        multiset_histogram15.add(histogram19);
        int i21 = multiset_histogram0.count(histogram19);
        int i22 = multiset_histogram0.totalCount();
        boolean b23 = multiset_histogram0.isEmpty();
        java.util.Set<java.util.Map.Entry<utility.Histogram, java.lang.Integer>> set_entry_histogram_i24 = multiset_histogram0.entrySet();
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNotNull(set_histogram14);
        org.junit.Assert.assertNull(i18);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set_entry_histogram_i24);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i2 = heapwithfixedsize_str1.size();
        boolean b4 = heapwithfixedsize_str1.offer("{}");
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        boolean b1 = multiset_histogram0.isEmpty();
        int i2 = multiset_histogram0.size();
        java.util.Collection<java.lang.Integer> collection_i3 = multiset_histogram0.values();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection_i3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        java.util.Set<utility.Histogram> set_histogram14 = multiset_histogram0.keySet();
        boolean b15 = multiset_histogram0.isEmpty();
        java.lang.String str16 = multiset_histogram0.toString();
        utility.PrefixSelectionCustomizer prefixSelectionCustomizer17 = new utility.PrefixSelectionCustomizer();
        java.lang.Integer i18 = multiset_histogram0.get(prefixSelectionCustomizer17);
        int i19 = multiset_histogram0.totalCount();
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNotNull(set_histogram14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(i18);
        org.junit.Assert.assertTrue(i19 == 1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        java.lang.String[] str_array6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str7 = new java.util.ArrayList<>();
        boolean b8 = java.util.Collections.addAll(arraylist_str7, str_array6);
        java.util.stream.Stream<java.lang.String> stream_str9 = arraylist_str7.stream();
        java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str13 = new java.util.ArrayList<>();
        boolean b14 = java.util.Collections.addAll(arraylist_str13, str_array12);
        java.lang.String[] str_array17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<>();
        boolean b19 = java.util.Collections.addAll(arraylist_str18, str_array17);
        java.lang.Boolean b20 = utility.Tokenization.contains(arraylist_str13, arraylist_str18);
        boolean b21 = arraylist_str7.containsAll(arraylist_str18);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str23 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str25 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i26 = heapwithfixedsize_str25.size();
        boolean b27 = heapwithfixedsize_str23.retainAll(heapwithfixedsize_str25);
        boolean b28 = arraylist_str18.removeAll(heapwithfixedsize_str25);
        boolean b30 = heapwithfixedsize_str25.offer("");
        java.lang.String[] str_array33 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str34 = new java.util.ArrayList<>();
        boolean b35 = java.util.Collections.addAll(arraylist_str34, str_array33);
        java.util.stream.Stream<java.lang.String> stream_str36 = arraylist_str34.stream();
        java.lang.String[] str_array39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str40 = new java.util.ArrayList<>();
        boolean b41 = java.util.Collections.addAll(arraylist_str40, str_array39);
        java.lang.String[] str_array44 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str45 = new java.util.ArrayList<>();
        boolean b46 = java.util.Collections.addAll(arraylist_str45, str_array44);
        java.lang.Boolean b47 = utility.Tokenization.contains(arraylist_str40, arraylist_str45);
        boolean b48 = arraylist_str34.containsAll(arraylist_str45);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str50 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str52 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i53 = heapwithfixedsize_str52.size();
        boolean b54 = heapwithfixedsize_str50.retainAll(heapwithfixedsize_str52);
        boolean b55 = arraylist_str45.removeAll(heapwithfixedsize_str52);
        java.lang.String[] str_array58 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str59 = new java.util.ArrayList<>();
        boolean b60 = java.util.Collections.addAll(arraylist_str59, str_array58);
        java.lang.String[] str_array63 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str64 = new java.util.ArrayList<>();
        boolean b65 = java.util.Collections.addAll(arraylist_str64, str_array63);
        java.lang.Boolean b66 = utility.Tokenization.contains(arraylist_str59, arraylist_str64);
        boolean b67 = arraylist_str64.isEmpty();
        java.lang.String[] str_array70 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str71 = new java.util.ArrayList<>();
        boolean b72 = java.util.Collections.addAll(arraylist_str71, str_array70);
        java.util.stream.Stream<java.lang.String> stream_str73 = arraylist_str71.stream();
        java.lang.String[] str_array76 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str77 = new java.util.ArrayList<>();
        boolean b78 = java.util.Collections.addAll(arraylist_str77, str_array76);
        java.lang.String[] str_array81 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str82 = new java.util.ArrayList<>();
        boolean b83 = java.util.Collections.addAll(arraylist_str82, str_array81);
        java.lang.Boolean b84 = utility.Tokenization.contains(arraylist_str77, arraylist_str82);
        boolean b85 = arraylist_str71.containsAll(arraylist_str82);
        boolean b86 = arraylist_str64.removeAll(arraylist_str82);
        double d87 = utility.TokenShareRatio.setTokenShareRatioFkLD(arraylist_str45, arraylist_str82);
        boolean b88 = heapwithfixedsize_str25.addAll(arraylist_str45);
        boolean b89 = multiset_histogram0.containsKey(heapwithfixedsize_str25);
        boolean b90 = multiset_histogram0.isEmpty();
        java.util.Set<java.util.Map.Entry<utility.Histogram, java.lang.Integer>> set_entry_histogram_i91 = multiset_histogram0.entrySet();
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(stream_str9);
        org.junit.Assert.assertNotNull(str_array12);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + b20 + "' != '" + true + "'", b20.equals(true));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(str_array33);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(stream_str36);
        org.junit.Assert.assertNotNull(str_array39);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(str_array44);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + b47 + "' != '" + true + "'", b47.equals(true));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(str_array58);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(str_array63);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue("'" + b66 + "' != '" + true + "'", b66.equals(true));
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(str_array70);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(stream_str73);
        org.junit.Assert.assertNotNull(str_array76);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(str_array81);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue("'" + b84 + "' != '" + true + "'", b84.equals(true));
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertTrue(d87 == 1.0d);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNotNull(set_entry_histogram_i91);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram14 = new utility.MultiSet<>();
        utility.Histogram histogram15 = new utility.Histogram();
        java.lang.Integer i17 = multiset_histogram14.put(histogram15, 0);
        utility.Histogram histogram18 = new utility.Histogram();
        multiset_histogram14.add(histogram18);
        java.lang.Integer i21 = multiset_histogram0.replace(histogram18, 2);
        java.lang.Integer i23 = multiset_histogram0.remove((byte) 0);
        utility.DataSourceFactory dataSourceFactory24 = new utility.DataSourceFactory();
        java.lang.Integer i26 = multiset_histogram0.getOrDefault(dataSourceFactory24, 0);
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(i17);
        org.junit.Assert.assertNull(i21);
        org.junit.Assert.assertNull(i23);
        org.junit.Assert.assertTrue("'" + i26 + "' != '" + 0 + "'", i26.equals(0));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.String[] str_array2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<>();
        boolean b4 = java.util.Collections.addAll(arraylist_str3, str_array2);
        java.lang.String str5 = arraylist_str3.toString();
        java.util.stream.Stream<java.lang.String> stream_str6 = arraylist_str3.parallelStream();
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[, hi!]" + "'", str5.equals("[, hi!]"));
        org.junit.Assert.assertNotNull(stream_str6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.List<java.lang.String> list_str1 = utility.Tokenization.lowercaseSplit("[, hi!]");
        org.junit.Assert.assertNotNull(list_str1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.util.List<java.lang.String> list_str1 = utility.Tokenization.split("hi!");
        org.junit.Assert.assertNotNull(list_str1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        javafx.scene.control.TextArea textArea0 = null;
        utility.TextAreaAppender textAreaAppender1 = new utility.TextAreaAppender(textArea0);
        java.util.logging.Filter filter2 = textAreaAppender1.getFilter();
        java.util.logging.Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        java.util.logging.Formatter formatter5 = textAreaAppender1.getFormatter();
        java.util.logging.Filter filter6 = null;
        textAreaAppender1.setFilter(filter6);
        java.util.logging.Filter filter8 = textAreaAppender1.getFilter();
        java.util.logging.ErrorManager errorManager9 = textAreaAppender1.getErrorManager();
        org.junit.Assert.assertNull(filter2);
        org.junit.Assert.assertNotNull(level3);
        org.junit.Assert.assertNotNull(formatter5);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNotNull(errorManager9);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = utility.Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = utility.Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double[] d_array14 = new double[] { (byte) 1, (short) 1 };
        double[] d_array17 = utility.Histogram.rel2abs(d_array14, (double) 100.0f, (double) ' ');
        double d19 = utility.Logistic.classify(d_array11, d_array17, (double) 100.0f);
        java.lang.Double d20 = utility.Histogram.jaccard(d_array5, d_array11);
        double[] d_array23 = utility.Histogram.rel2abs(d_array11, (double) 4, (double) 4);
        double[] d_array24 = new double[] {};
        java.lang.Double d25 = utility.Histogram.jaccard(d_array23, d_array24);
        try {
            float[] f_array26 = utility.Otsu.otsuThreshold(d_array23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(d_array2);
        org.junit.Assert.assertNotNull(d_array5);
        org.junit.Assert.assertNotNull(d_array8);
        org.junit.Assert.assertNotNull(d_array11);
        org.junit.Assert.assertNotNull(d_array14);
        org.junit.Assert.assertNotNull(d_array17);
        org.junit.Assert.assertTrue(d19 == 1.0d);
        org.junit.Assert.assertEquals(d20, Double.NaN, 0);
        org.junit.Assert.assertNotNull(d_array23);
        org.junit.Assert.assertNotNull(d_array24);
        org.junit.Assert.assertEquals(d25, Double.NaN, 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = utility.Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        try {
            float[] f_array6 = utility.Otsu.otsuThreshold(d_array5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(d_array2);
        org.junit.Assert.assertNotNull(d_array5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.String[] str_array2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<>();
        boolean b4 = java.util.Collections.addAll(arraylist_str3, str_array2);
        java.util.stream.Stream<java.lang.String> stream_str5 = arraylist_str3.stream();
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<>();
        boolean b10 = java.util.Collections.addAll(arraylist_str9, str_array8);
        java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<>();
        boolean b15 = java.util.Collections.addAll(arraylist_str14, str_array13);
        java.lang.Boolean b16 = utility.Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str19 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str21 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i22 = heapwithfixedsize_str21.size();
        boolean b23 = heapwithfixedsize_str19.retainAll(heapwithfixedsize_str21);
        boolean b24 = arraylist_str14.removeAll(heapwithfixedsize_str21);
        java.lang.String[] str_array27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<>();
        boolean b29 = java.util.Collections.addAll(arraylist_str28, str_array27);
        java.lang.String[] str_array32 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str33 = new java.util.ArrayList<>();
        boolean b34 = java.util.Collections.addAll(arraylist_str33, str_array32);
        java.lang.Boolean b35 = utility.Tokenization.contains(arraylist_str28, arraylist_str33);
        boolean b36 = arraylist_str33.isEmpty();
        java.lang.String[] str_array39 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str40 = new java.util.ArrayList<>();
        boolean b41 = java.util.Collections.addAll(arraylist_str40, str_array39);
        java.util.stream.Stream<java.lang.String> stream_str42 = arraylist_str40.stream();
        java.lang.String[] str_array45 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str46 = new java.util.ArrayList<>();
        boolean b47 = java.util.Collections.addAll(arraylist_str46, str_array45);
        java.lang.String[] str_array50 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str51 = new java.util.ArrayList<>();
        boolean b52 = java.util.Collections.addAll(arraylist_str51, str_array50);
        java.lang.Boolean b53 = utility.Tokenization.contains(arraylist_str46, arraylist_str51);
        boolean b54 = arraylist_str40.containsAll(arraylist_str51);
        boolean b55 = arraylist_str33.removeAll(arraylist_str51);
        double d56 = utility.TokenShareRatio.setTokenShareRatioFkLD(arraylist_str14, arraylist_str51);
        java.util.stream.Stream<java.lang.String> stream_str57 = arraylist_str51.stream();
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(stream_str5);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + b35 + "' != '" + true + "'", b35.equals(true));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(str_array39);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(stream_str42);
        org.junit.Assert.assertNotNull(str_array45);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(str_array50);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue("'" + b53 + "' != '" + true + "'", b53.equals(true));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(d56 == 1.0d);
        org.junit.Assert.assertNotNull(stream_str57);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        int i2 = utility.Levenshtein.getDistance("{}", "");
        org.junit.Assert.assertTrue(i2 == 2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        utility.MultiMap multiMap0 = new utility.MultiMap();
        multiMap0.put("", "hi!");
        int i4 = multiMap0.size();
        java.util.List<java.lang.String> list_str6 = multiMap0.get("{}");
        boolean b7 = multiMap0.isEmpty();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        java.util.Set<utility.Histogram> set_histogram14 = multiset_histogram0.keySet();
        boolean b15 = multiset_histogram0.isEmpty();
        java.lang.String str16 = multiset_histogram0.toString();
        utility.MultiSet<utility.Histogram> multiset_histogram17 = new utility.MultiSet<>();
        utility.Histogram histogram18 = new utility.Histogram();
        java.lang.Integer i20 = multiset_histogram17.put(histogram18, 0);
        utility.Histogram histogram21 = new utility.Histogram();
        multiset_histogram17.add(histogram21);
        java.lang.String[] str_array25 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str26 = new java.util.PriorityQueue<>();
        boolean b27 = java.util.Collections.addAll(priorityqueue_str26, str_array25);
        boolean b29 = priorityqueue_str26.offer("");
        java.lang.Integer i30 = multiset_histogram17.remove("");
        java.util.Set<utility.Histogram> set_histogram31 = multiset_histogram17.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram32 = new utility.MultiSet<>();
        utility.Histogram histogram33 = new utility.Histogram();
        java.lang.Integer i35 = multiset_histogram32.put(histogram33, 0);
        utility.Histogram histogram36 = new utility.Histogram();
        multiset_histogram32.add(histogram36);
        int i38 = multiset_histogram17.count(histogram36);
        int i39 = multiset_histogram17.totalCount();
        java.util.Set<java.util.Map.Entry<utility.Histogram, java.lang.Integer>> set_entry_histogram_i40 = multiset_histogram17.entrySet();
        utility.MultiSet<utility.Histogram> multiset_histogram41 = new utility.MultiSet<>();
        utility.Histogram histogram42 = new utility.Histogram();
        java.lang.Integer i44 = multiset_histogram41.put(histogram42, 0);
        utility.Histogram histogram45 = new utility.Histogram();
        multiset_histogram41.add(histogram45);
        java.lang.String[] str_array49 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str50 = new java.util.PriorityQueue<>();
        boolean b51 = java.util.Collections.addAll(priorityqueue_str50, str_array49);
        boolean b53 = priorityqueue_str50.offer("");
        java.lang.Integer i54 = multiset_histogram41.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram55 = new utility.MultiSet<>();
        utility.Histogram histogram56 = new utility.Histogram();
        java.lang.Integer i58 = multiset_histogram55.put(histogram56, 0);
        utility.Histogram histogram59 = new utility.Histogram();
        multiset_histogram55.add(histogram59);
        java.lang.Integer i62 = multiset_histogram41.replace(histogram59, 2);
        utility.DataSourceFactory dataSourceFactory63 = new utility.DataSourceFactory();
        boolean b64 = multiset_histogram41.containsKey(dataSourceFactory63);
        utility.MultiSet<utility.Histogram> multiset_histogram65 = new utility.MultiSet<>();
        utility.Histogram histogram66 = new utility.Histogram();
        java.lang.Integer i68 = multiset_histogram65.put(histogram66, 0);
        utility.Histogram histogram69 = new utility.Histogram();
        multiset_histogram65.add(histogram69);
        java.lang.String[] str_array73 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str74 = new java.util.PriorityQueue<>();
        boolean b75 = java.util.Collections.addAll(priorityqueue_str74, str_array73);
        boolean b77 = priorityqueue_str74.offer("");
        java.lang.Integer i78 = multiset_histogram65.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram79 = new utility.MultiSet<>();
        utility.Histogram histogram80 = new utility.Histogram();
        java.lang.Integer i82 = multiset_histogram79.put(histogram80, 0);
        utility.Histogram histogram83 = new utility.Histogram();
        multiset_histogram79.add(histogram83);
        java.lang.Integer i86 = multiset_histogram65.replace(histogram83, 2);
        utility.DataSourceFactory dataSourceFactory87 = new utility.DataSourceFactory();
        boolean b88 = multiset_histogram65.containsKey(dataSourceFactory87);
        utility.Histogram histogram89 = new utility.Histogram();
        multiset_histogram65.add(histogram89);
        multiset_histogram41.add(histogram89);
        multiset_histogram17.add(histogram89);
        java.lang.Integer i94 = multiset_histogram0.replace(histogram89, 0);
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNotNull(set_histogram14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(i20);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(i30);
        org.junit.Assert.assertNotNull(set_histogram31);
        org.junit.Assert.assertNull(i35);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(i39 == 1);
        org.junit.Assert.assertNotNull(set_entry_histogram_i40);
        org.junit.Assert.assertNull(i44);
        org.junit.Assert.assertNotNull(str_array49);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNull(i54);
        org.junit.Assert.assertNull(i58);
        org.junit.Assert.assertNull(i62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(i68);
        org.junit.Assert.assertNotNull(str_array73);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertNull(i78);
        org.junit.Assert.assertNull(i82);
        org.junit.Assert.assertNull(i86);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNull(i94);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<>();
        boolean b4 = java.util.Collections.addAll(arraylist_str3, str_array2);
        java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str8 = new java.util.ArrayList<>();
        boolean b9 = java.util.Collections.addAll(arraylist_str8, str_array7);
        java.lang.Boolean b10 = utility.Tokenization.contains(arraylist_str3, arraylist_str8);
        boolean b11 = arraylist_str8.isEmpty();
        java.lang.String[] str_array14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str15 = new java.util.ArrayList<>();
        boolean b16 = java.util.Collections.addAll(arraylist_str15, str_array14);
        java.util.stream.Stream<java.lang.String> stream_str17 = arraylist_str15.stream();
        java.lang.String[] str_array20 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<>();
        boolean b22 = java.util.Collections.addAll(arraylist_str21, str_array20);
        java.lang.String[] str_array25 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str26 = new java.util.ArrayList<>();
        boolean b27 = java.util.Collections.addAll(arraylist_str26, str_array25);
        java.lang.Boolean b28 = utility.Tokenization.contains(arraylist_str21, arraylist_str26);
        boolean b29 = arraylist_str15.containsAll(arraylist_str26);
        boolean b30 = arraylist_str8.removeAll(arraylist_str26);
        java.lang.String str31 = arraylist_str26.toString();
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(str_array7);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + b10 + "' != '" + true + "'", b10.equals(true));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(str_array14);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(stream_str17);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + b28 + "' != '" + true + "'", b28.equals(true));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[hi!, hi!]" + "'", str31.equals("[hi!, hi!]"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        java.lang.String[] str_array4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<>();
        boolean b6 = java.util.Collections.addAll(arraylist_str5, str_array4);
        java.util.stream.Stream<java.lang.String> stream_str7 = arraylist_str5.stream();
        java.util.stream.Stream<java.lang.String> stream_str8 = arraylist_str5.parallelStream();
        java.lang.String[] str_array11 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<>();
        boolean b13 = java.util.Collections.addAll(arraylist_str12, str_array11);
        java.util.stream.Stream<java.lang.String> stream_str14 = arraylist_str12.stream();
        java.lang.String[] str_array17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<>();
        boolean b19 = java.util.Collections.addAll(arraylist_str18, str_array17);
        java.util.stream.Stream<java.lang.String> stream_str20 = arraylist_str18.stream();
        java.util.stream.Stream<java.lang.String> stream_str21 = arraylist_str18.parallelStream();
        java.lang.String[] str_array24 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<>();
        boolean b26 = java.util.Collections.addAll(arraylist_str25, str_array24);
        java.util.stream.Stream<java.lang.String> stream_str27 = arraylist_str25.stream();
        java.util.stream.Stream<java.lang.String> stream_str28 = arraylist_str25.parallelStream();
        java.lang.String[] str_array31 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<>();
        boolean b33 = java.util.Collections.addAll(arraylist_str32, str_array31);
        java.util.stream.Stream<java.lang.String> stream_str34 = arraylist_str32.stream();
        java.lang.String[] str_array37 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<>();
        boolean b39 = java.util.Collections.addAll(arraylist_str38, str_array37);
        java.util.stream.Stream<java.lang.String> stream_str40 = arraylist_str38.stream();
        java.util.stream.Stream<java.lang.String> stream_str41 = arraylist_str38.parallelStream();
        java.util.stream.Stream[] stream_array43 = new java.util.stream.Stream[6];
        @SuppressWarnings("unchecked") java.util.stream.Stream<java.lang.String>[] stream_str_array44 = (java.util.stream.Stream<java.lang.String>[]) stream_array43;
        stream_str_array44[0] = stream_str8;
        stream_str_array44[1] = stream_str14;
        stream_str_array44[2] = stream_str21;
        stream_str_array44[3] = stream_str28;
        stream_str_array44[4] = stream_str34;
        stream_str_array44[5] = stream_str41;
        java.util.stream.Stream<java.lang.String>[] stream_str_array57 = heapwithfixedsize_str1.toArray(stream_str_array44);
        boolean b59 = heapwithfixedsize_str1.add("");
        boolean b61 = heapwithfixedsize_str1.contains(0L);
        java.util.Comparator<? super java.lang.String> comparator_wildcard62 = heapwithfixedsize_str1.comparator();
        boolean b64 = heapwithfixedsize_str1.contains((short) 1);
        org.junit.Assert.assertNotNull(str_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(stream_str7);
        org.junit.Assert.assertNotNull(stream_str8);
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(stream_str14);
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(stream_str20);
        org.junit.Assert.assertNotNull(stream_str21);
        org.junit.Assert.assertNotNull(str_array24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(stream_str27);
        org.junit.Assert.assertNotNull(stream_str28);
        org.junit.Assert.assertNotNull(str_array31);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(stream_str34);
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(stream_str40);
        org.junit.Assert.assertNotNull(stream_str41);
        org.junit.Assert.assertNotNull(stream_array43);
        org.junit.Assert.assertNotNull(stream_str_array44);
        org.junit.Assert.assertNotNull(stream_str_array57);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(comparator_wildcard62);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        javafx.scene.control.TextArea textArea0 = null;
        utility.TextAreaAppender textAreaAppender1 = new utility.TextAreaAppender(textArea0);
        java.util.logging.Filter filter2 = textAreaAppender1.getFilter();
        java.util.logging.Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        java.util.logging.Filter filter5 = null;
        textAreaAppender1.setFilter(filter5);
        javafx.scene.control.TextArea textArea7 = null;
        utility.TextAreaAppender textAreaAppender8 = new utility.TextAreaAppender(textArea7);
        java.util.logging.Filter filter9 = textAreaAppender8.getFilter();
        java.util.logging.Level level10 = textAreaAppender8.getLevel();
        textAreaAppender8.flush();
        java.util.logging.Formatter formatter12 = textAreaAppender8.getFormatter();
        textAreaAppender1.setFormatter(formatter12);
        try {
            textAreaAppender1.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException");
        } catch (java.io.UnsupportedEncodingException e) {
        }
        org.junit.Assert.assertNull(filter2);
        org.junit.Assert.assertNotNull(level3);
        org.junit.Assert.assertNull(filter9);
        org.junit.Assert.assertNotNull(level10);
        org.junit.Assert.assertNotNull(formatter12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.Double d1 = utility.String2Num.getNumericValue("{}");
        org.junit.Assert.assertTrue("'" + d1 + "' != '" + (-1.01d) + "'", d1.equals((-1.01d)));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        javafx.scene.control.TextArea textArea0 = null;
        utility.TextAreaAppender textAreaAppender1 = new utility.TextAreaAppender(textArea0);
        java.util.logging.Filter filter2 = textAreaAppender1.getFilter();
        java.util.logging.Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        java.util.logging.Filter filter5 = null;
        textAreaAppender1.setFilter(filter5);
        textAreaAppender1.close();
        textAreaAppender1.close();
        java.util.logging.ErrorManager errorManager9 = textAreaAppender1.getErrorManager();
        try {
            textAreaAppender1.setEncoding("[hi!, hi!]");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException");
        } catch (java.io.UnsupportedEncodingException e) {
        }
        org.junit.Assert.assertNull(filter2);
        org.junit.Assert.assertNotNull(level3);
        org.junit.Assert.assertNotNull(errorManager9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        java.lang.String[] str_array4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<>();
        boolean b6 = java.util.Collections.addAll(arraylist_str5, str_array4);
        java.util.stream.Stream<java.lang.String> stream_str7 = arraylist_str5.stream();
        java.util.stream.Stream<java.lang.String> stream_str8 = arraylist_str5.parallelStream();
        java.lang.String[] str_array11 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<>();
        boolean b13 = java.util.Collections.addAll(arraylist_str12, str_array11);
        java.util.stream.Stream<java.lang.String> stream_str14 = arraylist_str12.stream();
        java.lang.String[] str_array17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<>();
        boolean b19 = java.util.Collections.addAll(arraylist_str18, str_array17);
        java.util.stream.Stream<java.lang.String> stream_str20 = arraylist_str18.stream();
        java.util.stream.Stream<java.lang.String> stream_str21 = arraylist_str18.parallelStream();
        java.lang.String[] str_array24 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<>();
        boolean b26 = java.util.Collections.addAll(arraylist_str25, str_array24);
        java.util.stream.Stream<java.lang.String> stream_str27 = arraylist_str25.stream();
        java.util.stream.Stream<java.lang.String> stream_str28 = arraylist_str25.parallelStream();
        java.lang.String[] str_array31 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<>();
        boolean b33 = java.util.Collections.addAll(arraylist_str32, str_array31);
        java.util.stream.Stream<java.lang.String> stream_str34 = arraylist_str32.stream();
        java.lang.String[] str_array37 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<>();
        boolean b39 = java.util.Collections.addAll(arraylist_str38, str_array37);
        java.util.stream.Stream<java.lang.String> stream_str40 = arraylist_str38.stream();
        java.util.stream.Stream<java.lang.String> stream_str41 = arraylist_str38.parallelStream();
        java.util.stream.Stream[] stream_array43 = new java.util.stream.Stream[6];
        @SuppressWarnings("unchecked") java.util.stream.Stream<java.lang.String>[] stream_str_array44 = (java.util.stream.Stream<java.lang.String>[]) stream_array43;
        stream_str_array44[0] = stream_str8;
        stream_str_array44[1] = stream_str14;
        stream_str_array44[2] = stream_str21;
        stream_str_array44[3] = stream_str28;
        stream_str_array44[4] = stream_str34;
        stream_str_array44[5] = stream_str41;
        java.util.stream.Stream<java.lang.String>[] stream_str_array57 = heapwithfixedsize_str1.toArray(stream_str_array44);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str59 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str61 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i62 = heapwithfixedsize_str61.size();
        boolean b63 = heapwithfixedsize_str59.retainAll(heapwithfixedsize_str61);
        boolean b64 = heapwithfixedsize_str1.containsAll(heapwithfixedsize_str59);
        java.util.Spliterator<java.lang.String> spliterator_str65 = heapwithfixedsize_str1.spliterator();
        org.junit.Assert.assertNotNull(str_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(stream_str7);
        org.junit.Assert.assertNotNull(stream_str8);
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(stream_str14);
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(stream_str20);
        org.junit.Assert.assertNotNull(stream_str21);
        org.junit.Assert.assertNotNull(str_array24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(stream_str27);
        org.junit.Assert.assertNotNull(stream_str28);
        org.junit.Assert.assertNotNull(str_array31);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(stream_str34);
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(stream_str40);
        org.junit.Assert.assertNotNull(stream_str41);
        org.junit.Assert.assertNotNull(stream_array43);
        org.junit.Assert.assertNotNull(stream_str_array44);
        org.junit.Assert.assertNotNull(stream_str_array57);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(spliterator_str65);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        javafx.scene.control.TextArea textArea0 = null;
        utility.TextAreaAppender textAreaAppender1 = new utility.TextAreaAppender(textArea0);
        java.util.logging.Filter filter2 = textAreaAppender1.getFilter();
        java.util.logging.Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        java.util.logging.Formatter formatter5 = textAreaAppender1.getFormatter();
        javafx.scene.control.TextArea textArea6 = null;
        utility.TextAreaAppender textAreaAppender7 = new utility.TextAreaAppender(textArea6);
        java.util.logging.Filter filter8 = textAreaAppender7.getFilter();
        java.util.logging.Level level9 = textAreaAppender7.getLevel();
        textAreaAppender7.flush();
        java.util.logging.Filter filter11 = null;
        textAreaAppender7.setFilter(filter11);
        textAreaAppender7.close();
        textAreaAppender7.close();
        java.util.logging.ErrorManager errorManager15 = textAreaAppender7.getErrorManager();
        textAreaAppender1.setErrorManager(errorManager15);
        org.junit.Assert.assertNull(filter2);
        org.junit.Assert.assertNotNull(level3);
        org.junit.Assert.assertNotNull(formatter5);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNotNull(level9);
        org.junit.Assert.assertNotNull(errorManager15);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        javafx.scene.control.TextArea textArea0 = null;
        utility.TextAreaAppender textAreaAppender1 = new utility.TextAreaAppender(textArea0);
        java.util.logging.Filter filter2 = textAreaAppender1.getFilter();
        java.util.logging.Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        java.util.logging.Filter filter5 = null;
        textAreaAppender1.setFilter(filter5);
        textAreaAppender1.flush();
        java.util.logging.LogRecord logRecord8 = null;
        try {
            textAreaAppender1.publish(logRecord8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(filter2);
        org.junit.Assert.assertNotNull(level3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        double[] d_array3 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array6 = new double[] { (byte) 1, (short) 1 };
        double[] d_array9 = utility.Histogram.rel2abs(d_array6, (double) 100.0f, (double) ' ');
        double[] d_array12 = new double[] { (byte) 1, (short) 1 };
        double[] d_array15 = utility.Histogram.rel2abs(d_array12, (double) 100.0f, (double) ' ');
        double d17 = utility.Logistic.classify(d_array9, d_array15, (double) 100.0f);
        java.lang.Double d18 = utility.Histogram.jaccard(d_array3, d_array15);
        double[] d_array21 = new double[] { (byte) 1, (short) 1 };
        double[] d_array24 = utility.Histogram.rel2abs(d_array21, (double) 100.0f, (double) ' ');
        double[] d_array25 = utility.Multiplication.elementWise(d_array3, d_array24);
        double[] d_array29 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array32 = new double[] { (byte) 1, (short) 1 };
        double[] d_array35 = utility.Histogram.rel2abs(d_array32, (double) 100.0f, (double) ' ');
        double[] d_array38 = new double[] { (byte) 1, (short) 1 };
        double[] d_array41 = utility.Histogram.rel2abs(d_array38, (double) 100.0f, (double) ' ');
        double d43 = utility.Logistic.classify(d_array35, d_array41, (double) 100.0f);
        java.lang.Double d44 = utility.Histogram.jaccard(d_array29, d_array41);
        double d46 = utility.Logistic.classify(d_array24, d_array29, 0.0d);
        org.junit.Assert.assertNotNull(d_array3);
        org.junit.Assert.assertNotNull(d_array6);
        org.junit.Assert.assertNotNull(d_array9);
        org.junit.Assert.assertNotNull(d_array12);
        org.junit.Assert.assertNotNull(d_array15);
        org.junit.Assert.assertTrue(d17 == 1.0d);
        org.junit.Assert.assertTrue("'" + d18 + "' != '" + 0.0d + "'", d18.equals(0.0d));
        org.junit.Assert.assertNotNull(d_array21);
        org.junit.Assert.assertNotNull(d_array24);
        org.junit.Assert.assertNotNull(d_array25);
        org.junit.Assert.assertNotNull(d_array29);
        org.junit.Assert.assertNotNull(d_array32);
        org.junit.Assert.assertNotNull(d_array35);
        org.junit.Assert.assertNotNull(d_array38);
        org.junit.Assert.assertNotNull(d_array41);
        org.junit.Assert.assertTrue(d43 == 1.0d);
        org.junit.Assert.assertTrue("'" + d44 + "' != '" + 0.0d + "'", d44.equals(0.0d));
        org.junit.Assert.assertTrue(d46 == 1.0d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.Properties properties0 = null;
        try {
            javax.sql.DataSource dataSource2 = utility.DataSourceFactory.getConfiguredDataSource(properties0, "{}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        int i4 = multiset_histogram0.size();
        utility.Histogram histogram5 = new utility.Histogram();
        java.lang.Integer i7 = multiset_histogram0.replace(histogram5, 100);
        utility.MultiSet<utility.Histogram> multiset_histogram8 = new utility.MultiSet<>();
        java.util.Set<utility.Histogram> set_histogram9 = multiset_histogram8.keySet();
        java.lang.String str10 = multiset_histogram8.toString();
        utility.MultiSet<utility.Histogram> multiset_histogram11 = new utility.MultiSet<>();
        utility.Histogram histogram12 = new utility.Histogram();
        java.lang.Integer i14 = multiset_histogram11.put(histogram12, 0);
        utility.Histogram histogram15 = new utility.Histogram();
        multiset_histogram11.add(histogram15);
        java.lang.String[] str_array19 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str20 = new java.util.PriorityQueue<>();
        boolean b21 = java.util.Collections.addAll(priorityqueue_str20, str_array19);
        boolean b23 = priorityqueue_str20.offer("");
        java.lang.Integer i24 = multiset_histogram11.remove("");
        java.util.Set<utility.Histogram> set_histogram25 = multiset_histogram11.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram26 = new utility.MultiSet<>();
        utility.Histogram histogram27 = new utility.Histogram();
        java.lang.Integer i29 = multiset_histogram26.put(histogram27, 0);
        utility.Histogram histogram30 = new utility.Histogram();
        multiset_histogram26.add(histogram30);
        java.lang.String[] str_array34 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str35 = new java.util.PriorityQueue<>();
        boolean b36 = java.util.Collections.addAll(priorityqueue_str35, str_array34);
        boolean b38 = priorityqueue_str35.offer("");
        java.lang.Integer i39 = multiset_histogram26.remove("");
        java.util.Set<utility.Histogram> set_histogram40 = multiset_histogram26.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram41 = new utility.MultiSet<>();
        utility.Histogram histogram42 = new utility.Histogram();
        java.lang.Integer i44 = multiset_histogram41.put(histogram42, 0);
        utility.Histogram histogram45 = new utility.Histogram();
        multiset_histogram41.add(histogram45);
        int i47 = multiset_histogram26.count(histogram45);
        int i48 = multiset_histogram11.count(histogram45);
        utility.DataSourceFactory dataSourceFactory49 = new utility.DataSourceFactory();
        boolean b50 = multiset_histogram8.remove(histogram45, dataSourceFactory49);
        java.lang.Integer i52 = multiset_histogram0.replace(histogram45, 7);
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(i7);
        org.junit.Assert.assertNotNull(set_histogram9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNotNull(str_array19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(i24);
        org.junit.Assert.assertNotNull(set_histogram25);
        org.junit.Assert.assertNull(i29);
        org.junit.Assert.assertNotNull(str_array34);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(i39);
        org.junit.Assert.assertNotNull(set_histogram40);
        org.junit.Assert.assertNull(i44);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(i52);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.util.List<java.lang.String> list_str1 = utility.Tokenization.lowercaseSplit("");
        org.junit.Assert.assertNotNull(list_str1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        boolean b3 = heapwithfixedsize_str1.offer("hi!");
        double[] d_array6 = new double[] { (byte) 1, (short) 1 };
        double[] d_array9 = utility.Histogram.rel2abs(d_array6, (double) 100.0f, (double) ' ');
        boolean b10 = heapwithfixedsize_str1.contains(100.0f);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(d_array6);
        org.junit.Assert.assertNotNull(d_array9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        java.util.Set<utility.Histogram> set_histogram1 = multiset_histogram0.keySet();
        java.lang.String str2 = multiset_histogram0.toString();
        utility.MultiSet<utility.Histogram> multiset_histogram3 = new utility.MultiSet<>();
        utility.Histogram histogram4 = new utility.Histogram();
        java.lang.Integer i6 = multiset_histogram3.put(histogram4, 0);
        utility.Histogram histogram7 = new utility.Histogram();
        multiset_histogram3.add(histogram7);
        java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str12 = new java.util.PriorityQueue<>();
        boolean b13 = java.util.Collections.addAll(priorityqueue_str12, str_array11);
        boolean b15 = priorityqueue_str12.offer("");
        java.lang.Integer i16 = multiset_histogram3.remove("");
        java.util.Set<utility.Histogram> set_histogram17 = multiset_histogram3.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram18 = new utility.MultiSet<>();
        utility.Histogram histogram19 = new utility.Histogram();
        java.lang.Integer i21 = multiset_histogram18.put(histogram19, 0);
        utility.Histogram histogram22 = new utility.Histogram();
        multiset_histogram18.add(histogram22);
        java.lang.String[] str_array26 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str27 = new java.util.PriorityQueue<>();
        boolean b28 = java.util.Collections.addAll(priorityqueue_str27, str_array26);
        boolean b30 = priorityqueue_str27.offer("");
        java.lang.Integer i31 = multiset_histogram18.remove("");
        java.util.Set<utility.Histogram> set_histogram32 = multiset_histogram18.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram33 = new utility.MultiSet<>();
        utility.Histogram histogram34 = new utility.Histogram();
        java.lang.Integer i36 = multiset_histogram33.put(histogram34, 0);
        utility.Histogram histogram37 = new utility.Histogram();
        multiset_histogram33.add(histogram37);
        int i39 = multiset_histogram18.count(histogram37);
        int i40 = multiset_histogram3.count(histogram37);
        utility.DataSourceFactory dataSourceFactory41 = new utility.DataSourceFactory();
        boolean b42 = multiset_histogram0.remove(histogram37, dataSourceFactory41);
        java.lang.Integer i44 = multiset_histogram0.remove(-1L);
        int i45 = multiset_histogram0.totalCount();
        org.junit.Assert.assertNotNull(set_histogram1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(i16);
        org.junit.Assert.assertNotNull(set_histogram17);
        org.junit.Assert.assertNull(i21);
        org.junit.Assert.assertNotNull(str_array26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(i31);
        org.junit.Assert.assertNotNull(set_histogram32);
        org.junit.Assert.assertNull(i36);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(i44);
        org.junit.Assert.assertTrue(i45 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        main.Table[] table_array0 = new main.Table[] {};
        java.util.ArrayList<main.Table> arraylist_table1 = new java.util.ArrayList<>();
        boolean b2 = java.util.Collections.addAll(arraylist_table1, table_array0);
        utility.Chen chen3 = new utility.Chen(arraylist_table1);
        main.Table[] table_array4 = new main.Table[] {};
        java.util.ArrayList<main.Table> arraylist_table5 = new java.util.ArrayList<>();
        boolean b6 = java.util.Collections.addAll(arraylist_table5, table_array4);
        utility.Chen chen7 = new utility.Chen(arraylist_table5);
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<>();
        boolean b12 = java.util.Collections.addAll(arraylist_str11, str_array10);
        java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<>();
        boolean b17 = java.util.Collections.addAll(arraylist_str16, str_array15);
        java.lang.Boolean b18 = utility.Tokenization.contains(arraylist_str11, arraylist_str16);
        boolean b19 = arraylist_str16.isEmpty();
        java.lang.String[] str_array22 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str23 = new java.util.ArrayList<>();
        boolean b24 = java.util.Collections.addAll(arraylist_str23, str_array22);
        java.util.stream.Stream<java.lang.String> stream_str25 = arraylist_str23.stream();
        java.lang.String[] str_array28 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str29 = new java.util.ArrayList<>();
        boolean b30 = java.util.Collections.addAll(arraylist_str29, str_array28);
        java.lang.String[] str_array33 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str34 = new java.util.ArrayList<>();
        boolean b35 = java.util.Collections.addAll(arraylist_str34, str_array33);
        java.lang.Boolean b36 = utility.Tokenization.contains(arraylist_str29, arraylist_str34);
        boolean b37 = arraylist_str23.containsAll(arraylist_str34);
        boolean b38 = arraylist_str16.removeAll(arraylist_str34);
        java.lang.String[] str_array41 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str42 = new java.util.ArrayList<>();
        boolean b43 = java.util.Collections.addAll(arraylist_str42, str_array41);
        java.util.stream.Stream<java.lang.String> stream_str44 = arraylist_str42.stream();
        double d45 = chen7.getTableChenSimilarity(arraylist_str34, arraylist_str42);
        java.util.stream.Stream<java.lang.String> stream_str46 = arraylist_str42.stream();
        java.lang.String[] str_array50 = new java.lang.String[] { "hi!", "[, hi!]", "" };
        java.util.ArrayList<java.lang.String> arraylist_str51 = new java.util.ArrayList<>();
        boolean b52 = java.util.Collections.addAll(arraylist_str51, str_array50);
        double d53 = chen3.getTableChenSimilarity(arraylist_str42, arraylist_str51);
        boolean b54 = arraylist_str42.isEmpty();
        org.junit.Assert.assertNotNull(table_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(table_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + b18 + "' != '" + true + "'", b18.equals(true));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(stream_str25);
        org.junit.Assert.assertNotNull(str_array28);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(str_array33);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + b36 + "' != '" + true + "'", b36.equals(true));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(str_array41);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(stream_str44);
        org.junit.Assert.assertEquals(d45, Double.NaN, 0);
        org.junit.Assert.assertNotNull(stream_str46);
        org.junit.Assert.assertNotNull(str_array50);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertEquals(d53, Double.NaN, 0);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        main.Table[] table_array0 = new main.Table[] {};
        java.util.ArrayList<main.Table> arraylist_table1 = new java.util.ArrayList<>();
        boolean b2 = java.util.Collections.addAll(arraylist_table1, table_array0);
        utility.Chen chen3 = new utility.Chen(arraylist_table1);
        java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str7 = new java.util.ArrayList<>();
        boolean b8 = java.util.Collections.addAll(arraylist_str7, str_array6);
        java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<>();
        boolean b13 = java.util.Collections.addAll(arraylist_str12, str_array11);
        java.lang.Boolean b14 = utility.Tokenization.contains(arraylist_str7, arraylist_str12);
        boolean b15 = arraylist_str12.isEmpty();
        java.lang.String[] str_array18 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<>();
        boolean b20 = java.util.Collections.addAll(arraylist_str19, str_array18);
        java.util.stream.Stream<java.lang.String> stream_str21 = arraylist_str19.stream();
        java.lang.String[] str_array24 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<>();
        boolean b26 = java.util.Collections.addAll(arraylist_str25, str_array24);
        java.lang.String[] str_array29 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<>();
        boolean b31 = java.util.Collections.addAll(arraylist_str30, str_array29);
        java.lang.Boolean b32 = utility.Tokenization.contains(arraylist_str25, arraylist_str30);
        boolean b33 = arraylist_str19.containsAll(arraylist_str30);
        boolean b34 = arraylist_str12.removeAll(arraylist_str30);
        java.lang.String[] str_array37 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<>();
        boolean b39 = java.util.Collections.addAll(arraylist_str38, str_array37);
        java.util.stream.Stream<java.lang.String> stream_str40 = arraylist_str38.stream();
        double d41 = chen3.getTableChenSimilarity(arraylist_str30, arraylist_str38);
        main.Column column42 = null;
        main.Column column43 = null;
        try {
            double d44 = chen3.getChenSimilarity(column42, column43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(table_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + b14 + "' != '" + true + "'", b14.equals(true));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(stream_str21);
        org.junit.Assert.assertNotNull(str_array24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(str_array29);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + b32 + "' != '" + true + "'", b32.equals(true));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(stream_str40);
        org.junit.Assert.assertEquals(d41, Double.NaN, 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        java.util.Set<utility.Histogram> set_histogram14 = multiset_histogram0.keySet();
        boolean b15 = multiset_histogram0.isEmpty();
        boolean b16 = multiset_histogram0.isEmpty();
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNotNull(set_histogram14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        java.util.Set<utility.Histogram> set_histogram1 = multiset_histogram0.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram2 = new utility.MultiSet<>();
        utility.Histogram histogram3 = new utility.Histogram();
        java.lang.Integer i5 = multiset_histogram2.put(histogram3, 0);
        utility.Histogram histogram6 = new utility.Histogram();
        multiset_histogram2.add(histogram6);
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str11 = new java.util.PriorityQueue<>();
        boolean b12 = java.util.Collections.addAll(priorityqueue_str11, str_array10);
        boolean b14 = priorityqueue_str11.offer("");
        java.lang.Integer i15 = multiset_histogram2.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram16 = new utility.MultiSet<>();
        utility.Histogram histogram17 = new utility.Histogram();
        java.lang.Integer i19 = multiset_histogram16.put(histogram17, 0);
        utility.Histogram histogram20 = new utility.Histogram();
        multiset_histogram16.add(histogram20);
        java.lang.Integer i23 = multiset_histogram2.replace(histogram20, 2);
        java.lang.Integer i25 = multiset_histogram0.getOrDefault(i23, 7);
        utility.MultiSet<utility.Histogram> multiset_histogram26 = new utility.MultiSet<>();
        utility.Histogram histogram27 = new utility.Histogram();
        java.lang.Integer i29 = multiset_histogram26.put(histogram27, 0);
        utility.Histogram histogram30 = new utility.Histogram();
        multiset_histogram26.add(histogram30);
        java.lang.String[] str_array34 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str35 = new java.util.PriorityQueue<>();
        boolean b36 = java.util.Collections.addAll(priorityqueue_str35, str_array34);
        boolean b38 = priorityqueue_str35.offer("");
        java.lang.Integer i39 = multiset_histogram26.remove("");
        java.util.Set<utility.Histogram> set_histogram40 = multiset_histogram26.keySet();
        boolean b41 = multiset_histogram26.isEmpty();
        java.lang.String str42 = multiset_histogram26.toString();
        utility.MultiSet<utility.Histogram> multiset_histogram43 = new utility.MultiSet<>();
        utility.Histogram histogram44 = new utility.Histogram();
        java.lang.Integer i46 = multiset_histogram43.put(histogram44, 0);
        utility.Histogram histogram47 = new utility.Histogram();
        multiset_histogram43.add(histogram47);
        java.lang.String[] str_array51 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str52 = new java.util.PriorityQueue<>();
        boolean b53 = java.util.Collections.addAll(priorityqueue_str52, str_array51);
        boolean b55 = priorityqueue_str52.offer("");
        java.lang.Integer i56 = multiset_histogram43.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram57 = new utility.MultiSet<>();
        utility.Histogram histogram58 = new utility.Histogram();
        java.lang.Integer i60 = multiset_histogram57.put(histogram58, 0);
        utility.Histogram histogram61 = new utility.Histogram();
        multiset_histogram57.add(histogram61);
        java.lang.Integer i64 = multiset_histogram43.replace(histogram61, 2);
        utility.DataSourceFactory dataSourceFactory65 = new utility.DataSourceFactory();
        boolean b66 = multiset_histogram43.containsKey(dataSourceFactory65);
        utility.MultiSet<utility.Histogram> multiset_histogram67 = new utility.MultiSet<>();
        utility.Histogram histogram68 = new utility.Histogram();
        java.lang.Integer i70 = multiset_histogram67.put(histogram68, 0);
        utility.Histogram histogram71 = new utility.Histogram();
        multiset_histogram67.add(histogram71);
        java.lang.String[] str_array75 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str76 = new java.util.PriorityQueue<>();
        boolean b77 = java.util.Collections.addAll(priorityqueue_str76, str_array75);
        boolean b79 = priorityqueue_str76.offer("");
        java.lang.Integer i80 = multiset_histogram67.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram81 = new utility.MultiSet<>();
        utility.Histogram histogram82 = new utility.Histogram();
        java.lang.Integer i84 = multiset_histogram81.put(histogram82, 0);
        utility.Histogram histogram85 = new utility.Histogram();
        multiset_histogram81.add(histogram85);
        java.lang.Integer i88 = multiset_histogram67.replace(histogram85, 2);
        utility.DataSourceFactory dataSourceFactory89 = new utility.DataSourceFactory();
        boolean b90 = multiset_histogram67.containsKey(dataSourceFactory89);
        utility.Histogram histogram91 = new utility.Histogram();
        multiset_histogram67.add(histogram91);
        multiset_histogram43.add(histogram91);
        int i94 = multiset_histogram26.count(histogram91);
        javafx.scene.control.TextArea textArea95 = null;
        utility.TextAreaAppender textAreaAppender96 = new utility.TextAreaAppender(textArea95);
        java.util.logging.ErrorManager errorManager97 = textAreaAppender96.getErrorManager();
        boolean b98 = multiset_histogram0.remove(histogram91, textAreaAppender96);
        int i99 = multiset_histogram0.size();
        org.junit.Assert.assertNotNull(set_histogram1);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertNull(i19);
        org.junit.Assert.assertNull(i23);
        org.junit.Assert.assertTrue("'" + i25 + "' != '" + 7 + "'", i25.equals(7));
        org.junit.Assert.assertNull(i29);
        org.junit.Assert.assertNotNull(str_array34);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(i39);
        org.junit.Assert.assertNotNull(set_histogram40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(i46);
        org.junit.Assert.assertNotNull(str_array51);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNull(i56);
        org.junit.Assert.assertNull(i60);
        org.junit.Assert.assertNull(i64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(i70);
        org.junit.Assert.assertNotNull(str_array75);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNull(i80);
        org.junit.Assert.assertNull(i84);
        org.junit.Assert.assertNull(i88);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(i94 == 0);
        org.junit.Assert.assertNotNull(errorManager97);
        org.junit.Assert.assertTrue(b98 == false);
        org.junit.Assert.assertTrue(i99 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram14 = new utility.MultiSet<>();
        utility.Histogram histogram15 = new utility.Histogram();
        java.lang.Integer i17 = multiset_histogram14.put(histogram15, 0);
        utility.Histogram histogram18 = new utility.Histogram();
        multiset_histogram14.add(histogram18);
        java.lang.Integer i21 = multiset_histogram0.replace(histogram18, 2);
        utility.DataSourceFactory dataSourceFactory22 = new utility.DataSourceFactory();
        boolean b23 = multiset_histogram0.containsKey(dataSourceFactory22);
        utility.MultiSet<utility.Histogram> multiset_histogram24 = new utility.MultiSet<>();
        utility.Histogram histogram25 = new utility.Histogram();
        java.lang.Integer i27 = multiset_histogram24.put(histogram25, 0);
        utility.Histogram histogram28 = new utility.Histogram();
        multiset_histogram24.add(histogram28);
        java.lang.String[] str_array32 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str33 = new java.util.PriorityQueue<>();
        boolean b34 = java.util.Collections.addAll(priorityqueue_str33, str_array32);
        boolean b36 = priorityqueue_str33.offer("");
        java.lang.Integer i37 = multiset_histogram24.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram38 = new utility.MultiSet<>();
        utility.Histogram histogram39 = new utility.Histogram();
        java.lang.Integer i41 = multiset_histogram38.put(histogram39, 0);
        utility.Histogram histogram42 = new utility.Histogram();
        multiset_histogram38.add(histogram42);
        java.lang.Integer i45 = multiset_histogram24.replace(histogram42, 2);
        utility.DataSourceFactory dataSourceFactory46 = new utility.DataSourceFactory();
        boolean b47 = multiset_histogram24.containsKey(dataSourceFactory46);
        utility.Histogram histogram48 = new utility.Histogram();
        multiset_histogram24.add(histogram48);
        multiset_histogram0.add(histogram48);
        javafx.scene.control.TextArea textArea51 = null;
        utility.TextAreaAppender textAreaAppender52 = new utility.TextAreaAppender(textArea51);
        java.util.logging.Filter filter53 = textAreaAppender52.getFilter();
        java.util.logging.Level level54 = textAreaAppender52.getLevel();
        textAreaAppender52.flush();
        java.util.logging.Formatter formatter56 = textAreaAppender52.getFormatter();
        java.util.logging.Filter filter57 = null;
        textAreaAppender52.setFilter(filter57);
        javafx.scene.control.TextArea textArea59 = null;
        utility.TextAreaAppender textAreaAppender60 = new utility.TextAreaAppender(textArea59);
        javafx.scene.control.TextArea textArea61 = null;
        utility.TextAreaAppender textAreaAppender62 = new utility.TextAreaAppender(textArea61);
        java.util.logging.Filter filter63 = textAreaAppender62.getFilter();
        java.util.logging.Level level64 = textAreaAppender62.getLevel();
        textAreaAppender60.setLevel(level64);
        boolean b66 = multiset_histogram0.remove(filter57, textAreaAppender60);
        java.lang.Object obj67 = multiset_histogram0.clone();
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(i17);
        org.junit.Assert.assertNull(i21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(i27);
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(i37);
        org.junit.Assert.assertNull(i41);
        org.junit.Assert.assertNull(i45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(filter53);
        org.junit.Assert.assertNotNull(level54);
        org.junit.Assert.assertNotNull(formatter56);
        org.junit.Assert.assertNull(filter63);
        org.junit.Assert.assertNotNull(level64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(obj67);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.String[] str_array2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<>();
        boolean b4 = java.util.Collections.addAll(arraylist_str3, str_array2);
        java.util.stream.Stream<java.lang.String> stream_str5 = arraylist_str3.stream();
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<>();
        boolean b10 = java.util.Collections.addAll(arraylist_str9, str_array8);
        java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<>();
        boolean b15 = java.util.Collections.addAll(arraylist_str14, str_array13);
        java.lang.Boolean b16 = utility.Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        java.lang.String[] str_array20 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<>();
        boolean b22 = java.util.Collections.addAll(arraylist_str21, str_array20);
        java.util.stream.Stream<java.lang.String> stream_str23 = arraylist_str21.stream();
        java.lang.String[] str_array26 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str27 = new java.util.ArrayList<>();
        boolean b28 = java.util.Collections.addAll(arraylist_str27, str_array26);
        java.lang.String[] str_array31 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<>();
        boolean b33 = java.util.Collections.addAll(arraylist_str32, str_array31);
        java.lang.Boolean b34 = utility.Tokenization.contains(arraylist_str27, arraylist_str32);
        boolean b35 = arraylist_str21.containsAll(arraylist_str32);
        double d36 = utility.TokenShareRatio.setTokenShareRatioFkLD(arraylist_str3, arraylist_str21);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str38 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i39 = heapwithfixedsize_str38.size();
        boolean b40 = arraylist_str21.retainAll(heapwithfixedsize_str38);
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(stream_str5);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(stream_str23);
        org.junit.Assert.assertNotNull(str_array26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(str_array31);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + b34 + "' != '" + true + "'", b34.equals(true));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(d36 == 1.0d);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        javafx.scene.control.TextArea textArea0 = null;
        utility.TextAreaAppender textAreaAppender1 = new utility.TextAreaAppender(textArea0);
        java.util.logging.Filter filter2 = null;
        textAreaAppender1.setFilter(filter2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        java.util.Set<utility.Histogram> set_histogram14 = multiset_histogram0.keySet();
        boolean b15 = multiset_histogram0.isEmpty();
        java.lang.String str16 = multiset_histogram0.toString();
        utility.MultiSet<utility.Histogram> multiset_histogram17 = new utility.MultiSet<>();
        utility.Histogram histogram18 = new utility.Histogram();
        java.lang.Integer i20 = multiset_histogram17.put(histogram18, 0);
        utility.Histogram histogram21 = new utility.Histogram();
        multiset_histogram17.add(histogram21);
        java.lang.String[] str_array25 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str26 = new java.util.PriorityQueue<>();
        boolean b27 = java.util.Collections.addAll(priorityqueue_str26, str_array25);
        boolean b29 = priorityqueue_str26.offer("");
        java.lang.Integer i30 = multiset_histogram17.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram31 = new utility.MultiSet<>();
        utility.Histogram histogram32 = new utility.Histogram();
        java.lang.Integer i34 = multiset_histogram31.put(histogram32, 0);
        utility.Histogram histogram35 = new utility.Histogram();
        multiset_histogram31.add(histogram35);
        java.lang.String[] str_array39 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str40 = new java.util.PriorityQueue<>();
        boolean b41 = java.util.Collections.addAll(priorityqueue_str40, str_array39);
        boolean b43 = priorityqueue_str40.offer("");
        java.lang.Integer i44 = multiset_histogram31.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram45 = new utility.MultiSet<>();
        utility.Histogram histogram46 = new utility.Histogram();
        java.lang.Integer i48 = multiset_histogram45.put(histogram46, 0);
        utility.Histogram histogram49 = new utility.Histogram();
        multiset_histogram45.add(histogram49);
        java.lang.Integer i52 = multiset_histogram31.replace(histogram49, 2);
        utility.DataSourceFactory dataSourceFactory53 = new utility.DataSourceFactory();
        boolean b54 = multiset_histogram31.containsKey(dataSourceFactory53);
        utility.Histogram histogram55 = new utility.Histogram();
        multiset_histogram31.add(histogram55);
        boolean b59 = multiset_histogram17.replace(histogram55, 0, 3);
        java.lang.Integer i61 = multiset_histogram0.putIfAbsent(histogram55, 5);
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNotNull(set_histogram14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(i20);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(i30);
        org.junit.Assert.assertNull(i34);
        org.junit.Assert.assertNotNull(str_array39);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(i44);
        org.junit.Assert.assertNull(i48);
        org.junit.Assert.assertNull(i52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(i61);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str3 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i4 = heapwithfixedsize_str3.size();
        boolean b5 = heapwithfixedsize_str1.retainAll(heapwithfixedsize_str3);
        java.util.Iterator<java.lang.String> iterator_str6 = heapwithfixedsize_str1.iterator();
        utility.MultiSet<utility.Histogram> multiset_histogram7 = new utility.MultiSet<>();
        utility.Histogram histogram8 = new utility.Histogram();
        java.lang.Integer i10 = multiset_histogram7.put(histogram8, 0);
        utility.Histogram histogram11 = new utility.Histogram();
        multiset_histogram7.add(histogram11);
        java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str16 = new java.util.PriorityQueue<>();
        boolean b17 = java.util.Collections.addAll(priorityqueue_str16, str_array15);
        boolean b19 = priorityqueue_str16.offer("");
        java.lang.Integer i20 = multiset_histogram7.remove("");
        java.util.Set<utility.Histogram> set_histogram21 = multiset_histogram7.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram22 = new utility.MultiSet<>();
        utility.Histogram histogram23 = new utility.Histogram();
        java.lang.Integer i25 = multiset_histogram22.put(histogram23, 0);
        utility.Histogram histogram26 = new utility.Histogram();
        multiset_histogram22.add(histogram26);
        java.lang.String[] str_array30 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str31 = new java.util.PriorityQueue<>();
        boolean b32 = java.util.Collections.addAll(priorityqueue_str31, str_array30);
        boolean b34 = priorityqueue_str31.offer("");
        java.lang.Integer i35 = multiset_histogram22.remove("");
        java.util.Set<utility.Histogram> set_histogram36 = multiset_histogram22.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram37 = new utility.MultiSet<>();
        utility.Histogram histogram38 = new utility.Histogram();
        java.lang.Integer i40 = multiset_histogram37.put(histogram38, 0);
        utility.Histogram histogram41 = new utility.Histogram();
        multiset_histogram37.add(histogram41);
        int i43 = multiset_histogram22.count(histogram41);
        int i44 = multiset_histogram7.count(histogram41);
        java.lang.Object[] obj_array46 = new java.lang.Object[] { i44, 10L };
        java.lang.Object[] obj_array47 = heapwithfixedsize_str1.toArray(obj_array46);
        java.util.stream.Stream<java.lang.String> stream_str48 = heapwithfixedsize_str1.parallelStream();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(i20);
        org.junit.Assert.assertNotNull(set_histogram21);
        org.junit.Assert.assertNull(i25);
        org.junit.Assert.assertNotNull(str_array30);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(i35);
        org.junit.Assert.assertNotNull(set_histogram36);
        org.junit.Assert.assertNull(i40);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertNotNull(stream_str48);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        double[] d_array3 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array6 = new double[] { (byte) 1, (short) 1 };
        double[] d_array9 = utility.Histogram.rel2abs(d_array6, (double) 100.0f, (double) ' ');
        double[] d_array12 = new double[] { (byte) 1, (short) 1 };
        double[] d_array15 = utility.Histogram.rel2abs(d_array12, (double) 100.0f, (double) ' ');
        double d17 = utility.Logistic.classify(d_array9, d_array15, (double) 100.0f);
        java.lang.Double d18 = utility.Histogram.jaccard(d_array3, d_array15);
        try {
            float[] f_array19 = utility.Otsu.otsuThreshold(d_array3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(d_array3);
        org.junit.Assert.assertNotNull(d_array6);
        org.junit.Assert.assertNotNull(d_array9);
        org.junit.Assert.assertNotNull(d_array12);
        org.junit.Assert.assertNotNull(d_array15);
        org.junit.Assert.assertTrue(d17 == 1.0d);
        org.junit.Assert.assertTrue("'" + d18 + "' != '" + 0.0d + "'", d18.equals(0.0d));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram14 = new utility.MultiSet<>();
        utility.Histogram histogram15 = new utility.Histogram();
        java.lang.Integer i17 = multiset_histogram14.put(histogram15, 0);
        utility.Histogram histogram18 = new utility.Histogram();
        multiset_histogram14.add(histogram18);
        java.lang.Integer i21 = multiset_histogram0.replace(histogram18, 2);
        utility.DataSourceFactory dataSourceFactory22 = new utility.DataSourceFactory();
        boolean b23 = multiset_histogram0.containsKey(dataSourceFactory22);
        utility.Histogram histogram24 = new utility.Histogram();
        multiset_histogram0.add(histogram24);
        utility.MultiSet<utility.Histogram> multiset_histogram26 = new utility.MultiSet<>();
        java.util.Set<utility.Histogram> set_histogram27 = multiset_histogram26.keySet();
        java.lang.String str28 = multiset_histogram26.toString();
        boolean b31 = multiset_histogram26.remove(100.0d, 100);
        utility.String2Num string2Num32 = new utility.String2Num();
        boolean b33 = multiset_histogram26.containsValue(string2Num32);
        multiset_histogram0.putAll(multiset_histogram26);
        int i35 = multiset_histogram26.size();
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(i17);
        org.junit.Assert.assertNull(i21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set_histogram27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i35 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        java.util.Set<utility.Histogram> set_histogram14 = multiset_histogram0.keySet();
        int i15 = multiset_histogram0.totalCount();
        utility.MultiSet<utility.Histogram> multiset_histogram16 = new utility.MultiSet<>();
        utility.Histogram histogram17 = new utility.Histogram();
        java.lang.Integer i19 = multiset_histogram16.put(histogram17, 0);
        utility.Histogram histogram20 = new utility.Histogram();
        multiset_histogram16.add(histogram20);
        java.lang.String[] str_array24 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str25 = new java.util.PriorityQueue<>();
        boolean b26 = java.util.Collections.addAll(priorityqueue_str25, str_array24);
        boolean b28 = priorityqueue_str25.offer("");
        java.lang.Integer i29 = multiset_histogram16.remove("");
        java.util.Set<utility.Histogram> set_histogram30 = multiset_histogram16.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram31 = new utility.MultiSet<>();
        utility.Histogram histogram32 = new utility.Histogram();
        java.lang.Integer i34 = multiset_histogram31.put(histogram32, 0);
        utility.Histogram histogram35 = new utility.Histogram();
        multiset_histogram31.add(histogram35);
        java.lang.String[] str_array39 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str40 = new java.util.PriorityQueue<>();
        boolean b41 = java.util.Collections.addAll(priorityqueue_str40, str_array39);
        boolean b43 = priorityqueue_str40.offer("");
        java.lang.Integer i44 = multiset_histogram31.remove("");
        java.util.Set<utility.Histogram> set_histogram45 = multiset_histogram31.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram46 = new utility.MultiSet<>();
        utility.Histogram histogram47 = new utility.Histogram();
        java.lang.Integer i49 = multiset_histogram46.put(histogram47, 0);
        utility.Histogram histogram50 = new utility.Histogram();
        multiset_histogram46.add(histogram50);
        int i52 = multiset_histogram31.count(histogram50);
        int i53 = multiset_histogram16.count(histogram50);
        java.lang.Integer i55 = multiset_histogram0.replace(histogram50, 2);
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNotNull(set_histogram14);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNull(i19);
        org.junit.Assert.assertNotNull(str_array24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(i29);
        org.junit.Assert.assertNotNull(set_histogram30);
        org.junit.Assert.assertNull(i34);
        org.junit.Assert.assertNotNull(str_array39);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(i44);
        org.junit.Assert.assertNotNull(set_histogram45);
        org.junit.Assert.assertNull(i49);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNull(i55);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "[hi!, hi!]", "", "", "{}" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str6 = new java.util.PriorityQueue<>();
        boolean b7 = java.util.Collections.addAll(priorityqueue_str6, str_array5);
        java.lang.Object obj8 = null;
        boolean b9 = priorityqueue_str6.contains(obj8);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str3 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i4 = heapwithfixedsize_str3.size();
        boolean b5 = heapwithfixedsize_str1.retainAll(heapwithfixedsize_str3);
        java.util.Iterator<java.lang.String> iterator_str6 = heapwithfixedsize_str1.iterator();
        int i7 = heapwithfixedsize_str1.size();
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str9 = new utility.HeapWithFixedSize<>((int) '#');
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str11 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        boolean b13 = heapwithfixedsize_str11.offer("hi!");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str15 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str17 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i18 = heapwithfixedsize_str17.size();
        boolean b19 = heapwithfixedsize_str15.retainAll(heapwithfixedsize_str17);
        java.util.Queue[] queue_array21 = new java.util.Queue[3];
        @SuppressWarnings("unchecked") java.util.Queue<java.lang.String>[] queue_str_array22 = (java.util.Queue<java.lang.String>[]) queue_array21;
        queue_str_array22[0] = heapwithfixedsize_str9;
        queue_str_array22[1] = heapwithfixedsize_str11;
        queue_str_array22[2] = heapwithfixedsize_str15;
        java.util.Queue<java.lang.String>[] queue_str_array29 = heapwithfixedsize_str1.toArray(queue_str_array22);
        boolean b31 = heapwithfixedsize_str1.add("hi!");
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(queue_array21);
        org.junit.Assert.assertNotNull(queue_str_array22);
        org.junit.Assert.assertNotNull(queue_str_array29);
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        utility.MultiMap multiMap0 = new utility.MultiMap();
        multiMap0.put("hi!", "hi!");
        java.util.List<java.lang.String> list_str5 = multiMap0.get("[hi!, hi!]");
        org.junit.Assert.assertNotNull(list_str5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.String[] str_array2 = new java.lang.String[] { "{}", "hi!" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str3 = new java.util.PriorityQueue<>();
        boolean b4 = java.util.Collections.addAll(priorityqueue_str3, str_array2);
        java.util.List<java.lang.String> list_str6 = utility.Tokenization.lowercaseSplit("hi!");
        java.lang.String[] str_array9 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str10 = new java.util.ArrayList<>();
        boolean b11 = java.util.Collections.addAll(arraylist_str10, str_array9);
        java.util.stream.Stream<java.lang.String> stream_str12 = arraylist_str10.stream();
        java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<>();
        boolean b17 = java.util.Collections.addAll(arraylist_str16, str_array15);
        java.lang.String[] str_array20 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<>();
        boolean b22 = java.util.Collections.addAll(arraylist_str21, str_array20);
        java.lang.Boolean b23 = utility.Tokenization.contains(arraylist_str16, arraylist_str21);
        boolean b24 = arraylist_str10.containsAll(arraylist_str21);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str26 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str28 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i29 = heapwithfixedsize_str28.size();
        boolean b30 = heapwithfixedsize_str26.retainAll(heapwithfixedsize_str28);
        boolean b31 = arraylist_str21.removeAll(heapwithfixedsize_str28);
        java.lang.String[] str_array34 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str35 = new java.util.ArrayList<>();
        boolean b36 = java.util.Collections.addAll(arraylist_str35, str_array34);
        java.lang.String[] str_array39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str40 = new java.util.ArrayList<>();
        boolean b41 = java.util.Collections.addAll(arraylist_str40, str_array39);
        java.lang.Boolean b42 = utility.Tokenization.contains(arraylist_str35, arraylist_str40);
        boolean b43 = arraylist_str40.isEmpty();
        java.lang.String[] str_array46 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str47 = new java.util.ArrayList<>();
        boolean b48 = java.util.Collections.addAll(arraylist_str47, str_array46);
        java.util.stream.Stream<java.lang.String> stream_str49 = arraylist_str47.stream();
        java.lang.String[] str_array52 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str53 = new java.util.ArrayList<>();
        boolean b54 = java.util.Collections.addAll(arraylist_str53, str_array52);
        java.lang.String[] str_array57 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str58 = new java.util.ArrayList<>();
        boolean b59 = java.util.Collections.addAll(arraylist_str58, str_array57);
        java.lang.Boolean b60 = utility.Tokenization.contains(arraylist_str53, arraylist_str58);
        boolean b61 = arraylist_str47.containsAll(arraylist_str58);
        boolean b62 = arraylist_str40.removeAll(arraylist_str58);
        double d63 = utility.TokenShareRatio.setTokenShareRatioFkLD(arraylist_str21, arraylist_str58);
        java.lang.Boolean b64 = utility.Tokenization.contains(list_str6, arraylist_str58);
        boolean b65 = priorityqueue_str3.contains(list_str6);
        java.lang.String[] str_array68 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str69 = new java.util.ArrayList<>();
        boolean b70 = java.util.Collections.addAll(arraylist_str69, str_array68);
        java.util.stream.Stream<java.lang.String> stream_str71 = arraylist_str69.stream();
        boolean b72 = priorityqueue_str3.contains(arraylist_str69);
        java.lang.Object[] obj_array73 = priorityqueue_str3.toArray();
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertNotNull(str_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(stream_str12);
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + b23 + "' != '" + true + "'", b23.equals(true));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(str_array34);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(str_array39);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + b42 + "' != '" + true + "'", b42.equals(true));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(str_array46);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(stream_str49);
        org.junit.Assert.assertNotNull(str_array52);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(str_array57);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue("'" + b60 + "' != '" + true + "'", b60.equals(true));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(d63 == 1.0d);
        org.junit.Assert.assertTrue("'" + b64 + "' != '" + false + "'", b64.equals(false));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(str_array68);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(stream_str71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(obj_array73);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        java.lang.String[] str_array4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<>();
        boolean b6 = java.util.Collections.addAll(arraylist_str5, str_array4);
        java.util.stream.Stream<java.lang.String> stream_str7 = arraylist_str5.stream();
        java.util.stream.Stream<java.lang.String> stream_str8 = arraylist_str5.parallelStream();
        java.lang.String[] str_array11 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<>();
        boolean b13 = java.util.Collections.addAll(arraylist_str12, str_array11);
        java.util.stream.Stream<java.lang.String> stream_str14 = arraylist_str12.stream();
        java.lang.String[] str_array17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<>();
        boolean b19 = java.util.Collections.addAll(arraylist_str18, str_array17);
        java.util.stream.Stream<java.lang.String> stream_str20 = arraylist_str18.stream();
        java.util.stream.Stream<java.lang.String> stream_str21 = arraylist_str18.parallelStream();
        java.lang.String[] str_array24 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<>();
        boolean b26 = java.util.Collections.addAll(arraylist_str25, str_array24);
        java.util.stream.Stream<java.lang.String> stream_str27 = arraylist_str25.stream();
        java.util.stream.Stream<java.lang.String> stream_str28 = arraylist_str25.parallelStream();
        java.lang.String[] str_array31 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<>();
        boolean b33 = java.util.Collections.addAll(arraylist_str32, str_array31);
        java.util.stream.Stream<java.lang.String> stream_str34 = arraylist_str32.stream();
        java.lang.String[] str_array37 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<>();
        boolean b39 = java.util.Collections.addAll(arraylist_str38, str_array37);
        java.util.stream.Stream<java.lang.String> stream_str40 = arraylist_str38.stream();
        java.util.stream.Stream<java.lang.String> stream_str41 = arraylist_str38.parallelStream();
        java.util.stream.Stream[] stream_array43 = new java.util.stream.Stream[6];
        @SuppressWarnings("unchecked") java.util.stream.Stream<java.lang.String>[] stream_str_array44 = (java.util.stream.Stream<java.lang.String>[]) stream_array43;
        stream_str_array44[0] = stream_str8;
        stream_str_array44[1] = stream_str14;
        stream_str_array44[2] = stream_str21;
        stream_str_array44[3] = stream_str28;
        stream_str_array44[4] = stream_str34;
        stream_str_array44[5] = stream_str41;
        java.util.stream.Stream<java.lang.String>[] stream_str_array57 = heapwithfixedsize_str1.toArray(stream_str_array44);
        java.util.Iterator<java.lang.String> iterator_str58 = heapwithfixedsize_str1.iterator();
        heapwithfixedsize_str1.clear();
        org.junit.Assert.assertNotNull(str_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(stream_str7);
        org.junit.Assert.assertNotNull(stream_str8);
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(stream_str14);
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(stream_str20);
        org.junit.Assert.assertNotNull(stream_str21);
        org.junit.Assert.assertNotNull(str_array24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(stream_str27);
        org.junit.Assert.assertNotNull(stream_str28);
        org.junit.Assert.assertNotNull(str_array31);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(stream_str34);
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(stream_str40);
        org.junit.Assert.assertNotNull(stream_str41);
        org.junit.Assert.assertNotNull(stream_array43);
        org.junit.Assert.assertNotNull(stream_str_array44);
        org.junit.Assert.assertNotNull(stream_str_array57);
        org.junit.Assert.assertNotNull(iterator_str58);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram14 = new utility.MultiSet<>();
        utility.Histogram histogram15 = new utility.Histogram();
        java.lang.Integer i17 = multiset_histogram14.put(histogram15, 0);
        utility.Histogram histogram18 = new utility.Histogram();
        multiset_histogram14.add(histogram18);
        java.lang.Integer i21 = multiset_histogram0.replace(histogram18, 2);
        utility.MultiSet<utility.Histogram> multiset_histogram22 = new utility.MultiSet<>();
        utility.Histogram histogram23 = new utility.Histogram();
        java.lang.Integer i25 = multiset_histogram22.put(histogram23, 0);
        utility.Histogram histogram26 = new utility.Histogram();
        multiset_histogram22.add(histogram26);
        java.lang.String[] str_array30 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str31 = new java.util.PriorityQueue<>();
        boolean b32 = java.util.Collections.addAll(priorityqueue_str31, str_array30);
        boolean b34 = priorityqueue_str31.offer("");
        java.lang.Integer i35 = multiset_histogram22.remove("");
        java.util.Set<utility.Histogram> set_histogram36 = multiset_histogram22.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram37 = new utility.MultiSet<>();
        utility.Histogram histogram38 = new utility.Histogram();
        java.lang.Integer i40 = multiset_histogram37.put(histogram38, 0);
        utility.Histogram histogram41 = new utility.Histogram();
        multiset_histogram37.add(histogram41);
        int i43 = multiset_histogram22.count(histogram41);
        int i44 = multiset_histogram0.count(histogram41);
        java.lang.Object obj45 = multiset_histogram0.clone();
        java.lang.Integer i48 = multiset_histogram0.getOrDefault("hi!", 7);
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(i17);
        org.junit.Assert.assertNull(i21);
        org.junit.Assert.assertNull(i25);
        org.junit.Assert.assertNotNull(str_array30);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(i35);
        org.junit.Assert.assertNotNull(set_histogram36);
        org.junit.Assert.assertNull(i40);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + i48 + "' != '" + 7 + "'", i48.equals(7));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        double[] d_array3 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array6 = new double[] { (byte) 1, (short) 1 };
        double[] d_array9 = utility.Histogram.rel2abs(d_array6, (double) 100.0f, (double) ' ');
        double[] d_array12 = new double[] { (byte) 1, (short) 1 };
        double[] d_array15 = utility.Histogram.rel2abs(d_array12, (double) 100.0f, (double) ' ');
        double d17 = utility.Logistic.classify(d_array9, d_array15, (double) 100.0f);
        java.lang.Double d18 = utility.Histogram.jaccard(d_array3, d_array15);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str20 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i21 = heapwithfixedsize_str20.size();
        double[] d_array25 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array28 = new double[] { (byte) 1, (short) 1 };
        double[] d_array31 = utility.Histogram.rel2abs(d_array28, (double) 100.0f, (double) ' ');
        double[] d_array34 = new double[] { (byte) 1, (short) 1 };
        double[] d_array37 = utility.Histogram.rel2abs(d_array34, (double) 100.0f, (double) ' ');
        double d39 = utility.Logistic.classify(d_array31, d_array37, (double) 100.0f);
        java.lang.Double d40 = utility.Histogram.jaccard(d_array25, d_array37);
        double[] d_array43 = new double[] { (byte) 1, (short) 1 };
        double[] d_array46 = utility.Histogram.rel2abs(d_array43, (double) 100.0f, (double) ' ');
        double[] d_array47 = utility.Multiplication.elementWise(d_array25, d_array46);
        boolean b48 = heapwithfixedsize_str20.remove(d_array25);
        java.lang.Double d49 = utility.Histogram.jaccard(d_array3, d_array25);
        double[] d_array52 = new double[] { (byte) 1, (short) 1 };
        double[] d_array55 = utility.Histogram.rel2abs(d_array52, (double) 100.0f, (double) ' ');
        double[] d_array58 = new double[] { (byte) 1, (short) 1 };
        double[] d_array61 = utility.Histogram.rel2abs(d_array58, (double) 100.0f, (double) ' ');
        double[] d_array64 = new double[] { (byte) 1, (short) 1 };
        double[] d_array67 = utility.Histogram.rel2abs(d_array64, (double) 100.0f, (double) ' ');
        double d69 = utility.Logistic.classify(d_array61, d_array67, (double) 100.0f);
        java.lang.Double d70 = utility.Histogram.jaccard(d_array55, d_array61);
        double[] d_array73 = utility.Histogram.rel2abs(d_array61, (double) 4, (double) 4);
        double[] d_array74 = new double[] {};
        java.lang.Double d75 = utility.Histogram.jaccard(d_array73, d_array74);
        try {
            double d77 = utility.Logistic.classify(d_array25, d_array74, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(d_array3);
        org.junit.Assert.assertNotNull(d_array6);
        org.junit.Assert.assertNotNull(d_array9);
        org.junit.Assert.assertNotNull(d_array12);
        org.junit.Assert.assertNotNull(d_array15);
        org.junit.Assert.assertTrue(d17 == 1.0d);
        org.junit.Assert.assertTrue("'" + d18 + "' != '" + 0.0d + "'", d18.equals(0.0d));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(d_array25);
        org.junit.Assert.assertNotNull(d_array28);
        org.junit.Assert.assertNotNull(d_array31);
        org.junit.Assert.assertNotNull(d_array34);
        org.junit.Assert.assertNotNull(d_array37);
        org.junit.Assert.assertTrue(d39 == 1.0d);
        org.junit.Assert.assertTrue("'" + d40 + "' != '" + 0.0d + "'", d40.equals(0.0d));
        org.junit.Assert.assertNotNull(d_array43);
        org.junit.Assert.assertNotNull(d_array46);
        org.junit.Assert.assertNotNull(d_array47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + d49 + "' != '" + 1.0d + "'", d49.equals(1.0d));
        org.junit.Assert.assertNotNull(d_array52);
        org.junit.Assert.assertNotNull(d_array55);
        org.junit.Assert.assertNotNull(d_array58);
        org.junit.Assert.assertNotNull(d_array61);
        org.junit.Assert.assertNotNull(d_array64);
        org.junit.Assert.assertNotNull(d_array67);
        org.junit.Assert.assertTrue(d69 == 1.0d);
        org.junit.Assert.assertEquals(d70, Double.NaN, 0);
        org.junit.Assert.assertNotNull(d_array73);
        org.junit.Assert.assertNotNull(d_array74);
        org.junit.Assert.assertEquals(d75, Double.NaN, 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        main.Table[] table_array0 = new main.Table[] {};
        java.util.ArrayList<main.Table> arraylist_table1 = new java.util.ArrayList<>();
        boolean b2 = java.util.Collections.addAll(arraylist_table1, table_array0);
        utility.Chen chen3 = new utility.Chen(arraylist_table1);
        java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str7 = new java.util.ArrayList<>();
        boolean b8 = java.util.Collections.addAll(arraylist_str7, str_array6);
        java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<>();
        boolean b13 = java.util.Collections.addAll(arraylist_str12, str_array11);
        java.lang.Boolean b14 = utility.Tokenization.contains(arraylist_str7, arraylist_str12);
        boolean b15 = arraylist_str12.isEmpty();
        java.lang.String[] str_array18 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<>();
        boolean b20 = java.util.Collections.addAll(arraylist_str19, str_array18);
        java.util.stream.Stream<java.lang.String> stream_str21 = arraylist_str19.stream();
        java.lang.String[] str_array24 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<>();
        boolean b26 = java.util.Collections.addAll(arraylist_str25, str_array24);
        java.lang.String[] str_array29 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<>();
        boolean b31 = java.util.Collections.addAll(arraylist_str30, str_array29);
        java.lang.Boolean b32 = utility.Tokenization.contains(arraylist_str25, arraylist_str30);
        boolean b33 = arraylist_str19.containsAll(arraylist_str30);
        boolean b34 = arraylist_str12.removeAll(arraylist_str30);
        java.lang.String[] str_array37 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<>();
        boolean b39 = java.util.Collections.addAll(arraylist_str38, str_array37);
        java.util.stream.Stream<java.lang.String> stream_str40 = arraylist_str38.stream();
        double d41 = chen3.getTableChenSimilarity(arraylist_str30, arraylist_str38);
        java.lang.String[] str_array44 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str45 = new java.util.ArrayList<>();
        boolean b46 = java.util.Collections.addAll(arraylist_str45, str_array44);
        java.util.stream.Stream<java.lang.String> stream_str47 = arraylist_str45.stream();
        java.lang.String[] str_array50 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str51 = new java.util.ArrayList<>();
        boolean b52 = java.util.Collections.addAll(arraylist_str51, str_array50);
        java.lang.String[] str_array55 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str56 = new java.util.ArrayList<>();
        boolean b57 = java.util.Collections.addAll(arraylist_str56, str_array55);
        java.lang.Boolean b58 = utility.Tokenization.contains(arraylist_str51, arraylist_str56);
        boolean b59 = arraylist_str45.containsAll(arraylist_str56);
        double d60 = utility.TokenShareRatio.setTokenShareRatioFkLD(arraylist_str38, arraylist_str45);
        org.junit.Assert.assertNotNull(table_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + b14 + "' != '" + true + "'", b14.equals(true));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(stream_str21);
        org.junit.Assert.assertNotNull(str_array24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(str_array29);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + b32 + "' != '" + true + "'", b32.equals(true));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(stream_str40);
        org.junit.Assert.assertEquals(d41, Double.NaN, 0);
        org.junit.Assert.assertNotNull(str_array44);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(stream_str47);
        org.junit.Assert.assertNotNull(str_array50);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(str_array55);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue("'" + b58 + "' != '" + true + "'", b58.equals(true));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(d60 == 1.0d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        try {
            utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        javafx.scene.control.TextArea textArea0 = null;
        utility.TextAreaAppender textAreaAppender1 = new utility.TextAreaAppender(textArea0);
        java.util.logging.Filter filter2 = textAreaAppender1.getFilter();
        java.util.logging.Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        java.util.logging.Filter filter5 = null;
        textAreaAppender1.setFilter(filter5);
        textAreaAppender1.close();
        java.util.logging.Level level8 = textAreaAppender1.getLevel();
        java.util.logging.LogRecord logRecord9 = null;
        boolean b10 = textAreaAppender1.isLoggable(logRecord9);
        org.junit.Assert.assertNull(filter2);
        org.junit.Assert.assertNotNull(level3);
        org.junit.Assert.assertNotNull(level8);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.String[] str_array2 = new java.lang.String[] { "{}", "hi!" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str3 = new java.util.PriorityQueue<>();
        boolean b4 = java.util.Collections.addAll(priorityqueue_str3, str_array2);
        java.util.List<java.lang.String> list_str6 = utility.Tokenization.lowercaseSplit("hi!");
        java.lang.String[] str_array9 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str10 = new java.util.ArrayList<>();
        boolean b11 = java.util.Collections.addAll(arraylist_str10, str_array9);
        java.util.stream.Stream<java.lang.String> stream_str12 = arraylist_str10.stream();
        java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<>();
        boolean b17 = java.util.Collections.addAll(arraylist_str16, str_array15);
        java.lang.String[] str_array20 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<>();
        boolean b22 = java.util.Collections.addAll(arraylist_str21, str_array20);
        java.lang.Boolean b23 = utility.Tokenization.contains(arraylist_str16, arraylist_str21);
        boolean b24 = arraylist_str10.containsAll(arraylist_str21);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str26 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str28 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i29 = heapwithfixedsize_str28.size();
        boolean b30 = heapwithfixedsize_str26.retainAll(heapwithfixedsize_str28);
        boolean b31 = arraylist_str21.removeAll(heapwithfixedsize_str28);
        java.lang.String[] str_array34 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str35 = new java.util.ArrayList<>();
        boolean b36 = java.util.Collections.addAll(arraylist_str35, str_array34);
        java.lang.String[] str_array39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str40 = new java.util.ArrayList<>();
        boolean b41 = java.util.Collections.addAll(arraylist_str40, str_array39);
        java.lang.Boolean b42 = utility.Tokenization.contains(arraylist_str35, arraylist_str40);
        boolean b43 = arraylist_str40.isEmpty();
        java.lang.String[] str_array46 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str47 = new java.util.ArrayList<>();
        boolean b48 = java.util.Collections.addAll(arraylist_str47, str_array46);
        java.util.stream.Stream<java.lang.String> stream_str49 = arraylist_str47.stream();
        java.lang.String[] str_array52 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str53 = new java.util.ArrayList<>();
        boolean b54 = java.util.Collections.addAll(arraylist_str53, str_array52);
        java.lang.String[] str_array57 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str58 = new java.util.ArrayList<>();
        boolean b59 = java.util.Collections.addAll(arraylist_str58, str_array57);
        java.lang.Boolean b60 = utility.Tokenization.contains(arraylist_str53, arraylist_str58);
        boolean b61 = arraylist_str47.containsAll(arraylist_str58);
        boolean b62 = arraylist_str40.removeAll(arraylist_str58);
        double d63 = utility.TokenShareRatio.setTokenShareRatioFkLD(arraylist_str21, arraylist_str58);
        java.lang.Boolean b64 = utility.Tokenization.contains(list_str6, arraylist_str58);
        boolean b65 = priorityqueue_str3.contains(list_str6);
        utility.Tpc tpc66 = new utility.Tpc();
        utility.Tpc tpc67 = new utility.Tpc();
        utility.Tpc[] tpc_array68 = new utility.Tpc[] { tpc66, tpc67 };
        try {
            utility.Tpc[] tpc_array69 = priorityqueue_str3.toArray(tpc_array68);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException");
        } catch (java.lang.ArrayStoreException e) {
        }
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertNotNull(str_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(stream_str12);
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + b23 + "' != '" + true + "'", b23.equals(true));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(str_array34);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(str_array39);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + b42 + "' != '" + true + "'", b42.equals(true));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(str_array46);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(stream_str49);
        org.junit.Assert.assertNotNull(str_array52);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(str_array57);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue("'" + b60 + "' != '" + true + "'", b60.equals(true));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(d63 == 1.0d);
        org.junit.Assert.assertTrue("'" + b64 + "' != '" + false + "'", b64.equals(false));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(tpc_array68);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.List<java.lang.String> list_str1 = utility.Tokenization.lowercaseSplit("[hi!, hi!]");
        org.junit.Assert.assertNotNull(list_str1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        java.util.Set<utility.Histogram> set_histogram1 = multiset_histogram0.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram2 = new utility.MultiSet<>();
        utility.Histogram histogram3 = new utility.Histogram();
        java.lang.Integer i5 = multiset_histogram2.put(histogram3, 0);
        utility.Histogram histogram6 = new utility.Histogram();
        multiset_histogram2.add(histogram6);
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str11 = new java.util.PriorityQueue<>();
        boolean b12 = java.util.Collections.addAll(priorityqueue_str11, str_array10);
        boolean b14 = priorityqueue_str11.offer("");
        java.lang.Integer i15 = multiset_histogram2.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram16 = new utility.MultiSet<>();
        utility.Histogram histogram17 = new utility.Histogram();
        java.lang.Integer i19 = multiset_histogram16.put(histogram17, 0);
        utility.Histogram histogram20 = new utility.Histogram();
        multiset_histogram16.add(histogram20);
        java.lang.Integer i23 = multiset_histogram2.replace(histogram20, 2);
        java.lang.Integer i25 = multiset_histogram0.getOrDefault(i23, 7);
        utility.MultiSet<utility.Histogram> multiset_histogram26 = new utility.MultiSet<>();
        utility.Histogram histogram27 = new utility.Histogram();
        java.lang.Integer i29 = multiset_histogram26.put(histogram27, 0);
        utility.Histogram histogram30 = new utility.Histogram();
        multiset_histogram26.add(histogram30);
        java.lang.String[] str_array34 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str35 = new java.util.PriorityQueue<>();
        boolean b36 = java.util.Collections.addAll(priorityqueue_str35, str_array34);
        boolean b38 = priorityqueue_str35.offer("");
        java.lang.Integer i39 = multiset_histogram26.remove("");
        java.util.Set<utility.Histogram> set_histogram40 = multiset_histogram26.keySet();
        boolean b41 = multiset_histogram26.isEmpty();
        java.lang.String str42 = multiset_histogram26.toString();
        utility.MultiSet<utility.Histogram> multiset_histogram43 = new utility.MultiSet<>();
        utility.Histogram histogram44 = new utility.Histogram();
        java.lang.Integer i46 = multiset_histogram43.put(histogram44, 0);
        utility.Histogram histogram47 = new utility.Histogram();
        multiset_histogram43.add(histogram47);
        java.lang.String[] str_array51 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str52 = new java.util.PriorityQueue<>();
        boolean b53 = java.util.Collections.addAll(priorityqueue_str52, str_array51);
        boolean b55 = priorityqueue_str52.offer("");
        java.lang.Integer i56 = multiset_histogram43.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram57 = new utility.MultiSet<>();
        utility.Histogram histogram58 = new utility.Histogram();
        java.lang.Integer i60 = multiset_histogram57.put(histogram58, 0);
        utility.Histogram histogram61 = new utility.Histogram();
        multiset_histogram57.add(histogram61);
        java.lang.Integer i64 = multiset_histogram43.replace(histogram61, 2);
        utility.DataSourceFactory dataSourceFactory65 = new utility.DataSourceFactory();
        boolean b66 = multiset_histogram43.containsKey(dataSourceFactory65);
        utility.MultiSet<utility.Histogram> multiset_histogram67 = new utility.MultiSet<>();
        utility.Histogram histogram68 = new utility.Histogram();
        java.lang.Integer i70 = multiset_histogram67.put(histogram68, 0);
        utility.Histogram histogram71 = new utility.Histogram();
        multiset_histogram67.add(histogram71);
        java.lang.String[] str_array75 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str76 = new java.util.PriorityQueue<>();
        boolean b77 = java.util.Collections.addAll(priorityqueue_str76, str_array75);
        boolean b79 = priorityqueue_str76.offer("");
        java.lang.Integer i80 = multiset_histogram67.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram81 = new utility.MultiSet<>();
        utility.Histogram histogram82 = new utility.Histogram();
        java.lang.Integer i84 = multiset_histogram81.put(histogram82, 0);
        utility.Histogram histogram85 = new utility.Histogram();
        multiset_histogram81.add(histogram85);
        java.lang.Integer i88 = multiset_histogram67.replace(histogram85, 2);
        utility.DataSourceFactory dataSourceFactory89 = new utility.DataSourceFactory();
        boolean b90 = multiset_histogram67.containsKey(dataSourceFactory89);
        utility.Histogram histogram91 = new utility.Histogram();
        multiset_histogram67.add(histogram91);
        multiset_histogram43.add(histogram91);
        int i94 = multiset_histogram26.count(histogram91);
        javafx.scene.control.TextArea textArea95 = null;
        utility.TextAreaAppender textAreaAppender96 = new utility.TextAreaAppender(textArea95);
        java.util.logging.ErrorManager errorManager97 = textAreaAppender96.getErrorManager();
        boolean b98 = multiset_histogram0.remove(histogram91, textAreaAppender96);
        java.util.logging.ErrorManager errorManager99 = textAreaAppender96.getErrorManager();
        org.junit.Assert.assertNotNull(set_histogram1);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertNull(i19);
        org.junit.Assert.assertNull(i23);
        org.junit.Assert.assertTrue("'" + i25 + "' != '" + 7 + "'", i25.equals(7));
        org.junit.Assert.assertNull(i29);
        org.junit.Assert.assertNotNull(str_array34);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(i39);
        org.junit.Assert.assertNotNull(set_histogram40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(i46);
        org.junit.Assert.assertNotNull(str_array51);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNull(i56);
        org.junit.Assert.assertNull(i60);
        org.junit.Assert.assertNull(i64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(i70);
        org.junit.Assert.assertNotNull(str_array75);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNull(i80);
        org.junit.Assert.assertNull(i84);
        org.junit.Assert.assertNull(i88);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(i94 == 0);
        org.junit.Assert.assertNotNull(errorManager97);
        org.junit.Assert.assertTrue(b98 == false);
        org.junit.Assert.assertNotNull(errorManager99);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.String[] str_array2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<>();
        boolean b4 = java.util.Collections.addAll(arraylist_str3, str_array2);
        java.util.stream.Stream<java.lang.String> stream_str5 = arraylist_str3.stream();
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<>();
        boolean b10 = java.util.Collections.addAll(arraylist_str9, str_array8);
        java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<>();
        boolean b15 = java.util.Collections.addAll(arraylist_str14, str_array13);
        java.lang.Boolean b16 = utility.Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str19 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str21 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i22 = heapwithfixedsize_str21.size();
        boolean b23 = heapwithfixedsize_str19.retainAll(heapwithfixedsize_str21);
        boolean b24 = arraylist_str14.removeAll(heapwithfixedsize_str21);
        java.util.Iterator<java.lang.String> iterator_str25 = heapwithfixedsize_str21.iterator();
        java.lang.String str26 = heapwithfixedsize_str21.poll();
        java.util.Iterator<java.lang.String> iterator_str27 = heapwithfixedsize_str21.iterator();
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(stream_str5);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(iterator_str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(iterator_str27);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        java.util.Set<utility.Histogram> set_histogram1 = multiset_histogram0.keySet();
        java.lang.String str2 = multiset_histogram0.toString();
        boolean b5 = multiset_histogram0.remove(100.0d, 100);
        int i6 = multiset_histogram0.totalCount();
        multiset_histogram0.clear();
        org.junit.Assert.assertNotNull(set_histogram1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        javafx.scene.control.TextArea textArea0 = null;
        utility.TextAreaAppender textAreaAppender1 = new utility.TextAreaAppender(textArea0);
        java.util.logging.Filter filter2 = textAreaAppender1.getFilter();
        java.util.logging.Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        java.util.logging.Formatter formatter5 = textAreaAppender1.getFormatter();
        java.util.logging.Filter filter6 = null;
        textAreaAppender1.setFilter(filter6);
        textAreaAppender1.flush();
        textAreaAppender1.flush();
        java.lang.String str10 = textAreaAppender1.getEncoding();
        org.junit.Assert.assertNull(filter2);
        org.junit.Assert.assertNotNull(level3);
        org.junit.Assert.assertNotNull(formatter5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.util.List<java.lang.String> list_str1 = utility.Tokenization.split("{}");
        org.junit.Assert.assertNotNull(list_str1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        java.lang.String[] str_array4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<>();
        boolean b6 = java.util.Collections.addAll(arraylist_str5, str_array4);
        java.util.stream.Stream<java.lang.String> stream_str7 = arraylist_str5.stream();
        java.util.stream.Stream<java.lang.String> stream_str8 = arraylist_str5.parallelStream();
        java.lang.String[] str_array11 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<>();
        boolean b13 = java.util.Collections.addAll(arraylist_str12, str_array11);
        java.util.stream.Stream<java.lang.String> stream_str14 = arraylist_str12.stream();
        java.lang.String[] str_array17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<>();
        boolean b19 = java.util.Collections.addAll(arraylist_str18, str_array17);
        java.util.stream.Stream<java.lang.String> stream_str20 = arraylist_str18.stream();
        java.util.stream.Stream<java.lang.String> stream_str21 = arraylist_str18.parallelStream();
        java.lang.String[] str_array24 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<>();
        boolean b26 = java.util.Collections.addAll(arraylist_str25, str_array24);
        java.util.stream.Stream<java.lang.String> stream_str27 = arraylist_str25.stream();
        java.util.stream.Stream<java.lang.String> stream_str28 = arraylist_str25.parallelStream();
        java.lang.String[] str_array31 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<>();
        boolean b33 = java.util.Collections.addAll(arraylist_str32, str_array31);
        java.util.stream.Stream<java.lang.String> stream_str34 = arraylist_str32.stream();
        java.lang.String[] str_array37 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<>();
        boolean b39 = java.util.Collections.addAll(arraylist_str38, str_array37);
        java.util.stream.Stream<java.lang.String> stream_str40 = arraylist_str38.stream();
        java.util.stream.Stream<java.lang.String> stream_str41 = arraylist_str38.parallelStream();
        java.util.stream.Stream[] stream_array43 = new java.util.stream.Stream[6];
        @SuppressWarnings("unchecked") java.util.stream.Stream<java.lang.String>[] stream_str_array44 = (java.util.stream.Stream<java.lang.String>[]) stream_array43;
        stream_str_array44[0] = stream_str8;
        stream_str_array44[1] = stream_str14;
        stream_str_array44[2] = stream_str21;
        stream_str_array44[3] = stream_str28;
        stream_str_array44[4] = stream_str34;
        stream_str_array44[5] = stream_str41;
        java.util.stream.Stream<java.lang.String>[] stream_str_array57 = heapwithfixedsize_str1.toArray(stream_str_array44);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str59 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str61 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i62 = heapwithfixedsize_str61.size();
        boolean b63 = heapwithfixedsize_str59.retainAll(heapwithfixedsize_str61);
        boolean b64 = heapwithfixedsize_str1.containsAll(heapwithfixedsize_str59);
        java.lang.String str65 = heapwithfixedsize_str1.peek();
        java.lang.String str66 = heapwithfixedsize_str1.poll();
        java.util.stream.Stream<java.lang.String> stream_str67 = heapwithfixedsize_str1.parallelStream();
        org.junit.Assert.assertNotNull(str_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(stream_str7);
        org.junit.Assert.assertNotNull(stream_str8);
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(stream_str14);
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(stream_str20);
        org.junit.Assert.assertNotNull(stream_str21);
        org.junit.Assert.assertNotNull(str_array24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(stream_str27);
        org.junit.Assert.assertNotNull(stream_str28);
        org.junit.Assert.assertNotNull(str_array31);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(stream_str34);
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(stream_str40);
        org.junit.Assert.assertNotNull(stream_str41);
        org.junit.Assert.assertNotNull(stream_array43);
        org.junit.Assert.assertNotNull(stream_str_array44);
        org.junit.Assert.assertNotNull(stream_str_array57);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(stream_str67);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        utility.Levenshtein levenshtein0 = new utility.Levenshtein();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.String[] str_array2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<>();
        boolean b4 = java.util.Collections.addAll(arraylist_str3, str_array2);
        java.util.stream.Stream<java.lang.String> stream_str5 = arraylist_str3.stream();
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<>();
        boolean b10 = java.util.Collections.addAll(arraylist_str9, str_array8);
        java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<>();
        boolean b15 = java.util.Collections.addAll(arraylist_str14, str_array13);
        java.lang.Boolean b16 = utility.Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str19 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str21 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i22 = heapwithfixedsize_str21.size();
        boolean b23 = heapwithfixedsize_str19.retainAll(heapwithfixedsize_str21);
        boolean b24 = arraylist_str14.removeAll(heapwithfixedsize_str21);
        java.lang.String str25 = heapwithfixedsize_str21.poll();
        utility.MultiSet<utility.Histogram> multiset_histogram26 = new utility.MultiSet<>();
        java.lang.String[] str_array29 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<>();
        boolean b31 = java.util.Collections.addAll(arraylist_str30, str_array29);
        java.util.stream.Stream<java.lang.String> stream_str32 = arraylist_str30.stream();
        java.lang.String[] str_array35 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str36 = new java.util.ArrayList<>();
        boolean b37 = java.util.Collections.addAll(arraylist_str36, str_array35);
        java.lang.String[] str_array40 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str41 = new java.util.ArrayList<>();
        boolean b42 = java.util.Collections.addAll(arraylist_str41, str_array40);
        java.lang.Boolean b43 = utility.Tokenization.contains(arraylist_str36, arraylist_str41);
        boolean b44 = arraylist_str30.containsAll(arraylist_str41);
        java.lang.String[] str_array47 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str48 = new java.util.ArrayList<>();
        boolean b49 = java.util.Collections.addAll(arraylist_str48, str_array47);
        java.util.stream.Stream<java.lang.String> stream_str50 = arraylist_str48.stream();
        java.lang.String[] str_array53 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str54 = new java.util.ArrayList<>();
        boolean b55 = java.util.Collections.addAll(arraylist_str54, str_array53);
        java.lang.String[] str_array58 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str59 = new java.util.ArrayList<>();
        boolean b60 = java.util.Collections.addAll(arraylist_str59, str_array58);
        java.lang.Boolean b61 = utility.Tokenization.contains(arraylist_str54, arraylist_str59);
        boolean b62 = arraylist_str48.containsAll(arraylist_str59);
        double d63 = utility.TokenShareRatio.setTokenShareRatioFkLD(arraylist_str30, arraylist_str48);
        boolean b64 = arraylist_str48.isEmpty();
        java.lang.Integer i66 = multiset_histogram26.getOrDefault(b64, 3);
        java.util.Set<utility.Histogram> set_histogram67 = multiset_histogram26.keySet();
        boolean b68 = heapwithfixedsize_str21.contains(set_histogram67);
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(stream_str5);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(str_array29);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(stream_str32);
        org.junit.Assert.assertNotNull(str_array35);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(str_array40);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue("'" + b43 + "' != '" + true + "'", b43.equals(true));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(str_array47);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(stream_str50);
        org.junit.Assert.assertNotNull(str_array53);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(str_array58);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue("'" + b61 + "' != '" + true + "'", b61.equals(true));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(d63 == 1.0d);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + i66 + "' != '" + 3 + "'", i66.equals(3));
        org.junit.Assert.assertNotNull(set_histogram67);
        org.junit.Assert.assertTrue(b68 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        javafx.scene.control.TextArea textArea0 = null;
        utility.TextAreaAppender textAreaAppender1 = new utility.TextAreaAppender(textArea0);
        java.util.logging.Filter filter2 = textAreaAppender1.getFilter();
        java.util.logging.Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        java.util.logging.Formatter formatter5 = textAreaAppender1.getFormatter();
        java.util.logging.Filter filter6 = null;
        textAreaAppender1.setFilter(filter6);
        java.util.logging.Filter filter8 = textAreaAppender1.getFilter();
        javafx.scene.control.TextArea textArea9 = null;
        utility.TextAreaAppender textAreaAppender10 = new utility.TextAreaAppender(textArea9);
        java.util.logging.Filter filter11 = textAreaAppender10.getFilter();
        java.util.logging.Level level12 = textAreaAppender10.getLevel();
        textAreaAppender10.flush();
        java.util.logging.Formatter formatter14 = textAreaAppender10.getFormatter();
        textAreaAppender1.setFormatter(formatter14);
        org.junit.Assert.assertNull(filter2);
        org.junit.Assert.assertNotNull(level3);
        org.junit.Assert.assertNotNull(formatter5);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertNotNull(level12);
        org.junit.Assert.assertNotNull(formatter14);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.String[] str_array2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<>();
        boolean b4 = java.util.Collections.addAll(arraylist_str3, str_array2);
        java.util.stream.Stream<java.lang.String> stream_str5 = arraylist_str3.stream();
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str7 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        java.lang.String[] str_array10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<>();
        boolean b12 = java.util.Collections.addAll(arraylist_str11, str_array10);
        java.util.stream.Stream<java.lang.String> stream_str13 = arraylist_str11.stream();
        java.util.stream.Stream<java.lang.String> stream_str14 = arraylist_str11.parallelStream();
        java.lang.String[] str_array17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<>();
        boolean b19 = java.util.Collections.addAll(arraylist_str18, str_array17);
        java.util.stream.Stream<java.lang.String> stream_str20 = arraylist_str18.stream();
        java.lang.String[] str_array23 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str24 = new java.util.ArrayList<>();
        boolean b25 = java.util.Collections.addAll(arraylist_str24, str_array23);
        java.util.stream.Stream<java.lang.String> stream_str26 = arraylist_str24.stream();
        java.util.stream.Stream<java.lang.String> stream_str27 = arraylist_str24.parallelStream();
        java.lang.String[] str_array30 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str31 = new java.util.ArrayList<>();
        boolean b32 = java.util.Collections.addAll(arraylist_str31, str_array30);
        java.util.stream.Stream<java.lang.String> stream_str33 = arraylist_str31.stream();
        java.util.stream.Stream<java.lang.String> stream_str34 = arraylist_str31.parallelStream();
        java.lang.String[] str_array37 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<>();
        boolean b39 = java.util.Collections.addAll(arraylist_str38, str_array37);
        java.util.stream.Stream<java.lang.String> stream_str40 = arraylist_str38.stream();
        java.lang.String[] str_array43 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str44 = new java.util.ArrayList<>();
        boolean b45 = java.util.Collections.addAll(arraylist_str44, str_array43);
        java.util.stream.Stream<java.lang.String> stream_str46 = arraylist_str44.stream();
        java.util.stream.Stream<java.lang.String> stream_str47 = arraylist_str44.parallelStream();
        java.util.stream.Stream[] stream_array49 = new java.util.stream.Stream[6];
        @SuppressWarnings("unchecked") java.util.stream.Stream<java.lang.String>[] stream_str_array50 = (java.util.stream.Stream<java.lang.String>[]) stream_array49;
        stream_str_array50[0] = stream_str14;
        stream_str_array50[1] = stream_str20;
        stream_str_array50[2] = stream_str27;
        stream_str_array50[3] = stream_str34;
        stream_str_array50[4] = stream_str40;
        stream_str_array50[5] = stream_str47;
        java.util.stream.Stream<java.lang.String>[] stream_str_array63 = heapwithfixedsize_str7.toArray(stream_str_array50);
        java.util.Iterator<java.lang.String> iterator_str64 = heapwithfixedsize_str7.iterator();
        boolean b66 = heapwithfixedsize_str7.offer("hi!");
        int i67 = heapwithfixedsize_str7.size();
        java.lang.String str68 = heapwithfixedsize_str7.poll();
        boolean b69 = arraylist_str3.containsAll(heapwithfixedsize_str7);
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(stream_str5);
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(stream_str13);
        org.junit.Assert.assertNotNull(stream_str14);
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(stream_str20);
        org.junit.Assert.assertNotNull(str_array23);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(stream_str26);
        org.junit.Assert.assertNotNull(stream_str27);
        org.junit.Assert.assertNotNull(str_array30);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(stream_str33);
        org.junit.Assert.assertNotNull(stream_str34);
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(stream_str40);
        org.junit.Assert.assertNotNull(str_array43);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(stream_str46);
        org.junit.Assert.assertNotNull(stream_str47);
        org.junit.Assert.assertNotNull(stream_array49);
        org.junit.Assert.assertNotNull(stream_str_array50);
        org.junit.Assert.assertNotNull(stream_str_array63);
        org.junit.Assert.assertNotNull(iterator_str64);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(i67 == 1);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!" + "'", str68.equals("hi!"));
        org.junit.Assert.assertTrue(b69 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram14 = new utility.MultiSet<>();
        utility.Histogram histogram15 = new utility.Histogram();
        java.lang.Integer i17 = multiset_histogram14.put(histogram15, 0);
        utility.Histogram histogram18 = new utility.Histogram();
        multiset_histogram14.add(histogram18);
        java.lang.Integer i21 = multiset_histogram0.replace(histogram18, 2);
        utility.DataSourceFactory dataSourceFactory22 = new utility.DataSourceFactory();
        boolean b23 = multiset_histogram0.containsKey(dataSourceFactory22);
        utility.MultiSet<utility.Histogram> multiset_histogram24 = new utility.MultiSet<>();
        utility.Histogram histogram25 = new utility.Histogram();
        java.lang.Integer i27 = multiset_histogram24.put(histogram25, 0);
        utility.Histogram histogram28 = new utility.Histogram();
        multiset_histogram24.add(histogram28);
        java.lang.String[] str_array32 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str33 = new java.util.PriorityQueue<>();
        boolean b34 = java.util.Collections.addAll(priorityqueue_str33, str_array32);
        boolean b36 = priorityqueue_str33.offer("");
        java.lang.Integer i37 = multiset_histogram24.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram38 = new utility.MultiSet<>();
        utility.Histogram histogram39 = new utility.Histogram();
        java.lang.Integer i41 = multiset_histogram38.put(histogram39, 0);
        utility.Histogram histogram42 = new utility.Histogram();
        multiset_histogram38.add(histogram42);
        java.lang.Integer i45 = multiset_histogram24.replace(histogram42, 2);
        utility.DataSourceFactory dataSourceFactory46 = new utility.DataSourceFactory();
        boolean b47 = multiset_histogram24.containsKey(dataSourceFactory46);
        utility.Histogram histogram48 = new utility.Histogram();
        multiset_histogram24.add(histogram48);
        multiset_histogram0.add(histogram48);
        utility.MultiSet<utility.Histogram> multiset_histogram51 = new utility.MultiSet<>();
        utility.Histogram histogram52 = new utility.Histogram();
        java.lang.Integer i54 = multiset_histogram51.put(histogram52, 0);
        utility.Histogram histogram55 = new utility.Histogram();
        multiset_histogram51.add(histogram55);
        java.lang.String[] str_array59 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str60 = new java.util.PriorityQueue<>();
        boolean b61 = java.util.Collections.addAll(priorityqueue_str60, str_array59);
        boolean b63 = priorityqueue_str60.offer("");
        java.lang.Integer i64 = multiset_histogram51.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram65 = new utility.MultiSet<>();
        utility.Histogram histogram66 = new utility.Histogram();
        java.lang.Integer i68 = multiset_histogram65.put(histogram66, 0);
        utility.Histogram histogram69 = new utility.Histogram();
        multiset_histogram65.add(histogram69);
        java.lang.Integer i72 = multiset_histogram51.replace(histogram69, 2);
        utility.MultiSet<utility.Histogram> multiset_histogram73 = new utility.MultiSet<>();
        utility.Histogram histogram74 = new utility.Histogram();
        java.lang.Integer i76 = multiset_histogram73.put(histogram74, 0);
        utility.Histogram histogram77 = new utility.Histogram();
        multiset_histogram73.add(histogram77);
        java.lang.String[] str_array81 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str82 = new java.util.PriorityQueue<>();
        boolean b83 = java.util.Collections.addAll(priorityqueue_str82, str_array81);
        boolean b85 = priorityqueue_str82.offer("");
        java.lang.Integer i86 = multiset_histogram73.remove("");
        java.util.Set<utility.Histogram> set_histogram87 = multiset_histogram73.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram88 = new utility.MultiSet<>();
        utility.Histogram histogram89 = new utility.Histogram();
        java.lang.Integer i91 = multiset_histogram88.put(histogram89, 0);
        utility.Histogram histogram92 = new utility.Histogram();
        multiset_histogram88.add(histogram92);
        int i94 = multiset_histogram73.count(histogram92);
        int i95 = multiset_histogram51.count(histogram92);
        java.lang.Object obj96 = multiset_histogram51.clone();
        multiset_histogram0.putAll(multiset_histogram51);
        multiset_histogram51.clear();
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(i17);
        org.junit.Assert.assertNull(i21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(i27);
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(i37);
        org.junit.Assert.assertNull(i41);
        org.junit.Assert.assertNull(i45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(i54);
        org.junit.Assert.assertNotNull(str_array59);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNull(i64);
        org.junit.Assert.assertNull(i68);
        org.junit.Assert.assertNull(i72);
        org.junit.Assert.assertNull(i76);
        org.junit.Assert.assertNotNull(str_array81);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertNull(i86);
        org.junit.Assert.assertNotNull(set_histogram87);
        org.junit.Assert.assertNull(i91);
        org.junit.Assert.assertTrue(i94 == 0);
        org.junit.Assert.assertTrue(i95 == 0);
        org.junit.Assert.assertNotNull(obj96);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i2 = heapwithfixedsize_str1.size();
        java.util.stream.Stream<java.lang.String> stream_str3 = heapwithfixedsize_str1.parallelStream();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(stream_str3);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        java.util.Set<utility.Histogram> set_histogram14 = multiset_histogram0.keySet();
        boolean b15 = multiset_histogram0.isEmpty();
        java.lang.String str16 = multiset_histogram0.toString();
        utility.PrefixSelectionCustomizer prefixSelectionCustomizer17 = new utility.PrefixSelectionCustomizer();
        java.lang.Integer i18 = multiset_histogram0.get(prefixSelectionCustomizer17);
        utility.Histogram histogram19 = null;
        int i20 = multiset_histogram0.count(histogram19);
        java.util.Collection<java.lang.Integer> collection_i21 = multiset_histogram0.values();
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNotNull(set_histogram14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(i18);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(collection_i21);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        main.Table[] table_array0 = new main.Table[] {};
        java.util.ArrayList<main.Table> arraylist_table1 = new java.util.ArrayList<>();
        boolean b2 = java.util.Collections.addAll(arraylist_table1, table_array0);
        utility.Chen chen3 = new utility.Chen(arraylist_table1);
        java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str7 = new java.util.ArrayList<>();
        boolean b8 = java.util.Collections.addAll(arraylist_str7, str_array6);
        java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<>();
        boolean b13 = java.util.Collections.addAll(arraylist_str12, str_array11);
        java.lang.Boolean b14 = utility.Tokenization.contains(arraylist_str7, arraylist_str12);
        boolean b15 = arraylist_str12.isEmpty();
        java.lang.String[] str_array18 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<>();
        boolean b20 = java.util.Collections.addAll(arraylist_str19, str_array18);
        java.util.stream.Stream<java.lang.String> stream_str21 = arraylist_str19.stream();
        java.lang.String[] str_array24 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<>();
        boolean b26 = java.util.Collections.addAll(arraylist_str25, str_array24);
        java.lang.String[] str_array29 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<>();
        boolean b31 = java.util.Collections.addAll(arraylist_str30, str_array29);
        java.lang.Boolean b32 = utility.Tokenization.contains(arraylist_str25, arraylist_str30);
        boolean b33 = arraylist_str19.containsAll(arraylist_str30);
        boolean b34 = arraylist_str12.removeAll(arraylist_str30);
        java.lang.String[] str_array37 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<>();
        boolean b39 = java.util.Collections.addAll(arraylist_str38, str_array37);
        java.util.stream.Stream<java.lang.String> stream_str40 = arraylist_str38.stream();
        double d41 = chen3.getTableChenSimilarity(arraylist_str30, arraylist_str38);
        java.util.stream.Stream<java.lang.String> stream_str42 = arraylist_str38.stream();
        boolean b43 = arraylist_str38.isEmpty();
        boolean b44 = arraylist_str38.isEmpty();
        org.junit.Assert.assertNotNull(table_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + b14 + "' != '" + true + "'", b14.equals(true));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(stream_str21);
        org.junit.Assert.assertNotNull(str_array24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(str_array29);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + b32 + "' != '" + true + "'", b32.equals(true));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(stream_str40);
        org.junit.Assert.assertEquals(d41, Double.NaN, 0);
        org.junit.Assert.assertNotNull(stream_str42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.String[] str_array2 = new java.lang.String[] { "", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str3 = new java.util.PriorityQueue<>();
        boolean b4 = java.util.Collections.addAll(priorityqueue_str3, str_array2);
        int i5 = priorityqueue_str3.size();
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str7 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        java.lang.String[] str_array10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<>();
        boolean b12 = java.util.Collections.addAll(arraylist_str11, str_array10);
        java.util.stream.Stream<java.lang.String> stream_str13 = arraylist_str11.stream();
        java.util.stream.Stream<java.lang.String> stream_str14 = arraylist_str11.parallelStream();
        java.lang.String[] str_array17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<>();
        boolean b19 = java.util.Collections.addAll(arraylist_str18, str_array17);
        java.util.stream.Stream<java.lang.String> stream_str20 = arraylist_str18.stream();
        java.lang.String[] str_array23 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str24 = new java.util.ArrayList<>();
        boolean b25 = java.util.Collections.addAll(arraylist_str24, str_array23);
        java.util.stream.Stream<java.lang.String> stream_str26 = arraylist_str24.stream();
        java.util.stream.Stream<java.lang.String> stream_str27 = arraylist_str24.parallelStream();
        java.lang.String[] str_array30 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str31 = new java.util.ArrayList<>();
        boolean b32 = java.util.Collections.addAll(arraylist_str31, str_array30);
        java.util.stream.Stream<java.lang.String> stream_str33 = arraylist_str31.stream();
        java.util.stream.Stream<java.lang.String> stream_str34 = arraylist_str31.parallelStream();
        java.lang.String[] str_array37 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<>();
        boolean b39 = java.util.Collections.addAll(arraylist_str38, str_array37);
        java.util.stream.Stream<java.lang.String> stream_str40 = arraylist_str38.stream();
        java.lang.String[] str_array43 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str44 = new java.util.ArrayList<>();
        boolean b45 = java.util.Collections.addAll(arraylist_str44, str_array43);
        java.util.stream.Stream<java.lang.String> stream_str46 = arraylist_str44.stream();
        java.util.stream.Stream<java.lang.String> stream_str47 = arraylist_str44.parallelStream();
        java.util.stream.Stream[] stream_array49 = new java.util.stream.Stream[6];
        @SuppressWarnings("unchecked") java.util.stream.Stream<java.lang.String>[] stream_str_array50 = (java.util.stream.Stream<java.lang.String>[]) stream_array49;
        stream_str_array50[0] = stream_str14;
        stream_str_array50[1] = stream_str20;
        stream_str_array50[2] = stream_str27;
        stream_str_array50[3] = stream_str34;
        stream_str_array50[4] = stream_str40;
        stream_str_array50[5] = stream_str47;
        java.util.stream.Stream<java.lang.String>[] stream_str_array63 = heapwithfixedsize_str7.toArray(stream_str_array50);
        boolean b65 = heapwithfixedsize_str7.add("");
        boolean b67 = heapwithfixedsize_str7.contains(0L);
        java.util.Comparator<? super java.lang.String> comparator_wildcard68 = heapwithfixedsize_str7.comparator();
        boolean b69 = priorityqueue_str3.remove(heapwithfixedsize_str7);
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(stream_str13);
        org.junit.Assert.assertNotNull(stream_str14);
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(stream_str20);
        org.junit.Assert.assertNotNull(str_array23);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(stream_str26);
        org.junit.Assert.assertNotNull(stream_str27);
        org.junit.Assert.assertNotNull(str_array30);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(stream_str33);
        org.junit.Assert.assertNotNull(stream_str34);
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(stream_str40);
        org.junit.Assert.assertNotNull(str_array43);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(stream_str46);
        org.junit.Assert.assertNotNull(stream_str47);
        org.junit.Assert.assertNotNull(stream_array49);
        org.junit.Assert.assertNotNull(stream_str_array50);
        org.junit.Assert.assertNotNull(stream_str_array63);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(comparator_wildcard68);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.String[] str_array2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<>();
        boolean b4 = java.util.Collections.addAll(arraylist_str3, str_array2);
        java.util.stream.Stream<java.lang.String> stream_str5 = arraylist_str3.stream();
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<>();
        boolean b10 = java.util.Collections.addAll(arraylist_str9, str_array8);
        java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<>();
        boolean b15 = java.util.Collections.addAll(arraylist_str14, str_array13);
        java.lang.Boolean b16 = utility.Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str19 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str21 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i22 = heapwithfixedsize_str21.size();
        boolean b23 = heapwithfixedsize_str19.retainAll(heapwithfixedsize_str21);
        boolean b24 = arraylist_str14.removeAll(heapwithfixedsize_str21);
        java.lang.String str25 = heapwithfixedsize_str21.poll();
        java.util.List<java.lang.String> list_str27 = utility.Tokenization.split("");
        boolean b28 = heapwithfixedsize_str21.removeAll(list_str27);
        java.util.Comparator<? super java.lang.String> comparator_wildcard29 = heapwithfixedsize_str21.comparator();
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(stream_str5);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(list_str27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(comparator_wildcard29);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str4 = new java.util.ArrayList<>();
        boolean b5 = java.util.Collections.addAll(arraylist_str4, str_array3);
        java.util.stream.Stream<java.lang.String> stream_str6 = arraylist_str4.stream();
        java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str10 = new java.util.ArrayList<>();
        boolean b11 = java.util.Collections.addAll(arraylist_str10, str_array9);
        java.lang.String[] str_array14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str15 = new java.util.ArrayList<>();
        boolean b16 = java.util.Collections.addAll(arraylist_str15, str_array14);
        java.lang.Boolean b17 = utility.Tokenization.contains(arraylist_str10, arraylist_str15);
        boolean b18 = arraylist_str4.containsAll(arraylist_str15);
        java.lang.String[] str_array21 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str22 = new java.util.ArrayList<>();
        boolean b23 = java.util.Collections.addAll(arraylist_str22, str_array21);
        java.util.stream.Stream<java.lang.String> stream_str24 = arraylist_str22.stream();
        java.lang.String[] str_array27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<>();
        boolean b29 = java.util.Collections.addAll(arraylist_str28, str_array27);
        java.lang.String[] str_array32 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str33 = new java.util.ArrayList<>();
        boolean b34 = java.util.Collections.addAll(arraylist_str33, str_array32);
        java.lang.Boolean b35 = utility.Tokenization.contains(arraylist_str28, arraylist_str33);
        boolean b36 = arraylist_str22.containsAll(arraylist_str33);
        double d37 = utility.TokenShareRatio.setTokenShareRatioFkLD(arraylist_str4, arraylist_str22);
        boolean b38 = arraylist_str22.isEmpty();
        java.lang.Integer i40 = multiset_histogram0.getOrDefault(b38, 3);
        java.util.Set<utility.Histogram> set_histogram41 = multiset_histogram0.keySet();
        boolean b42 = multiset_histogram0.isEmpty();
        org.junit.Assert.assertNotNull(str_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(stream_str6);
        org.junit.Assert.assertNotNull(str_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(str_array14);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + b17 + "' != '" + true + "'", b17.equals(true));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(str_array21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(stream_str24);
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + b35 + "' != '" + true + "'", b35.equals(true));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(d37 == 1.0d);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + i40 + "' != '" + 3 + "'", i40.equals(3));
        org.junit.Assert.assertNotNull(set_histogram41);
        org.junit.Assert.assertTrue(b42 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = utility.Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = utility.Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double[] d_array14 = new double[] { (byte) 1, (short) 1 };
        double[] d_array17 = utility.Histogram.rel2abs(d_array14, (double) 100.0f, (double) ' ');
        double d19 = utility.Logistic.classify(d_array11, d_array17, (double) 100.0f);
        java.lang.Double d20 = utility.Histogram.jaccard(d_array5, d_array11);
        double[] d_array23 = new double[] { (byte) 1, (short) 1 };
        double[] d_array26 = utility.Histogram.rel2abs(d_array23, (double) 100.0f, (double) ' ');
        double[] d_array29 = new double[] { (byte) 1, (short) 1 };
        double[] d_array32 = utility.Histogram.rel2abs(d_array29, (double) 100.0f, (double) ' ');
        double[] d_array35 = new double[] { (byte) 1, (short) 1 };
        double[] d_array38 = utility.Histogram.rel2abs(d_array35, (double) 100.0f, (double) ' ');
        double d40 = utility.Logistic.classify(d_array32, d_array38, (double) 100.0f);
        java.lang.Double d41 = utility.Histogram.jaccard(d_array26, d_array32);
        double[] d_array42 = utility.Multiplication.elementWise(d_array11, d_array26);
        double[] d_array45 = new double[] { (byte) 1, (short) 1 };
        double[] d_array48 = utility.Histogram.rel2abs(d_array45, (double) 100.0f, (double) ' ');
        double[] d_array51 = new double[] { (byte) 1, (short) 1 };
        double[] d_array54 = utility.Histogram.rel2abs(d_array51, (double) 100.0f, (double) ' ');
        double d56 = utility.Logistic.classify(d_array48, d_array54, (double) 100.0f);
        double[] d_array60 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array63 = new double[] { (byte) 1, (short) 1 };
        double[] d_array66 = utility.Histogram.rel2abs(d_array63, (double) 100.0f, (double) ' ');
        double[] d_array69 = new double[] { (byte) 1, (short) 1 };
        double[] d_array72 = utility.Histogram.rel2abs(d_array69, (double) 100.0f, (double) ' ');
        double d74 = utility.Logistic.classify(d_array66, d_array72, (double) 100.0f);
        java.lang.Double d75 = utility.Histogram.jaccard(d_array60, d_array72);
        double[] d_array78 = new double[] { (byte) 1, (short) 1 };
        double[] d_array81 = utility.Histogram.rel2abs(d_array78, (double) 100.0f, (double) ' ');
        double[] d_array82 = utility.Multiplication.elementWise(d_array60, d_array81);
        double d84 = utility.Logistic.classify(d_array48, d_array60, (double) (byte) 1);
        double d86 = utility.Logistic.classify(d_array26, d_array60, (double) 0L);
        double[] d_array89 = utility.Histogram.rel2abs(d_array60, 0.0d, (double) (short) 100);
        org.junit.Assert.assertNotNull(d_array2);
        org.junit.Assert.assertNotNull(d_array5);
        org.junit.Assert.assertNotNull(d_array8);
        org.junit.Assert.assertNotNull(d_array11);
        org.junit.Assert.assertNotNull(d_array14);
        org.junit.Assert.assertNotNull(d_array17);
        org.junit.Assert.assertTrue(d19 == 1.0d);
        org.junit.Assert.assertEquals(d20, Double.NaN, 0);
        org.junit.Assert.assertNotNull(d_array23);
        org.junit.Assert.assertNotNull(d_array26);
        org.junit.Assert.assertNotNull(d_array29);
        org.junit.Assert.assertNotNull(d_array32);
        org.junit.Assert.assertNotNull(d_array35);
        org.junit.Assert.assertNotNull(d_array38);
        org.junit.Assert.assertTrue(d40 == 1.0d);
        org.junit.Assert.assertEquals(d41, Double.NaN, 0);
        org.junit.Assert.assertNotNull(d_array42);
        org.junit.Assert.assertNotNull(d_array45);
        org.junit.Assert.assertNotNull(d_array48);
        org.junit.Assert.assertNotNull(d_array51);
        org.junit.Assert.assertNotNull(d_array54);
        org.junit.Assert.assertTrue(d56 == 1.0d);
        org.junit.Assert.assertNotNull(d_array60);
        org.junit.Assert.assertNotNull(d_array63);
        org.junit.Assert.assertNotNull(d_array66);
        org.junit.Assert.assertNotNull(d_array69);
        org.junit.Assert.assertNotNull(d_array72);
        org.junit.Assert.assertTrue(d74 == 1.0d);
        org.junit.Assert.assertTrue("'" + d75 + "' != '" + 0.0d + "'", d75.equals(0.0d));
        org.junit.Assert.assertNotNull(d_array78);
        org.junit.Assert.assertNotNull(d_array81);
        org.junit.Assert.assertNotNull(d_array82);
        org.junit.Assert.assertTrue(d84 == 1.0d);
        org.junit.Assert.assertTrue(d86 == 1.0d);
        org.junit.Assert.assertNotNull(d_array89);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        java.util.Set<utility.Histogram> set_histogram14 = multiset_histogram0.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram15 = new utility.MultiSet<>();
        utility.Histogram histogram16 = new utility.Histogram();
        java.lang.Integer i18 = multiset_histogram15.put(histogram16, 0);
        utility.Histogram histogram19 = new utility.Histogram();
        multiset_histogram15.add(histogram19);
        java.lang.String[] str_array23 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str24 = new java.util.PriorityQueue<>();
        boolean b25 = java.util.Collections.addAll(priorityqueue_str24, str_array23);
        boolean b27 = priorityqueue_str24.offer("");
        java.lang.Integer i28 = multiset_histogram15.remove("");
        java.util.Set<utility.Histogram> set_histogram29 = multiset_histogram15.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram30 = new utility.MultiSet<>();
        utility.Histogram histogram31 = new utility.Histogram();
        java.lang.Integer i33 = multiset_histogram30.put(histogram31, 0);
        utility.Histogram histogram34 = new utility.Histogram();
        multiset_histogram30.add(histogram34);
        int i36 = multiset_histogram15.count(histogram34);
        int i37 = multiset_histogram0.count(histogram34);
        java.util.Set<java.util.Map.Entry<utility.Histogram, java.lang.Integer>> set_entry_histogram_i38 = multiset_histogram0.entrySet();
        java.lang.String str39 = multiset_histogram0.toString();
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNotNull(set_histogram14);
        org.junit.Assert.assertNull(i18);
        org.junit.Assert.assertNotNull(str_array23);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(i28);
        org.junit.Assert.assertNotNull(set_histogram29);
        org.junit.Assert.assertNull(i33);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(set_entry_histogram_i38);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        double[] d_array3 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array6 = new double[] { (byte) 1, (short) 1 };
        double[] d_array9 = utility.Histogram.rel2abs(d_array6, (double) 100.0f, (double) ' ');
        double[] d_array12 = new double[] { (byte) 1, (short) 1 };
        double[] d_array15 = utility.Histogram.rel2abs(d_array12, (double) 100.0f, (double) ' ');
        double d17 = utility.Logistic.classify(d_array9, d_array15, (double) 100.0f);
        java.lang.Double d18 = utility.Histogram.jaccard(d_array3, d_array15);
        double[] d_array21 = new double[] { (byte) 1, (short) 1 };
        double[] d_array24 = utility.Histogram.rel2abs(d_array21, (double) 100.0f, (double) ' ');
        double[] d_array25 = utility.Multiplication.elementWise(d_array3, d_array24);
        try {
            float[] f_array26 = utility.Otsu.otsuThreshold(d_array25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(d_array3);
        org.junit.Assert.assertNotNull(d_array6);
        org.junit.Assert.assertNotNull(d_array9);
        org.junit.Assert.assertNotNull(d_array12);
        org.junit.Assert.assertNotNull(d_array15);
        org.junit.Assert.assertTrue(d17 == 1.0d);
        org.junit.Assert.assertTrue("'" + d18 + "' != '" + 0.0d + "'", d18.equals(0.0d));
        org.junit.Assert.assertNotNull(d_array21);
        org.junit.Assert.assertNotNull(d_array24);
        org.junit.Assert.assertNotNull(d_array25);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        utility.MultiMap multiMap0 = new utility.MultiMap();
        int i1 = multiMap0.size();
        java.util.List<java.lang.String> list_str3 = multiMap0.get("{}");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(list_str3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram14 = new utility.MultiSet<>();
        utility.Histogram histogram15 = new utility.Histogram();
        java.lang.Integer i17 = multiset_histogram14.put(histogram15, 0);
        utility.Histogram histogram18 = new utility.Histogram();
        multiset_histogram14.add(histogram18);
        java.lang.Integer i21 = multiset_histogram0.replace(histogram18, 2);
        utility.DataSourceFactory dataSourceFactory22 = new utility.DataSourceFactory();
        boolean b23 = multiset_histogram0.containsKey(dataSourceFactory22);
        utility.MultiSet<utility.Histogram> multiset_histogram24 = new utility.MultiSet<>();
        utility.Histogram histogram25 = new utility.Histogram();
        java.lang.Integer i27 = multiset_histogram24.put(histogram25, 0);
        utility.Histogram histogram28 = new utility.Histogram();
        multiset_histogram24.add(histogram28);
        java.lang.String[] str_array32 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str33 = new java.util.PriorityQueue<>();
        boolean b34 = java.util.Collections.addAll(priorityqueue_str33, str_array32);
        boolean b36 = priorityqueue_str33.offer("");
        java.lang.Integer i37 = multiset_histogram24.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram38 = new utility.MultiSet<>();
        utility.Histogram histogram39 = new utility.Histogram();
        java.lang.Integer i41 = multiset_histogram38.put(histogram39, 0);
        utility.Histogram histogram42 = new utility.Histogram();
        multiset_histogram38.add(histogram42);
        java.lang.Integer i45 = multiset_histogram24.replace(histogram42, 2);
        utility.DataSourceFactory dataSourceFactory46 = new utility.DataSourceFactory();
        boolean b47 = multiset_histogram24.containsKey(dataSourceFactory46);
        utility.Histogram histogram48 = new utility.Histogram();
        multiset_histogram24.add(histogram48);
        multiset_histogram0.add(histogram48);
        javafx.scene.control.TextArea textArea51 = null;
        utility.TextAreaAppender textAreaAppender52 = new utility.TextAreaAppender(textArea51);
        java.util.logging.Filter filter53 = textAreaAppender52.getFilter();
        java.util.logging.Level level54 = textAreaAppender52.getLevel();
        textAreaAppender52.flush();
        java.util.logging.Formatter formatter56 = textAreaAppender52.getFormatter();
        java.util.logging.Filter filter57 = null;
        textAreaAppender52.setFilter(filter57);
        javafx.scene.control.TextArea textArea59 = null;
        utility.TextAreaAppender textAreaAppender60 = new utility.TextAreaAppender(textArea59);
        javafx.scene.control.TextArea textArea61 = null;
        utility.TextAreaAppender textAreaAppender62 = new utility.TextAreaAppender(textArea61);
        java.util.logging.Filter filter63 = textAreaAppender62.getFilter();
        java.util.logging.Level level64 = textAreaAppender62.getLevel();
        textAreaAppender60.setLevel(level64);
        boolean b66 = multiset_histogram0.remove(filter57, textAreaAppender60);
        javafx.scene.control.TextArea textArea67 = null;
        utility.TextAreaAppender textAreaAppender68 = new utility.TextAreaAppender(textArea67);
        javafx.scene.control.TextArea textArea69 = null;
        utility.TextAreaAppender textAreaAppender70 = new utility.TextAreaAppender(textArea69);
        java.util.logging.Filter filter71 = textAreaAppender70.getFilter();
        java.util.logging.Level level72 = textAreaAppender70.getLevel();
        textAreaAppender68.setLevel(level72);
        textAreaAppender60.setLevel(level72);
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(i17);
        org.junit.Assert.assertNull(i21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(i27);
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(i37);
        org.junit.Assert.assertNull(i41);
        org.junit.Assert.assertNull(i45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(filter53);
        org.junit.Assert.assertNotNull(level54);
        org.junit.Assert.assertNotNull(formatter56);
        org.junit.Assert.assertNull(filter63);
        org.junit.Assert.assertNotNull(level64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(filter71);
        org.junit.Assert.assertNotNull(level72);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        java.lang.String[] str_array4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<>();
        boolean b6 = java.util.Collections.addAll(arraylist_str5, str_array4);
        java.util.stream.Stream<java.lang.String> stream_str7 = arraylist_str5.stream();
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<>();
        boolean b12 = java.util.Collections.addAll(arraylist_str11, str_array10);
        java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<>();
        boolean b17 = java.util.Collections.addAll(arraylist_str16, str_array15);
        java.lang.Boolean b18 = utility.Tokenization.contains(arraylist_str11, arraylist_str16);
        boolean b19 = arraylist_str5.containsAll(arraylist_str16);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str21 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str23 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i24 = heapwithfixedsize_str23.size();
        boolean b25 = heapwithfixedsize_str21.retainAll(heapwithfixedsize_str23);
        boolean b26 = arraylist_str16.removeAll(heapwithfixedsize_str23);
        java.lang.String str27 = heapwithfixedsize_str23.poll();
        java.lang.String[] str_array30 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str31 = new java.util.ArrayList<>();
        boolean b32 = java.util.Collections.addAll(arraylist_str31, str_array30);
        java.util.stream.Stream<java.lang.String> stream_str33 = arraylist_str31.stream();
        java.lang.String[] str_array36 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str37 = new java.util.ArrayList<>();
        boolean b38 = java.util.Collections.addAll(arraylist_str37, str_array36);
        java.lang.String[] str_array41 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str42 = new java.util.ArrayList<>();
        boolean b43 = java.util.Collections.addAll(arraylist_str42, str_array41);
        java.lang.Boolean b44 = utility.Tokenization.contains(arraylist_str37, arraylist_str42);
        boolean b45 = arraylist_str31.containsAll(arraylist_str42);
        java.lang.String[] str_array48 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str49 = new java.util.ArrayList<>();
        boolean b50 = java.util.Collections.addAll(arraylist_str49, str_array48);
        java.util.stream.Stream<java.lang.String> stream_str51 = arraylist_str49.stream();
        java.lang.String[] str_array54 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str55 = new java.util.ArrayList<>();
        boolean b56 = java.util.Collections.addAll(arraylist_str55, str_array54);
        java.lang.String[] str_array59 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str60 = new java.util.ArrayList<>();
        boolean b61 = java.util.Collections.addAll(arraylist_str60, str_array59);
        java.lang.Boolean b62 = utility.Tokenization.contains(arraylist_str55, arraylist_str60);
        boolean b63 = arraylist_str49.containsAll(arraylist_str60);
        double d64 = utility.TokenShareRatio.setTokenShareRatioFkLD(arraylist_str31, arraylist_str49);
        boolean b65 = arraylist_str49.isEmpty();
        java.util.List<java.lang.String> list_str67 = utility.Tokenization.split("");
        double d68 = utility.TokenShareRatio.setTokenShareRatioFkLD(arraylist_str49, list_str67);
        boolean b69 = heapwithfixedsize_str23.contains(arraylist_str49);
        java.util.Iterator<java.lang.String> iterator_str70 = heapwithfixedsize_str23.iterator();
        boolean b71 = heapwithfixedsize_str1.removeAll(heapwithfixedsize_str23);
        org.junit.Assert.assertNotNull(str_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(stream_str7);
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + b18 + "' != '" + true + "'", b18.equals(true));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(str_array30);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(stream_str33);
        org.junit.Assert.assertNotNull(str_array36);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(str_array41);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + b44 + "' != '" + true + "'", b44.equals(true));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(str_array48);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(stream_str51);
        org.junit.Assert.assertNotNull(str_array54);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(str_array59);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue("'" + b62 + "' != '" + true + "'", b62.equals(true));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(d64 == 1.0d);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(list_str67);
        org.junit.Assert.assertTrue(d68 == 1.0d);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(iterator_str70);
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = utility.Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = utility.Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double[] d_array14 = new double[] { (byte) 1, (short) 1 };
        double[] d_array17 = utility.Histogram.rel2abs(d_array14, (double) 100.0f, (double) ' ');
        double d19 = utility.Logistic.classify(d_array11, d_array17, (double) 100.0f);
        java.lang.Double d20 = utility.Histogram.jaccard(d_array5, d_array11);
        double[] d_array23 = utility.Histogram.rel2abs(d_array11, (double) 4, (double) 4);
        double[] d_array24 = new double[] {};
        java.lang.Double d25 = utility.Histogram.jaccard(d_array23, d_array24);
        double[] d_array28 = new double[] { (byte) 1, (short) 1 };
        double[] d_array31 = utility.Histogram.rel2abs(d_array28, (double) 100.0f, (double) ' ');
        double[] d_array34 = new double[] { (byte) 1, (short) 1 };
        double[] d_array37 = utility.Histogram.rel2abs(d_array34, (double) 100.0f, (double) ' ');
        double[] d_array40 = new double[] { (byte) 1, (short) 1 };
        double[] d_array43 = utility.Histogram.rel2abs(d_array40, (double) 100.0f, (double) ' ');
        double d45 = utility.Logistic.classify(d_array37, d_array43, (double) 100.0f);
        java.lang.Double d46 = utility.Histogram.jaccard(d_array31, d_array37);
        double[] d_array49 = utility.Histogram.rel2abs(d_array37, (double) 4, (double) 4);
        double[] d_array50 = new double[] {};
        java.lang.Double d51 = utility.Histogram.jaccard(d_array49, d_array50);
        try {
            double[] d_array52 = utility.Multiplication.elementWise(d_array24, d_array49);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(d_array2);
        org.junit.Assert.assertNotNull(d_array5);
        org.junit.Assert.assertNotNull(d_array8);
        org.junit.Assert.assertNotNull(d_array11);
        org.junit.Assert.assertNotNull(d_array14);
        org.junit.Assert.assertNotNull(d_array17);
        org.junit.Assert.assertTrue(d19 == 1.0d);
        org.junit.Assert.assertEquals(d20, Double.NaN, 0);
        org.junit.Assert.assertNotNull(d_array23);
        org.junit.Assert.assertNotNull(d_array24);
        org.junit.Assert.assertEquals(d25, Double.NaN, 0);
        org.junit.Assert.assertNotNull(d_array28);
        org.junit.Assert.assertNotNull(d_array31);
        org.junit.Assert.assertNotNull(d_array34);
        org.junit.Assert.assertNotNull(d_array37);
        org.junit.Assert.assertNotNull(d_array40);
        org.junit.Assert.assertNotNull(d_array43);
        org.junit.Assert.assertTrue(d45 == 1.0d);
        org.junit.Assert.assertEquals(d46, Double.NaN, 0);
        org.junit.Assert.assertNotNull(d_array49);
        org.junit.Assert.assertNotNull(d_array50);
        org.junit.Assert.assertEquals(d51, Double.NaN, 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        java.util.Set<utility.Histogram> set_histogram14 = multiset_histogram0.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram15 = new utility.MultiSet<>();
        utility.Histogram histogram16 = new utility.Histogram();
        java.lang.Integer i18 = multiset_histogram15.put(histogram16, 0);
        utility.Histogram histogram19 = new utility.Histogram();
        multiset_histogram15.add(histogram19);
        int i21 = multiset_histogram0.count(histogram19);
        int i22 = multiset_histogram0.totalCount();
        java.util.Set<utility.Histogram> set_histogram23 = multiset_histogram0.keySet();
        java.util.Collection<java.lang.Integer> collection_i24 = multiset_histogram0.values();
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNotNull(set_histogram14);
        org.junit.Assert.assertNull(i18);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertNotNull(set_histogram23);
        org.junit.Assert.assertNotNull(collection_i24);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        javafx.scene.control.TextArea textArea0 = null;
        utility.TextAreaAppender textAreaAppender1 = new utility.TextAreaAppender(textArea0);
        java.util.logging.Filter filter2 = textAreaAppender1.getFilter();
        java.util.logging.Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        java.util.logging.Filter filter5 = null;
        textAreaAppender1.setFilter(filter5);
        textAreaAppender1.close();
        textAreaAppender1.close();
        java.util.logging.ErrorManager errorManager9 = textAreaAppender1.getErrorManager();
        javafx.scene.control.TextArea textArea10 = null;
        utility.TextAreaAppender textAreaAppender11 = new utility.TextAreaAppender(textArea10);
        java.util.logging.Filter filter12 = textAreaAppender11.getFilter();
        java.util.logging.Level level13 = textAreaAppender11.getLevel();
        textAreaAppender11.flush();
        java.util.logging.Formatter formatter15 = textAreaAppender11.getFormatter();
        textAreaAppender1.setFormatter(formatter15);
        org.junit.Assert.assertNull(filter2);
        org.junit.Assert.assertNotNull(level3);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertNotNull(level13);
        org.junit.Assert.assertNotNull(formatter15);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        main.Table[] table_array0 = new main.Table[] {};
        java.util.ArrayList<main.Table> arraylist_table1 = new java.util.ArrayList<>();
        boolean b2 = java.util.Collections.addAll(arraylist_table1, table_array0);
        utility.Chen chen3 = new utility.Chen(arraylist_table1);
        main.Table[] table_array4 = new main.Table[] {};
        java.util.ArrayList<main.Table> arraylist_table5 = new java.util.ArrayList<>();
        boolean b6 = java.util.Collections.addAll(arraylist_table5, table_array4);
        utility.Chen chen7 = new utility.Chen(arraylist_table5);
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<>();
        boolean b12 = java.util.Collections.addAll(arraylist_str11, str_array10);
        java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<>();
        boolean b17 = java.util.Collections.addAll(arraylist_str16, str_array15);
        java.lang.Boolean b18 = utility.Tokenization.contains(arraylist_str11, arraylist_str16);
        boolean b19 = arraylist_str16.isEmpty();
        java.lang.String[] str_array22 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str23 = new java.util.ArrayList<>();
        boolean b24 = java.util.Collections.addAll(arraylist_str23, str_array22);
        java.util.stream.Stream<java.lang.String> stream_str25 = arraylist_str23.stream();
        java.lang.String[] str_array28 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str29 = new java.util.ArrayList<>();
        boolean b30 = java.util.Collections.addAll(arraylist_str29, str_array28);
        java.lang.String[] str_array33 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str34 = new java.util.ArrayList<>();
        boolean b35 = java.util.Collections.addAll(arraylist_str34, str_array33);
        java.lang.Boolean b36 = utility.Tokenization.contains(arraylist_str29, arraylist_str34);
        boolean b37 = arraylist_str23.containsAll(arraylist_str34);
        boolean b38 = arraylist_str16.removeAll(arraylist_str34);
        java.lang.String[] str_array41 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str42 = new java.util.ArrayList<>();
        boolean b43 = java.util.Collections.addAll(arraylist_str42, str_array41);
        java.util.stream.Stream<java.lang.String> stream_str44 = arraylist_str42.stream();
        double d45 = chen7.getTableChenSimilarity(arraylist_str34, arraylist_str42);
        java.util.stream.Stream<java.lang.String> stream_str46 = arraylist_str42.stream();
        java.lang.String[] str_array50 = new java.lang.String[] { "hi!", "[, hi!]", "" };
        java.util.ArrayList<java.lang.String> arraylist_str51 = new java.util.ArrayList<>();
        boolean b52 = java.util.Collections.addAll(arraylist_str51, str_array50);
        double d53 = chen3.getTableChenSimilarity(arraylist_str42, arraylist_str51);
        java.lang.String str54 = arraylist_str51.toString();
        org.junit.Assert.assertNotNull(table_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(table_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + b18 + "' != '" + true + "'", b18.equals(true));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(stream_str25);
        org.junit.Assert.assertNotNull(str_array28);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(str_array33);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + b36 + "' != '" + true + "'", b36.equals(true));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(str_array41);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(stream_str44);
        org.junit.Assert.assertEquals(d45, Double.NaN, 0);
        org.junit.Assert.assertNotNull(stream_str46);
        org.junit.Assert.assertNotNull(str_array50);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertEquals(d53, Double.NaN, 0);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "[hi!, [, hi!], ]" + "'", str54.equals("[hi!, [, hi!], ]"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        java.lang.String[] str_array4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<>();
        boolean b6 = java.util.Collections.addAll(arraylist_str5, str_array4);
        java.util.stream.Stream<java.lang.String> stream_str7 = arraylist_str5.stream();
        java.util.stream.Stream<java.lang.String> stream_str8 = arraylist_str5.parallelStream();
        java.lang.String[] str_array11 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<>();
        boolean b13 = java.util.Collections.addAll(arraylist_str12, str_array11);
        java.util.stream.Stream<java.lang.String> stream_str14 = arraylist_str12.stream();
        java.lang.String[] str_array17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<>();
        boolean b19 = java.util.Collections.addAll(arraylist_str18, str_array17);
        java.util.stream.Stream<java.lang.String> stream_str20 = arraylist_str18.stream();
        java.util.stream.Stream<java.lang.String> stream_str21 = arraylist_str18.parallelStream();
        java.lang.String[] str_array24 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<>();
        boolean b26 = java.util.Collections.addAll(arraylist_str25, str_array24);
        java.util.stream.Stream<java.lang.String> stream_str27 = arraylist_str25.stream();
        java.util.stream.Stream<java.lang.String> stream_str28 = arraylist_str25.parallelStream();
        java.lang.String[] str_array31 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<>();
        boolean b33 = java.util.Collections.addAll(arraylist_str32, str_array31);
        java.util.stream.Stream<java.lang.String> stream_str34 = arraylist_str32.stream();
        java.lang.String[] str_array37 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<>();
        boolean b39 = java.util.Collections.addAll(arraylist_str38, str_array37);
        java.util.stream.Stream<java.lang.String> stream_str40 = arraylist_str38.stream();
        java.util.stream.Stream<java.lang.String> stream_str41 = arraylist_str38.parallelStream();
        java.util.stream.Stream[] stream_array43 = new java.util.stream.Stream[6];
        @SuppressWarnings("unchecked") java.util.stream.Stream<java.lang.String>[] stream_str_array44 = (java.util.stream.Stream<java.lang.String>[]) stream_array43;
        stream_str_array44[0] = stream_str8;
        stream_str_array44[1] = stream_str14;
        stream_str_array44[2] = stream_str21;
        stream_str_array44[3] = stream_str28;
        stream_str_array44[4] = stream_str34;
        stream_str_array44[5] = stream_str41;
        java.util.stream.Stream<java.lang.String>[] stream_str_array57 = heapwithfixedsize_str1.toArray(stream_str_array44);
        java.util.Iterator<java.lang.String> iterator_str58 = heapwithfixedsize_str1.iterator();
        java.util.Spliterator<java.lang.String> spliterator_str59 = heapwithfixedsize_str1.spliterator();
        java.lang.String str60 = heapwithfixedsize_str1.poll();
        org.junit.Assert.assertNotNull(str_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(stream_str7);
        org.junit.Assert.assertNotNull(stream_str8);
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(stream_str14);
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(stream_str20);
        org.junit.Assert.assertNotNull(stream_str21);
        org.junit.Assert.assertNotNull(str_array24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(stream_str27);
        org.junit.Assert.assertNotNull(stream_str28);
        org.junit.Assert.assertNotNull(str_array31);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(stream_str34);
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(stream_str40);
        org.junit.Assert.assertNotNull(stream_str41);
        org.junit.Assert.assertNotNull(stream_array43);
        org.junit.Assert.assertNotNull(stream_str_array44);
        org.junit.Assert.assertNotNull(stream_str_array57);
        org.junit.Assert.assertNotNull(iterator_str58);
        org.junit.Assert.assertNotNull(spliterator_str59);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        javafx.scene.control.TextArea textArea0 = null;
        utility.TextAreaAppender textAreaAppender1 = new utility.TextAreaAppender(textArea0);
        javafx.scene.control.TextArea textArea2 = null;
        utility.TextAreaAppender textAreaAppender3 = new utility.TextAreaAppender(textArea2);
        java.util.logging.Filter filter4 = textAreaAppender3.getFilter();
        java.util.logging.Level level5 = textAreaAppender3.getLevel();
        textAreaAppender1.setLevel(level5);
        utility.MultiSet<utility.Histogram> multiset_histogram7 = new utility.MultiSet<>();
        utility.Histogram histogram8 = new utility.Histogram();
        java.lang.Integer i10 = multiset_histogram7.put(histogram8, 0);
        utility.Histogram histogram11 = new utility.Histogram();
        multiset_histogram7.add(histogram11);
        java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str16 = new java.util.PriorityQueue<>();
        boolean b17 = java.util.Collections.addAll(priorityqueue_str16, str_array15);
        boolean b19 = priorityqueue_str16.offer("");
        java.lang.Integer i20 = multiset_histogram7.remove("");
        java.util.Set<utility.Histogram> set_histogram21 = multiset_histogram7.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram22 = new utility.MultiSet<>();
        utility.Histogram histogram23 = new utility.Histogram();
        java.lang.Integer i25 = multiset_histogram22.put(histogram23, 0);
        utility.Histogram histogram26 = new utility.Histogram();
        multiset_histogram22.add(histogram26);
        java.lang.String[] str_array30 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str31 = new java.util.PriorityQueue<>();
        boolean b32 = java.util.Collections.addAll(priorityqueue_str31, str_array30);
        boolean b34 = priorityqueue_str31.offer("");
        java.lang.Integer i35 = multiset_histogram22.remove("");
        java.util.Set<utility.Histogram> set_histogram36 = multiset_histogram22.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram37 = new utility.MultiSet<>();
        utility.Histogram histogram38 = new utility.Histogram();
        java.lang.Integer i40 = multiset_histogram37.put(histogram38, 0);
        utility.Histogram histogram41 = new utility.Histogram();
        multiset_histogram37.add(histogram41);
        int i43 = multiset_histogram22.count(histogram41);
        int i44 = multiset_histogram7.count(histogram41);
        java.util.Set<java.util.Map.Entry<utility.Histogram, java.lang.Integer>> set_entry_histogram_i45 = multiset_histogram7.entrySet();
        javafx.scene.control.TextArea textArea46 = null;
        utility.TextAreaAppender textAreaAppender47 = new utility.TextAreaAppender(textArea46);
        javafx.scene.control.TextArea textArea48 = null;
        utility.TextAreaAppender textAreaAppender49 = new utility.TextAreaAppender(textArea48);
        java.util.logging.Filter filter50 = textAreaAppender49.getFilter();
        java.util.logging.Level level51 = textAreaAppender49.getLevel();
        textAreaAppender47.setLevel(level51);
        java.lang.Integer i53 = multiset_histogram7.remove(level51);
        textAreaAppender1.setLevel(level51);
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertNotNull(level5);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(i20);
        org.junit.Assert.assertNotNull(set_histogram21);
        org.junit.Assert.assertNull(i25);
        org.junit.Assert.assertNotNull(str_array30);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(i35);
        org.junit.Assert.assertNotNull(set_histogram36);
        org.junit.Assert.assertNull(i40);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(set_entry_histogram_i45);
        org.junit.Assert.assertNull(filter50);
        org.junit.Assert.assertNotNull(level51);
        org.junit.Assert.assertNull(i53);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        main.Table[] table_array0 = new main.Table[] {};
        java.util.ArrayList<main.Table> arraylist_table1 = new java.util.ArrayList<>();
        boolean b2 = java.util.Collections.addAll(arraylist_table1, table_array0);
        utility.Chen chen3 = new utility.Chen(arraylist_table1);
        utility.Chen chen4 = new utility.Chen(arraylist_table1);
        main.Column column5 = null;
        main.Column column6 = null;
        try {
            double d7 = chen4.getChenSimilarity(column5, column6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(table_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        main.Table[] table_array0 = new main.Table[] {};
        java.util.ArrayList<main.Table> arraylist_table1 = new java.util.ArrayList<>();
        boolean b2 = java.util.Collections.addAll(arraylist_table1, table_array0);
        utility.Chen chen3 = new utility.Chen(arraylist_table1);
        java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str7 = new java.util.ArrayList<>();
        boolean b8 = java.util.Collections.addAll(arraylist_str7, str_array6);
        java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<>();
        boolean b13 = java.util.Collections.addAll(arraylist_str12, str_array11);
        java.lang.Boolean b14 = utility.Tokenization.contains(arraylist_str7, arraylist_str12);
        boolean b15 = arraylist_str12.isEmpty();
        java.lang.String[] str_array18 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<>();
        boolean b20 = java.util.Collections.addAll(arraylist_str19, str_array18);
        java.util.stream.Stream<java.lang.String> stream_str21 = arraylist_str19.stream();
        java.lang.String[] str_array24 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<>();
        boolean b26 = java.util.Collections.addAll(arraylist_str25, str_array24);
        java.lang.String[] str_array29 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<>();
        boolean b31 = java.util.Collections.addAll(arraylist_str30, str_array29);
        java.lang.Boolean b32 = utility.Tokenization.contains(arraylist_str25, arraylist_str30);
        boolean b33 = arraylist_str19.containsAll(arraylist_str30);
        boolean b34 = arraylist_str12.removeAll(arraylist_str30);
        java.lang.String[] str_array37 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<>();
        boolean b39 = java.util.Collections.addAll(arraylist_str38, str_array37);
        java.util.stream.Stream<java.lang.String> stream_str40 = arraylist_str38.stream();
        java.lang.String[] str_array43 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str44 = new java.util.ArrayList<>();
        boolean b45 = java.util.Collections.addAll(arraylist_str44, str_array43);
        java.lang.String[] str_array48 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str49 = new java.util.ArrayList<>();
        boolean b50 = java.util.Collections.addAll(arraylist_str49, str_array48);
        java.lang.Boolean b51 = utility.Tokenization.contains(arraylist_str44, arraylist_str49);
        boolean b52 = arraylist_str38.containsAll(arraylist_str49);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str54 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str56 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i57 = heapwithfixedsize_str56.size();
        boolean b58 = heapwithfixedsize_str54.retainAll(heapwithfixedsize_str56);
        boolean b59 = arraylist_str49.removeAll(heapwithfixedsize_str56);
        java.lang.String[] str_array62 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str63 = new java.util.ArrayList<>();
        boolean b64 = java.util.Collections.addAll(arraylist_str63, str_array62);
        java.lang.String[] str_array67 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str68 = new java.util.ArrayList<>();
        boolean b69 = java.util.Collections.addAll(arraylist_str68, str_array67);
        java.lang.Boolean b70 = utility.Tokenization.contains(arraylist_str63, arraylist_str68);
        boolean b71 = arraylist_str68.isEmpty();
        java.lang.String[] str_array74 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str75 = new java.util.ArrayList<>();
        boolean b76 = java.util.Collections.addAll(arraylist_str75, str_array74);
        java.util.stream.Stream<java.lang.String> stream_str77 = arraylist_str75.stream();
        java.lang.String[] str_array80 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str81 = new java.util.ArrayList<>();
        boolean b82 = java.util.Collections.addAll(arraylist_str81, str_array80);
        java.lang.String[] str_array85 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str86 = new java.util.ArrayList<>();
        boolean b87 = java.util.Collections.addAll(arraylist_str86, str_array85);
        java.lang.Boolean b88 = utility.Tokenization.contains(arraylist_str81, arraylist_str86);
        boolean b89 = arraylist_str75.containsAll(arraylist_str86);
        boolean b90 = arraylist_str68.removeAll(arraylist_str86);
        double d91 = utility.TokenShareRatio.setTokenShareRatioFkLD(arraylist_str49, arraylist_str86);
        double d92 = chen3.getTableChenSimilarity(arraylist_str12, arraylist_str49);
        main.Column column93 = null;
        main.Column column94 = null;
        try {
            double d95 = chen3.getChenSimilarity(column93, column94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(table_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + b14 + "' != '" + true + "'", b14.equals(true));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(stream_str21);
        org.junit.Assert.assertNotNull(str_array24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(str_array29);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + b32 + "' != '" + true + "'", b32.equals(true));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(stream_str40);
        org.junit.Assert.assertNotNull(str_array43);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(str_array48);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue("'" + b51 + "' != '" + true + "'", b51.equals(true));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(str_array62);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(str_array67);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue("'" + b70 + "' != '" + true + "'", b70.equals(true));
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(str_array74);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(stream_str77);
        org.junit.Assert.assertNotNull(str_array80);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertNotNull(str_array85);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertTrue("'" + b88 + "' != '" + true + "'", b88.equals(true));
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertTrue(d91 == 1.0d);
        org.junit.Assert.assertEquals(d92, Double.NaN, 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        utility.MultiMap multiMap0 = new utility.MultiMap();
        multiMap0.put("hi!", "hi!");
        int i4 = multiMap0.size();
        org.junit.Assert.assertTrue(i4 == 1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        javafx.scene.control.TextArea textArea0 = null;
        utility.TextAreaAppender textAreaAppender1 = new utility.TextAreaAppender(textArea0);
        java.util.logging.Filter filter2 = textAreaAppender1.getFilter();
        java.util.logging.Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        java.util.logging.Formatter formatter5 = textAreaAppender1.getFormatter();
        java.util.logging.Filter filter6 = null;
        textAreaAppender1.setFilter(filter6);
        textAreaAppender1.flush();
        textAreaAppender1.flush();
        textAreaAppender1.flush();
        org.junit.Assert.assertNull(filter2);
        org.junit.Assert.assertNotNull(level3);
        org.junit.Assert.assertNotNull(formatter5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = utility.Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = utility.Histogram.rel2abs(d_array2, (double) 5, 1.0d);
        double[] d_array11 = new double[] { (byte) 1, (short) 1 };
        double[] d_array14 = utility.Histogram.rel2abs(d_array11, (double) 100.0f, (double) ' ');
        double[] d_array17 = new double[] { (byte) 1, (short) 1 };
        double[] d_array20 = utility.Histogram.rel2abs(d_array17, (double) 100.0f, (double) ' ');
        double d22 = utility.Logistic.classify(d_array14, d_array20, (double) 100.0f);
        try {
            double[] d_array23 = utility.Multiplication.elementWise(d_array2, d_array20);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(d_array2);
        org.junit.Assert.assertNotNull(d_array5);
        org.junit.Assert.assertNotNull(d_array8);
        org.junit.Assert.assertNotNull(d_array11);
        org.junit.Assert.assertNotNull(d_array14);
        org.junit.Assert.assertNotNull(d_array17);
        org.junit.Assert.assertNotNull(d_array20);
        org.junit.Assert.assertTrue(d22 == 1.0d);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str3 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i4 = heapwithfixedsize_str3.size();
        boolean b5 = heapwithfixedsize_str1.retainAll(heapwithfixedsize_str3);
        java.util.Collection<java.lang.String> collection_str6 = null;
        try {
            boolean b7 = heapwithfixedsize_str3.addAll(collection_str6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        javafx.scene.control.TextArea textArea0 = null;
        utility.TextAreaAppender textAreaAppender1 = new utility.TextAreaAppender(textArea0);
        java.util.logging.Filter filter2 = textAreaAppender1.getFilter();
        java.util.logging.Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        java.util.logging.Formatter formatter5 = textAreaAppender1.getFormatter();
        java.util.logging.Filter filter6 = null;
        textAreaAppender1.setFilter(filter6);
        textAreaAppender1.flush();
        textAreaAppender1.flush();
        java.util.logging.Filter filter10 = textAreaAppender1.getFilter();
        org.junit.Assert.assertNull(filter2);
        org.junit.Assert.assertNotNull(level3);
        org.junit.Assert.assertNotNull(formatter5);
        org.junit.Assert.assertNull(filter10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = utility.Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = utility.Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double d13 = utility.Logistic.classify(d_array5, d_array11, (double) 100.0f);
        double[] d_array17 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array20 = new double[] { (byte) 1, (short) 1 };
        double[] d_array23 = utility.Histogram.rel2abs(d_array20, (double) 100.0f, (double) ' ');
        double[] d_array26 = new double[] { (byte) 1, (short) 1 };
        double[] d_array29 = utility.Histogram.rel2abs(d_array26, (double) 100.0f, (double) ' ');
        double d31 = utility.Logistic.classify(d_array23, d_array29, (double) 100.0f);
        java.lang.Double d32 = utility.Histogram.jaccard(d_array17, d_array29);
        double[] d_array35 = new double[] { (byte) 1, (short) 1 };
        double[] d_array38 = utility.Histogram.rel2abs(d_array35, (double) 100.0f, (double) ' ');
        double[] d_array39 = utility.Multiplication.elementWise(d_array17, d_array38);
        double d41 = utility.Logistic.classify(d_array5, d_array17, (double) (byte) 1);
        double[] d_array44 = new double[] { (byte) 1, (short) 1 };
        double[] d_array47 = utility.Histogram.rel2abs(d_array44, (double) 100.0f, (double) ' ');
        double[] d_array50 = new double[] { (byte) 1, (short) 1 };
        double[] d_array53 = utility.Histogram.rel2abs(d_array50, (double) 100.0f, (double) ' ');
        double[] d_array56 = new double[] { (byte) 1, (short) 1 };
        double[] d_array59 = utility.Histogram.rel2abs(d_array56, (double) 100.0f, (double) ' ');
        double d61 = utility.Logistic.classify(d_array53, d_array59, (double) 100.0f);
        java.lang.Double d62 = utility.Histogram.jaccard(d_array47, d_array53);
        double[] d_array65 = new double[] { (byte) 1, (short) 1 };
        double[] d_array68 = utility.Histogram.rel2abs(d_array65, (double) 100.0f, (double) ' ');
        double[] d_array71 = new double[] { (byte) 1, (short) 1 };
        double[] d_array74 = utility.Histogram.rel2abs(d_array71, (double) 100.0f, (double) ' ');
        double[] d_array77 = new double[] { (byte) 1, (short) 1 };
        double[] d_array80 = utility.Histogram.rel2abs(d_array77, (double) 100.0f, (double) ' ');
        double d82 = utility.Logistic.classify(d_array74, d_array80, (double) 100.0f);
        java.lang.Double d83 = utility.Histogram.jaccard(d_array68, d_array74);
        double[] d_array84 = utility.Multiplication.elementWise(d_array53, d_array68);
        double d86 = utility.Logistic.classify(d_array17, d_array68, (double) 1);
        double[] d_array92 = new double[] { (byte) 0, 0L, 1.0d, 100.0d, 7 };
        java.lang.Double d93 = utility.Histogram.jaccard(d_array68, d_array92);
        try {
            float[] f_array94 = utility.Otsu.otsuThreshold(d_array92);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(d_array2);
        org.junit.Assert.assertNotNull(d_array5);
        org.junit.Assert.assertNotNull(d_array8);
        org.junit.Assert.assertNotNull(d_array11);
        org.junit.Assert.assertTrue(d13 == 1.0d);
        org.junit.Assert.assertNotNull(d_array17);
        org.junit.Assert.assertNotNull(d_array20);
        org.junit.Assert.assertNotNull(d_array23);
        org.junit.Assert.assertNotNull(d_array26);
        org.junit.Assert.assertNotNull(d_array29);
        org.junit.Assert.assertTrue(d31 == 1.0d);
        org.junit.Assert.assertTrue("'" + d32 + "' != '" + 0.0d + "'", d32.equals(0.0d));
        org.junit.Assert.assertNotNull(d_array35);
        org.junit.Assert.assertNotNull(d_array38);
        org.junit.Assert.assertNotNull(d_array39);
        org.junit.Assert.assertTrue(d41 == 1.0d);
        org.junit.Assert.assertNotNull(d_array44);
        org.junit.Assert.assertNotNull(d_array47);
        org.junit.Assert.assertNotNull(d_array50);
        org.junit.Assert.assertNotNull(d_array53);
        org.junit.Assert.assertNotNull(d_array56);
        org.junit.Assert.assertNotNull(d_array59);
        org.junit.Assert.assertTrue(d61 == 1.0d);
        org.junit.Assert.assertEquals(d62, Double.NaN, 0);
        org.junit.Assert.assertNotNull(d_array65);
        org.junit.Assert.assertNotNull(d_array68);
        org.junit.Assert.assertNotNull(d_array71);
        org.junit.Assert.assertNotNull(d_array74);
        org.junit.Assert.assertNotNull(d_array77);
        org.junit.Assert.assertNotNull(d_array80);
        org.junit.Assert.assertTrue(d82 == 1.0d);
        org.junit.Assert.assertEquals(d83, Double.NaN, 0);
        org.junit.Assert.assertNotNull(d_array84);
        org.junit.Assert.assertTrue(d86 == 1.0d);
        org.junit.Assert.assertNotNull(d_array92);
        org.junit.Assert.assertTrue("'" + d93 + "' != '" + 0.0d + "'", d93.equals(0.0d));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        java.util.Set<utility.Histogram> set_histogram14 = multiset_histogram0.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram15 = new utility.MultiSet<>();
        utility.Histogram histogram16 = new utility.Histogram();
        java.lang.Integer i18 = multiset_histogram15.put(histogram16, 0);
        utility.Histogram histogram19 = new utility.Histogram();
        multiset_histogram15.add(histogram19);
        int i21 = multiset_histogram0.count(histogram19);
        int i22 = multiset_histogram0.totalCount();
        java.util.Set<java.util.Map.Entry<utility.Histogram, java.lang.Integer>> set_entry_histogram_i23 = multiset_histogram0.entrySet();
        utility.MultiSet<utility.Histogram> multiset_histogram24 = new utility.MultiSet<>();
        utility.Histogram histogram25 = new utility.Histogram();
        java.lang.Integer i27 = multiset_histogram24.put(histogram25, 0);
        utility.Histogram histogram28 = new utility.Histogram();
        multiset_histogram24.add(histogram28);
        java.lang.String[] str_array32 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str33 = new java.util.PriorityQueue<>();
        boolean b34 = java.util.Collections.addAll(priorityqueue_str33, str_array32);
        boolean b36 = priorityqueue_str33.offer("");
        java.lang.Integer i37 = multiset_histogram24.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram38 = new utility.MultiSet<>();
        utility.Histogram histogram39 = new utility.Histogram();
        java.lang.Integer i41 = multiset_histogram38.put(histogram39, 0);
        utility.Histogram histogram42 = new utility.Histogram();
        multiset_histogram38.add(histogram42);
        java.lang.Integer i45 = multiset_histogram24.replace(histogram42, 2);
        utility.DataSourceFactory dataSourceFactory46 = new utility.DataSourceFactory();
        boolean b47 = multiset_histogram24.containsKey(dataSourceFactory46);
        utility.MultiSet<utility.Histogram> multiset_histogram48 = new utility.MultiSet<>();
        utility.Histogram histogram49 = new utility.Histogram();
        java.lang.Integer i51 = multiset_histogram48.put(histogram49, 0);
        utility.Histogram histogram52 = new utility.Histogram();
        multiset_histogram48.add(histogram52);
        java.lang.String[] str_array56 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str57 = new java.util.PriorityQueue<>();
        boolean b58 = java.util.Collections.addAll(priorityqueue_str57, str_array56);
        boolean b60 = priorityqueue_str57.offer("");
        java.lang.Integer i61 = multiset_histogram48.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram62 = new utility.MultiSet<>();
        utility.Histogram histogram63 = new utility.Histogram();
        java.lang.Integer i65 = multiset_histogram62.put(histogram63, 0);
        utility.Histogram histogram66 = new utility.Histogram();
        multiset_histogram62.add(histogram66);
        java.lang.Integer i69 = multiset_histogram48.replace(histogram66, 2);
        utility.DataSourceFactory dataSourceFactory70 = new utility.DataSourceFactory();
        boolean b71 = multiset_histogram48.containsKey(dataSourceFactory70);
        utility.Histogram histogram72 = new utility.Histogram();
        multiset_histogram48.add(histogram72);
        multiset_histogram24.add(histogram72);
        multiset_histogram0.add(histogram72);
        java.util.Set<java.util.Map.Entry<utility.Histogram, java.lang.Integer>> set_entry_histogram_i76 = multiset_histogram0.entrySet();
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNotNull(set_histogram14);
        org.junit.Assert.assertNull(i18);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertNotNull(set_entry_histogram_i23);
        org.junit.Assert.assertNull(i27);
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(i37);
        org.junit.Assert.assertNull(i41);
        org.junit.Assert.assertNull(i45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(i51);
        org.junit.Assert.assertNotNull(str_array56);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(i61);
        org.junit.Assert.assertNull(i65);
        org.junit.Assert.assertNull(i69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(set_entry_histogram_i76);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.String[] str_array2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<>();
        boolean b4 = java.util.Collections.addAll(arraylist_str3, str_array2);
        java.util.stream.Stream<java.lang.String> stream_str5 = arraylist_str3.stream();
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<>();
        boolean b10 = java.util.Collections.addAll(arraylist_str9, str_array8);
        java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<>();
        boolean b15 = java.util.Collections.addAll(arraylist_str14, str_array13);
        java.lang.Boolean b16 = utility.Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        java.lang.String[] str_array20 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<>();
        boolean b22 = java.util.Collections.addAll(arraylist_str21, str_array20);
        java.util.stream.Stream<java.lang.String> stream_str23 = arraylist_str21.stream();
        java.lang.String[] str_array26 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str27 = new java.util.ArrayList<>();
        boolean b28 = java.util.Collections.addAll(arraylist_str27, str_array26);
        java.lang.String[] str_array31 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<>();
        boolean b33 = java.util.Collections.addAll(arraylist_str32, str_array31);
        java.lang.Boolean b34 = utility.Tokenization.contains(arraylist_str27, arraylist_str32);
        boolean b35 = arraylist_str21.containsAll(arraylist_str32);
        double d36 = utility.TokenShareRatio.setTokenShareRatioFkLD(arraylist_str3, arraylist_str21);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str38 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        java.lang.String[] str_array41 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str42 = new java.util.ArrayList<>();
        boolean b43 = java.util.Collections.addAll(arraylist_str42, str_array41);
        java.util.stream.Stream<java.lang.String> stream_str44 = arraylist_str42.stream();
        java.util.stream.Stream<java.lang.String> stream_str45 = arraylist_str42.parallelStream();
        java.lang.String[] str_array48 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str49 = new java.util.ArrayList<>();
        boolean b50 = java.util.Collections.addAll(arraylist_str49, str_array48);
        java.util.stream.Stream<java.lang.String> stream_str51 = arraylist_str49.stream();
        java.lang.String[] str_array54 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str55 = new java.util.ArrayList<>();
        boolean b56 = java.util.Collections.addAll(arraylist_str55, str_array54);
        java.util.stream.Stream<java.lang.String> stream_str57 = arraylist_str55.stream();
        java.util.stream.Stream<java.lang.String> stream_str58 = arraylist_str55.parallelStream();
        java.lang.String[] str_array61 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str62 = new java.util.ArrayList<>();
        boolean b63 = java.util.Collections.addAll(arraylist_str62, str_array61);
        java.util.stream.Stream<java.lang.String> stream_str64 = arraylist_str62.stream();
        java.util.stream.Stream<java.lang.String> stream_str65 = arraylist_str62.parallelStream();
        java.lang.String[] str_array68 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str69 = new java.util.ArrayList<>();
        boolean b70 = java.util.Collections.addAll(arraylist_str69, str_array68);
        java.util.stream.Stream<java.lang.String> stream_str71 = arraylist_str69.stream();
        java.lang.String[] str_array74 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str75 = new java.util.ArrayList<>();
        boolean b76 = java.util.Collections.addAll(arraylist_str75, str_array74);
        java.util.stream.Stream<java.lang.String> stream_str77 = arraylist_str75.stream();
        java.util.stream.Stream<java.lang.String> stream_str78 = arraylist_str75.parallelStream();
        java.util.stream.Stream[] stream_array80 = new java.util.stream.Stream[6];
        @SuppressWarnings("unchecked") java.util.stream.Stream<java.lang.String>[] stream_str_array81 = (java.util.stream.Stream<java.lang.String>[]) stream_array80;
        stream_str_array81[0] = stream_str45;
        stream_str_array81[1] = stream_str51;
        stream_str_array81[2] = stream_str58;
        stream_str_array81[3] = stream_str65;
        stream_str_array81[4] = stream_str71;
        stream_str_array81[5] = stream_str78;
        java.util.stream.Stream<java.lang.String>[] stream_str_array94 = heapwithfixedsize_str38.toArray(stream_str_array81);
        java.util.Iterator<java.lang.String> iterator_str95 = heapwithfixedsize_str38.iterator();
        boolean b96 = arraylist_str21.containsAll(heapwithfixedsize_str38);
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(stream_str5);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(stream_str23);
        org.junit.Assert.assertNotNull(str_array26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(str_array31);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + b34 + "' != '" + true + "'", b34.equals(true));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(d36 == 1.0d);
        org.junit.Assert.assertNotNull(str_array41);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(stream_str44);
        org.junit.Assert.assertNotNull(stream_str45);
        org.junit.Assert.assertNotNull(str_array48);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(stream_str51);
        org.junit.Assert.assertNotNull(str_array54);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(stream_str57);
        org.junit.Assert.assertNotNull(stream_str58);
        org.junit.Assert.assertNotNull(str_array61);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(stream_str64);
        org.junit.Assert.assertNotNull(stream_str65);
        org.junit.Assert.assertNotNull(str_array68);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(stream_str71);
        org.junit.Assert.assertNotNull(str_array74);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(stream_str77);
        org.junit.Assert.assertNotNull(stream_str78);
        org.junit.Assert.assertNotNull(stream_array80);
        org.junit.Assert.assertNotNull(stream_str_array81);
        org.junit.Assert.assertNotNull(stream_str_array94);
        org.junit.Assert.assertNotNull(iterator_str95);
        org.junit.Assert.assertTrue(b96 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.String[] str_array3 = new java.lang.String[] { "[hi!, hi!]", "[, hi!]", "{}" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str4 = new java.util.PriorityQueue<>();
        boolean b5 = java.util.Collections.addAll(priorityqueue_str4, str_array3);
        java.lang.String str6 = priorityqueue_str4.poll();
        double[] d_array10 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array13 = new double[] { (byte) 1, (short) 1 };
        double[] d_array16 = utility.Histogram.rel2abs(d_array13, (double) 100.0f, (double) ' ');
        double[] d_array19 = new double[] { (byte) 1, (short) 1 };
        double[] d_array22 = utility.Histogram.rel2abs(d_array19, (double) 100.0f, (double) ' ');
        double d24 = utility.Logistic.classify(d_array16, d_array22, (double) 100.0f);
        java.lang.Double d25 = utility.Histogram.jaccard(d_array10, d_array22);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str27 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i28 = heapwithfixedsize_str27.size();
        double[] d_array32 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array35 = new double[] { (byte) 1, (short) 1 };
        double[] d_array38 = utility.Histogram.rel2abs(d_array35, (double) 100.0f, (double) ' ');
        double[] d_array41 = new double[] { (byte) 1, (short) 1 };
        double[] d_array44 = utility.Histogram.rel2abs(d_array41, (double) 100.0f, (double) ' ');
        double d46 = utility.Logistic.classify(d_array38, d_array44, (double) 100.0f);
        java.lang.Double d47 = utility.Histogram.jaccard(d_array32, d_array44);
        double[] d_array50 = new double[] { (byte) 1, (short) 1 };
        double[] d_array53 = utility.Histogram.rel2abs(d_array50, (double) 100.0f, (double) ' ');
        double[] d_array54 = utility.Multiplication.elementWise(d_array32, d_array53);
        boolean b55 = heapwithfixedsize_str27.remove(d_array32);
        java.lang.Double d56 = utility.Histogram.jaccard(d_array10, d_array32);
        boolean b57 = priorityqueue_str4.remove(d56);
        org.junit.Assert.assertNotNull(str_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[, hi!]" + "'", str6.equals("[, hi!]"));
        org.junit.Assert.assertNotNull(d_array10);
        org.junit.Assert.assertNotNull(d_array13);
        org.junit.Assert.assertNotNull(d_array16);
        org.junit.Assert.assertNotNull(d_array19);
        org.junit.Assert.assertNotNull(d_array22);
        org.junit.Assert.assertTrue(d24 == 1.0d);
        org.junit.Assert.assertTrue("'" + d25 + "' != '" + 0.0d + "'", d25.equals(0.0d));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(d_array32);
        org.junit.Assert.assertNotNull(d_array35);
        org.junit.Assert.assertNotNull(d_array38);
        org.junit.Assert.assertNotNull(d_array41);
        org.junit.Assert.assertNotNull(d_array44);
        org.junit.Assert.assertTrue(d46 == 1.0d);
        org.junit.Assert.assertTrue("'" + d47 + "' != '" + 0.0d + "'", d47.equals(0.0d));
        org.junit.Assert.assertNotNull(d_array50);
        org.junit.Assert.assertNotNull(d_array53);
        org.junit.Assert.assertNotNull(d_array54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + d56 + "' != '" + 1.0d + "'", d56.equals(1.0d));
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.String[] str_array2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<>();
        boolean b4 = java.util.Collections.addAll(arraylist_str3, str_array2);
        java.util.stream.Stream<java.lang.String> stream_str5 = arraylist_str3.stream();
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<>();
        boolean b10 = java.util.Collections.addAll(arraylist_str9, str_array8);
        java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<>();
        boolean b15 = java.util.Collections.addAll(arraylist_str14, str_array13);
        java.lang.Boolean b16 = utility.Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str19 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str21 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i22 = heapwithfixedsize_str21.size();
        boolean b23 = heapwithfixedsize_str19.retainAll(heapwithfixedsize_str21);
        boolean b24 = arraylist_str14.removeAll(heapwithfixedsize_str21);
        java.lang.String str25 = heapwithfixedsize_str21.poll();
        java.lang.String[] str_array28 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str29 = new java.util.ArrayList<>();
        boolean b30 = java.util.Collections.addAll(arraylist_str29, str_array28);
        java.util.stream.Stream<java.lang.String> stream_str31 = arraylist_str29.stream();
        java.lang.String[] str_array34 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str35 = new java.util.ArrayList<>();
        boolean b36 = java.util.Collections.addAll(arraylist_str35, str_array34);
        java.lang.String[] str_array39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str40 = new java.util.ArrayList<>();
        boolean b41 = java.util.Collections.addAll(arraylist_str40, str_array39);
        java.lang.Boolean b42 = utility.Tokenization.contains(arraylist_str35, arraylist_str40);
        boolean b43 = arraylist_str29.containsAll(arraylist_str40);
        java.lang.String[] str_array46 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str47 = new java.util.ArrayList<>();
        boolean b48 = java.util.Collections.addAll(arraylist_str47, str_array46);
        java.util.stream.Stream<java.lang.String> stream_str49 = arraylist_str47.stream();
        java.lang.String[] str_array52 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str53 = new java.util.ArrayList<>();
        boolean b54 = java.util.Collections.addAll(arraylist_str53, str_array52);
        java.lang.String[] str_array57 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str58 = new java.util.ArrayList<>();
        boolean b59 = java.util.Collections.addAll(arraylist_str58, str_array57);
        java.lang.Boolean b60 = utility.Tokenization.contains(arraylist_str53, arraylist_str58);
        boolean b61 = arraylist_str47.containsAll(arraylist_str58);
        double d62 = utility.TokenShareRatio.setTokenShareRatioFkLD(arraylist_str29, arraylist_str47);
        boolean b63 = arraylist_str47.isEmpty();
        java.util.List<java.lang.String> list_str65 = utility.Tokenization.split("");
        double d66 = utility.TokenShareRatio.setTokenShareRatioFkLD(arraylist_str47, list_str65);
        boolean b67 = heapwithfixedsize_str21.contains(arraylist_str47);
        java.util.Comparator<? super java.lang.String> comparator_wildcard68 = heapwithfixedsize_str21.comparator();
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(stream_str5);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(str_array28);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(stream_str31);
        org.junit.Assert.assertNotNull(str_array34);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(str_array39);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + b42 + "' != '" + true + "'", b42.equals(true));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(str_array46);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(stream_str49);
        org.junit.Assert.assertNotNull(str_array52);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(str_array57);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue("'" + b60 + "' != '" + true + "'", b60.equals(true));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(d62 == 1.0d);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(list_str65);
        org.junit.Assert.assertTrue(d66 == 1.0d);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(comparator_wildcard68);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        java.util.Set<utility.Histogram> set_histogram14 = multiset_histogram0.keySet();
        boolean b15 = multiset_histogram0.isEmpty();
        java.lang.String str16 = multiset_histogram0.toString();
        utility.MultiSet<utility.Histogram> multiset_histogram17 = new utility.MultiSet<>();
        utility.Histogram histogram18 = new utility.Histogram();
        java.lang.Integer i20 = multiset_histogram17.put(histogram18, 0);
        utility.Histogram histogram21 = new utility.Histogram();
        multiset_histogram17.add(histogram21);
        java.lang.String[] str_array25 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str26 = new java.util.PriorityQueue<>();
        boolean b27 = java.util.Collections.addAll(priorityqueue_str26, str_array25);
        boolean b29 = priorityqueue_str26.offer("");
        java.lang.Integer i30 = multiset_histogram17.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram31 = new utility.MultiSet<>();
        utility.Histogram histogram32 = new utility.Histogram();
        java.lang.Integer i34 = multiset_histogram31.put(histogram32, 0);
        utility.Histogram histogram35 = new utility.Histogram();
        multiset_histogram31.add(histogram35);
        java.lang.Integer i38 = multiset_histogram17.replace(histogram35, 2);
        utility.DataSourceFactory dataSourceFactory39 = new utility.DataSourceFactory();
        boolean b40 = multiset_histogram17.containsKey(dataSourceFactory39);
        utility.MultiSet<utility.Histogram> multiset_histogram41 = new utility.MultiSet<>();
        utility.Histogram histogram42 = new utility.Histogram();
        java.lang.Integer i44 = multiset_histogram41.put(histogram42, 0);
        utility.Histogram histogram45 = new utility.Histogram();
        multiset_histogram41.add(histogram45);
        java.lang.String[] str_array49 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str50 = new java.util.PriorityQueue<>();
        boolean b51 = java.util.Collections.addAll(priorityqueue_str50, str_array49);
        boolean b53 = priorityqueue_str50.offer("");
        java.lang.Integer i54 = multiset_histogram41.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram55 = new utility.MultiSet<>();
        utility.Histogram histogram56 = new utility.Histogram();
        java.lang.Integer i58 = multiset_histogram55.put(histogram56, 0);
        utility.Histogram histogram59 = new utility.Histogram();
        multiset_histogram55.add(histogram59);
        java.lang.Integer i62 = multiset_histogram41.replace(histogram59, 2);
        utility.DataSourceFactory dataSourceFactory63 = new utility.DataSourceFactory();
        boolean b64 = multiset_histogram41.containsKey(dataSourceFactory63);
        utility.Histogram histogram65 = new utility.Histogram();
        multiset_histogram41.add(histogram65);
        multiset_histogram17.add(histogram65);
        int i68 = multiset_histogram0.count(histogram65);
        utility.MultiSet<utility.Histogram> multiset_histogram69 = new utility.MultiSet<>();
        utility.Histogram histogram70 = new utility.Histogram();
        java.lang.Integer i72 = multiset_histogram69.put(histogram70, 0);
        utility.Histogram histogram73 = new utility.Histogram();
        multiset_histogram69.add(histogram73);
        java.lang.String[] str_array77 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str78 = new java.util.PriorityQueue<>();
        boolean b79 = java.util.Collections.addAll(priorityqueue_str78, str_array77);
        boolean b81 = priorityqueue_str78.offer("");
        java.lang.Integer i82 = multiset_histogram69.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram83 = new utility.MultiSet<>();
        utility.Histogram histogram84 = new utility.Histogram();
        java.lang.Integer i86 = multiset_histogram83.put(histogram84, 0);
        utility.Histogram histogram87 = new utility.Histogram();
        multiset_histogram83.add(histogram87);
        java.lang.Integer i90 = multiset_histogram69.replace(histogram87, 2);
        utility.DataSourceFactory dataSourceFactory91 = new utility.DataSourceFactory();
        boolean b92 = multiset_histogram69.containsKey(dataSourceFactory91);
        utility.Histogram histogram93 = new utility.Histogram();
        multiset_histogram69.add(histogram93);
        multiset_histogram0.add(histogram93);
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNotNull(set_histogram14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(i20);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(i30);
        org.junit.Assert.assertNull(i34);
        org.junit.Assert.assertNull(i38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(i44);
        org.junit.Assert.assertNotNull(str_array49);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNull(i54);
        org.junit.Assert.assertNull(i58);
        org.junit.Assert.assertNull(i62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertNull(i72);
        org.junit.Assert.assertNotNull(str_array77);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertNull(i82);
        org.junit.Assert.assertNull(i86);
        org.junit.Assert.assertNull(i90);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        java.lang.Object obj14 = null;
        boolean b15 = multiset_histogram0.containsValue(obj14);
        java.util.Set<utility.Histogram> set_histogram16 = multiset_histogram0.keySet();
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set_histogram16);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        utility.MultiMap multiMap0 = new utility.MultiMap();
        multiMap0.put("", "hi!");
        int i4 = multiMap0.size();
        java.util.List<java.lang.String> list_str6 = multiMap0.get("{}");
        int i7 = multiMap0.size();
        boolean b8 = multiMap0.isEmpty();
        java.util.List<java.lang.String> list_str10 = multiMap0.get("{}");
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_str10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        javafx.scene.control.TextArea textArea0 = null;
        utility.TextAreaAppender textAreaAppender1 = new utility.TextAreaAppender(textArea0);
        java.util.logging.Filter filter2 = textAreaAppender1.getFilter();
        java.util.logging.Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        java.util.logging.Formatter formatter5 = textAreaAppender1.getFormatter();
        java.util.logging.Filter filter6 = null;
        textAreaAppender1.setFilter(filter6);
        java.util.logging.LogRecord logRecord8 = null;
        try {
            textAreaAppender1.publish(logRecord8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(filter2);
        org.junit.Assert.assertNotNull(level3);
        org.junit.Assert.assertNotNull(formatter5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        java.util.Set<utility.Histogram> set_histogram14 = multiset_histogram0.keySet();
        boolean b15 = multiset_histogram0.isEmpty();
        java.lang.String str16 = multiset_histogram0.toString();
        utility.PrefixSelectionCustomizer prefixSelectionCustomizer17 = new utility.PrefixSelectionCustomizer();
        java.lang.Integer i18 = multiset_histogram0.get(prefixSelectionCustomizer17);
        utility.Histogram histogram19 = null;
        int i20 = multiset_histogram0.count(histogram19);
        utility.MultiSet<utility.Histogram> multiset_histogram21 = new utility.MultiSet<>();
        boolean b22 = multiset_histogram21.isEmpty();
        utility.MultiSet<utility.Histogram> multiset_histogram23 = new utility.MultiSet<>();
        utility.Histogram histogram24 = new utility.Histogram();
        java.lang.Integer i26 = multiset_histogram23.put(histogram24, 0);
        utility.Histogram histogram27 = new utility.Histogram();
        multiset_histogram23.add(histogram27);
        java.lang.String[] str_array31 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str32 = new java.util.PriorityQueue<>();
        boolean b33 = java.util.Collections.addAll(priorityqueue_str32, str_array31);
        boolean b35 = priorityqueue_str32.offer("");
        java.lang.Integer i36 = multiset_histogram23.remove("");
        java.util.Set<utility.Histogram> set_histogram37 = multiset_histogram23.keySet();
        boolean b38 = multiset_histogram23.isEmpty();
        java.lang.String str39 = multiset_histogram23.toString();
        utility.MultiSet<utility.Histogram> multiset_histogram40 = new utility.MultiSet<>();
        utility.Histogram histogram41 = new utility.Histogram();
        java.lang.Integer i43 = multiset_histogram40.put(histogram41, 0);
        utility.Histogram histogram44 = new utility.Histogram();
        multiset_histogram40.add(histogram44);
        java.lang.String[] str_array48 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str49 = new java.util.PriorityQueue<>();
        boolean b50 = java.util.Collections.addAll(priorityqueue_str49, str_array48);
        boolean b52 = priorityqueue_str49.offer("");
        java.lang.Integer i53 = multiset_histogram40.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram54 = new utility.MultiSet<>();
        utility.Histogram histogram55 = new utility.Histogram();
        java.lang.Integer i57 = multiset_histogram54.put(histogram55, 0);
        utility.Histogram histogram58 = new utility.Histogram();
        multiset_histogram54.add(histogram58);
        java.lang.Integer i61 = multiset_histogram40.replace(histogram58, 2);
        utility.DataSourceFactory dataSourceFactory62 = new utility.DataSourceFactory();
        boolean b63 = multiset_histogram40.containsKey(dataSourceFactory62);
        utility.MultiSet<utility.Histogram> multiset_histogram64 = new utility.MultiSet<>();
        utility.Histogram histogram65 = new utility.Histogram();
        java.lang.Integer i67 = multiset_histogram64.put(histogram65, 0);
        utility.Histogram histogram68 = new utility.Histogram();
        multiset_histogram64.add(histogram68);
        java.lang.String[] str_array72 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str73 = new java.util.PriorityQueue<>();
        boolean b74 = java.util.Collections.addAll(priorityqueue_str73, str_array72);
        boolean b76 = priorityqueue_str73.offer("");
        java.lang.Integer i77 = multiset_histogram64.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram78 = new utility.MultiSet<>();
        utility.Histogram histogram79 = new utility.Histogram();
        java.lang.Integer i81 = multiset_histogram78.put(histogram79, 0);
        utility.Histogram histogram82 = new utility.Histogram();
        multiset_histogram78.add(histogram82);
        java.lang.Integer i85 = multiset_histogram64.replace(histogram82, 2);
        utility.DataSourceFactory dataSourceFactory86 = new utility.DataSourceFactory();
        boolean b87 = multiset_histogram64.containsKey(dataSourceFactory86);
        utility.Histogram histogram88 = new utility.Histogram();
        multiset_histogram64.add(histogram88);
        multiset_histogram40.add(histogram88);
        int i91 = multiset_histogram23.count(histogram88);
        int i92 = multiset_histogram21.count(histogram88);
        multiset_histogram0.putAll(multiset_histogram21);
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNotNull(set_histogram14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(i18);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(i26);
        org.junit.Assert.assertNotNull(str_array31);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(i36);
        org.junit.Assert.assertNotNull(set_histogram37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(i43);
        org.junit.Assert.assertNotNull(str_array48);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNull(i53);
        org.junit.Assert.assertNull(i57);
        org.junit.Assert.assertNull(i61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(i67);
        org.junit.Assert.assertNotNull(str_array72);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNull(i77);
        org.junit.Assert.assertNull(i81);
        org.junit.Assert.assertNull(i85);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(i91 == 0);
        org.junit.Assert.assertTrue(i92 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        utility.MultiMap multiMap0 = new utility.MultiMap();
        multiMap0.put("", "hi!");
        multiMap0.put("{}", "hi!");
        java.util.List<java.lang.String> list_str8 = multiMap0.get("[hi!, [, hi!], ]");
        org.junit.Assert.assertNotNull(list_str8);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        utility.MultiMap multiMap0 = new utility.MultiMap();
        boolean b1 = multiMap0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.util.List<java.lang.String> list_str1 = utility.Tokenization.split("[hi!, hi!]");
        org.junit.Assert.assertNotNull(list_str1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        javafx.scene.control.TextArea textArea0 = null;
        utility.TextAreaAppender textAreaAppender1 = new utility.TextAreaAppender(textArea0);
        java.util.logging.Filter filter2 = textAreaAppender1.getFilter();
        java.util.logging.Level level3 = textAreaAppender1.getLevel();
        java.util.logging.Level level4 = textAreaAppender1.getLevel();
        org.junit.Assert.assertNull(filter2);
        org.junit.Assert.assertNotNull(level3);
        org.junit.Assert.assertNotNull(level4);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        java.util.Set<utility.Histogram> set_histogram1 = multiset_histogram0.keySet();
        java.lang.String str2 = multiset_histogram0.toString();
        boolean b5 = multiset_histogram0.remove(100.0d, 100);
        java.util.Collection<java.lang.Integer> collection_i6 = multiset_histogram0.values();
        org.junit.Assert.assertNotNull(set_histogram1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection_i6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.List<java.lang.String> list_str1 = utility.Tokenization.split("[, hi!]");
        org.junit.Assert.assertNotNull(list_str1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.String[] str_array2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<>();
        boolean b4 = java.util.Collections.addAll(arraylist_str3, str_array2);
        java.util.stream.Stream<java.lang.String> stream_str5 = arraylist_str3.stream();
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<>();
        boolean b10 = java.util.Collections.addAll(arraylist_str9, str_array8);
        java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<>();
        boolean b15 = java.util.Collections.addAll(arraylist_str14, str_array13);
        java.lang.Boolean b16 = utility.Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str19 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str21 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i22 = heapwithfixedsize_str21.size();
        boolean b23 = heapwithfixedsize_str19.retainAll(heapwithfixedsize_str21);
        boolean b24 = arraylist_str14.removeAll(heapwithfixedsize_str21);
        java.lang.String str25 = heapwithfixedsize_str21.poll();
        utility.MultiSet<utility.Histogram> multiset_histogram26 = new utility.MultiSet<>();
        utility.Histogram histogram27 = new utility.Histogram();
        java.lang.Integer i29 = multiset_histogram26.put(histogram27, 0);
        utility.Histogram histogram30 = new utility.Histogram();
        multiset_histogram26.add(histogram30);
        java.lang.String[] str_array34 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str35 = new java.util.PriorityQueue<>();
        boolean b36 = java.util.Collections.addAll(priorityqueue_str35, str_array34);
        boolean b38 = priorityqueue_str35.offer("");
        java.lang.Integer i39 = multiset_histogram26.remove("");
        java.util.Set<utility.Histogram> set_histogram40 = multiset_histogram26.keySet();
        boolean b41 = multiset_histogram26.isEmpty();
        java.lang.String str42 = multiset_histogram26.toString();
        utility.PrefixSelectionCustomizer prefixSelectionCustomizer43 = new utility.PrefixSelectionCustomizer();
        java.lang.Integer i44 = multiset_histogram26.get(prefixSelectionCustomizer43);
        boolean b45 = heapwithfixedsize_str21.contains(i44);
        java.util.stream.Stream<java.lang.String> stream_str46 = heapwithfixedsize_str21.stream();
        boolean b48 = heapwithfixedsize_str21.offer("[hi!, [, hi!], ]");
        java.util.Spliterator<java.lang.String> spliterator_str49 = heapwithfixedsize_str21.spliterator();
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(stream_str5);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(i29);
        org.junit.Assert.assertNotNull(str_array34);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(i39);
        org.junit.Assert.assertNotNull(set_histogram40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(i44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(stream_str46);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(spliterator_str49);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        java.util.Set<utility.Histogram> set_histogram1 = multiset_histogram0.keySet();
        java.lang.String str2 = multiset_histogram0.toString();
        boolean b5 = multiset_histogram0.remove(100.0d, 100);
        java.util.Set<java.util.Map.Entry<utility.Histogram, java.lang.Integer>> set_entry_histogram_i6 = multiset_histogram0.entrySet();
        org.junit.Assert.assertNotNull(set_histogram1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set_entry_histogram_i6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        javafx.scene.control.TextArea textArea0 = null;
        utility.TextAreaAppender textAreaAppender1 = new utility.TextAreaAppender(textArea0);
        java.util.logging.Filter filter2 = textAreaAppender1.getFilter();
        java.util.logging.Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        java.util.logging.Formatter formatter5 = textAreaAppender1.getFormatter();
        java.util.logging.Filter filter6 = null;
        textAreaAppender1.setFilter(filter6);
        java.util.logging.Filter filter8 = textAreaAppender1.getFilter();
        java.util.logging.Filter filter9 = textAreaAppender1.getFilter();
        org.junit.Assert.assertNull(filter2);
        org.junit.Assert.assertNotNull(level3);
        org.junit.Assert.assertNotNull(formatter5);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(filter9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        java.util.Set<utility.Histogram> set_histogram1 = multiset_histogram0.keySet();
        java.lang.String str2 = multiset_histogram0.toString();
        utility.MultiSet<utility.Histogram> multiset_histogram3 = new utility.MultiSet<>();
        utility.Histogram histogram4 = new utility.Histogram();
        java.lang.Integer i6 = multiset_histogram3.put(histogram4, 0);
        utility.Histogram histogram7 = new utility.Histogram();
        multiset_histogram3.add(histogram7);
        java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str12 = new java.util.PriorityQueue<>();
        boolean b13 = java.util.Collections.addAll(priorityqueue_str12, str_array11);
        boolean b15 = priorityqueue_str12.offer("");
        java.lang.Integer i16 = multiset_histogram3.remove("");
        java.util.Set<utility.Histogram> set_histogram17 = multiset_histogram3.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram18 = new utility.MultiSet<>();
        utility.Histogram histogram19 = new utility.Histogram();
        java.lang.Integer i21 = multiset_histogram18.put(histogram19, 0);
        utility.Histogram histogram22 = new utility.Histogram();
        multiset_histogram18.add(histogram22);
        java.lang.String[] str_array26 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str27 = new java.util.PriorityQueue<>();
        boolean b28 = java.util.Collections.addAll(priorityqueue_str27, str_array26);
        boolean b30 = priorityqueue_str27.offer("");
        java.lang.Integer i31 = multiset_histogram18.remove("");
        java.util.Set<utility.Histogram> set_histogram32 = multiset_histogram18.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram33 = new utility.MultiSet<>();
        utility.Histogram histogram34 = new utility.Histogram();
        java.lang.Integer i36 = multiset_histogram33.put(histogram34, 0);
        utility.Histogram histogram37 = new utility.Histogram();
        multiset_histogram33.add(histogram37);
        int i39 = multiset_histogram18.count(histogram37);
        int i40 = multiset_histogram3.count(histogram37);
        utility.DataSourceFactory dataSourceFactory41 = new utility.DataSourceFactory();
        boolean b42 = multiset_histogram0.remove(histogram37, dataSourceFactory41);
        java.lang.Integer i44 = multiset_histogram0.remove(-1L);
        java.util.Set<utility.Histogram> set_histogram45 = multiset_histogram0.keySet();
        org.junit.Assert.assertNotNull(set_histogram1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(i16);
        org.junit.Assert.assertNotNull(set_histogram17);
        org.junit.Assert.assertNull(i21);
        org.junit.Assert.assertNotNull(str_array26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(i31);
        org.junit.Assert.assertNotNull(set_histogram32);
        org.junit.Assert.assertNull(i36);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(i44);
        org.junit.Assert.assertNotNull(set_histogram45);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        utility.Histogram histogram1 = new utility.Histogram();
        java.lang.Integer i3 = multiset_histogram0.put(histogram1, 0);
        utility.Histogram histogram4 = new utility.Histogram();
        multiset_histogram0.add(histogram4);
        java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str9 = new java.util.PriorityQueue<>();
        boolean b10 = java.util.Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        java.lang.Integer i13 = multiset_histogram0.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram14 = new utility.MultiSet<>();
        utility.Histogram histogram15 = new utility.Histogram();
        java.lang.Integer i17 = multiset_histogram14.put(histogram15, 0);
        utility.Histogram histogram18 = new utility.Histogram();
        multiset_histogram14.add(histogram18);
        java.lang.Integer i21 = multiset_histogram0.replace(histogram18, 2);
        utility.DataSourceFactory dataSourceFactory22 = new utility.DataSourceFactory();
        boolean b23 = multiset_histogram0.containsKey(dataSourceFactory22);
        utility.MultiSet<utility.Histogram> multiset_histogram24 = new utility.MultiSet<>();
        utility.Histogram histogram25 = new utility.Histogram();
        java.lang.Integer i27 = multiset_histogram24.put(histogram25, 0);
        utility.Histogram histogram28 = new utility.Histogram();
        multiset_histogram24.add(histogram28);
        java.lang.String[] str_array32 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str33 = new java.util.PriorityQueue<>();
        boolean b34 = java.util.Collections.addAll(priorityqueue_str33, str_array32);
        boolean b36 = priorityqueue_str33.offer("");
        java.lang.Integer i37 = multiset_histogram24.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram38 = new utility.MultiSet<>();
        utility.Histogram histogram39 = new utility.Histogram();
        java.lang.Integer i41 = multiset_histogram38.put(histogram39, 0);
        utility.Histogram histogram42 = new utility.Histogram();
        multiset_histogram38.add(histogram42);
        java.lang.Integer i45 = multiset_histogram24.replace(histogram42, 2);
        utility.DataSourceFactory dataSourceFactory46 = new utility.DataSourceFactory();
        boolean b47 = multiset_histogram24.containsKey(dataSourceFactory46);
        utility.Histogram histogram48 = new utility.Histogram();
        multiset_histogram24.add(histogram48);
        multiset_histogram0.add(histogram48);
        java.lang.String[] str_array53 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str54 = new java.util.ArrayList<>();
        boolean b55 = java.util.Collections.addAll(arraylist_str54, str_array53);
        java.util.stream.Stream<java.lang.String> stream_str56 = arraylist_str54.stream();
        boolean b58 = multiset_histogram0.remove(arraylist_str54, (byte) 100);
        multiset_histogram0.clear();
        org.junit.Assert.assertNull(i3);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(i17);
        org.junit.Assert.assertNull(i21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(i27);
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(i37);
        org.junit.Assert.assertNull(i41);
        org.junit.Assert.assertNull(i45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(str_array53);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(stream_str56);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        int i2 = utility.LCS.getLongestCommonSubsequence("hi!", "[, hi!]");
        org.junit.Assert.assertTrue(i2 == 3);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = utility.Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = utility.Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double d13 = utility.Logistic.classify(d_array5, d_array11, (double) 100.0f);
        double[] d_array16 = new double[] { (byte) 1, (short) 1 };
        double[] d_array19 = utility.Histogram.rel2abs(d_array16, (double) 100.0f, (double) ' ');
        double[] d_array22 = new double[] { (byte) 1, (short) 1 };
        double[] d_array25 = utility.Histogram.rel2abs(d_array22, (double) 100.0f, (double) ' ');
        double[] d_array28 = new double[] { (byte) 1, (short) 1 };
        double[] d_array31 = utility.Histogram.rel2abs(d_array28, (double) 100.0f, (double) ' ');
        double d33 = utility.Logistic.classify(d_array25, d_array31, (double) 100.0f);
        java.lang.Double d34 = utility.Histogram.jaccard(d_array19, d_array25);
        double[] d_array37 = utility.Histogram.rel2abs(d_array25, (double) 4, (double) 4);
        double[] d_array38 = new double[] {};
        java.lang.Double d39 = utility.Histogram.jaccard(d_array37, d_array38);
        double[] d_array40 = null;
        java.lang.Double d41 = utility.Histogram.jaccard(d_array38, d_array40);
        try {
            double d43 = utility.Logistic.classify(d_array11, d_array40, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(d_array2);
        org.junit.Assert.assertNotNull(d_array5);
        org.junit.Assert.assertNotNull(d_array8);
        org.junit.Assert.assertNotNull(d_array11);
        org.junit.Assert.assertTrue(d13 == 1.0d);
        org.junit.Assert.assertNotNull(d_array16);
        org.junit.Assert.assertNotNull(d_array19);
        org.junit.Assert.assertNotNull(d_array22);
        org.junit.Assert.assertNotNull(d_array25);
        org.junit.Assert.assertNotNull(d_array28);
        org.junit.Assert.assertNotNull(d_array31);
        org.junit.Assert.assertTrue(d33 == 1.0d);
        org.junit.Assert.assertEquals(d34, Double.NaN, 0);
        org.junit.Assert.assertNotNull(d_array37);
        org.junit.Assert.assertNotNull(d_array38);
        org.junit.Assert.assertEquals(d39, Double.NaN, 0);
        org.junit.Assert.assertNull(d41);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str1 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        java.lang.String[] str_array4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<>();
        boolean b6 = java.util.Collections.addAll(arraylist_str5, str_array4);
        java.util.stream.Stream<java.lang.String> stream_str7 = arraylist_str5.stream();
        java.util.stream.Stream<java.lang.String> stream_str8 = arraylist_str5.parallelStream();
        java.lang.String[] str_array11 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<>();
        boolean b13 = java.util.Collections.addAll(arraylist_str12, str_array11);
        java.util.stream.Stream<java.lang.String> stream_str14 = arraylist_str12.stream();
        java.lang.String[] str_array17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<>();
        boolean b19 = java.util.Collections.addAll(arraylist_str18, str_array17);
        java.util.stream.Stream<java.lang.String> stream_str20 = arraylist_str18.stream();
        java.util.stream.Stream<java.lang.String> stream_str21 = arraylist_str18.parallelStream();
        java.lang.String[] str_array24 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<>();
        boolean b26 = java.util.Collections.addAll(arraylist_str25, str_array24);
        java.util.stream.Stream<java.lang.String> stream_str27 = arraylist_str25.stream();
        java.util.stream.Stream<java.lang.String> stream_str28 = arraylist_str25.parallelStream();
        java.lang.String[] str_array31 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<>();
        boolean b33 = java.util.Collections.addAll(arraylist_str32, str_array31);
        java.util.stream.Stream<java.lang.String> stream_str34 = arraylist_str32.stream();
        java.lang.String[] str_array37 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<>();
        boolean b39 = java.util.Collections.addAll(arraylist_str38, str_array37);
        java.util.stream.Stream<java.lang.String> stream_str40 = arraylist_str38.stream();
        java.util.stream.Stream<java.lang.String> stream_str41 = arraylist_str38.parallelStream();
        java.util.stream.Stream[] stream_array43 = new java.util.stream.Stream[6];
        @SuppressWarnings("unchecked") java.util.stream.Stream<java.lang.String>[] stream_str_array44 = (java.util.stream.Stream<java.lang.String>[]) stream_array43;
        stream_str_array44[0] = stream_str8;
        stream_str_array44[1] = stream_str14;
        stream_str_array44[2] = stream_str21;
        stream_str_array44[3] = stream_str28;
        stream_str_array44[4] = stream_str34;
        stream_str_array44[5] = stream_str41;
        java.util.stream.Stream<java.lang.String>[] stream_str_array57 = heapwithfixedsize_str1.toArray(stream_str_array44);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str59 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        utility.HeapWithFixedSize<java.lang.String> heapwithfixedsize_str61 = new utility.HeapWithFixedSize<>((int) (byte) 100);
        int i62 = heapwithfixedsize_str61.size();
        boolean b63 = heapwithfixedsize_str59.retainAll(heapwithfixedsize_str61);
        boolean b64 = heapwithfixedsize_str1.containsAll(heapwithfixedsize_str59);
        java.lang.String str65 = heapwithfixedsize_str1.peek();
        java.lang.String str66 = heapwithfixedsize_str1.poll();
        boolean b67 = heapwithfixedsize_str1.isEmpty();
        org.junit.Assert.assertNotNull(str_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(stream_str7);
        org.junit.Assert.assertNotNull(stream_str8);
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(stream_str14);
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(stream_str20);
        org.junit.Assert.assertNotNull(stream_str21);
        org.junit.Assert.assertNotNull(str_array24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(stream_str27);
        org.junit.Assert.assertNotNull(stream_str28);
        org.junit.Assert.assertNotNull(str_array31);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(stream_str34);
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(stream_str40);
        org.junit.Assert.assertNotNull(stream_str41);
        org.junit.Assert.assertNotNull(stream_array43);
        org.junit.Assert.assertNotNull(stream_str_array44);
        org.junit.Assert.assertNotNull(stream_str_array57);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue(b67 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        utility.MultiSet<utility.Histogram> multiset_histogram0 = new utility.MultiSet<>();
        java.util.Set<utility.Histogram> set_histogram1 = multiset_histogram0.keySet();
        utility.MultiSet<utility.Histogram> multiset_histogram2 = new utility.MultiSet<>();
        utility.Histogram histogram3 = new utility.Histogram();
        java.lang.Integer i5 = multiset_histogram2.put(histogram3, 0);
        utility.Histogram histogram6 = new utility.Histogram();
        multiset_histogram2.add(histogram6);
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str11 = new java.util.PriorityQueue<>();
        boolean b12 = java.util.Collections.addAll(priorityqueue_str11, str_array10);
        boolean b14 = priorityqueue_str11.offer("");
        java.lang.Integer i15 = multiset_histogram2.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram16 = new utility.MultiSet<>();
        utility.Histogram histogram17 = new utility.Histogram();
        java.lang.Integer i19 = multiset_histogram16.put(histogram17, 0);
        utility.Histogram histogram20 = new utility.Histogram();
        multiset_histogram16.add(histogram20);
        java.lang.Integer i23 = multiset_histogram2.replace(histogram20, 2);
        java.lang.Integer i25 = multiset_histogram0.getOrDefault(i23, 7);
        utility.MultiSet<utility.Histogram> multiset_histogram26 = new utility.MultiSet<>();
        utility.Histogram histogram27 = new utility.Histogram();
        java.lang.Integer i29 = multiset_histogram26.put(histogram27, 0);
        utility.Histogram histogram30 = new utility.Histogram();
        multiset_histogram26.add(histogram30);
        java.lang.String[] str_array34 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str35 = new java.util.PriorityQueue<>();
        boolean b36 = java.util.Collections.addAll(priorityqueue_str35, str_array34);
        boolean b38 = priorityqueue_str35.offer("");
        java.lang.Integer i39 = multiset_histogram26.remove("");
        java.util.Set<utility.Histogram> set_histogram40 = multiset_histogram26.keySet();
        boolean b41 = multiset_histogram26.isEmpty();
        java.lang.String str42 = multiset_histogram26.toString();
        utility.MultiSet<utility.Histogram> multiset_histogram43 = new utility.MultiSet<>();
        utility.Histogram histogram44 = new utility.Histogram();
        java.lang.Integer i46 = multiset_histogram43.put(histogram44, 0);
        utility.Histogram histogram47 = new utility.Histogram();
        multiset_histogram43.add(histogram47);
        java.lang.String[] str_array51 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str52 = new java.util.PriorityQueue<>();
        boolean b53 = java.util.Collections.addAll(priorityqueue_str52, str_array51);
        boolean b55 = priorityqueue_str52.offer("");
        java.lang.Integer i56 = multiset_histogram43.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram57 = new utility.MultiSet<>();
        utility.Histogram histogram58 = new utility.Histogram();
        java.lang.Integer i60 = multiset_histogram57.put(histogram58, 0);
        utility.Histogram histogram61 = new utility.Histogram();
        multiset_histogram57.add(histogram61);
        java.lang.Integer i64 = multiset_histogram43.replace(histogram61, 2);
        utility.DataSourceFactory dataSourceFactory65 = new utility.DataSourceFactory();
        boolean b66 = multiset_histogram43.containsKey(dataSourceFactory65);
        utility.MultiSet<utility.Histogram> multiset_histogram67 = new utility.MultiSet<>();
        utility.Histogram histogram68 = new utility.Histogram();
        java.lang.Integer i70 = multiset_histogram67.put(histogram68, 0);
        utility.Histogram histogram71 = new utility.Histogram();
        multiset_histogram67.add(histogram71);
        java.lang.String[] str_array75 = new java.lang.String[] { "hi!", "" };
        java.util.PriorityQueue<java.lang.String> priorityqueue_str76 = new java.util.PriorityQueue<>();
        boolean b77 = java.util.Collections.addAll(priorityqueue_str76, str_array75);
        boolean b79 = priorityqueue_str76.offer("");
        java.lang.Integer i80 = multiset_histogram67.remove("");
        utility.MultiSet<utility.Histogram> multiset_histogram81 = new utility.MultiSet<>();
        utility.Histogram histogram82 = new utility.Histogram();
        java.lang.Integer i84 = multiset_histogram81.put(histogram82, 0);
        utility.Histogram histogram85 = new utility.Histogram();
        multiset_histogram81.add(histogram85);
        java.lang.Integer i88 = multiset_histogram67.replace(histogram85, 2);
        utility.DataSourceFactory dataSourceFactory89 = new utility.DataSourceFactory();
        boolean b90 = multiset_histogram67.containsKey(dataSourceFactory89);
        utility.Histogram histogram91 = new utility.Histogram();
        multiset_histogram67.add(histogram91);
        multiset_histogram43.add(histogram91);
        int i94 = multiset_histogram26.count(histogram91);
        javafx.scene.control.TextArea textArea95 = null;
        utility.TextAreaAppender textAreaAppender96 = new utility.TextAreaAppender(textArea95);
        java.util.logging.ErrorManager errorManager97 = textAreaAppender96.getErrorManager();
        boolean b98 = multiset_histogram0.remove(histogram91, textAreaAppender96);
        java.lang.Object obj99 = multiset_histogram0.clone();
        org.junit.Assert.assertNotNull(set_histogram1);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertNull(i19);
        org.junit.Assert.assertNull(i23);
        org.junit.Assert.assertTrue("'" + i25 + "' != '" + 7 + "'", i25.equals(7));
        org.junit.Assert.assertNull(i29);
        org.junit.Assert.assertNotNull(str_array34);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(i39);
        org.junit.Assert.assertNotNull(set_histogram40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(i46);
        org.junit.Assert.assertNotNull(str_array51);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNull(i56);
        org.junit.Assert.assertNull(i60);
        org.junit.Assert.assertNull(i64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(i70);
        org.junit.Assert.assertNotNull(str_array75);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNull(i80);
        org.junit.Assert.assertNull(i84);
        org.junit.Assert.assertNull(i88);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(i94 == 0);
        org.junit.Assert.assertNotNull(errorManager97);
        org.junit.Assert.assertTrue(b98 == false);
        org.junit.Assert.assertNotNull(obj99);
    }
}

