package utility;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import main.Column;
import main.Table;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import javax.sql.DataSource;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;
import java.util.Spliterator;
import java.util.logging.ErrorManager;
import java.util.logging.Filter;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.stream.Stream;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest {

    @Test
    public void test002() throws Throwable {
        double[] d_array6 = new double[] { (short) 100, (byte) 1, (byte) 1, 100, (byte) -1, (byte) -1 };
        double[] d_array7 = null;
        try {
            double d9 = Logistic.classify(d_array6, d_array7, (double) ' ');
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNotNull(d_array6);
    }

    @Test
    public void test003() throws Throwable {
        try {
            HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>(0);
            Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        double[] d_array5 = new double[] { 1.0d, '4', (byte) 10, (short) 1, '#' };
        double[] d_array9 = new double[] { 1, (byte) 1, (short) -1 };
        try {
            Double d10 = Histogram.jaccard(d_array5, d_array9);
            Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
        Assert.assertNotNull(d_array5);
        Assert.assertNotNull(d_array9);
    }

    @Test
    public void test005() throws Throwable {
        ValidatorText validatorText0 = new ValidatorText();
    }

    @Test
    public void test006() throws Throwable {
        double[] d_array2 = new double[] { (byte) 10, (-1.0d) };
        double[] d_array3 = null;
        try {
            double d5 = Logistic.classify(d_array2, d_array3, (double) 0.0f);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNotNull(d_array2);
    }

    @Test
    public void test007() throws Throwable {
        double[][] d_array_array0 = null;
        try {
            Hungarian hungarian1 = new Hungarian(d_array_array0);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        TextField textField0 = null;
        try {
            ValidatorText.addNumericValidation(textField0);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (byte) 100);
        try {
            String str2 = heapwithfixedsize_str1.remove();
            Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (NoSuchElementException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        Multiplication multiplication0 = new Multiplication();
    }

    @Test
    public void test011() throws Throwable {
        String[] str_array2 = new String[] { "", "" };
        ArrayList<String> arraylist_str3 = new ArrayList<>();
        boolean b4 = Collections.addAll(arraylist_str3, str_array2);
        Stream<String> stream_str5 = arraylist_str3.stream();
        Stream<String> stream_str6 = arraylist_str3.parallelStream();
        Assert.assertNotNull(str_array2);
        Assert.assertTrue(b4 == true);
        Assert.assertNotNull(stream_str5);
        Assert.assertNotNull(stream_str6);
    }

    @Test
    public void test012() throws Throwable {
        TextField textField0 = null;
        try {
            ValidatorText.addNumericValidation(textField0, (int) (byte) 1);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        Logistic logistic0 = new Logistic();
    }

    @Test
    public void test014() throws Throwable {
        Tpc tpc0 = new Tpc();
    }

    @Test
    public void test015() throws Throwable {
        double[] d_array1 = new double[] { 0.0d };
        double[] d_array5 = new double[] { '#', (byte) 1, (short) -1 };
        try {
            double[] d_array6 = Multiplication.elementWise(d_array1, d_array5);
            Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (RuntimeException e) {
        }
        Assert.assertNotNull(d_array1);
        Assert.assertNotNull(d_array5);
    }

    @Test
    public void test016() throws Throwable {
        LCS lCS0 = new LCS();
    }

    @Test
    public void test017() throws Throwable {
        Double d1 = String2Num.getNumericValue("");
        Assert.assertTrue("'" + d1 + "' != '" + 0.0d + "'", d1.equals(0.0d));
    }

    @Test
    public void test018() throws Throwable {
        int i2 = Levenshtein.getDistance("hi!", "");
        Assert.assertTrue(i2 == 3);
    }

    @Test
    public void test019() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (byte) 100);
        try {
            String str2 = heapwithfixedsize_str1.element();
            Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (NoSuchElementException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        Properties properties0 = null;
        try {
            DataSource dataSource2 = DataSourceFactory.getConfiguredDataSource(properties0, "hi!");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        Tokenization tokenization0 = new Tokenization();
    }

    @Test
    public void test022() throws Throwable {
        Table[] table_array0 = new Table[] {};
        ArrayList<Table> arraylist_table1 = new ArrayList<>();
        boolean b2 = Collections.addAll(arraylist_table1, table_array0);
        Chen chen3 = new Chen(arraylist_table1);
        Column column4 = null;
        Column column5 = null;
        try {
            double d6 = chen3.getChenSimilarity(column4, column5);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNotNull(table_array0);
        Assert.assertTrue(b2 == false);
    }

    @Test
    public void test023() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        HeapWithFixedSize<String> heapwithfixedsize_str2 = new HeapWithFixedSize<>((int) (byte) 100);
        String[] str_array5 = new String[] { "", "" };
        ArrayList<String> arraylist_str6 = new ArrayList<>();
        boolean b7 = Collections.addAll(arraylist_str6, str_array5);
        Stream<String> stream_str8 = arraylist_str6.stream();
        Stream<String> stream_str9 = arraylist_str6.parallelStream();
        String[] str_array12 = new String[] { "", "" };
        ArrayList<String> arraylist_str13 = new ArrayList<>();
        boolean b14 = Collections.addAll(arraylist_str13, str_array12);
        Stream<String> stream_str15 = arraylist_str13.stream();
        String[] str_array18 = new String[] { "", "" };
        ArrayList<String> arraylist_str19 = new ArrayList<>();
        boolean b20 = Collections.addAll(arraylist_str19, str_array18);
        Stream<String> stream_str21 = arraylist_str19.stream();
        Stream<String> stream_str22 = arraylist_str19.parallelStream();
        String[] str_array25 = new String[] { "", "" };
        ArrayList<String> arraylist_str26 = new ArrayList<>();
        boolean b27 = Collections.addAll(arraylist_str26, str_array25);
        Stream<String> stream_str28 = arraylist_str26.stream();
        Stream<String> stream_str29 = arraylist_str26.parallelStream();
        String[] str_array32 = new String[] { "", "" };
        ArrayList<String> arraylist_str33 = new ArrayList<>();
        boolean b34 = Collections.addAll(arraylist_str33, str_array32);
        Stream<String> stream_str35 = arraylist_str33.stream();
        String[] str_array38 = new String[] { "", "" };
        ArrayList<String> arraylist_str39 = new ArrayList<>();
        boolean b40 = Collections.addAll(arraylist_str39, str_array38);
        Stream<String> stream_str41 = arraylist_str39.stream();
        Stream<String> stream_str42 = arraylist_str39.parallelStream();
        Stream[] stream_array44 = new Stream[6];
        @SuppressWarnings("unchecked") Stream<String>[] stream_str_array45 = (Stream<String>[]) stream_array44;
        stream_str_array45[0] = stream_str9;
        stream_str_array45[1] = stream_str15;
        stream_str_array45[2] = stream_str22;
        stream_str_array45[3] = stream_str29;
        stream_str_array45[4] = stream_str35;
        stream_str_array45[5] = stream_str42;
        Stream<String>[] stream_str_array58 = heapwithfixedsize_str2.toArray(stream_str_array45);
        boolean b59 = multiset_histogram0.containsValue(stream_str_array58);
        Assert.assertNotNull(str_array5);
        Assert.assertTrue(b7 == true);
        Assert.assertNotNull(stream_str8);
        Assert.assertNotNull(stream_str9);
        Assert.assertNotNull(str_array12);
        Assert.assertTrue(b14 == true);
        Assert.assertNotNull(stream_str15);
        Assert.assertNotNull(str_array18);
        Assert.assertTrue(b20 == true);
        Assert.assertNotNull(stream_str21);
        Assert.assertNotNull(stream_str22);
        Assert.assertNotNull(str_array25);
        Assert.assertTrue(b27 == true);
        Assert.assertNotNull(stream_str28);
        Assert.assertNotNull(stream_str29);
        Assert.assertNotNull(str_array32);
        Assert.assertTrue(b34 == true);
        Assert.assertNotNull(stream_str35);
        Assert.assertNotNull(str_array38);
        Assert.assertTrue(b40 == true);
        Assert.assertNotNull(stream_str41);
        Assert.assertNotNull(stream_str42);
        Assert.assertNotNull(stream_array44);
        Assert.assertNotNull(stream_str_array45);
        Assert.assertNotNull(stream_str_array58);
        Assert.assertTrue(b59 == false);
    }

    @Test
    public void test026() throws Throwable {
        double[] d_array0 = new double[] {};
        double[] d_array3 = new double[] { (byte) 1, (short) 1 };
        double[] d_array6 = Histogram.rel2abs(d_array3, (double) 100.0f, (double) ' ');
        double[] d_array9 = new double[] { (byte) 1, (short) 1 };
        double[] d_array12 = Histogram.rel2abs(d_array9, (double) 100.0f, (double) ' ');
        double[] d_array15 = new double[] { (byte) 1, (short) 1 };
        double[] d_array18 = Histogram.rel2abs(d_array15, (double) 100.0f, (double) ' ');
        double d20 = Logistic.classify(d_array12, d_array18, (double) 100.0f);
        Double d21 = Histogram.jaccard(d_array6, d_array12);
        try {
            double[] d_array22 = Multiplication.elementWise(d_array0, d_array6);
            Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (RuntimeException e) {
        }
        Assert.assertNotNull(d_array0);
        Assert.assertNotNull(d_array3);
        Assert.assertNotNull(d_array6);
        Assert.assertNotNull(d_array9);
        Assert.assertNotNull(d_array12);
        Assert.assertNotNull(d_array15);
        Assert.assertNotNull(d_array18);
        Assert.assertTrue(d20 == 1.0d);
        Assert.assertEquals(d21, Double.NaN, 0);
    }

    @Test
    public void test027() throws Throwable {
        int i2 = Levenshtein.getDistance("", "hi!");
        Assert.assertTrue(i2 == 3);
    }

    @Test
    public void test028() throws Throwable {
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double d13 = Logistic.classify(d_array5, d_array11, (double) 100.0f);
        double[] d_array16 = new double[] { (byte) 1, (short) 1 };
        double[] d_array19 = Histogram.rel2abs(d_array16, (double) 100.0f, (double) ' ');
        double[] d_array22 = new double[] { (byte) 1, (short) 1 };
        double[] d_array25 = Histogram.rel2abs(d_array22, (double) 100.0f, (double) ' ');
        double[] d_array28 = new double[] { (byte) 1, (short) 1 };
        double[] d_array31 = Histogram.rel2abs(d_array28, (double) 100.0f, (double) ' ');
        double d33 = Logistic.classify(d_array25, d_array31, (double) 100.0f);
        Double d34 = Histogram.jaccard(d_array19, d_array25);
        double[] d_array37 = Histogram.rel2abs(d_array25, (double) 4, (double) 4);
        try {
            double d39 = Logistic.classify(d_array5, d_array37, 0.0d);
            Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (RuntimeException e) {
        }
        Assert.assertNotNull(d_array2);
        Assert.assertNotNull(d_array5);
        Assert.assertNotNull(d_array8);
        Assert.assertNotNull(d_array11);
        Assert.assertTrue(d13 == 1.0d);
        Assert.assertNotNull(d_array16);
        Assert.assertNotNull(d_array19);
        Assert.assertNotNull(d_array22);
        Assert.assertNotNull(d_array25);
        Assert.assertNotNull(d_array28);
        Assert.assertNotNull(d_array31);
        Assert.assertTrue(d33 == 1.0d);
        Assert.assertEquals(d34, Double.NaN, 0);
        Assert.assertNotNull(d_array37);
    }

    @Test
    public void test029() throws Throwable {
        try {
            HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (byte) -1);
            Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str3 = new HeapWithFixedSize<>((int) (byte) 100);
        int i4 = heapwithfixedsize_str3.size();
        boolean b5 = heapwithfixedsize_str1.retainAll(heapwithfixedsize_str3);
        Iterator<String> iterator_str6 = heapwithfixedsize_str1.iterator();
        try {
            String str7 = heapwithfixedsize_str1.remove();
            Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (NoSuchElementException e) {
        }
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(b5 == false);
        Assert.assertNotNull(iterator_str6);
    }

    @Test
    public void test031() throws Throwable {
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double[] d_array14 = new double[] { (byte) 1, (short) 1 };
        double[] d_array17 = Histogram.rel2abs(d_array14, (double) 100.0f, (double) ' ');
        double d19 = Logistic.classify(d_array11, d_array17, (double) 100.0f);
        Double d20 = Histogram.jaccard(d_array5, d_array11);
        double[] d_array23 = new double[] { (byte) 1, (short) 1 };
        double[] d_array26 = Histogram.rel2abs(d_array23, (double) 100.0f, (double) ' ');
        double[] d_array29 = new double[] { (byte) 1, (short) 1 };
        double[] d_array32 = Histogram.rel2abs(d_array29, (double) 100.0f, (double) ' ');
        double[] d_array35 = new double[] { (byte) 1, (short) 1 };
        double[] d_array38 = Histogram.rel2abs(d_array35, (double) 100.0f, (double) ' ');
        double d40 = Logistic.classify(d_array32, d_array38, (double) 100.0f);
        Double d41 = Histogram.jaccard(d_array26, d_array32);
        double[] d_array44 = Histogram.rel2abs(d_array32, (double) 4, (double) 4);
        try {
            Double d45 = Histogram.jaccard(d_array5, d_array44);
            Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
        Assert.assertNotNull(d_array2);
        Assert.assertNotNull(d_array5);
        Assert.assertNotNull(d_array8);
        Assert.assertNotNull(d_array11);
        Assert.assertNotNull(d_array14);
        Assert.assertNotNull(d_array17);
        Assert.assertTrue(d19 == 1.0d);
        Assert.assertEquals(d20, Double.NaN, 0);
        Assert.assertNotNull(d_array23);
        Assert.assertNotNull(d_array26);
        Assert.assertNotNull(d_array29);
        Assert.assertNotNull(d_array32);
        Assert.assertNotNull(d_array35);
        Assert.assertNotNull(d_array38);
        Assert.assertTrue(d40 == 1.0d);
        Assert.assertEquals(d41, Double.NaN, 0);
        Assert.assertNotNull(d_array44);
    }

    @Test
    public void test032() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (short) 100);
    }

    @Test
    public void test033() throws Throwable {
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double[] d_array14 = new double[] { (byte) 1, (short) 1 };
        double[] d_array17 = Histogram.rel2abs(d_array14, (double) 100.0f, (double) ' ');
        double d19 = Logistic.classify(d_array11, d_array17, (double) 100.0f);
        Double d20 = Histogram.jaccard(d_array5, d_array11);
        double[] d_array23 = Histogram.rel2abs(d_array11, (double) 4, (double) 4);
        Assert.assertNotNull(d_array2);
        Assert.assertNotNull(d_array5);
        Assert.assertNotNull(d_array8);
        Assert.assertNotNull(d_array11);
        Assert.assertNotNull(d_array14);
        Assert.assertNotNull(d_array17);
        Assert.assertTrue(d19 == 1.0d);
        Assert.assertEquals(d20, Double.NaN, 0);
        Assert.assertNotNull(d_array23);
    }

    @Test
    public void test034() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        Set<Entry<Histogram, Integer>> set_entry_histogram_i6 = multiset_histogram0.entrySet();
        Assert.assertNull(i3);
        Assert.assertNotNull(set_entry_histogram_i6);
    }

    @Test
    public void test035() throws Throwable {
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double d13 = Logistic.classify(d_array5, d_array11, (double) 100.0f);
        Assert.assertNotNull(d_array2);
        Assert.assertNotNull(d_array5);
        Assert.assertNotNull(d_array8);
        Assert.assertNotNull(d_array11);
        Assert.assertTrue(d13 == 1.0d);
    }

    @Test
    public void test036() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        MultiSet<Histogram> multiset_histogram14 = new MultiSet<>();
        Histogram histogram15 = new Histogram();
        Integer i17 = multiset_histogram14.put(histogram15, 0);
        Histogram histogram18 = new Histogram();
        multiset_histogram14.add(histogram18);
        Integer i21 = multiset_histogram0.replace(histogram18, 2);
        multiset_histogram0.clear();
        multiset_histogram0.clear();
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNull(i17);
        Assert.assertNull(i21);
    }

    @Test
    public void test037() throws Throwable {
        int i2 = LCS.getLongestCommonSubsequence("[, hi!]", "[, hi!]");
        Assert.assertTrue(i2 == 7);
    }

    @Test
    public void test038() throws Throwable {
        Properties properties0 = null;
        try {
            DataSource dataSource2 = DataSourceFactory.getConfiguredDataSource(properties0, "[, hi!]");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        boolean b1 = multiset_histogram0.isEmpty();
        MultiSet<Histogram> multiset_histogram2 = new MultiSet<>();
        Histogram histogram3 = new Histogram();
        Integer i5 = multiset_histogram2.put(histogram3, 0);
        HeapWithFixedSize<String> heapwithfixedsize_str7 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str9 = new HeapWithFixedSize<>((int) (byte) 100);
        int i10 = heapwithfixedsize_str9.size();
        boolean b11 = heapwithfixedsize_str7.retainAll(heapwithfixedsize_str9);
        boolean b12 = multiset_histogram0.remove(i5, b11);
        Assert.assertTrue(b1 == true);
        Assert.assertNull(i5);
        Assert.assertTrue(i10 == 0);
        Assert.assertTrue(b11 == false);
        Assert.assertTrue(b12 == false);
    }

    @Test
    public void test040() throws Throwable {
        double[] d_array3 = new double[] { 0.0f, 10, (-1) };
        double[][] d_array_array4 = new double[][] { d_array3 };
        Hungarian hungarian5 = new Hungarian(d_array_array4);
        Hungarian hungarian6 = new Hungarian(d_array_array4);
        Assert.assertNotNull(d_array3);
        Assert.assertNotNull(d_array_array4);
    }

    @Test
    public void test041() throws Throwable {
        Properties properties0 = null;
        try {
            DataSource dataSource2 = DataSourceFactory.getConfiguredDataSource(properties0, "");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test042() throws Throwable {
        MultiMap multiMap0 = new MultiMap();
        multiMap0.put("", "hi!");
        List<String> list_str5 = multiMap0.get("hi!");
        Stream<String> stream_str6 = list_str5.parallelStream();
        Assert.assertNotNull(list_str5);
        Assert.assertNotNull(stream_str6);
    }

    @Test
    public void test043() throws Throwable {
        String[] str_array2 = new String[] { "", "" };
        ArrayList<String> arraylist_str3 = new ArrayList<>();
        boolean b4 = Collections.addAll(arraylist_str3, str_array2);
        Stream<String> stream_str5 = arraylist_str3.stream();
        String[] str_array8 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str9 = new ArrayList<>();
        boolean b10 = Collections.addAll(arraylist_str9, str_array8);
        String[] str_array13 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str14 = new ArrayList<>();
        boolean b15 = Collections.addAll(arraylist_str14, str_array13);
        Boolean b16 = Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        HeapWithFixedSize<String> heapwithfixedsize_str19 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str21 = new HeapWithFixedSize<>((int) (byte) 100);
        int i22 = heapwithfixedsize_str21.size();
        boolean b23 = heapwithfixedsize_str19.retainAll(heapwithfixedsize_str21);
        boolean b24 = arraylist_str14.removeAll(heapwithfixedsize_str21);
        Table[] table_array25 = new Table[] {};
        ArrayList<Table> arraylist_table26 = new ArrayList<>();
        boolean b27 = Collections.addAll(arraylist_table26, table_array25);
        Chen chen28 = new Chen(arraylist_table26);
        String[] str_array31 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str32 = new ArrayList<>();
        boolean b33 = Collections.addAll(arraylist_str32, str_array31);
        String[] str_array36 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str37 = new ArrayList<>();
        boolean b38 = Collections.addAll(arraylist_str37, str_array36);
        Boolean b39 = Tokenization.contains(arraylist_str32, arraylist_str37);
        boolean b40 = arraylist_str37.isEmpty();
        String[] str_array43 = new String[] { "", "" };
        ArrayList<String> arraylist_str44 = new ArrayList<>();
        boolean b45 = Collections.addAll(arraylist_str44, str_array43);
        Stream<String> stream_str46 = arraylist_str44.stream();
        String[] str_array49 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str50 = new ArrayList<>();
        boolean b51 = Collections.addAll(arraylist_str50, str_array49);
        String[] str_array54 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str55 = new ArrayList<>();
        boolean b56 = Collections.addAll(arraylist_str55, str_array54);
        Boolean b57 = Tokenization.contains(arraylist_str50, arraylist_str55);
        boolean b58 = arraylist_str44.containsAll(arraylist_str55);
        boolean b59 = arraylist_str37.removeAll(arraylist_str55);
        String[] str_array62 = new String[] { "", "" };
        ArrayList<String> arraylist_str63 = new ArrayList<>();
        boolean b64 = Collections.addAll(arraylist_str63, str_array62);
        Stream<String> stream_str65 = arraylist_str63.stream();
        double d66 = chen28.getTableChenSimilarity(arraylist_str55, arraylist_str63);
        double d67 = TokenShareRatio.setTokenShareRatioFkLD(arraylist_str14, arraylist_str63);
        List<String> list_str69 = Tokenization.lowercaseSplit("hi!");
        boolean b70 = arraylist_str63.retainAll(list_str69);
        Assert.assertNotNull(str_array2);
        Assert.assertTrue(b4 == true);
        Assert.assertNotNull(stream_str5);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertNotNull(str_array13);
        Assert.assertTrue(b15 == true);
        Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        Assert.assertTrue(b17 == false);
        Assert.assertTrue(i22 == 0);
        Assert.assertTrue(b23 == false);
        Assert.assertTrue(b24 == false);
        Assert.assertNotNull(table_array25);
        Assert.assertTrue(b27 == false);
        Assert.assertNotNull(str_array31);
        Assert.assertTrue(b33 == true);
        Assert.assertNotNull(str_array36);
        Assert.assertTrue(b38 == true);
        Assert.assertTrue("'" + b39 + "' != '" + true + "'", b39.equals(true));
        Assert.assertTrue(b40 == false);
        Assert.assertNotNull(str_array43);
        Assert.assertTrue(b45 == true);
        Assert.assertNotNull(stream_str46);
        Assert.assertNotNull(str_array49);
        Assert.assertTrue(b51 == true);
        Assert.assertNotNull(str_array54);
        Assert.assertTrue(b56 == true);
        Assert.assertTrue("'" + b57 + "' != '" + true + "'", b57.equals(true));
        Assert.assertTrue(b58 == false);
        Assert.assertTrue(b59 == true);
        Assert.assertNotNull(str_array62);
        Assert.assertTrue(b64 == true);
        Assert.assertNotNull(stream_str65);
        Assert.assertEquals(d66, Double.NaN, 0);
        Assert.assertEquals(d67, Double.NaN, 0);
        Assert.assertNotNull(list_str69);
        Assert.assertTrue(b70 == true);
    }

    @Test
    public void test044() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        Set<Histogram> set_histogram14 = multiset_histogram0.keySet();
        int i15 = multiset_histogram0.totalCount();
        HeapWithFixedSize<String> heapwithfixedsize_str17 = new HeapWithFixedSize<>((int) (byte) 100);
        String[] str_array20 = new String[] { "", "" };
        ArrayList<String> arraylist_str21 = new ArrayList<>();
        boolean b22 = Collections.addAll(arraylist_str21, str_array20);
        Stream<String> stream_str23 = arraylist_str21.stream();
        Stream<String> stream_str24 = arraylist_str21.parallelStream();
        String[] str_array27 = new String[] { "", "" };
        ArrayList<String> arraylist_str28 = new ArrayList<>();
        boolean b29 = Collections.addAll(arraylist_str28, str_array27);
        Stream<String> stream_str30 = arraylist_str28.stream();
        String[] str_array33 = new String[] { "", "" };
        ArrayList<String> arraylist_str34 = new ArrayList<>();
        boolean b35 = Collections.addAll(arraylist_str34, str_array33);
        Stream<String> stream_str36 = arraylist_str34.stream();
        Stream<String> stream_str37 = arraylist_str34.parallelStream();
        String[] str_array40 = new String[] { "", "" };
        ArrayList<String> arraylist_str41 = new ArrayList<>();
        boolean b42 = Collections.addAll(arraylist_str41, str_array40);
        Stream<String> stream_str43 = arraylist_str41.stream();
        Stream<String> stream_str44 = arraylist_str41.parallelStream();
        String[] str_array47 = new String[] { "", "" };
        ArrayList<String> arraylist_str48 = new ArrayList<>();
        boolean b49 = Collections.addAll(arraylist_str48, str_array47);
        Stream<String> stream_str50 = arraylist_str48.stream();
        String[] str_array53 = new String[] { "", "" };
        ArrayList<String> arraylist_str54 = new ArrayList<>();
        boolean b55 = Collections.addAll(arraylist_str54, str_array53);
        Stream<String> stream_str56 = arraylist_str54.stream();
        Stream<String> stream_str57 = arraylist_str54.parallelStream();
        Stream[] stream_array59 = new Stream[6];
        @SuppressWarnings("unchecked") Stream<String>[] stream_str_array60 = (Stream<String>[]) stream_array59;
        stream_str_array60[0] = stream_str24;
        stream_str_array60[1] = stream_str30;
        stream_str_array60[2] = stream_str37;
        stream_str_array60[3] = stream_str44;
        stream_str_array60[4] = stream_str50;
        stream_str_array60[5] = stream_str57;
        Stream<String>[] stream_str_array73 = heapwithfixedsize_str17.toArray(stream_str_array60);
        Iterator<String> iterator_str74 = heapwithfixedsize_str17.iterator();
        boolean b76 = heapwithfixedsize_str17.offer("hi!");
        Integer i77 = multiset_histogram0.remove(b76);
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNotNull(set_histogram14);
        Assert.assertTrue(i15 == 1);
        Assert.assertNotNull(str_array20);
        Assert.assertTrue(b22 == true);
        Assert.assertNotNull(stream_str23);
        Assert.assertNotNull(stream_str24);
        Assert.assertNotNull(str_array27);
        Assert.assertTrue(b29 == true);
        Assert.assertNotNull(stream_str30);
        Assert.assertNotNull(str_array33);
        Assert.assertTrue(b35 == true);
        Assert.assertNotNull(stream_str36);
        Assert.assertNotNull(stream_str37);
        Assert.assertNotNull(str_array40);
        Assert.assertTrue(b42 == true);
        Assert.assertNotNull(stream_str43);
        Assert.assertNotNull(stream_str44);
        Assert.assertNotNull(str_array47);
        Assert.assertTrue(b49 == true);
        Assert.assertNotNull(stream_str50);
        Assert.assertNotNull(str_array53);
        Assert.assertTrue(b55 == true);
        Assert.assertNotNull(stream_str56);
        Assert.assertNotNull(stream_str57);
        Assert.assertNotNull(stream_array59);
        Assert.assertNotNull(stream_str_array60);
        Assert.assertNotNull(stream_str_array73);
        Assert.assertNotNull(iterator_str74);
        Assert.assertTrue(b76 == true);
        Assert.assertNull(i77);
    }

    @Test
    public void test045() throws Throwable {
        List<String> list_str0 = null;
        String[] str_array4 = new String[] { "", "hi!", "hi!" };
        ArrayList<String> arraylist_str5 = new ArrayList<>();
        boolean b6 = Collections.addAll(arraylist_str5, str_array4);
        String[] str_array9 = new String[] { "", "" };
        ArrayList<String> arraylist_str10 = new ArrayList<>();
        boolean b11 = Collections.addAll(arraylist_str10, str_array9);
        Stream<String> stream_str12 = arraylist_str10.stream();
        String[] str_array15 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str16 = new ArrayList<>();
        boolean b17 = Collections.addAll(arraylist_str16, str_array15);
        String[] str_array20 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str21 = new ArrayList<>();
        boolean b22 = Collections.addAll(arraylist_str21, str_array20);
        Boolean b23 = Tokenization.contains(arraylist_str16, arraylist_str21);
        boolean b24 = arraylist_str10.containsAll(arraylist_str21);
        String[] str_array27 = new String[] { "", "" };
        ArrayList<String> arraylist_str28 = new ArrayList<>();
        boolean b29 = Collections.addAll(arraylist_str28, str_array27);
        Stream<String> stream_str30 = arraylist_str28.stream();
        String[] str_array33 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str34 = new ArrayList<>();
        boolean b35 = Collections.addAll(arraylist_str34, str_array33);
        String[] str_array38 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str39 = new ArrayList<>();
        boolean b40 = Collections.addAll(arraylist_str39, str_array38);
        Boolean b41 = Tokenization.contains(arraylist_str34, arraylist_str39);
        boolean b42 = arraylist_str28.containsAll(arraylist_str39);
        double d43 = TokenShareRatio.setTokenShareRatioFkLD(arraylist_str10, arraylist_str28);
        double d44 = TokenShareRatio.setTokenShareRatioFkLD(arraylist_str5, arraylist_str28);
        try {
            Boolean b45 = Tokenization.contains(list_str0, arraylist_str28);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNotNull(str_array4);
        Assert.assertTrue(b6 == true);
        Assert.assertNotNull(str_array9);
        Assert.assertTrue(b11 == true);
        Assert.assertNotNull(stream_str12);
        Assert.assertNotNull(str_array15);
        Assert.assertTrue(b17 == true);
        Assert.assertNotNull(str_array20);
        Assert.assertTrue(b22 == true);
        Assert.assertTrue("'" + b23 + "' != '" + true + "'", b23.equals(true));
        Assert.assertTrue(b24 == false);
        Assert.assertNotNull(str_array27);
        Assert.assertTrue(b29 == true);
        Assert.assertNotNull(stream_str30);
        Assert.assertNotNull(str_array33);
        Assert.assertTrue(b35 == true);
        Assert.assertNotNull(str_array38);
        Assert.assertTrue(b40 == true);
        Assert.assertTrue("'" + b41 + "' != '" + true + "'", b41.equals(true));
        Assert.assertTrue(b42 == false);
        Assert.assertTrue(d43 == 1.0d);
        Assert.assertTrue(d44 == 1.0d);
    }

    @Test
    public void test046() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) '#');
        boolean b3 = heapwithfixedsize_str1.add("");
        Assert.assertTrue(b3 == true);
    }

    @Test
    public void test047() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        Object obj14 = null;
        boolean b15 = multiset_histogram0.containsValue(obj14);
        MultiSet<Histogram> multiset_histogram16 = new MultiSet<>();
        Histogram histogram17 = new Histogram();
        Integer i19 = multiset_histogram16.put(histogram17, 0);
        Histogram histogram20 = new Histogram();
        multiset_histogram16.add(histogram20);
        String[] str_array24 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str25 = new PriorityQueue<>();
        boolean b26 = Collections.addAll(priorityqueue_str25, str_array24);
        boolean b28 = priorityqueue_str25.offer("");
        Integer i29 = multiset_histogram16.remove("");
        MultiSet<Histogram> multiset_histogram30 = new MultiSet<>();
        Histogram histogram31 = new Histogram();
        Integer i33 = multiset_histogram30.put(histogram31, 0);
        Histogram histogram34 = new Histogram();
        multiset_histogram30.add(histogram34);
        Integer i37 = multiset_histogram16.replace(histogram34, 2);
        MultiSet<Histogram> multiset_histogram38 = new MultiSet<>();
        Histogram histogram39 = new Histogram();
        Integer i41 = multiset_histogram38.put(histogram39, 0);
        Histogram histogram42 = new Histogram();
        multiset_histogram38.add(histogram42);
        String[] str_array46 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str47 = new PriorityQueue<>();
        boolean b48 = Collections.addAll(priorityqueue_str47, str_array46);
        boolean b50 = priorityqueue_str47.offer("");
        Integer i51 = multiset_histogram38.remove("");
        Set<Histogram> set_histogram52 = multiset_histogram38.keySet();
        MultiSet<Histogram> multiset_histogram53 = new MultiSet<>();
        Histogram histogram54 = new Histogram();
        Integer i56 = multiset_histogram53.put(histogram54, 0);
        Histogram histogram57 = new Histogram();
        multiset_histogram53.add(histogram57);
        int i59 = multiset_histogram38.count(histogram57);
        int i60 = multiset_histogram16.count(histogram57);
        multiset_histogram0.add(histogram57);
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertTrue(b15 == false);
        Assert.assertNull(i19);
        Assert.assertNotNull(str_array24);
        Assert.assertTrue(b26 == true);
        Assert.assertTrue(b28 == true);
        Assert.assertNull(i29);
        Assert.assertNull(i33);
        Assert.assertNull(i37);
        Assert.assertNull(i41);
        Assert.assertNotNull(str_array46);
        Assert.assertTrue(b48 == true);
        Assert.assertTrue(b50 == true);
        Assert.assertNull(i51);
        Assert.assertNotNull(set_histogram52);
        Assert.assertNull(i56);
        Assert.assertTrue(i59 == 0);
        Assert.assertTrue(i60 == 0);
    }

    @Test
    public void test048() throws Throwable {
        double[] d_array3 = new double[] { 10L, 2, 7 };
        Assert.assertNotNull(d_array3);
    }

    @Test
    public void test049() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        Set<Histogram> set_histogram14 = multiset_histogram0.keySet();
        boolean b15 = multiset_histogram0.isEmpty();
        Set<Entry<Histogram, Integer>> set_entry_histogram_i16 = multiset_histogram0.entrySet();
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNotNull(set_histogram14);
        Assert.assertTrue(b15 == false);
        Assert.assertNotNull(set_entry_histogram_i16);
    }

    @Test
    public void test050() throws Throwable {
        List<String> list_str1 = Tokenization.lowercaseSplit("{}");
        Assert.assertNotNull(list_str1);
    }

    @Test
    public void test052() throws Throwable {
        TextField textField0 = null;
        try {
            ValidatorText.addNumericValidation(textField0, 4);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        TextArea textArea0 = null;
        TextAreaAppender textAreaAppender1 = new TextAreaAppender(textArea0);
        Filter filter2 = textAreaAppender1.getFilter();
        Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        textAreaAppender1.flush();
        Assert.assertNull(filter2);
        Assert.assertNotNull(level3);
    }

    @Test
    public void test054() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        MultiSet<Histogram> multiset_histogram1 = new MultiSet<>();
        Histogram histogram2 = new Histogram();
        Integer i4 = multiset_histogram1.put(histogram2, 0);
        Histogram histogram5 = new Histogram();
        multiset_histogram1.add(histogram5);
        String[] str_array9 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str10 = new PriorityQueue<>();
        boolean b11 = Collections.addAll(priorityqueue_str10, str_array9);
        boolean b13 = priorityqueue_str10.offer("");
        Integer i14 = multiset_histogram1.remove("");
        MultiSet<Histogram> multiset_histogram15 = new MultiSet<>();
        Histogram histogram16 = new Histogram();
        Integer i18 = multiset_histogram15.put(histogram16, 0);
        Histogram histogram19 = new Histogram();
        multiset_histogram15.add(histogram19);
        Integer i22 = multiset_histogram1.replace(histogram19, 2);
        boolean b25 = multiset_histogram0.replace(histogram19, 100, -1);
        Assert.assertNull(i4);
        Assert.assertNotNull(str_array9);
        Assert.assertTrue(b11 == true);
        Assert.assertTrue(b13 == true);
        Assert.assertNull(i14);
        Assert.assertNull(i18);
        Assert.assertNull(i22);
        Assert.assertTrue(b25 == false);
    }

    @Test
    public void test055() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str3 = new HeapWithFixedSize<>((int) (byte) 100);
        int i4 = heapwithfixedsize_str3.size();
        boolean b5 = heapwithfixedsize_str1.retainAll(heapwithfixedsize_str3);
        String str6 = heapwithfixedsize_str1.peek();
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(b5 == false);
        Assert.assertNull(str6);
    }

    @Test
    public void test056() throws Throwable {
        double[] d_array3 = new double[] { 0.0f, 10, (-1) };
        double[][] d_array_array4 = new double[][] { d_array3 };
        Hungarian hungarian5 = new Hungarian(d_array_array4);
        int[] i_array6 = hungarian5.execute();
        Assert.assertNotNull(d_array3);
        Assert.assertNotNull(d_array_array4);
        Assert.assertNotNull(i_array6);
    }

    @Test
    public void test057() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (byte) 100);
        String[] str_array4 = new String[] { "", "" };
        ArrayList<String> arraylist_str5 = new ArrayList<>();
        boolean b6 = Collections.addAll(arraylist_str5, str_array4);
        Stream<String> stream_str7 = arraylist_str5.stream();
        Stream<String> stream_str8 = arraylist_str5.parallelStream();
        String[] str_array11 = new String[] { "", "" };
        ArrayList<String> arraylist_str12 = new ArrayList<>();
        boolean b13 = Collections.addAll(arraylist_str12, str_array11);
        Stream<String> stream_str14 = arraylist_str12.stream();
        String[] str_array17 = new String[] { "", "" };
        ArrayList<String> arraylist_str18 = new ArrayList<>();
        boolean b19 = Collections.addAll(arraylist_str18, str_array17);
        Stream<String> stream_str20 = arraylist_str18.stream();
        Stream<String> stream_str21 = arraylist_str18.parallelStream();
        String[] str_array24 = new String[] { "", "" };
        ArrayList<String> arraylist_str25 = new ArrayList<>();
        boolean b26 = Collections.addAll(arraylist_str25, str_array24);
        Stream<String> stream_str27 = arraylist_str25.stream();
        Stream<String> stream_str28 = arraylist_str25.parallelStream();
        String[] str_array31 = new String[] { "", "" };
        ArrayList<String> arraylist_str32 = new ArrayList<>();
        boolean b33 = Collections.addAll(arraylist_str32, str_array31);
        Stream<String> stream_str34 = arraylist_str32.stream();
        String[] str_array37 = new String[] { "", "" };
        ArrayList<String> arraylist_str38 = new ArrayList<>();
        boolean b39 = Collections.addAll(arraylist_str38, str_array37);
        Stream<String> stream_str40 = arraylist_str38.stream();
        Stream<String> stream_str41 = arraylist_str38.parallelStream();
        Stream[] stream_array43 = new Stream[6];
        @SuppressWarnings("unchecked") Stream<String>[] stream_str_array44 = (Stream<String>[]) stream_array43;
        stream_str_array44[0] = stream_str8;
        stream_str_array44[1] = stream_str14;
        stream_str_array44[2] = stream_str21;
        stream_str_array44[3] = stream_str28;
        stream_str_array44[4] = stream_str34;
        stream_str_array44[5] = stream_str41;
        Stream<String>[] stream_str_array57 = heapwithfixedsize_str1.toArray(stream_str_array44);
        boolean b59 = heapwithfixedsize_str1.offer("{}");
        Assert.assertNotNull(str_array4);
        Assert.assertTrue(b6 == true);
        Assert.assertNotNull(stream_str7);
        Assert.assertNotNull(stream_str8);
        Assert.assertNotNull(str_array11);
        Assert.assertTrue(b13 == true);
        Assert.assertNotNull(stream_str14);
        Assert.assertNotNull(str_array17);
        Assert.assertTrue(b19 == true);
        Assert.assertNotNull(stream_str20);
        Assert.assertNotNull(stream_str21);
        Assert.assertNotNull(str_array24);
        Assert.assertTrue(b26 == true);
        Assert.assertNotNull(stream_str27);
        Assert.assertNotNull(stream_str28);
        Assert.assertNotNull(str_array31);
        Assert.assertTrue(b33 == true);
        Assert.assertNotNull(stream_str34);
        Assert.assertNotNull(str_array37);
        Assert.assertTrue(b39 == true);
        Assert.assertNotNull(stream_str40);
        Assert.assertNotNull(stream_str41);
        Assert.assertNotNull(stream_array43);
        Assert.assertNotNull(stream_str_array44);
        Assert.assertNotNull(stream_str_array57);
        Assert.assertTrue(b59 == true);
    }

    @Test
    public void test058() throws Throwable {
        int i2 = Levenshtein.getDistance("hi!", "{}");
        Assert.assertTrue(i2 == 3);
    }

    @Test
    public void test059() throws Throwable {
        int i2 = Levenshtein.getDistance("{}", "{}");
        Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test060() throws Throwable {
        MultiMap multiMap0 = new MultiMap();
        multiMap0.put("hi!", "hi!");
        multiMap0.put("{}", "hi!");
    }

    @Test
    public void test061() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) '#');
        boolean b3 = heapwithfixedsize_str1.offer("[, hi!]");
        Assert.assertTrue(b3 == true);
    }

    @Test
    public void test062() throws Throwable {
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double[] d_array14 = new double[] { (byte) 1, (short) 1 };
        double[] d_array17 = Histogram.rel2abs(d_array14, (double) 100.0f, (double) ' ');
        double d19 = Logistic.classify(d_array11, d_array17, (double) 100.0f);
        Double d20 = Histogram.jaccard(d_array5, d_array11);
        double[] d_array23 = Histogram.rel2abs(d_array11, (double) 4, (double) 4);
        Assert.assertNotNull(d_array2);
        Assert.assertNotNull(d_array5);
        Assert.assertNotNull(d_array8);
        Assert.assertNotNull(d_array11);
        Assert.assertNotNull(d_array14);
        Assert.assertNotNull(d_array17);
        Assert.assertTrue(d19 == 1.0d);
        Assert.assertEquals(d20, Double.NaN, 0);
        Assert.assertNotNull(d_array23);
    }

    @Test
    public void test063() throws Throwable {
        int i2 = Levenshtein.getDistance("[, hi!]", "");
        Assert.assertTrue(i2 == 7);
    }

    @Test
    public void test064() throws Throwable {
        String[] str_array2 = new String[] { "", "" };
        ArrayList<String> arraylist_str3 = new ArrayList<>();
        boolean b4 = Collections.addAll(arraylist_str3, str_array2);
        Stream<String> stream_str5 = arraylist_str3.stream();
        String[] str_array8 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str9 = new ArrayList<>();
        boolean b10 = Collections.addAll(arraylist_str9, str_array8);
        String[] str_array13 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str14 = new ArrayList<>();
        boolean b15 = Collections.addAll(arraylist_str14, str_array13);
        Boolean b16 = Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        HeapWithFixedSize<String> heapwithfixedsize_str19 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str21 = new HeapWithFixedSize<>((int) (byte) 100);
        int i22 = heapwithfixedsize_str21.size();
        boolean b23 = heapwithfixedsize_str19.retainAll(heapwithfixedsize_str21);
        boolean b24 = arraylist_str14.removeAll(heapwithfixedsize_str21);
        String str25 = heapwithfixedsize_str21.poll();
        HeapWithFixedSize<String> heapwithfixedsize_str27 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str29 = new HeapWithFixedSize<>((int) (byte) 100);
        int i30 = heapwithfixedsize_str29.size();
        boolean b31 = heapwithfixedsize_str27.retainAll(heapwithfixedsize_str29);
        Iterator<String> iterator_str32 = heapwithfixedsize_str27.iterator();
        int i33 = heapwithfixedsize_str27.size();
        HeapWithFixedSize<String> heapwithfixedsize_str35 = new HeapWithFixedSize<>((int) '#');
        HeapWithFixedSize<String> heapwithfixedsize_str37 = new HeapWithFixedSize<>((int) (byte) 100);
        boolean b39 = heapwithfixedsize_str37.offer("hi!");
        HeapWithFixedSize<String> heapwithfixedsize_str41 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str43 = new HeapWithFixedSize<>((int) (byte) 100);
        int i44 = heapwithfixedsize_str43.size();
        boolean b45 = heapwithfixedsize_str41.retainAll(heapwithfixedsize_str43);
        Queue[] queue_array47 = new Queue[3];
        @SuppressWarnings("unchecked") Queue<String>[] queue_str_array48 = (Queue<String>[]) queue_array47;
        queue_str_array48[0] = heapwithfixedsize_str35;
        queue_str_array48[1] = heapwithfixedsize_str37;
        queue_str_array48[2] = heapwithfixedsize_str41;
        Queue<String>[] queue_str_array55 = heapwithfixedsize_str27.toArray(queue_str_array48);
        boolean b56 = heapwithfixedsize_str21.remove(queue_str_array55);
        Assert.assertNotNull(str_array2);
        Assert.assertTrue(b4 == true);
        Assert.assertNotNull(stream_str5);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertNotNull(str_array13);
        Assert.assertTrue(b15 == true);
        Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        Assert.assertTrue(b17 == false);
        Assert.assertTrue(i22 == 0);
        Assert.assertTrue(b23 == false);
        Assert.assertTrue(b24 == false);
        Assert.assertNull(str25);
        Assert.assertTrue(i30 == 0);
        Assert.assertTrue(b31 == false);
        Assert.assertNotNull(iterator_str32);
        Assert.assertTrue(i33 == 0);
        Assert.assertTrue(b39 == true);
        Assert.assertTrue(i44 == 0);
        Assert.assertTrue(b45 == false);
        Assert.assertNotNull(queue_array47);
        Assert.assertNotNull(queue_str_array48);
        Assert.assertNotNull(queue_str_array55);
        Assert.assertTrue(b56 == false);
    }

    @Test
    public void test065() throws Throwable {
        TokenShareRatio tokenShareRatio0 = new TokenShareRatio();
    }

    @Test
    public void test066() throws Throwable {
        TextArea textArea0 = null;
        TextAreaAppender textAreaAppender1 = new TextAreaAppender(textArea0);
        LogRecord logRecord2 = null;
        try {
            textAreaAppender1.publish(logRecord2);
            Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (IllegalStateException e) {
        }
    }

    @Test
    public void test067() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        Set<Histogram> set_histogram14 = multiset_histogram0.keySet();
        MultiSet<Histogram> multiset_histogram15 = new MultiSet<>();
        Histogram histogram16 = new Histogram();
        Integer i18 = multiset_histogram15.put(histogram16, 0);
        Histogram histogram19 = new Histogram();
        multiset_histogram15.add(histogram19);
        int i21 = multiset_histogram0.count(histogram19);
        int i22 = multiset_histogram0.totalCount();
        boolean b23 = multiset_histogram0.isEmpty();
        Set<Entry<Histogram, Integer>> set_entry_histogram_i24 = multiset_histogram0.entrySet();
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNotNull(set_histogram14);
        Assert.assertNull(i18);
        Assert.assertTrue(i21 == 0);
        Assert.assertTrue(i22 == 1);
        Assert.assertTrue(b23 == false);
        Assert.assertNotNull(set_entry_histogram_i24);
    }

    @Test
    public void test068() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (byte) 100);
        int i2 = heapwithfixedsize_str1.size();
        boolean b4 = heapwithfixedsize_str1.offer("{}");
        Assert.assertTrue(i2 == 0);
        Assert.assertTrue(b4 == true);
    }

    @Test
    public void test069() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        boolean b1 = multiset_histogram0.isEmpty();
        int i2 = multiset_histogram0.size();
        Collection<Integer> collection_i3 = multiset_histogram0.values();
        Assert.assertTrue(b1 == true);
        Assert.assertTrue(i2 == 0);
        Assert.assertNotNull(collection_i3);
    }

    @Test
    public void test070() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        Set<Histogram> set_histogram14 = multiset_histogram0.keySet();
        boolean b15 = multiset_histogram0.isEmpty();
        String str16 = multiset_histogram0.toString();
        PrefixSelectionCustomizer prefixSelectionCustomizer17 = new PrefixSelectionCustomizer();
        Integer i18 = multiset_histogram0.get(prefixSelectionCustomizer17);
        int i19 = multiset_histogram0.totalCount();
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNotNull(set_histogram14);
        Assert.assertTrue(b15 == false);
        Assert.assertNull(i18);
        Assert.assertTrue(i19 == 1);
    }

    @Test
    public void test071() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        String[] str_array6 = new String[] { "", "" };
        ArrayList<String> arraylist_str7 = new ArrayList<>();
        boolean b8 = Collections.addAll(arraylist_str7, str_array6);
        Stream<String> stream_str9 = arraylist_str7.stream();
        String[] str_array12 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str13 = new ArrayList<>();
        boolean b14 = Collections.addAll(arraylist_str13, str_array12);
        String[] str_array17 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str18 = new ArrayList<>();
        boolean b19 = Collections.addAll(arraylist_str18, str_array17);
        Boolean b20 = Tokenization.contains(arraylist_str13, arraylist_str18);
        boolean b21 = arraylist_str7.containsAll(arraylist_str18);
        HeapWithFixedSize<String> heapwithfixedsize_str23 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str25 = new HeapWithFixedSize<>((int) (byte) 100);
        int i26 = heapwithfixedsize_str25.size();
        boolean b27 = heapwithfixedsize_str23.retainAll(heapwithfixedsize_str25);
        boolean b28 = arraylist_str18.removeAll(heapwithfixedsize_str25);
        boolean b30 = heapwithfixedsize_str25.offer("");
        String[] str_array33 = new String[] { "", "" };
        ArrayList<String> arraylist_str34 = new ArrayList<>();
        boolean b35 = Collections.addAll(arraylist_str34, str_array33);
        Stream<String> stream_str36 = arraylist_str34.stream();
        String[] str_array39 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str40 = new ArrayList<>();
        boolean b41 = Collections.addAll(arraylist_str40, str_array39);
        String[] str_array44 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str45 = new ArrayList<>();
        boolean b46 = Collections.addAll(arraylist_str45, str_array44);
        Boolean b47 = Tokenization.contains(arraylist_str40, arraylist_str45);
        boolean b48 = arraylist_str34.containsAll(arraylist_str45);
        HeapWithFixedSize<String> heapwithfixedsize_str50 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str52 = new HeapWithFixedSize<>((int) (byte) 100);
        int i53 = heapwithfixedsize_str52.size();
        boolean b54 = heapwithfixedsize_str50.retainAll(heapwithfixedsize_str52);
        boolean b55 = arraylist_str45.removeAll(heapwithfixedsize_str52);
        String[] str_array58 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str59 = new ArrayList<>();
        boolean b60 = Collections.addAll(arraylist_str59, str_array58);
        String[] str_array63 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str64 = new ArrayList<>();
        boolean b65 = Collections.addAll(arraylist_str64, str_array63);
        Boolean b66 = Tokenization.contains(arraylist_str59, arraylist_str64);
        boolean b67 = arraylist_str64.isEmpty();
        String[] str_array70 = new String[] { "", "" };
        ArrayList<String> arraylist_str71 = new ArrayList<>();
        boolean b72 = Collections.addAll(arraylist_str71, str_array70);
        Stream<String> stream_str73 = arraylist_str71.stream();
        String[] str_array76 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str77 = new ArrayList<>();
        boolean b78 = Collections.addAll(arraylist_str77, str_array76);
        String[] str_array81 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str82 = new ArrayList<>();
        boolean b83 = Collections.addAll(arraylist_str82, str_array81);
        Boolean b84 = Tokenization.contains(arraylist_str77, arraylist_str82);
        boolean b85 = arraylist_str71.containsAll(arraylist_str82);
        boolean b86 = arraylist_str64.removeAll(arraylist_str82);
        double d87 = TokenShareRatio.setTokenShareRatioFkLD(arraylist_str45, arraylist_str82);
        boolean b88 = heapwithfixedsize_str25.addAll(arraylist_str45);
        boolean b89 = multiset_histogram0.containsKey(heapwithfixedsize_str25);
        boolean b90 = multiset_histogram0.isEmpty();
        Set<Entry<Histogram, Integer>> set_entry_histogram_i91 = multiset_histogram0.entrySet();
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array6);
        Assert.assertTrue(b8 == true);
        Assert.assertNotNull(stream_str9);
        Assert.assertNotNull(str_array12);
        Assert.assertTrue(b14 == true);
        Assert.assertNotNull(str_array17);
        Assert.assertTrue(b19 == true);
        Assert.assertTrue("'" + b20 + "' != '" + true + "'", b20.equals(true));
        Assert.assertTrue(b21 == false);
        Assert.assertTrue(i26 == 0);
        Assert.assertTrue(b27 == false);
        Assert.assertTrue(b28 == false);
        Assert.assertTrue(b30 == true);
        Assert.assertNotNull(str_array33);
        Assert.assertTrue(b35 == true);
        Assert.assertNotNull(stream_str36);
        Assert.assertNotNull(str_array39);
        Assert.assertTrue(b41 == true);
        Assert.assertNotNull(str_array44);
        Assert.assertTrue(b46 == true);
        Assert.assertTrue("'" + b47 + "' != '" + true + "'", b47.equals(true));
        Assert.assertTrue(b48 == false);
        Assert.assertTrue(i53 == 0);
        Assert.assertTrue(b54 == false);
        Assert.assertTrue(b55 == false);
        Assert.assertNotNull(str_array58);
        Assert.assertTrue(b60 == true);
        Assert.assertNotNull(str_array63);
        Assert.assertTrue(b65 == true);
        Assert.assertTrue("'" + b66 + "' != '" + true + "'", b66.equals(true));
        Assert.assertTrue(b67 == false);
        Assert.assertNotNull(str_array70);
        Assert.assertTrue(b72 == true);
        Assert.assertNotNull(stream_str73);
        Assert.assertNotNull(str_array76);
        Assert.assertTrue(b78 == true);
        Assert.assertNotNull(str_array81);
        Assert.assertTrue(b83 == true);
        Assert.assertTrue("'" + b84 + "' != '" + true + "'", b84.equals(true));
        Assert.assertTrue(b85 == false);
        Assert.assertTrue(b86 == true);
        Assert.assertTrue(d87 == 1.0d);
        Assert.assertTrue(b88 == true);
        Assert.assertTrue(b89 == false);
        Assert.assertTrue(b90 == false);
        Assert.assertNotNull(set_entry_histogram_i91);
    }

    @Test
    public void test072() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        MultiSet<Histogram> multiset_histogram14 = new MultiSet<>();
        Histogram histogram15 = new Histogram();
        Integer i17 = multiset_histogram14.put(histogram15, 0);
        Histogram histogram18 = new Histogram();
        multiset_histogram14.add(histogram18);
        Integer i21 = multiset_histogram0.replace(histogram18, 2);
        Integer i23 = multiset_histogram0.remove((byte) 0);
        DataSourceFactory dataSourceFactory24 = new DataSourceFactory();
        Integer i26 = multiset_histogram0.getOrDefault(dataSourceFactory24, 0);
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNull(i17);
        Assert.assertNull(i21);
        Assert.assertNull(i23);
        Assert.assertTrue("'" + i26 + "' != '" + 0 + "'", i26.equals(0));
    }

    @Test
    public void test073() throws Throwable {
        String[] str_array2 = new String[] { "", "hi!" };
        ArrayList<String> arraylist_str3 = new ArrayList<>();
        boolean b4 = Collections.addAll(arraylist_str3, str_array2);
        String str5 = arraylist_str3.toString();
        Stream<String> stream_str6 = arraylist_str3.parallelStream();
        Assert.assertNotNull(str_array2);
        Assert.assertTrue(b4 == true);
        Assert.assertTrue("'" + str5 + "' != '" + "[, hi!]" + "'", str5.equals("[, hi!]"));
        Assert.assertNotNull(stream_str6);
    }

    @Test
    public void test074() throws Throwable {
        List<String> list_str1 = Tokenization.lowercaseSplit("[, hi!]");
        Assert.assertNotNull(list_str1);
    }

    @Test
    public void test075() throws Throwable {
        List<String> list_str1 = Tokenization.split("hi!");
        Assert.assertNotNull(list_str1);
    }

    @Test
    public void test076() throws Throwable {
        TextArea textArea0 = null;
        TextAreaAppender textAreaAppender1 = new TextAreaAppender(textArea0);
        Filter filter2 = textAreaAppender1.getFilter();
        Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        Formatter formatter5 = textAreaAppender1.getFormatter();
        Filter filter6 = null;
        textAreaAppender1.setFilter(filter6);
        Filter filter8 = textAreaAppender1.getFilter();
        ErrorManager errorManager9 = textAreaAppender1.getErrorManager();
        Assert.assertNull(filter2);
        Assert.assertNotNull(level3);
        Assert.assertNotNull(formatter5);
        Assert.assertNull(filter8);
        Assert.assertNotNull(errorManager9);
    }

    @Test
    public void test077() throws Throwable {
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double[] d_array14 = new double[] { (byte) 1, (short) 1 };
        double[] d_array17 = Histogram.rel2abs(d_array14, (double) 100.0f, (double) ' ');
        double d19 = Logistic.classify(d_array11, d_array17, (double) 100.0f);
        Double d20 = Histogram.jaccard(d_array5, d_array11);
        double[] d_array23 = Histogram.rel2abs(d_array11, (double) 4, (double) 4);
        double[] d_array24 = new double[] {};
        Double d25 = Histogram.jaccard(d_array23, d_array24);
        Assert.assertNotNull(d_array2);
        Assert.assertNotNull(d_array5);
        Assert.assertNotNull(d_array8);
        Assert.assertNotNull(d_array11);
        Assert.assertNotNull(d_array14);
        Assert.assertNotNull(d_array17);
        Assert.assertTrue(d19 == 1.0d);
        Assert.assertEquals(d20, Double.NaN, 0);
        Assert.assertNotNull(d_array23);
        Assert.assertNotNull(d_array24);
        Assert.assertEquals(d25, Double.NaN, 0);
    }

    @Test
    public void test078() throws Throwable {
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        Assert.assertNotNull(d_array2);
        Assert.assertNotNull(d_array5);
    }

    @Test
    public void test079() throws Throwable {
        String[] str_array2 = new String[] { "", "" };
        ArrayList<String> arraylist_str3 = new ArrayList<>();
        boolean b4 = Collections.addAll(arraylist_str3, str_array2);
        Stream<String> stream_str5 = arraylist_str3.stream();
        String[] str_array8 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str9 = new ArrayList<>();
        boolean b10 = Collections.addAll(arraylist_str9, str_array8);
        String[] str_array13 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str14 = new ArrayList<>();
        boolean b15 = Collections.addAll(arraylist_str14, str_array13);
        Boolean b16 = Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        HeapWithFixedSize<String> heapwithfixedsize_str19 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str21 = new HeapWithFixedSize<>((int) (byte) 100);
        int i22 = heapwithfixedsize_str21.size();
        boolean b23 = heapwithfixedsize_str19.retainAll(heapwithfixedsize_str21);
        boolean b24 = arraylist_str14.removeAll(heapwithfixedsize_str21);
        String[] str_array27 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str28 = new ArrayList<>();
        boolean b29 = Collections.addAll(arraylist_str28, str_array27);
        String[] str_array32 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str33 = new ArrayList<>();
        boolean b34 = Collections.addAll(arraylist_str33, str_array32);
        Boolean b35 = Tokenization.contains(arraylist_str28, arraylist_str33);
        boolean b36 = arraylist_str33.isEmpty();
        String[] str_array39 = new String[] { "", "" };
        ArrayList<String> arraylist_str40 = new ArrayList<>();
        boolean b41 = Collections.addAll(arraylist_str40, str_array39);
        Stream<String> stream_str42 = arraylist_str40.stream();
        String[] str_array45 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str46 = new ArrayList<>();
        boolean b47 = Collections.addAll(arraylist_str46, str_array45);
        String[] str_array50 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str51 = new ArrayList<>();
        boolean b52 = Collections.addAll(arraylist_str51, str_array50);
        Boolean b53 = Tokenization.contains(arraylist_str46, arraylist_str51);
        boolean b54 = arraylist_str40.containsAll(arraylist_str51);
        boolean b55 = arraylist_str33.removeAll(arraylist_str51);
        double d56 = TokenShareRatio.setTokenShareRatioFkLD(arraylist_str14, arraylist_str51);
        Stream<String> stream_str57 = arraylist_str51.stream();
        Assert.assertNotNull(str_array2);
        Assert.assertTrue(b4 == true);
        Assert.assertNotNull(stream_str5);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertNotNull(str_array13);
        Assert.assertTrue(b15 == true);
        Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        Assert.assertTrue(b17 == false);
        Assert.assertTrue(i22 == 0);
        Assert.assertTrue(b23 == false);
        Assert.assertTrue(b24 == false);
        Assert.assertNotNull(str_array27);
        Assert.assertTrue(b29 == true);
        Assert.assertNotNull(str_array32);
        Assert.assertTrue(b34 == true);
        Assert.assertTrue("'" + b35 + "' != '" + true + "'", b35.equals(true));
        Assert.assertTrue(b36 == false);
        Assert.assertNotNull(str_array39);
        Assert.assertTrue(b41 == true);
        Assert.assertNotNull(stream_str42);
        Assert.assertNotNull(str_array45);
        Assert.assertTrue(b47 == true);
        Assert.assertNotNull(str_array50);
        Assert.assertTrue(b52 == true);
        Assert.assertTrue("'" + b53 + "' != '" + true + "'", b53.equals(true));
        Assert.assertTrue(b54 == false);
        Assert.assertTrue(b55 == true);
        Assert.assertTrue(d56 == 1.0d);
        Assert.assertNotNull(stream_str57);
    }

    @Test
    public void test080() throws Throwable {
        int i2 = Levenshtein.getDistance("{}", "");
        Assert.assertTrue(i2 == 2);
    }

    @Test
    public void test081() throws Throwable {
        MultiMap multiMap0 = new MultiMap();
        multiMap0.put("", "hi!");
        int i4 = multiMap0.size();
        List<String> list_str6 = multiMap0.get("{}");
        boolean b7 = multiMap0.isEmpty();
        Assert.assertTrue(i4 == 1);
        Assert.assertNotNull(list_str6);
        Assert.assertTrue(b7 == false);
    }

    @Test
    public void test082() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        Set<Histogram> set_histogram14 = multiset_histogram0.keySet();
        boolean b15 = multiset_histogram0.isEmpty();
        String str16 = multiset_histogram0.toString();
        MultiSet<Histogram> multiset_histogram17 = new MultiSet<>();
        Histogram histogram18 = new Histogram();
        Integer i20 = multiset_histogram17.put(histogram18, 0);
        Histogram histogram21 = new Histogram();
        multiset_histogram17.add(histogram21);
        String[] str_array25 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str26 = new PriorityQueue<>();
        boolean b27 = Collections.addAll(priorityqueue_str26, str_array25);
        boolean b29 = priorityqueue_str26.offer("");
        Integer i30 = multiset_histogram17.remove("");
        Set<Histogram> set_histogram31 = multiset_histogram17.keySet();
        MultiSet<Histogram> multiset_histogram32 = new MultiSet<>();
        Histogram histogram33 = new Histogram();
        Integer i35 = multiset_histogram32.put(histogram33, 0);
        Histogram histogram36 = new Histogram();
        multiset_histogram32.add(histogram36);
        int i38 = multiset_histogram17.count(histogram36);
        int i39 = multiset_histogram17.totalCount();
        Set<Entry<Histogram, Integer>> set_entry_histogram_i40 = multiset_histogram17.entrySet();
        MultiSet<Histogram> multiset_histogram41 = new MultiSet<>();
        Histogram histogram42 = new Histogram();
        Integer i44 = multiset_histogram41.put(histogram42, 0);
        Histogram histogram45 = new Histogram();
        multiset_histogram41.add(histogram45);
        String[] str_array49 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str50 = new PriorityQueue<>();
        boolean b51 = Collections.addAll(priorityqueue_str50, str_array49);
        boolean b53 = priorityqueue_str50.offer("");
        Integer i54 = multiset_histogram41.remove("");
        MultiSet<Histogram> multiset_histogram55 = new MultiSet<>();
        Histogram histogram56 = new Histogram();
        Integer i58 = multiset_histogram55.put(histogram56, 0);
        Histogram histogram59 = new Histogram();
        multiset_histogram55.add(histogram59);
        Integer i62 = multiset_histogram41.replace(histogram59, 2);
        DataSourceFactory dataSourceFactory63 = new DataSourceFactory();
        boolean b64 = multiset_histogram41.containsKey(dataSourceFactory63);
        MultiSet<Histogram> multiset_histogram65 = new MultiSet<>();
        Histogram histogram66 = new Histogram();
        Integer i68 = multiset_histogram65.put(histogram66, 0);
        Histogram histogram69 = new Histogram();
        multiset_histogram65.add(histogram69);
        String[] str_array73 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str74 = new PriorityQueue<>();
        boolean b75 = Collections.addAll(priorityqueue_str74, str_array73);
        boolean b77 = priorityqueue_str74.offer("");
        Integer i78 = multiset_histogram65.remove("");
        MultiSet<Histogram> multiset_histogram79 = new MultiSet<>();
        Histogram histogram80 = new Histogram();
        Integer i82 = multiset_histogram79.put(histogram80, 0);
        Histogram histogram83 = new Histogram();
        multiset_histogram79.add(histogram83);
        Integer i86 = multiset_histogram65.replace(histogram83, 2);
        DataSourceFactory dataSourceFactory87 = new DataSourceFactory();
        boolean b88 = multiset_histogram65.containsKey(dataSourceFactory87);
        Histogram histogram89 = new Histogram();
        multiset_histogram65.add(histogram89);
        multiset_histogram41.add(histogram89);
        multiset_histogram17.add(histogram89);
        Integer i94 = multiset_histogram0.replace(histogram89, 0);
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNotNull(set_histogram14);
        Assert.assertTrue(b15 == false);
        Assert.assertNull(i20);
        Assert.assertNotNull(str_array25);
        Assert.assertTrue(b27 == true);
        Assert.assertTrue(b29 == true);
        Assert.assertNull(i30);
        Assert.assertNotNull(set_histogram31);
        Assert.assertNull(i35);
        Assert.assertTrue(i38 == 0);
        Assert.assertTrue(i39 == 1);
        Assert.assertNotNull(set_entry_histogram_i40);
        Assert.assertNull(i44);
        Assert.assertNotNull(str_array49);
        Assert.assertTrue(b51 == true);
        Assert.assertTrue(b53 == true);
        Assert.assertNull(i54);
        Assert.assertNull(i58);
        Assert.assertNull(i62);
        Assert.assertTrue(b64 == false);
        Assert.assertNull(i68);
        Assert.assertNotNull(str_array73);
        Assert.assertTrue(b75 == true);
        Assert.assertTrue(b77 == true);
        Assert.assertNull(i78);
        Assert.assertNull(i82);
        Assert.assertNull(i86);
        Assert.assertTrue(b88 == false);
        Assert.assertNull(i94);
    }

    @Test
    public void test083() throws Throwable {
        String[] str_array2 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str3 = new ArrayList<>();
        boolean b4 = Collections.addAll(arraylist_str3, str_array2);
        String[] str_array7 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str8 = new ArrayList<>();
        boolean b9 = Collections.addAll(arraylist_str8, str_array7);
        Boolean b10 = Tokenization.contains(arraylist_str3, arraylist_str8);
        boolean b11 = arraylist_str8.isEmpty();
        String[] str_array14 = new String[] { "", "" };
        ArrayList<String> arraylist_str15 = new ArrayList<>();
        boolean b16 = Collections.addAll(arraylist_str15, str_array14);
        Stream<String> stream_str17 = arraylist_str15.stream();
        String[] str_array20 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str21 = new ArrayList<>();
        boolean b22 = Collections.addAll(arraylist_str21, str_array20);
        String[] str_array25 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str26 = new ArrayList<>();
        boolean b27 = Collections.addAll(arraylist_str26, str_array25);
        Boolean b28 = Tokenization.contains(arraylist_str21, arraylist_str26);
        boolean b29 = arraylist_str15.containsAll(arraylist_str26);
        boolean b30 = arraylist_str8.removeAll(arraylist_str26);
        String str31 = arraylist_str26.toString();
        Assert.assertNotNull(str_array2);
        Assert.assertTrue(b4 == true);
        Assert.assertNotNull(str_array7);
        Assert.assertTrue(b9 == true);
        Assert.assertTrue("'" + b10 + "' != '" + true + "'", b10.equals(true));
        Assert.assertTrue(b11 == false);
        Assert.assertNotNull(str_array14);
        Assert.assertTrue(b16 == true);
        Assert.assertNotNull(stream_str17);
        Assert.assertNotNull(str_array20);
        Assert.assertTrue(b22 == true);
        Assert.assertNotNull(str_array25);
        Assert.assertTrue(b27 == true);
        Assert.assertTrue("'" + b28 + "' != '" + true + "'", b28.equals(true));
        Assert.assertTrue(b29 == false);
        Assert.assertTrue(b30 == true);
        Assert.assertTrue("'" + str31 + "' != '" + "[hi!, hi!]" + "'", str31.equals("[hi!, hi!]"));
    }

    @Test
    public void test084() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (byte) 100);
        String[] str_array4 = new String[] { "", "" };
        ArrayList<String> arraylist_str5 = new ArrayList<>();
        boolean b6 = Collections.addAll(arraylist_str5, str_array4);
        Stream<String> stream_str7 = arraylist_str5.stream();
        Stream<String> stream_str8 = arraylist_str5.parallelStream();
        String[] str_array11 = new String[] { "", "" };
        ArrayList<String> arraylist_str12 = new ArrayList<>();
        boolean b13 = Collections.addAll(arraylist_str12, str_array11);
        Stream<String> stream_str14 = arraylist_str12.stream();
        String[] str_array17 = new String[] { "", "" };
        ArrayList<String> arraylist_str18 = new ArrayList<>();
        boolean b19 = Collections.addAll(arraylist_str18, str_array17);
        Stream<String> stream_str20 = arraylist_str18.stream();
        Stream<String> stream_str21 = arraylist_str18.parallelStream();
        String[] str_array24 = new String[] { "", "" };
        ArrayList<String> arraylist_str25 = new ArrayList<>();
        boolean b26 = Collections.addAll(arraylist_str25, str_array24);
        Stream<String> stream_str27 = arraylist_str25.stream();
        Stream<String> stream_str28 = arraylist_str25.parallelStream();
        String[] str_array31 = new String[] { "", "" };
        ArrayList<String> arraylist_str32 = new ArrayList<>();
        boolean b33 = Collections.addAll(arraylist_str32, str_array31);
        Stream<String> stream_str34 = arraylist_str32.stream();
        String[] str_array37 = new String[] { "", "" };
        ArrayList<String> arraylist_str38 = new ArrayList<>();
        boolean b39 = Collections.addAll(arraylist_str38, str_array37);
        Stream<String> stream_str40 = arraylist_str38.stream();
        Stream<String> stream_str41 = arraylist_str38.parallelStream();
        Stream[] stream_array43 = new Stream[6];
        @SuppressWarnings("unchecked") Stream<String>[] stream_str_array44 = (Stream<String>[]) stream_array43;
        stream_str_array44[0] = stream_str8;
        stream_str_array44[1] = stream_str14;
        stream_str_array44[2] = stream_str21;
        stream_str_array44[3] = stream_str28;
        stream_str_array44[4] = stream_str34;
        stream_str_array44[5] = stream_str41;
        Stream<String>[] stream_str_array57 = heapwithfixedsize_str1.toArray(stream_str_array44);
        boolean b59 = heapwithfixedsize_str1.add("");
        boolean b61 = heapwithfixedsize_str1.contains(0L);
        Comparator<? super String> comparator_wildcard62 = heapwithfixedsize_str1.comparator();
        boolean b64 = heapwithfixedsize_str1.contains((short) 1);
        Assert.assertNotNull(str_array4);
        Assert.assertTrue(b6 == true);
        Assert.assertNotNull(stream_str7);
        Assert.assertNotNull(stream_str8);
        Assert.assertNotNull(str_array11);
        Assert.assertTrue(b13 == true);
        Assert.assertNotNull(stream_str14);
        Assert.assertNotNull(str_array17);
        Assert.assertTrue(b19 == true);
        Assert.assertNotNull(stream_str20);
        Assert.assertNotNull(stream_str21);
        Assert.assertNotNull(str_array24);
        Assert.assertTrue(b26 == true);
        Assert.assertNotNull(stream_str27);
        Assert.assertNotNull(stream_str28);
        Assert.assertNotNull(str_array31);
        Assert.assertTrue(b33 == true);
        Assert.assertNotNull(stream_str34);
        Assert.assertNotNull(str_array37);
        Assert.assertTrue(b39 == true);
        Assert.assertNotNull(stream_str40);
        Assert.assertNotNull(stream_str41);
        Assert.assertNotNull(stream_array43);
        Assert.assertNotNull(stream_str_array44);
        Assert.assertNotNull(stream_str_array57);
        Assert.assertTrue(b59 == true);
        Assert.assertTrue(b61 == false);
        Assert.assertNotNull(comparator_wildcard62);
        Assert.assertTrue(b64 == false);
    }

    @Test
    public void test085() throws Throwable {
        TextArea textArea0 = null;
        TextAreaAppender textAreaAppender1 = new TextAreaAppender(textArea0);
        Filter filter2 = textAreaAppender1.getFilter();
        Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        Filter filter5 = null;
        textAreaAppender1.setFilter(filter5);
        TextArea textArea7 = null;
        TextAreaAppender textAreaAppender8 = new TextAreaAppender(textArea7);
        Filter filter9 = textAreaAppender8.getFilter();
        Level level10 = textAreaAppender8.getLevel();
        textAreaAppender8.flush();
        Formatter formatter12 = textAreaAppender8.getFormatter();
        textAreaAppender1.setFormatter(formatter12);
        try {
            textAreaAppender1.setEncoding("hi!");
            Assert.fail("Expected exception of type java.io.UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
        }
        Assert.assertNull(filter2);
        Assert.assertNotNull(level3);
        Assert.assertNull(filter9);
        Assert.assertNotNull(level10);
        Assert.assertNotNull(formatter12);
    }

    @Test
    public void test087() throws Throwable {
        TextArea textArea0 = null;
        TextAreaAppender textAreaAppender1 = new TextAreaAppender(textArea0);
        Filter filter2 = textAreaAppender1.getFilter();
        Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        Filter filter5 = null;
        textAreaAppender1.setFilter(filter5);
        textAreaAppender1.close();
        textAreaAppender1.close();
        ErrorManager errorManager9 = textAreaAppender1.getErrorManager();
        try {
            textAreaAppender1.setEncoding("[hi!, hi!]");
            Assert.fail("Expected exception of type java.io.UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
        }
        Assert.assertNull(filter2);
        Assert.assertNotNull(level3);
        Assert.assertNotNull(errorManager9);
    }

    @Test
    public void test088() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (byte) 100);
        String[] str_array4 = new String[] { "", "" };
        ArrayList<String> arraylist_str5 = new ArrayList<>();
        boolean b6 = Collections.addAll(arraylist_str5, str_array4);
        Stream<String> stream_str7 = arraylist_str5.stream();
        Stream<String> stream_str8 = arraylist_str5.parallelStream();
        String[] str_array11 = new String[] { "", "" };
        ArrayList<String> arraylist_str12 = new ArrayList<>();
        boolean b13 = Collections.addAll(arraylist_str12, str_array11);
        Stream<String> stream_str14 = arraylist_str12.stream();
        String[] str_array17 = new String[] { "", "" };
        ArrayList<String> arraylist_str18 = new ArrayList<>();
        boolean b19 = Collections.addAll(arraylist_str18, str_array17);
        Stream<String> stream_str20 = arraylist_str18.stream();
        Stream<String> stream_str21 = arraylist_str18.parallelStream();
        String[] str_array24 = new String[] { "", "" };
        ArrayList<String> arraylist_str25 = new ArrayList<>();
        boolean b26 = Collections.addAll(arraylist_str25, str_array24);
        Stream<String> stream_str27 = arraylist_str25.stream();
        Stream<String> stream_str28 = arraylist_str25.parallelStream();
        String[] str_array31 = new String[] { "", "" };
        ArrayList<String> arraylist_str32 = new ArrayList<>();
        boolean b33 = Collections.addAll(arraylist_str32, str_array31);
        Stream<String> stream_str34 = arraylist_str32.stream();
        String[] str_array37 = new String[] { "", "" };
        ArrayList<String> arraylist_str38 = new ArrayList<>();
        boolean b39 = Collections.addAll(arraylist_str38, str_array37);
        Stream<String> stream_str40 = arraylist_str38.stream();
        Stream<String> stream_str41 = arraylist_str38.parallelStream();
        Stream[] stream_array43 = new Stream[6];
        @SuppressWarnings("unchecked") Stream<String>[] stream_str_array44 = (Stream<String>[]) stream_array43;
        stream_str_array44[0] = stream_str8;
        stream_str_array44[1] = stream_str14;
        stream_str_array44[2] = stream_str21;
        stream_str_array44[3] = stream_str28;
        stream_str_array44[4] = stream_str34;
        stream_str_array44[5] = stream_str41;
        Stream<String>[] stream_str_array57 = heapwithfixedsize_str1.toArray(stream_str_array44);
        HeapWithFixedSize<String> heapwithfixedsize_str59 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str61 = new HeapWithFixedSize<>((int) (byte) 100);
        int i62 = heapwithfixedsize_str61.size();
        boolean b63 = heapwithfixedsize_str59.retainAll(heapwithfixedsize_str61);
        boolean b64 = heapwithfixedsize_str1.containsAll(heapwithfixedsize_str59);
        Spliterator<String> spliterator_str65 = heapwithfixedsize_str1.spliterator();
        Assert.assertNotNull(str_array4);
        Assert.assertTrue(b6 == true);
        Assert.assertNotNull(stream_str7);
        Assert.assertNotNull(stream_str8);
        Assert.assertNotNull(str_array11);
        Assert.assertTrue(b13 == true);
        Assert.assertNotNull(stream_str14);
        Assert.assertNotNull(str_array17);
        Assert.assertTrue(b19 == true);
        Assert.assertNotNull(stream_str20);
        Assert.assertNotNull(stream_str21);
        Assert.assertNotNull(str_array24);
        Assert.assertTrue(b26 == true);
        Assert.assertNotNull(stream_str27);
        Assert.assertNotNull(stream_str28);
        Assert.assertNotNull(str_array31);
        Assert.assertTrue(b33 == true);
        Assert.assertNotNull(stream_str34);
        Assert.assertNotNull(str_array37);
        Assert.assertTrue(b39 == true);
        Assert.assertNotNull(stream_str40);
        Assert.assertNotNull(stream_str41);
        Assert.assertNotNull(stream_array43);
        Assert.assertNotNull(stream_str_array44);
        Assert.assertNotNull(stream_str_array57);
        Assert.assertTrue(i62 == 0);
        Assert.assertTrue(b63 == false);
        Assert.assertTrue(b64 == true);
        Assert.assertNotNull(spliterator_str65);
    }

    @Test
    public void test089() throws Throwable {
        TextArea textArea0 = null;
        TextAreaAppender textAreaAppender1 = new TextAreaAppender(textArea0);
        Filter filter2 = textAreaAppender1.getFilter();
        Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        Formatter formatter5 = textAreaAppender1.getFormatter();
        TextArea textArea6 = null;
        TextAreaAppender textAreaAppender7 = new TextAreaAppender(textArea6);
        Filter filter8 = textAreaAppender7.getFilter();
        Level level9 = textAreaAppender7.getLevel();
        textAreaAppender7.flush();
        Filter filter11 = null;
        textAreaAppender7.setFilter(filter11);
        textAreaAppender7.close();
        textAreaAppender7.close();
        ErrorManager errorManager15 = textAreaAppender7.getErrorManager();
        textAreaAppender1.setErrorManager(errorManager15);
        Assert.assertNull(filter2);
        Assert.assertNotNull(level3);
        Assert.assertNotNull(formatter5);
        Assert.assertNull(filter8);
        Assert.assertNotNull(level9);
        Assert.assertNotNull(errorManager15);
    }

    @Test
    public void test090() throws Throwable {
        TextArea textArea0 = null;
        TextAreaAppender textAreaAppender1 = new TextAreaAppender(textArea0);
        Filter filter2 = textAreaAppender1.getFilter();
        Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        Filter filter5 = null;
        textAreaAppender1.setFilter(filter5);
        textAreaAppender1.flush();
        LogRecord logRecord8 = null;
        try {
            textAreaAppender1.publish(logRecord8);
            Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (IllegalStateException e) {
        }
        Assert.assertNull(filter2);
        Assert.assertNotNull(level3);
    }

    @Test
    public void test091() throws Throwable {
        double[] d_array3 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array6 = new double[] { (byte) 1, (short) 1 };
        double[] d_array9 = Histogram.rel2abs(d_array6, (double) 100.0f, (double) ' ');
        double[] d_array12 = new double[] { (byte) 1, (short) 1 };
        double[] d_array15 = Histogram.rel2abs(d_array12, (double) 100.0f, (double) ' ');
        double d17 = Logistic.classify(d_array9, d_array15, (double) 100.0f);
        Double d18 = Histogram.jaccard(d_array3, d_array15);
        double[] d_array21 = new double[] { (byte) 1, (short) 1 };
        double[] d_array24 = Histogram.rel2abs(d_array21, (double) 100.0f, (double) ' ');
        double[] d_array25 = Multiplication.elementWise(d_array3, d_array24);
        double[] d_array29 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array32 = new double[] { (byte) 1, (short) 1 };
        double[] d_array35 = Histogram.rel2abs(d_array32, (double) 100.0f, (double) ' ');
        double[] d_array38 = new double[] { (byte) 1, (short) 1 };
        double[] d_array41 = Histogram.rel2abs(d_array38, (double) 100.0f, (double) ' ');
        double d43 = Logistic.classify(d_array35, d_array41, (double) 100.0f);
        Double d44 = Histogram.jaccard(d_array29, d_array41);
        double d46 = Logistic.classify(d_array24, d_array29, 0.0d);
        Assert.assertNotNull(d_array3);
        Assert.assertNotNull(d_array6);
        Assert.assertNotNull(d_array9);
        Assert.assertNotNull(d_array12);
        Assert.assertNotNull(d_array15);
        Assert.assertTrue(d17 == 1.0d);
        Assert.assertTrue("'" + d18 + "' != '" + 0.0d + "'", d18.equals(0.0d));
        Assert.assertNotNull(d_array21);
        Assert.assertNotNull(d_array24);
        Assert.assertNotNull(d_array25);
        Assert.assertNotNull(d_array29);
        Assert.assertNotNull(d_array32);
        Assert.assertNotNull(d_array35);
        Assert.assertNotNull(d_array38);
        Assert.assertNotNull(d_array41);
        Assert.assertTrue(d43 == 1.0d);
        Assert.assertTrue("'" + d44 + "' != '" + 0.0d + "'", d44.equals(0.0d));
        Assert.assertTrue(d46 == 1.0d);
    }

    @Test
    public void test092() throws Throwable {
        Properties properties0 = null;
        try {
            DataSource dataSource2 = DataSourceFactory.getConfiguredDataSource(properties0, "{}");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test093() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        int i4 = multiset_histogram0.size();
        Histogram histogram5 = new Histogram();
        Integer i7 = multiset_histogram0.replace(histogram5, 100);
        MultiSet<Histogram> multiset_histogram8 = new MultiSet<>();
        Set<Histogram> set_histogram9 = multiset_histogram8.keySet();
        String str10 = multiset_histogram8.toString();
        MultiSet<Histogram> multiset_histogram11 = new MultiSet<>();
        Histogram histogram12 = new Histogram();
        Integer i14 = multiset_histogram11.put(histogram12, 0);
        Histogram histogram15 = new Histogram();
        multiset_histogram11.add(histogram15);
        String[] str_array19 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str20 = new PriorityQueue<>();
        boolean b21 = Collections.addAll(priorityqueue_str20, str_array19);
        boolean b23 = priorityqueue_str20.offer("");
        Integer i24 = multiset_histogram11.remove("");
        Set<Histogram> set_histogram25 = multiset_histogram11.keySet();
        MultiSet<Histogram> multiset_histogram26 = new MultiSet<>();
        Histogram histogram27 = new Histogram();
        Integer i29 = multiset_histogram26.put(histogram27, 0);
        Histogram histogram30 = new Histogram();
        multiset_histogram26.add(histogram30);
        String[] str_array34 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str35 = new PriorityQueue<>();
        boolean b36 = Collections.addAll(priorityqueue_str35, str_array34);
        boolean b38 = priorityqueue_str35.offer("");
        Integer i39 = multiset_histogram26.remove("");
        Set<Histogram> set_histogram40 = multiset_histogram26.keySet();
        MultiSet<Histogram> multiset_histogram41 = new MultiSet<>();
        Histogram histogram42 = new Histogram();
        Integer i44 = multiset_histogram41.put(histogram42, 0);
        Histogram histogram45 = new Histogram();
        multiset_histogram41.add(histogram45);
        int i47 = multiset_histogram26.count(histogram45);
        int i48 = multiset_histogram11.count(histogram45);
        DataSourceFactory dataSourceFactory49 = new DataSourceFactory();
        boolean b50 = multiset_histogram8.remove(histogram45, dataSourceFactory49);
        Integer i52 = multiset_histogram0.replace(histogram45, 7);
        Assert.assertNull(i3);
        Assert.assertTrue(i4 == 1);
        Assert.assertNull(i7);
        Assert.assertNotNull(set_histogram9);
        Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        Assert.assertNull(i14);
        Assert.assertNotNull(str_array19);
        Assert.assertTrue(b21 == true);
        Assert.assertTrue(b23 == true);
        Assert.assertNull(i24);
        Assert.assertNotNull(set_histogram25);
        Assert.assertNull(i29);
        Assert.assertNotNull(str_array34);
        Assert.assertTrue(b36 == true);
        Assert.assertTrue(b38 == true);
        Assert.assertNull(i39);
        Assert.assertNotNull(set_histogram40);
        Assert.assertNull(i44);
        Assert.assertTrue(i47 == 0);
        Assert.assertTrue(i48 == 0);
        Assert.assertTrue(b50 == false);
        Assert.assertNull(i52);
    }

    @Test
    public void test094() throws Throwable {
        List<String> list_str1 = Tokenization.lowercaseSplit("");
        Assert.assertNotNull(list_str1);
    }

    @Test
    public void test095() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (byte) 100);
        boolean b3 = heapwithfixedsize_str1.offer("hi!");
        double[] d_array6 = new double[] { (byte) 1, (short) 1 };
        double[] d_array9 = Histogram.rel2abs(d_array6, (double) 100.0f, (double) ' ');
        boolean b10 = heapwithfixedsize_str1.contains(100.0f);
        Assert.assertTrue(b3 == true);
        Assert.assertNotNull(d_array6);
        Assert.assertNotNull(d_array9);
        Assert.assertTrue(b10 == false);
    }

    @Test
    public void test096() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Set<Histogram> set_histogram1 = multiset_histogram0.keySet();
        String str2 = multiset_histogram0.toString();
        MultiSet<Histogram> multiset_histogram3 = new MultiSet<>();
        Histogram histogram4 = new Histogram();
        Integer i6 = multiset_histogram3.put(histogram4, 0);
        Histogram histogram7 = new Histogram();
        multiset_histogram3.add(histogram7);
        String[] str_array11 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str12 = new PriorityQueue<>();
        boolean b13 = Collections.addAll(priorityqueue_str12, str_array11);
        boolean b15 = priorityqueue_str12.offer("");
        Integer i16 = multiset_histogram3.remove("");
        Set<Histogram> set_histogram17 = multiset_histogram3.keySet();
        MultiSet<Histogram> multiset_histogram18 = new MultiSet<>();
        Histogram histogram19 = new Histogram();
        Integer i21 = multiset_histogram18.put(histogram19, 0);
        Histogram histogram22 = new Histogram();
        multiset_histogram18.add(histogram22);
        String[] str_array26 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str27 = new PriorityQueue<>();
        boolean b28 = Collections.addAll(priorityqueue_str27, str_array26);
        boolean b30 = priorityqueue_str27.offer("");
        Integer i31 = multiset_histogram18.remove("");
        Set<Histogram> set_histogram32 = multiset_histogram18.keySet();
        MultiSet<Histogram> multiset_histogram33 = new MultiSet<>();
        Histogram histogram34 = new Histogram();
        Integer i36 = multiset_histogram33.put(histogram34, 0);
        Histogram histogram37 = new Histogram();
        multiset_histogram33.add(histogram37);
        int i39 = multiset_histogram18.count(histogram37);
        int i40 = multiset_histogram3.count(histogram37);
        DataSourceFactory dataSourceFactory41 = new DataSourceFactory();
        boolean b42 = multiset_histogram0.remove(histogram37, dataSourceFactory41);
        Integer i44 = multiset_histogram0.remove(-1L);
        int i45 = multiset_histogram0.totalCount();
        Assert.assertNotNull(set_histogram1);
        Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        Assert.assertNull(i6);
        Assert.assertNotNull(str_array11);
        Assert.assertTrue(b13 == true);
        Assert.assertTrue(b15 == true);
        Assert.assertNull(i16);
        Assert.assertNotNull(set_histogram17);
        Assert.assertNull(i21);
        Assert.assertNotNull(str_array26);
        Assert.assertTrue(b28 == true);
        Assert.assertTrue(b30 == true);
        Assert.assertNull(i31);
        Assert.assertNotNull(set_histogram32);
        Assert.assertNull(i36);
        Assert.assertTrue(i39 == 0);
        Assert.assertTrue(i40 == 0);
        Assert.assertTrue(b42 == false);
        Assert.assertNull(i44);
        Assert.assertTrue(i45 == 0);
    }

    @Test
    public void test097() throws Throwable {
        Table[] table_array0 = new Table[] {};
        ArrayList<Table> arraylist_table1 = new ArrayList<>();
        boolean b2 = Collections.addAll(arraylist_table1, table_array0);
        Chen chen3 = new Chen(arraylist_table1);
        Table[] table_array4 = new Table[] {};
        ArrayList<Table> arraylist_table5 = new ArrayList<>();
        boolean b6 = Collections.addAll(arraylist_table5, table_array4);
        Chen chen7 = new Chen(arraylist_table5);
        String[] str_array10 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str11 = new ArrayList<>();
        boolean b12 = Collections.addAll(arraylist_str11, str_array10);
        String[] str_array15 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str16 = new ArrayList<>();
        boolean b17 = Collections.addAll(arraylist_str16, str_array15);
        Boolean b18 = Tokenization.contains(arraylist_str11, arraylist_str16);
        boolean b19 = arraylist_str16.isEmpty();
        String[] str_array22 = new String[] { "", "" };
        ArrayList<String> arraylist_str23 = new ArrayList<>();
        boolean b24 = Collections.addAll(arraylist_str23, str_array22);
        Stream<String> stream_str25 = arraylist_str23.stream();
        String[] str_array28 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str29 = new ArrayList<>();
        boolean b30 = Collections.addAll(arraylist_str29, str_array28);
        String[] str_array33 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str34 = new ArrayList<>();
        boolean b35 = Collections.addAll(arraylist_str34, str_array33);
        Boolean b36 = Tokenization.contains(arraylist_str29, arraylist_str34);
        boolean b37 = arraylist_str23.containsAll(arraylist_str34);
        boolean b38 = arraylist_str16.removeAll(arraylist_str34);
        String[] str_array41 = new String[] { "", "" };
        ArrayList<String> arraylist_str42 = new ArrayList<>();
        boolean b43 = Collections.addAll(arraylist_str42, str_array41);
        Stream<String> stream_str44 = arraylist_str42.stream();
        double d45 = chen7.getTableChenSimilarity(arraylist_str34, arraylist_str42);
        Stream<String> stream_str46 = arraylist_str42.stream();
        String[] str_array50 = new String[] { "hi!", "[, hi!]", "" };
        ArrayList<String> arraylist_str51 = new ArrayList<>();
        boolean b52 = Collections.addAll(arraylist_str51, str_array50);
        double d53 = chen3.getTableChenSimilarity(arraylist_str42, arraylist_str51);
        boolean b54 = arraylist_str42.isEmpty();
        Assert.assertNotNull(table_array0);
        Assert.assertTrue(b2 == false);
        Assert.assertNotNull(table_array4);
        Assert.assertTrue(b6 == false);
        Assert.assertNotNull(str_array10);
        Assert.assertTrue(b12 == true);
        Assert.assertNotNull(str_array15);
        Assert.assertTrue(b17 == true);
        Assert.assertTrue("'" + b18 + "' != '" + true + "'", b18.equals(true));
        Assert.assertTrue(b19 == false);
        Assert.assertNotNull(str_array22);
        Assert.assertTrue(b24 == true);
        Assert.assertNotNull(stream_str25);
        Assert.assertNotNull(str_array28);
        Assert.assertTrue(b30 == true);
        Assert.assertNotNull(str_array33);
        Assert.assertTrue(b35 == true);
        Assert.assertTrue("'" + b36 + "' != '" + true + "'", b36.equals(true));
        Assert.assertTrue(b37 == false);
        Assert.assertTrue(b38 == true);
        Assert.assertNotNull(str_array41);
        Assert.assertTrue(b43 == true);
        Assert.assertNotNull(stream_str44);
        Assert.assertEquals(d45, Double.NaN, 0);
        Assert.assertNotNull(stream_str46);
        Assert.assertNotNull(str_array50);
        Assert.assertTrue(b52 == true);
        Assert.assertEquals(d53, Double.NaN, 0);
        Assert.assertTrue(b54 == false);
    }

    @Test
    public void test098() throws Throwable {
        Table[] table_array0 = new Table[] {};
        ArrayList<Table> arraylist_table1 = new ArrayList<>();
        boolean b2 = Collections.addAll(arraylist_table1, table_array0);
        Chen chen3 = new Chen(arraylist_table1);
        String[] str_array6 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str7 = new ArrayList<>();
        boolean b8 = Collections.addAll(arraylist_str7, str_array6);
        String[] str_array11 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str12 = new ArrayList<>();
        boolean b13 = Collections.addAll(arraylist_str12, str_array11);
        Boolean b14 = Tokenization.contains(arraylist_str7, arraylist_str12);
        boolean b15 = arraylist_str12.isEmpty();
        String[] str_array18 = new String[] { "", "" };
        ArrayList<String> arraylist_str19 = new ArrayList<>();
        boolean b20 = Collections.addAll(arraylist_str19, str_array18);
        Stream<String> stream_str21 = arraylist_str19.stream();
        String[] str_array24 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str25 = new ArrayList<>();
        boolean b26 = Collections.addAll(arraylist_str25, str_array24);
        String[] str_array29 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str30 = new ArrayList<>();
        boolean b31 = Collections.addAll(arraylist_str30, str_array29);
        Boolean b32 = Tokenization.contains(arraylist_str25, arraylist_str30);
        boolean b33 = arraylist_str19.containsAll(arraylist_str30);
        boolean b34 = arraylist_str12.removeAll(arraylist_str30);
        String[] str_array37 = new String[] { "", "" };
        ArrayList<String> arraylist_str38 = new ArrayList<>();
        boolean b39 = Collections.addAll(arraylist_str38, str_array37);
        Stream<String> stream_str40 = arraylist_str38.stream();
        double d41 = chen3.getTableChenSimilarity(arraylist_str30, arraylist_str38);
        Column column42 = null;
        Column column43 = null;
        try {
            double d44 = chen3.getChenSimilarity(column42, column43);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNotNull(table_array0);
        Assert.assertTrue(b2 == false);
        Assert.assertNotNull(str_array6);
        Assert.assertTrue(b8 == true);
        Assert.assertNotNull(str_array11);
        Assert.assertTrue(b13 == true);
        Assert.assertTrue("'" + b14 + "' != '" + true + "'", b14.equals(true));
        Assert.assertTrue(b15 == false);
        Assert.assertNotNull(str_array18);
        Assert.assertTrue(b20 == true);
        Assert.assertNotNull(stream_str21);
        Assert.assertNotNull(str_array24);
        Assert.assertTrue(b26 == true);
        Assert.assertNotNull(str_array29);
        Assert.assertTrue(b31 == true);
        Assert.assertTrue("'" + b32 + "' != '" + true + "'", b32.equals(true));
        Assert.assertTrue(b33 == false);
        Assert.assertTrue(b34 == true);
        Assert.assertNotNull(str_array37);
        Assert.assertTrue(b39 == true);
        Assert.assertNotNull(stream_str40);
        Assert.assertEquals(d41, Double.NaN, 0);
    }

    @Test
    public void test099() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        Set<Histogram> set_histogram14 = multiset_histogram0.keySet();
        boolean b15 = multiset_histogram0.isEmpty();
        boolean b16 = multiset_histogram0.isEmpty();
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNotNull(set_histogram14);
        Assert.assertTrue(b15 == false);
        Assert.assertTrue(b16 == false);
    }

    @Test
    public void test100() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Set<Histogram> set_histogram1 = multiset_histogram0.keySet();
        MultiSet<Histogram> multiset_histogram2 = new MultiSet<>();
        Histogram histogram3 = new Histogram();
        Integer i5 = multiset_histogram2.put(histogram3, 0);
        Histogram histogram6 = new Histogram();
        multiset_histogram2.add(histogram6);
        String[] str_array10 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str11 = new PriorityQueue<>();
        boolean b12 = Collections.addAll(priorityqueue_str11, str_array10);
        boolean b14 = priorityqueue_str11.offer("");
        Integer i15 = multiset_histogram2.remove("");
        MultiSet<Histogram> multiset_histogram16 = new MultiSet<>();
        Histogram histogram17 = new Histogram();
        Integer i19 = multiset_histogram16.put(histogram17, 0);
        Histogram histogram20 = new Histogram();
        multiset_histogram16.add(histogram20);
        Integer i23 = multiset_histogram2.replace(histogram20, 2);
        Integer i25 = multiset_histogram0.getOrDefault(i23, 7);
        MultiSet<Histogram> multiset_histogram26 = new MultiSet<>();
        Histogram histogram27 = new Histogram();
        Integer i29 = multiset_histogram26.put(histogram27, 0);
        Histogram histogram30 = new Histogram();
        multiset_histogram26.add(histogram30);
        String[] str_array34 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str35 = new PriorityQueue<>();
        boolean b36 = Collections.addAll(priorityqueue_str35, str_array34);
        boolean b38 = priorityqueue_str35.offer("");
        Integer i39 = multiset_histogram26.remove("");
        Set<Histogram> set_histogram40 = multiset_histogram26.keySet();
        boolean b41 = multiset_histogram26.isEmpty();
        String str42 = multiset_histogram26.toString();
        MultiSet<Histogram> multiset_histogram43 = new MultiSet<>();
        Histogram histogram44 = new Histogram();
        Integer i46 = multiset_histogram43.put(histogram44, 0);
        Histogram histogram47 = new Histogram();
        multiset_histogram43.add(histogram47);
        String[] str_array51 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str52 = new PriorityQueue<>();
        boolean b53 = Collections.addAll(priorityqueue_str52, str_array51);
        boolean b55 = priorityqueue_str52.offer("");
        Integer i56 = multiset_histogram43.remove("");
        MultiSet<Histogram> multiset_histogram57 = new MultiSet<>();
        Histogram histogram58 = new Histogram();
        Integer i60 = multiset_histogram57.put(histogram58, 0);
        Histogram histogram61 = new Histogram();
        multiset_histogram57.add(histogram61);
        Integer i64 = multiset_histogram43.replace(histogram61, 2);
        DataSourceFactory dataSourceFactory65 = new DataSourceFactory();
        boolean b66 = multiset_histogram43.containsKey(dataSourceFactory65);
        MultiSet<Histogram> multiset_histogram67 = new MultiSet<>();
        Histogram histogram68 = new Histogram();
        Integer i70 = multiset_histogram67.put(histogram68, 0);
        Histogram histogram71 = new Histogram();
        multiset_histogram67.add(histogram71);
        String[] str_array75 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str76 = new PriorityQueue<>();
        boolean b77 = Collections.addAll(priorityqueue_str76, str_array75);
        boolean b79 = priorityqueue_str76.offer("");
        Integer i80 = multiset_histogram67.remove("");
        MultiSet<Histogram> multiset_histogram81 = new MultiSet<>();
        Histogram histogram82 = new Histogram();
        Integer i84 = multiset_histogram81.put(histogram82, 0);
        Histogram histogram85 = new Histogram();
        multiset_histogram81.add(histogram85);
        Integer i88 = multiset_histogram67.replace(histogram85, 2);
        DataSourceFactory dataSourceFactory89 = new DataSourceFactory();
        boolean b90 = multiset_histogram67.containsKey(dataSourceFactory89);
        Histogram histogram91 = new Histogram();
        multiset_histogram67.add(histogram91);
        multiset_histogram43.add(histogram91);
        int i94 = multiset_histogram26.count(histogram91);
        TextArea textArea95 = null;
        TextAreaAppender textAreaAppender96 = new TextAreaAppender(textArea95);
        ErrorManager errorManager97 = textAreaAppender96.getErrorManager();
        boolean b98 = multiset_histogram0.remove(histogram91, textAreaAppender96);
        int i99 = multiset_histogram0.size();
        Assert.assertNotNull(set_histogram1);
        Assert.assertNull(i5);
        Assert.assertNotNull(str_array10);
        Assert.assertTrue(b12 == true);
        Assert.assertTrue(b14 == true);
        Assert.assertNull(i15);
        Assert.assertNull(i19);
        Assert.assertNull(i23);
        Assert.assertTrue("'" + i25 + "' != '" + 7 + "'", i25.equals(7));
        Assert.assertNull(i29);
        Assert.assertNotNull(str_array34);
        Assert.assertTrue(b36 == true);
        Assert.assertTrue(b38 == true);
        Assert.assertNull(i39);
        Assert.assertNotNull(set_histogram40);
        Assert.assertTrue(b41 == false);
        Assert.assertNull(i46);
        Assert.assertNotNull(str_array51);
        Assert.assertTrue(b53 == true);
        Assert.assertTrue(b55 == true);
        Assert.assertNull(i56);
        Assert.assertNull(i60);
        Assert.assertNull(i64);
        Assert.assertTrue(b66 == false);
        Assert.assertNull(i70);
        Assert.assertNotNull(str_array75);
        Assert.assertTrue(b77 == true);
        Assert.assertTrue(b79 == true);
        Assert.assertNull(i80);
        Assert.assertNull(i84);
        Assert.assertNull(i88);
        Assert.assertTrue(b90 == false);
        Assert.assertTrue(i94 == 0);
        Assert.assertNotNull(errorManager97);
        Assert.assertTrue(b98 == false);
        Assert.assertTrue(i99 == 0);
    }

    @Test
    public void test101() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        MultiSet<Histogram> multiset_histogram14 = new MultiSet<>();
        Histogram histogram15 = new Histogram();
        Integer i17 = multiset_histogram14.put(histogram15, 0);
        Histogram histogram18 = new Histogram();
        multiset_histogram14.add(histogram18);
        Integer i21 = multiset_histogram0.replace(histogram18, 2);
        DataSourceFactory dataSourceFactory22 = new DataSourceFactory();
        boolean b23 = multiset_histogram0.containsKey(dataSourceFactory22);
        MultiSet<Histogram> multiset_histogram24 = new MultiSet<>();
        Histogram histogram25 = new Histogram();
        Integer i27 = multiset_histogram24.put(histogram25, 0);
        Histogram histogram28 = new Histogram();
        multiset_histogram24.add(histogram28);
        String[] str_array32 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str33 = new PriorityQueue<>();
        boolean b34 = Collections.addAll(priorityqueue_str33, str_array32);
        boolean b36 = priorityqueue_str33.offer("");
        Integer i37 = multiset_histogram24.remove("");
        MultiSet<Histogram> multiset_histogram38 = new MultiSet<>();
        Histogram histogram39 = new Histogram();
        Integer i41 = multiset_histogram38.put(histogram39, 0);
        Histogram histogram42 = new Histogram();
        multiset_histogram38.add(histogram42);
        Integer i45 = multiset_histogram24.replace(histogram42, 2);
        DataSourceFactory dataSourceFactory46 = new DataSourceFactory();
        boolean b47 = multiset_histogram24.containsKey(dataSourceFactory46);
        Histogram histogram48 = new Histogram();
        multiset_histogram24.add(histogram48);
        multiset_histogram0.add(histogram48);
        TextArea textArea51 = null;
        TextAreaAppender textAreaAppender52 = new TextAreaAppender(textArea51);
        Filter filter53 = textAreaAppender52.getFilter();
        Level level54 = textAreaAppender52.getLevel();
        textAreaAppender52.flush();
        Formatter formatter56 = textAreaAppender52.getFormatter();
        Filter filter57 = null;
        textAreaAppender52.setFilter(filter57);
        TextArea textArea59 = null;
        TextAreaAppender textAreaAppender60 = new TextAreaAppender(textArea59);
        TextArea textArea61 = null;
        TextAreaAppender textAreaAppender62 = new TextAreaAppender(textArea61);
        Filter filter63 = textAreaAppender62.getFilter();
        Level level64 = textAreaAppender62.getLevel();
        textAreaAppender60.setLevel(level64);
        boolean b66 = multiset_histogram0.remove(filter57, textAreaAppender60);
        Object obj67 = multiset_histogram0.clone();
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNull(i17);
        Assert.assertNull(i21);
        Assert.assertTrue(b23 == false);
        Assert.assertNull(i27);
        Assert.assertNotNull(str_array32);
        Assert.assertTrue(b34 == true);
        Assert.assertTrue(b36 == true);
        Assert.assertNull(i37);
        Assert.assertNull(i41);
        Assert.assertNull(i45);
        Assert.assertTrue(b47 == false);
        Assert.assertNull(filter53);
        Assert.assertNotNull(level54);
        Assert.assertNotNull(formatter56);
        Assert.assertNull(filter63);
        Assert.assertNotNull(level64);
        Assert.assertTrue(b66 == false);
        Assert.assertNotNull(obj67);
    }

    @Test
    public void test102() throws Throwable {
        String[] str_array2 = new String[] { "", "" };
        ArrayList<String> arraylist_str3 = new ArrayList<>();
        boolean b4 = Collections.addAll(arraylist_str3, str_array2);
        Stream<String> stream_str5 = arraylist_str3.stream();
        String[] str_array8 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str9 = new ArrayList<>();
        boolean b10 = Collections.addAll(arraylist_str9, str_array8);
        String[] str_array13 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str14 = new ArrayList<>();
        boolean b15 = Collections.addAll(arraylist_str14, str_array13);
        Boolean b16 = Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        String[] str_array20 = new String[] { "", "" };
        ArrayList<String> arraylist_str21 = new ArrayList<>();
        boolean b22 = Collections.addAll(arraylist_str21, str_array20);
        Stream<String> stream_str23 = arraylist_str21.stream();
        String[] str_array26 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str27 = new ArrayList<>();
        boolean b28 = Collections.addAll(arraylist_str27, str_array26);
        String[] str_array31 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str32 = new ArrayList<>();
        boolean b33 = Collections.addAll(arraylist_str32, str_array31);
        Boolean b34 = Tokenization.contains(arraylist_str27, arraylist_str32);
        boolean b35 = arraylist_str21.containsAll(arraylist_str32);
        double d36 = TokenShareRatio.setTokenShareRatioFkLD(arraylist_str3, arraylist_str21);
        HeapWithFixedSize<String> heapwithfixedsize_str38 = new HeapWithFixedSize<>((int) (byte) 100);
        int i39 = heapwithfixedsize_str38.size();
        boolean b40 = arraylist_str21.retainAll(heapwithfixedsize_str38);
        Assert.assertNotNull(str_array2);
        Assert.assertTrue(b4 == true);
        Assert.assertNotNull(stream_str5);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertNotNull(str_array13);
        Assert.assertTrue(b15 == true);
        Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        Assert.assertTrue(b17 == false);
        Assert.assertNotNull(str_array20);
        Assert.assertTrue(b22 == true);
        Assert.assertNotNull(stream_str23);
        Assert.assertNotNull(str_array26);
        Assert.assertTrue(b28 == true);
        Assert.assertNotNull(str_array31);
        Assert.assertTrue(b33 == true);
        Assert.assertTrue("'" + b34 + "' != '" + true + "'", b34.equals(true));
        Assert.assertTrue(b35 == false);
        Assert.assertTrue(d36 == 1.0d);
        Assert.assertTrue(i39 == 0);
        Assert.assertTrue(b40 == true);
    }

    @Test
    public void test103() throws Throwable {
        TextArea textArea0 = null;
        TextAreaAppender textAreaAppender1 = new TextAreaAppender(textArea0);
        Filter filter2 = null;
        textAreaAppender1.setFilter(filter2);
    }

    @Test
    public void test104() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        Set<Histogram> set_histogram14 = multiset_histogram0.keySet();
        boolean b15 = multiset_histogram0.isEmpty();
        String str16 = multiset_histogram0.toString();
        MultiSet<Histogram> multiset_histogram17 = new MultiSet<>();
        Histogram histogram18 = new Histogram();
        Integer i20 = multiset_histogram17.put(histogram18, 0);
        Histogram histogram21 = new Histogram();
        multiset_histogram17.add(histogram21);
        String[] str_array25 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str26 = new PriorityQueue<>();
        boolean b27 = Collections.addAll(priorityqueue_str26, str_array25);
        boolean b29 = priorityqueue_str26.offer("");
        Integer i30 = multiset_histogram17.remove("");
        MultiSet<Histogram> multiset_histogram31 = new MultiSet<>();
        Histogram histogram32 = new Histogram();
        Integer i34 = multiset_histogram31.put(histogram32, 0);
        Histogram histogram35 = new Histogram();
        multiset_histogram31.add(histogram35);
        String[] str_array39 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str40 = new PriorityQueue<>();
        boolean b41 = Collections.addAll(priorityqueue_str40, str_array39);
        boolean b43 = priorityqueue_str40.offer("");
        Integer i44 = multiset_histogram31.remove("");
        MultiSet<Histogram> multiset_histogram45 = new MultiSet<>();
        Histogram histogram46 = new Histogram();
        Integer i48 = multiset_histogram45.put(histogram46, 0);
        Histogram histogram49 = new Histogram();
        multiset_histogram45.add(histogram49);
        Integer i52 = multiset_histogram31.replace(histogram49, 2);
        DataSourceFactory dataSourceFactory53 = new DataSourceFactory();
        boolean b54 = multiset_histogram31.containsKey(dataSourceFactory53);
        Histogram histogram55 = new Histogram();
        multiset_histogram31.add(histogram55);
        boolean b59 = multiset_histogram17.replace(histogram55, 0, 3);
        Integer i61 = multiset_histogram0.putIfAbsent(histogram55, 5);
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNotNull(set_histogram14);
        Assert.assertTrue(b15 == false);
        Assert.assertNull(i20);
        Assert.assertNotNull(str_array25);
        Assert.assertTrue(b27 == true);
        Assert.assertTrue(b29 == true);
        Assert.assertNull(i30);
        Assert.assertNull(i34);
        Assert.assertNotNull(str_array39);
        Assert.assertTrue(b41 == true);
        Assert.assertTrue(b43 == true);
        Assert.assertNull(i44);
        Assert.assertNull(i48);
        Assert.assertNull(i52);
        Assert.assertTrue(b54 == false);
        Assert.assertTrue(b59 == false);
        Assert.assertNull(i61);
    }

    @Test
    public void test105() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str3 = new HeapWithFixedSize<>((int) (byte) 100);
        int i4 = heapwithfixedsize_str3.size();
        boolean b5 = heapwithfixedsize_str1.retainAll(heapwithfixedsize_str3);
        Iterator<String> iterator_str6 = heapwithfixedsize_str1.iterator();
        MultiSet<Histogram> multiset_histogram7 = new MultiSet<>();
        Histogram histogram8 = new Histogram();
        Integer i10 = multiset_histogram7.put(histogram8, 0);
        Histogram histogram11 = new Histogram();
        multiset_histogram7.add(histogram11);
        String[] str_array15 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str16 = new PriorityQueue<>();
        boolean b17 = Collections.addAll(priorityqueue_str16, str_array15);
        boolean b19 = priorityqueue_str16.offer("");
        Integer i20 = multiset_histogram7.remove("");
        Set<Histogram> set_histogram21 = multiset_histogram7.keySet();
        MultiSet<Histogram> multiset_histogram22 = new MultiSet<>();
        Histogram histogram23 = new Histogram();
        Integer i25 = multiset_histogram22.put(histogram23, 0);
        Histogram histogram26 = new Histogram();
        multiset_histogram22.add(histogram26);
        String[] str_array30 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str31 = new PriorityQueue<>();
        boolean b32 = Collections.addAll(priorityqueue_str31, str_array30);
        boolean b34 = priorityqueue_str31.offer("");
        Integer i35 = multiset_histogram22.remove("");
        Set<Histogram> set_histogram36 = multiset_histogram22.keySet();
        MultiSet<Histogram> multiset_histogram37 = new MultiSet<>();
        Histogram histogram38 = new Histogram();
        Integer i40 = multiset_histogram37.put(histogram38, 0);
        Histogram histogram41 = new Histogram();
        multiset_histogram37.add(histogram41);
        int i43 = multiset_histogram22.count(histogram41);
        int i44 = multiset_histogram7.count(histogram41);
        Object[] obj_array46 = new Object[] { i44, 10L };
        Object[] obj_array47 = heapwithfixedsize_str1.toArray(obj_array46);
        Stream<String> stream_str48 = heapwithfixedsize_str1.parallelStream();
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(b5 == false);
        Assert.assertNotNull(iterator_str6);
        Assert.assertNull(i10);
        Assert.assertNotNull(str_array15);
        Assert.assertTrue(b17 == true);
        Assert.assertTrue(b19 == true);
        Assert.assertNull(i20);
        Assert.assertNotNull(set_histogram21);
        Assert.assertNull(i25);
        Assert.assertNotNull(str_array30);
        Assert.assertTrue(b32 == true);
        Assert.assertTrue(b34 == true);
        Assert.assertNull(i35);
        Assert.assertNotNull(set_histogram36);
        Assert.assertNull(i40);
        Assert.assertTrue(i43 == 0);
        Assert.assertTrue(i44 == 0);
        Assert.assertNotNull(obj_array46);
        Assert.assertNotNull(obj_array47);
        Assert.assertNotNull(stream_str48);
    }

    @Test
    public void test106() throws Throwable {
        double[] d_array3 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array6 = new double[] { (byte) 1, (short) 1 };
        double[] d_array9 = Histogram.rel2abs(d_array6, (double) 100.0f, (double) ' ');
        double[] d_array12 = new double[] { (byte) 1, (short) 1 };
        double[] d_array15 = Histogram.rel2abs(d_array12, (double) 100.0f, (double) ' ');
        double d17 = Logistic.classify(d_array9, d_array15, (double) 100.0f);
        Double d18 = Histogram.jaccard(d_array3, d_array15);
        Assert.assertNotNull(d_array3);
        Assert.assertNotNull(d_array6);
        Assert.assertNotNull(d_array9);
        Assert.assertNotNull(d_array12);
        Assert.assertNotNull(d_array15);
        Assert.assertTrue(d17 == 1.0d);
        Assert.assertTrue("'" + d18 + "' != '" + 0.0d + "'", d18.equals(0.0d));
    }

    @Test
    public void test107() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        MultiSet<Histogram> multiset_histogram14 = new MultiSet<>();
        Histogram histogram15 = new Histogram();
        Integer i17 = multiset_histogram14.put(histogram15, 0);
        Histogram histogram18 = new Histogram();
        multiset_histogram14.add(histogram18);
        Integer i21 = multiset_histogram0.replace(histogram18, 2);
        DataSourceFactory dataSourceFactory22 = new DataSourceFactory();
        boolean b23 = multiset_histogram0.containsKey(dataSourceFactory22);
        Histogram histogram24 = new Histogram();
        multiset_histogram0.add(histogram24);
        MultiSet<Histogram> multiset_histogram26 = new MultiSet<>();
        Set<Histogram> set_histogram27 = multiset_histogram26.keySet();
        String str28 = multiset_histogram26.toString();
        boolean b31 = multiset_histogram26.remove(100.0d, 100);
        String2Num string2Num32 = new String2Num();
        boolean b33 = multiset_histogram26.containsValue(string2Num32);
        multiset_histogram0.putAll(multiset_histogram26);
        int i35 = multiset_histogram26.size();
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNull(i17);
        Assert.assertNull(i21);
        Assert.assertTrue(b23 == false);
        Assert.assertNotNull(set_histogram27);
        Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        Assert.assertTrue(b31 == false);
        Assert.assertTrue(b33 == false);
        Assert.assertTrue(i35 == 0);
    }

    @Test
    public void test108() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        Set<Histogram> set_histogram14 = multiset_histogram0.keySet();
        int i15 = multiset_histogram0.totalCount();
        MultiSet<Histogram> multiset_histogram16 = new MultiSet<>();
        Histogram histogram17 = new Histogram();
        Integer i19 = multiset_histogram16.put(histogram17, 0);
        Histogram histogram20 = new Histogram();
        multiset_histogram16.add(histogram20);
        String[] str_array24 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str25 = new PriorityQueue<>();
        boolean b26 = Collections.addAll(priorityqueue_str25, str_array24);
        boolean b28 = priorityqueue_str25.offer("");
        Integer i29 = multiset_histogram16.remove("");
        Set<Histogram> set_histogram30 = multiset_histogram16.keySet();
        MultiSet<Histogram> multiset_histogram31 = new MultiSet<>();
        Histogram histogram32 = new Histogram();
        Integer i34 = multiset_histogram31.put(histogram32, 0);
        Histogram histogram35 = new Histogram();
        multiset_histogram31.add(histogram35);
        String[] str_array39 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str40 = new PriorityQueue<>();
        boolean b41 = Collections.addAll(priorityqueue_str40, str_array39);
        boolean b43 = priorityqueue_str40.offer("");
        Integer i44 = multiset_histogram31.remove("");
        Set<Histogram> set_histogram45 = multiset_histogram31.keySet();
        MultiSet<Histogram> multiset_histogram46 = new MultiSet<>();
        Histogram histogram47 = new Histogram();
        Integer i49 = multiset_histogram46.put(histogram47, 0);
        Histogram histogram50 = new Histogram();
        multiset_histogram46.add(histogram50);
        int i52 = multiset_histogram31.count(histogram50);
        int i53 = multiset_histogram16.count(histogram50);
        Integer i55 = multiset_histogram0.replace(histogram50, 2);
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNotNull(set_histogram14);
        Assert.assertTrue(i15 == 1);
        Assert.assertNull(i19);
        Assert.assertNotNull(str_array24);
        Assert.assertTrue(b26 == true);
        Assert.assertTrue(b28 == true);
        Assert.assertNull(i29);
        Assert.assertNotNull(set_histogram30);
        Assert.assertNull(i34);
        Assert.assertNotNull(str_array39);
        Assert.assertTrue(b41 == true);
        Assert.assertTrue(b43 == true);
        Assert.assertNull(i44);
        Assert.assertNotNull(set_histogram45);
        Assert.assertNull(i49);
        Assert.assertTrue(i52 == 0);
        Assert.assertTrue(i53 == 0);
        Assert.assertNull(i55);
    }

    @Test
    public void test109() throws Throwable {
        String[] str_array5 = new String[] { "hi!", "[hi!, hi!]", "", "", "{}" };
        PriorityQueue<String> priorityqueue_str6 = new PriorityQueue<>();
        boolean b7 = Collections.addAll(priorityqueue_str6, str_array5);
        Object obj8 = null;
        boolean b9 = priorityqueue_str6.contains(obj8);
        Assert.assertNotNull(str_array5);
        Assert.assertTrue(b7 == true);
        Assert.assertTrue(b9 == false);
    }

    @Test
    public void test110() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str3 = new HeapWithFixedSize<>((int) (byte) 100);
        int i4 = heapwithfixedsize_str3.size();
        boolean b5 = heapwithfixedsize_str1.retainAll(heapwithfixedsize_str3);
        Iterator<String> iterator_str6 = heapwithfixedsize_str1.iterator();
        int i7 = heapwithfixedsize_str1.size();
        HeapWithFixedSize<String> heapwithfixedsize_str9 = new HeapWithFixedSize<>((int) '#');
        HeapWithFixedSize<String> heapwithfixedsize_str11 = new HeapWithFixedSize<>((int) (byte) 100);
        boolean b13 = heapwithfixedsize_str11.offer("hi!");
        HeapWithFixedSize<String> heapwithfixedsize_str15 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str17 = new HeapWithFixedSize<>((int) (byte) 100);
        int i18 = heapwithfixedsize_str17.size();
        boolean b19 = heapwithfixedsize_str15.retainAll(heapwithfixedsize_str17);
        Queue[] queue_array21 = new Queue[3];
        @SuppressWarnings("unchecked") Queue<String>[] queue_str_array22 = (Queue<String>[]) queue_array21;
        queue_str_array22[0] = heapwithfixedsize_str9;
        queue_str_array22[1] = heapwithfixedsize_str11;
        queue_str_array22[2] = heapwithfixedsize_str15;
        Queue<String>[] queue_str_array29 = heapwithfixedsize_str1.toArray(queue_str_array22);
        boolean b31 = heapwithfixedsize_str1.add("hi!");
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(b5 == false);
        Assert.assertNotNull(iterator_str6);
        Assert.assertTrue(i7 == 0);
        Assert.assertTrue(b13 == true);
        Assert.assertTrue(i18 == 0);
        Assert.assertTrue(b19 == false);
        Assert.assertNotNull(queue_array21);
        Assert.assertNotNull(queue_str_array22);
        Assert.assertNotNull(queue_str_array29);
        Assert.assertTrue(b31 == true);
    }

    @Test
    public void test111() throws Throwable {
        MultiMap multiMap0 = new MultiMap();
        multiMap0.put("hi!", "hi!");
        List<String> list_str5 = multiMap0.get("[hi!, hi!]");
        Assert.assertNotNull(list_str5);
    }

    @Test
    public void test112() throws Throwable {
        String[] str_array2 = new String[] { "{}", "hi!" };
        PriorityQueue<String> priorityqueue_str3 = new PriorityQueue<>();
        boolean b4 = Collections.addAll(priorityqueue_str3, str_array2);
        List<String> list_str6 = Tokenization.lowercaseSplit("hi!");
        String[] str_array9 = new String[] { "", "" };
        ArrayList<String> arraylist_str10 = new ArrayList<>();
        boolean b11 = Collections.addAll(arraylist_str10, str_array9);
        Stream<String> stream_str12 = arraylist_str10.stream();
        String[] str_array15 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str16 = new ArrayList<>();
        boolean b17 = Collections.addAll(arraylist_str16, str_array15);
        String[] str_array20 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str21 = new ArrayList<>();
        boolean b22 = Collections.addAll(arraylist_str21, str_array20);
        Boolean b23 = Tokenization.contains(arraylist_str16, arraylist_str21);
        boolean b24 = arraylist_str10.containsAll(arraylist_str21);
        HeapWithFixedSize<String> heapwithfixedsize_str26 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str28 = new HeapWithFixedSize<>((int) (byte) 100);
        int i29 = heapwithfixedsize_str28.size();
        boolean b30 = heapwithfixedsize_str26.retainAll(heapwithfixedsize_str28);
        boolean b31 = arraylist_str21.removeAll(heapwithfixedsize_str28);
        String[] str_array34 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str35 = new ArrayList<>();
        boolean b36 = Collections.addAll(arraylist_str35, str_array34);
        String[] str_array39 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str40 = new ArrayList<>();
        boolean b41 = Collections.addAll(arraylist_str40, str_array39);
        Boolean b42 = Tokenization.contains(arraylist_str35, arraylist_str40);
        boolean b43 = arraylist_str40.isEmpty();
        String[] str_array46 = new String[] { "", "" };
        ArrayList<String> arraylist_str47 = new ArrayList<>();
        boolean b48 = Collections.addAll(arraylist_str47, str_array46);
        Stream<String> stream_str49 = arraylist_str47.stream();
        String[] str_array52 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str53 = new ArrayList<>();
        boolean b54 = Collections.addAll(arraylist_str53, str_array52);
        String[] str_array57 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str58 = new ArrayList<>();
        boolean b59 = Collections.addAll(arraylist_str58, str_array57);
        Boolean b60 = Tokenization.contains(arraylist_str53, arraylist_str58);
        boolean b61 = arraylist_str47.containsAll(arraylist_str58);
        boolean b62 = arraylist_str40.removeAll(arraylist_str58);
        double d63 = TokenShareRatio.setTokenShareRatioFkLD(arraylist_str21, arraylist_str58);
        Boolean b64 = Tokenization.contains(list_str6, arraylist_str58);
        boolean b65 = priorityqueue_str3.contains(list_str6);
        String[] str_array68 = new String[] { "", "" };
        ArrayList<String> arraylist_str69 = new ArrayList<>();
        boolean b70 = Collections.addAll(arraylist_str69, str_array68);
        Stream<String> stream_str71 = arraylist_str69.stream();
        boolean b72 = priorityqueue_str3.contains(arraylist_str69);
        Object[] obj_array73 = priorityqueue_str3.toArray();
        Assert.assertNotNull(str_array2);
        Assert.assertTrue(b4 == true);
        Assert.assertNotNull(list_str6);
        Assert.assertNotNull(str_array9);
        Assert.assertTrue(b11 == true);
        Assert.assertNotNull(stream_str12);
        Assert.assertNotNull(str_array15);
        Assert.assertTrue(b17 == true);
        Assert.assertNotNull(str_array20);
        Assert.assertTrue(b22 == true);
        Assert.assertTrue("'" + b23 + "' != '" + true + "'", b23.equals(true));
        Assert.assertTrue(b24 == false);
        Assert.assertTrue(i29 == 0);
        Assert.assertTrue(b30 == false);
        Assert.assertTrue(b31 == false);
        Assert.assertNotNull(str_array34);
        Assert.assertTrue(b36 == true);
        Assert.assertNotNull(str_array39);
        Assert.assertTrue(b41 == true);
        Assert.assertTrue("'" + b42 + "' != '" + true + "'", b42.equals(true));
        Assert.assertTrue(b43 == false);
        Assert.assertNotNull(str_array46);
        Assert.assertTrue(b48 == true);
        Assert.assertNotNull(stream_str49);
        Assert.assertNotNull(str_array52);
        Assert.assertTrue(b54 == true);
        Assert.assertNotNull(str_array57);
        Assert.assertTrue(b59 == true);
        Assert.assertTrue("'" + b60 + "' != '" + true + "'", b60.equals(true));
        Assert.assertTrue(b61 == false);
        Assert.assertTrue(b62 == true);
        Assert.assertTrue(d63 == 1.0d);
        Assert.assertTrue("'" + b64 + "' != '" + false + "'", b64.equals(false));
        Assert.assertTrue(b65 == false);
        Assert.assertNotNull(str_array68);
        Assert.assertTrue(b70 == true);
        Assert.assertNotNull(stream_str71);
        Assert.assertTrue(b72 == false);
        Assert.assertNotNull(obj_array73);
    }

    @Test
    public void test113() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (byte) 100);
        String[] str_array4 = new String[] { "", "" };
        ArrayList<String> arraylist_str5 = new ArrayList<>();
        boolean b6 = Collections.addAll(arraylist_str5, str_array4);
        Stream<String> stream_str7 = arraylist_str5.stream();
        Stream<String> stream_str8 = arraylist_str5.parallelStream();
        String[] str_array11 = new String[] { "", "" };
        ArrayList<String> arraylist_str12 = new ArrayList<>();
        boolean b13 = Collections.addAll(arraylist_str12, str_array11);
        Stream<String> stream_str14 = arraylist_str12.stream();
        String[] str_array17 = new String[] { "", "" };
        ArrayList<String> arraylist_str18 = new ArrayList<>();
        boolean b19 = Collections.addAll(arraylist_str18, str_array17);
        Stream<String> stream_str20 = arraylist_str18.stream();
        Stream<String> stream_str21 = arraylist_str18.parallelStream();
        String[] str_array24 = new String[] { "", "" };
        ArrayList<String> arraylist_str25 = new ArrayList<>();
        boolean b26 = Collections.addAll(arraylist_str25, str_array24);
        Stream<String> stream_str27 = arraylist_str25.stream();
        Stream<String> stream_str28 = arraylist_str25.parallelStream();
        String[] str_array31 = new String[] { "", "" };
        ArrayList<String> arraylist_str32 = new ArrayList<>();
        boolean b33 = Collections.addAll(arraylist_str32, str_array31);
        Stream<String> stream_str34 = arraylist_str32.stream();
        String[] str_array37 = new String[] { "", "" };
        ArrayList<String> arraylist_str38 = new ArrayList<>();
        boolean b39 = Collections.addAll(arraylist_str38, str_array37);
        Stream<String> stream_str40 = arraylist_str38.stream();
        Stream<String> stream_str41 = arraylist_str38.parallelStream();
        Stream[] stream_array43 = new Stream[6];
        @SuppressWarnings("unchecked") Stream<String>[] stream_str_array44 = (Stream<String>[]) stream_array43;
        stream_str_array44[0] = stream_str8;
        stream_str_array44[1] = stream_str14;
        stream_str_array44[2] = stream_str21;
        stream_str_array44[3] = stream_str28;
        stream_str_array44[4] = stream_str34;
        stream_str_array44[5] = stream_str41;
        Stream<String>[] stream_str_array57 = heapwithfixedsize_str1.toArray(stream_str_array44);
        Iterator<String> iterator_str58 = heapwithfixedsize_str1.iterator();
        heapwithfixedsize_str1.clear();
        Assert.assertNotNull(str_array4);
        Assert.assertTrue(b6 == true);
        Assert.assertNotNull(stream_str7);
        Assert.assertNotNull(stream_str8);
        Assert.assertNotNull(str_array11);
        Assert.assertTrue(b13 == true);
        Assert.assertNotNull(stream_str14);
        Assert.assertNotNull(str_array17);
        Assert.assertTrue(b19 == true);
        Assert.assertNotNull(stream_str20);
        Assert.assertNotNull(stream_str21);
        Assert.assertNotNull(str_array24);
        Assert.assertTrue(b26 == true);
        Assert.assertNotNull(stream_str27);
        Assert.assertNotNull(stream_str28);
        Assert.assertNotNull(str_array31);
        Assert.assertTrue(b33 == true);
        Assert.assertNotNull(stream_str34);
        Assert.assertNotNull(str_array37);
        Assert.assertTrue(b39 == true);
        Assert.assertNotNull(stream_str40);
        Assert.assertNotNull(stream_str41);
        Assert.assertNotNull(stream_array43);
        Assert.assertNotNull(stream_str_array44);
        Assert.assertNotNull(stream_str_array57);
        Assert.assertNotNull(iterator_str58);
    }

    @Test
    public void test114() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        MultiSet<Histogram> multiset_histogram14 = new MultiSet<>();
        Histogram histogram15 = new Histogram();
        Integer i17 = multiset_histogram14.put(histogram15, 0);
        Histogram histogram18 = new Histogram();
        multiset_histogram14.add(histogram18);
        Integer i21 = multiset_histogram0.replace(histogram18, 2);
        MultiSet<Histogram> multiset_histogram22 = new MultiSet<>();
        Histogram histogram23 = new Histogram();
        Integer i25 = multiset_histogram22.put(histogram23, 0);
        Histogram histogram26 = new Histogram();
        multiset_histogram22.add(histogram26);
        String[] str_array30 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str31 = new PriorityQueue<>();
        boolean b32 = Collections.addAll(priorityqueue_str31, str_array30);
        boolean b34 = priorityqueue_str31.offer("");
        Integer i35 = multiset_histogram22.remove("");
        Set<Histogram> set_histogram36 = multiset_histogram22.keySet();
        MultiSet<Histogram> multiset_histogram37 = new MultiSet<>();
        Histogram histogram38 = new Histogram();
        Integer i40 = multiset_histogram37.put(histogram38, 0);
        Histogram histogram41 = new Histogram();
        multiset_histogram37.add(histogram41);
        int i43 = multiset_histogram22.count(histogram41);
        int i44 = multiset_histogram0.count(histogram41);
        Object obj45 = multiset_histogram0.clone();
        Integer i48 = multiset_histogram0.getOrDefault("hi!", 7);
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNull(i17);
        Assert.assertNull(i21);
        Assert.assertNull(i25);
        Assert.assertNotNull(str_array30);
        Assert.assertTrue(b32 == true);
        Assert.assertTrue(b34 == true);
        Assert.assertNull(i35);
        Assert.assertNotNull(set_histogram36);
        Assert.assertNull(i40);
        Assert.assertTrue(i43 == 0);
        Assert.assertTrue(i44 == 0);
        Assert.assertNotNull(obj45);
        Assert.assertTrue("'" + i48 + "' != '" + 7 + "'", i48.equals(7));
    }

    @Test
    public void test115() throws Throwable {
        double[] d_array3 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array6 = new double[] { (byte) 1, (short) 1 };
        double[] d_array9 = Histogram.rel2abs(d_array6, (double) 100.0f, (double) ' ');
        double[] d_array12 = new double[] { (byte) 1, (short) 1 };
        double[] d_array15 = Histogram.rel2abs(d_array12, (double) 100.0f, (double) ' ');
        double d17 = Logistic.classify(d_array9, d_array15, (double) 100.0f);
        Double d18 = Histogram.jaccard(d_array3, d_array15);
        HeapWithFixedSize<String> heapwithfixedsize_str20 = new HeapWithFixedSize<>((int) (byte) 100);
        int i21 = heapwithfixedsize_str20.size();
        double[] d_array25 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array28 = new double[] { (byte) 1, (short) 1 };
        double[] d_array31 = Histogram.rel2abs(d_array28, (double) 100.0f, (double) ' ');
        double[] d_array34 = new double[] { (byte) 1, (short) 1 };
        double[] d_array37 = Histogram.rel2abs(d_array34, (double) 100.0f, (double) ' ');
        double d39 = Logistic.classify(d_array31, d_array37, (double) 100.0f);
        Double d40 = Histogram.jaccard(d_array25, d_array37);
        double[] d_array43 = new double[] { (byte) 1, (short) 1 };
        double[] d_array46 = Histogram.rel2abs(d_array43, (double) 100.0f, (double) ' ');
        double[] d_array47 = Multiplication.elementWise(d_array25, d_array46);
        boolean b48 = heapwithfixedsize_str20.remove(d_array25);
        Double d49 = Histogram.jaccard(d_array3, d_array25);
        double[] d_array52 = new double[] { (byte) 1, (short) 1 };
        double[] d_array55 = Histogram.rel2abs(d_array52, (double) 100.0f, (double) ' ');
        double[] d_array58 = new double[] { (byte) 1, (short) 1 };
        double[] d_array61 = Histogram.rel2abs(d_array58, (double) 100.0f, (double) ' ');
        double[] d_array64 = new double[] { (byte) 1, (short) 1 };
        double[] d_array67 = Histogram.rel2abs(d_array64, (double) 100.0f, (double) ' ');
        double d69 = Logistic.classify(d_array61, d_array67, (double) 100.0f);
        Double d70 = Histogram.jaccard(d_array55, d_array61);
        double[] d_array73 = Histogram.rel2abs(d_array61, (double) 4, (double) 4);
        double[] d_array74 = new double[] {};
        Double d75 = Histogram.jaccard(d_array73, d_array74);
        try {
            double d77 = Logistic.classify(d_array25, d_array74, (double) 100L);
            Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (RuntimeException e) {
        }
        Assert.assertNotNull(d_array3);
        Assert.assertNotNull(d_array6);
        Assert.assertNotNull(d_array9);
        Assert.assertNotNull(d_array12);
        Assert.assertNotNull(d_array15);
        Assert.assertTrue(d17 == 1.0d);
        Assert.assertTrue("'" + d18 + "' != '" + 0.0d + "'", d18.equals(0.0d));
        Assert.assertTrue(i21 == 0);
        Assert.assertNotNull(d_array25);
        Assert.assertNotNull(d_array28);
        Assert.assertNotNull(d_array31);
        Assert.assertNotNull(d_array34);
        Assert.assertNotNull(d_array37);
        Assert.assertTrue(d39 == 1.0d);
        Assert.assertTrue("'" + d40 + "' != '" + 0.0d + "'", d40.equals(0.0d));
        Assert.assertNotNull(d_array43);
        Assert.assertNotNull(d_array46);
        Assert.assertNotNull(d_array47);
        Assert.assertTrue(b48 == false);
        Assert.assertTrue("'" + d49 + "' != '" + 1.0d + "'", d49.equals(1.0d));
        Assert.assertNotNull(d_array52);
        Assert.assertNotNull(d_array55);
        Assert.assertNotNull(d_array58);
        Assert.assertNotNull(d_array61);
        Assert.assertNotNull(d_array64);
        Assert.assertNotNull(d_array67);
        Assert.assertTrue(d69 == 1.0d);
        Assert.assertEquals(d70, Double.NaN, 0);
        Assert.assertNotNull(d_array73);
        Assert.assertNotNull(d_array74);
        Assert.assertEquals(d75, Double.NaN, 0);
    }

    @Test
    public void test116() throws Throwable {
        Table[] table_array0 = new Table[] {};
        ArrayList<Table> arraylist_table1 = new ArrayList<>();
        boolean b2 = Collections.addAll(arraylist_table1, table_array0);
        Chen chen3 = new Chen(arraylist_table1);
        String[] str_array6 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str7 = new ArrayList<>();
        boolean b8 = Collections.addAll(arraylist_str7, str_array6);
        String[] str_array11 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str12 = new ArrayList<>();
        boolean b13 = Collections.addAll(arraylist_str12, str_array11);
        Boolean b14 = Tokenization.contains(arraylist_str7, arraylist_str12);
        boolean b15 = arraylist_str12.isEmpty();
        String[] str_array18 = new String[] { "", "" };
        ArrayList<String> arraylist_str19 = new ArrayList<>();
        boolean b20 = Collections.addAll(arraylist_str19, str_array18);
        Stream<String> stream_str21 = arraylist_str19.stream();
        String[] str_array24 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str25 = new ArrayList<>();
        boolean b26 = Collections.addAll(arraylist_str25, str_array24);
        String[] str_array29 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str30 = new ArrayList<>();
        boolean b31 = Collections.addAll(arraylist_str30, str_array29);
        Boolean b32 = Tokenization.contains(arraylist_str25, arraylist_str30);
        boolean b33 = arraylist_str19.containsAll(arraylist_str30);
        boolean b34 = arraylist_str12.removeAll(arraylist_str30);
        String[] str_array37 = new String[] { "", "" };
        ArrayList<String> arraylist_str38 = new ArrayList<>();
        boolean b39 = Collections.addAll(arraylist_str38, str_array37);
        Stream<String> stream_str40 = arraylist_str38.stream();
        double d41 = chen3.getTableChenSimilarity(arraylist_str30, arraylist_str38);
        String[] str_array44 = new String[] { "", "" };
        ArrayList<String> arraylist_str45 = new ArrayList<>();
        boolean b46 = Collections.addAll(arraylist_str45, str_array44);
        Stream<String> stream_str47 = arraylist_str45.stream();
        String[] str_array50 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str51 = new ArrayList<>();
        boolean b52 = Collections.addAll(arraylist_str51, str_array50);
        String[] str_array55 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str56 = new ArrayList<>();
        boolean b57 = Collections.addAll(arraylist_str56, str_array55);
        Boolean b58 = Tokenization.contains(arraylist_str51, arraylist_str56);
        boolean b59 = arraylist_str45.containsAll(arraylist_str56);
        double d60 = TokenShareRatio.setTokenShareRatioFkLD(arraylist_str38, arraylist_str45);
        Assert.assertNotNull(table_array0);
        Assert.assertTrue(b2 == false);
        Assert.assertNotNull(str_array6);
        Assert.assertTrue(b8 == true);
        Assert.assertNotNull(str_array11);
        Assert.assertTrue(b13 == true);
        Assert.assertTrue("'" + b14 + "' != '" + true + "'", b14.equals(true));
        Assert.assertTrue(b15 == false);
        Assert.assertNotNull(str_array18);
        Assert.assertTrue(b20 == true);
        Assert.assertNotNull(stream_str21);
        Assert.assertNotNull(str_array24);
        Assert.assertTrue(b26 == true);
        Assert.assertNotNull(str_array29);
        Assert.assertTrue(b31 == true);
        Assert.assertTrue("'" + b32 + "' != '" + true + "'", b32.equals(true));
        Assert.assertTrue(b33 == false);
        Assert.assertTrue(b34 == true);
        Assert.assertNotNull(str_array37);
        Assert.assertTrue(b39 == true);
        Assert.assertNotNull(stream_str40);
        Assert.assertEquals(d41, Double.NaN, 0);
        Assert.assertNotNull(str_array44);
        Assert.assertTrue(b46 == true);
        Assert.assertNotNull(stream_str47);
        Assert.assertNotNull(str_array50);
        Assert.assertTrue(b52 == true);
        Assert.assertNotNull(str_array55);
        Assert.assertTrue(b57 == true);
        Assert.assertTrue("'" + b58 + "' != '" + true + "'", b58.equals(true));
        Assert.assertTrue(b59 == false);
        Assert.assertTrue(d60 == 1.0d);
    }

    @Test
    public void test117() throws Throwable {
        try {
            HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (short) 0);
            Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void test118() throws Throwable {
        TextArea textArea0 = null;
        TextAreaAppender textAreaAppender1 = new TextAreaAppender(textArea0);
        Filter filter2 = textAreaAppender1.getFilter();
        Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        Filter filter5 = null;
        textAreaAppender1.setFilter(filter5);
        textAreaAppender1.close();
        Level level8 = textAreaAppender1.getLevel();
        LogRecord logRecord9 = null;
        boolean b10 = textAreaAppender1.isLoggable(logRecord9);
        Assert.assertNull(filter2);
        Assert.assertNotNull(level3);
        Assert.assertNotNull(level8);
        Assert.assertTrue(b10 == false);
    }

    @Test
    public void test119() throws Throwable {
        String[] str_array2 = new String[] { "{}", "hi!" };
        PriorityQueue<String> priorityqueue_str3 = new PriorityQueue<>();
        boolean b4 = Collections.addAll(priorityqueue_str3, str_array2);
        List<String> list_str6 = Tokenization.lowercaseSplit("hi!");
        String[] str_array9 = new String[] { "", "" };
        ArrayList<String> arraylist_str10 = new ArrayList<>();
        boolean b11 = Collections.addAll(arraylist_str10, str_array9);
        Stream<String> stream_str12 = arraylist_str10.stream();
        String[] str_array15 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str16 = new ArrayList<>();
        boolean b17 = Collections.addAll(arraylist_str16, str_array15);
        String[] str_array20 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str21 = new ArrayList<>();
        boolean b22 = Collections.addAll(arraylist_str21, str_array20);
        Boolean b23 = Tokenization.contains(arraylist_str16, arraylist_str21);
        boolean b24 = arraylist_str10.containsAll(arraylist_str21);
        HeapWithFixedSize<String> heapwithfixedsize_str26 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str28 = new HeapWithFixedSize<>((int) (byte) 100);
        int i29 = heapwithfixedsize_str28.size();
        boolean b30 = heapwithfixedsize_str26.retainAll(heapwithfixedsize_str28);
        boolean b31 = arraylist_str21.removeAll(heapwithfixedsize_str28);
        String[] str_array34 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str35 = new ArrayList<>();
        boolean b36 = Collections.addAll(arraylist_str35, str_array34);
        String[] str_array39 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str40 = new ArrayList<>();
        boolean b41 = Collections.addAll(arraylist_str40, str_array39);
        Boolean b42 = Tokenization.contains(arraylist_str35, arraylist_str40);
        boolean b43 = arraylist_str40.isEmpty();
        String[] str_array46 = new String[] { "", "" };
        ArrayList<String> arraylist_str47 = new ArrayList<>();
        boolean b48 = Collections.addAll(arraylist_str47, str_array46);
        Stream<String> stream_str49 = arraylist_str47.stream();
        String[] str_array52 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str53 = new ArrayList<>();
        boolean b54 = Collections.addAll(arraylist_str53, str_array52);
        String[] str_array57 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str58 = new ArrayList<>();
        boolean b59 = Collections.addAll(arraylist_str58, str_array57);
        Boolean b60 = Tokenization.contains(arraylist_str53, arraylist_str58);
        boolean b61 = arraylist_str47.containsAll(arraylist_str58);
        boolean b62 = arraylist_str40.removeAll(arraylist_str58);
        double d63 = TokenShareRatio.setTokenShareRatioFkLD(arraylist_str21, arraylist_str58);
        Boolean b64 = Tokenization.contains(list_str6, arraylist_str58);
        boolean b65 = priorityqueue_str3.contains(list_str6);
        Tpc tpc66 = new Tpc();
        Tpc tpc67 = new Tpc();
        Tpc[] tpc_array68 = new Tpc[] { tpc66, tpc67 };
        try {
            Tpc[] tpc_array69 = priorityqueue_str3.toArray(tpc_array68);
            Assert.fail("Expected exception of type java.lang.ArrayStoreException");
        } catch (ArrayStoreException e) {
        }
        Assert.assertNotNull(str_array2);
        Assert.assertTrue(b4 == true);
        Assert.assertNotNull(list_str6);
        Assert.assertNotNull(str_array9);
        Assert.assertTrue(b11 == true);
        Assert.assertNotNull(stream_str12);
        Assert.assertNotNull(str_array15);
        Assert.assertTrue(b17 == true);
        Assert.assertNotNull(str_array20);
        Assert.assertTrue(b22 == true);
        Assert.assertTrue("'" + b23 + "' != '" + true + "'", b23.equals(true));
        Assert.assertTrue(b24 == false);
        Assert.assertTrue(i29 == 0);
        Assert.assertTrue(b30 == false);
        Assert.assertTrue(b31 == false);
        Assert.assertNotNull(str_array34);
        Assert.assertTrue(b36 == true);
        Assert.assertNotNull(str_array39);
        Assert.assertTrue(b41 == true);
        Assert.assertTrue("'" + b42 + "' != '" + true + "'", b42.equals(true));
        Assert.assertTrue(b43 == false);
        Assert.assertNotNull(str_array46);
        Assert.assertTrue(b48 == true);
        Assert.assertNotNull(stream_str49);
        Assert.assertNotNull(str_array52);
        Assert.assertTrue(b54 == true);
        Assert.assertNotNull(str_array57);
        Assert.assertTrue(b59 == true);
        Assert.assertTrue("'" + b60 + "' != '" + true + "'", b60.equals(true));
        Assert.assertTrue(b61 == false);
        Assert.assertTrue(b62 == true);
        Assert.assertTrue(d63 == 1.0d);
        Assert.assertTrue("'" + b64 + "' != '" + false + "'", b64.equals(false));
        Assert.assertTrue(b65 == false);
        Assert.assertNotNull(tpc_array68);
    }

    @Test
    public void test120() throws Throwable {
        List<String> list_str1 = Tokenization.lowercaseSplit("[hi!, hi!]");
        Assert.assertNotNull(list_str1);
    }

    @Test
    public void test121() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Set<Histogram> set_histogram1 = multiset_histogram0.keySet();
        MultiSet<Histogram> multiset_histogram2 = new MultiSet<>();
        Histogram histogram3 = new Histogram();
        Integer i5 = multiset_histogram2.put(histogram3, 0);
        Histogram histogram6 = new Histogram();
        multiset_histogram2.add(histogram6);
        String[] str_array10 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str11 = new PriorityQueue<>();
        boolean b12 = Collections.addAll(priorityqueue_str11, str_array10);
        boolean b14 = priorityqueue_str11.offer("");
        Integer i15 = multiset_histogram2.remove("");
        MultiSet<Histogram> multiset_histogram16 = new MultiSet<>();
        Histogram histogram17 = new Histogram();
        Integer i19 = multiset_histogram16.put(histogram17, 0);
        Histogram histogram20 = new Histogram();
        multiset_histogram16.add(histogram20);
        Integer i23 = multiset_histogram2.replace(histogram20, 2);
        Integer i25 = multiset_histogram0.getOrDefault(i23, 7);
        MultiSet<Histogram> multiset_histogram26 = new MultiSet<>();
        Histogram histogram27 = new Histogram();
        Integer i29 = multiset_histogram26.put(histogram27, 0);
        Histogram histogram30 = new Histogram();
        multiset_histogram26.add(histogram30);
        String[] str_array34 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str35 = new PriorityQueue<>();
        boolean b36 = Collections.addAll(priorityqueue_str35, str_array34);
        boolean b38 = priorityqueue_str35.offer("");
        Integer i39 = multiset_histogram26.remove("");
        Set<Histogram> set_histogram40 = multiset_histogram26.keySet();
        boolean b41 = multiset_histogram26.isEmpty();
        String str42 = multiset_histogram26.toString();
        MultiSet<Histogram> multiset_histogram43 = new MultiSet<>();
        Histogram histogram44 = new Histogram();
        Integer i46 = multiset_histogram43.put(histogram44, 0);
        Histogram histogram47 = new Histogram();
        multiset_histogram43.add(histogram47);
        String[] str_array51 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str52 = new PriorityQueue<>();
        boolean b53 = Collections.addAll(priorityqueue_str52, str_array51);
        boolean b55 = priorityqueue_str52.offer("");
        Integer i56 = multiset_histogram43.remove("");
        MultiSet<Histogram> multiset_histogram57 = new MultiSet<>();
        Histogram histogram58 = new Histogram();
        Integer i60 = multiset_histogram57.put(histogram58, 0);
        Histogram histogram61 = new Histogram();
        multiset_histogram57.add(histogram61);
        Integer i64 = multiset_histogram43.replace(histogram61, 2);
        DataSourceFactory dataSourceFactory65 = new DataSourceFactory();
        boolean b66 = multiset_histogram43.containsKey(dataSourceFactory65);
        MultiSet<Histogram> multiset_histogram67 = new MultiSet<>();
        Histogram histogram68 = new Histogram();
        Integer i70 = multiset_histogram67.put(histogram68, 0);
        Histogram histogram71 = new Histogram();
        multiset_histogram67.add(histogram71);
        String[] str_array75 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str76 = new PriorityQueue<>();
        boolean b77 = Collections.addAll(priorityqueue_str76, str_array75);
        boolean b79 = priorityqueue_str76.offer("");
        Integer i80 = multiset_histogram67.remove("");
        MultiSet<Histogram> multiset_histogram81 = new MultiSet<>();
        Histogram histogram82 = new Histogram();
        Integer i84 = multiset_histogram81.put(histogram82, 0);
        Histogram histogram85 = new Histogram();
        multiset_histogram81.add(histogram85);
        Integer i88 = multiset_histogram67.replace(histogram85, 2);
        DataSourceFactory dataSourceFactory89 = new DataSourceFactory();
        boolean b90 = multiset_histogram67.containsKey(dataSourceFactory89);
        Histogram histogram91 = new Histogram();
        multiset_histogram67.add(histogram91);
        multiset_histogram43.add(histogram91);
        int i94 = multiset_histogram26.count(histogram91);
        TextArea textArea95 = null;
        TextAreaAppender textAreaAppender96 = new TextAreaAppender(textArea95);
        ErrorManager errorManager97 = textAreaAppender96.getErrorManager();
        boolean b98 = multiset_histogram0.remove(histogram91, textAreaAppender96);
        ErrorManager errorManager99 = textAreaAppender96.getErrorManager();
        Assert.assertNotNull(set_histogram1);
        Assert.assertNull(i5);
        Assert.assertNotNull(str_array10);
        Assert.assertTrue(b12 == true);
        Assert.assertTrue(b14 == true);
        Assert.assertNull(i15);
        Assert.assertNull(i19);
        Assert.assertNull(i23);
        Assert.assertTrue("'" + i25 + "' != '" + 7 + "'", i25.equals(7));
        Assert.assertNull(i29);
        Assert.assertNotNull(str_array34);
        Assert.assertTrue(b36 == true);
        Assert.assertTrue(b38 == true);
        Assert.assertNull(i39);
        Assert.assertNotNull(set_histogram40);
        Assert.assertTrue(b41 == false);
        Assert.assertNull(i46);
        Assert.assertNotNull(str_array51);
        Assert.assertTrue(b53 == true);
        Assert.assertTrue(b55 == true);
        Assert.assertNull(i56);
        Assert.assertNull(i60);
        Assert.assertNull(i64);
        Assert.assertTrue(b66 == false);
        Assert.assertNull(i70);
        Assert.assertNotNull(str_array75);
        Assert.assertTrue(b77 == true);
        Assert.assertTrue(b79 == true);
        Assert.assertNull(i80);
        Assert.assertNull(i84);
        Assert.assertNull(i88);
        Assert.assertTrue(b90 == false);
        Assert.assertTrue(i94 == 0);
        Assert.assertNotNull(errorManager97);
        Assert.assertTrue(b98 == false);
        Assert.assertNotNull(errorManager99);
    }

    @Test
    public void test122() throws Throwable {
        String[] str_array2 = new String[] { "", "" };
        ArrayList<String> arraylist_str3 = new ArrayList<>();
        boolean b4 = Collections.addAll(arraylist_str3, str_array2);
        Stream<String> stream_str5 = arraylist_str3.stream();
        String[] str_array8 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str9 = new ArrayList<>();
        boolean b10 = Collections.addAll(arraylist_str9, str_array8);
        String[] str_array13 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str14 = new ArrayList<>();
        boolean b15 = Collections.addAll(arraylist_str14, str_array13);
        Boolean b16 = Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        HeapWithFixedSize<String> heapwithfixedsize_str19 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str21 = new HeapWithFixedSize<>((int) (byte) 100);
        int i22 = heapwithfixedsize_str21.size();
        boolean b23 = heapwithfixedsize_str19.retainAll(heapwithfixedsize_str21);
        boolean b24 = arraylist_str14.removeAll(heapwithfixedsize_str21);
        Iterator<String> iterator_str25 = heapwithfixedsize_str21.iterator();
        String str26 = heapwithfixedsize_str21.poll();
        Iterator<String> iterator_str27 = heapwithfixedsize_str21.iterator();
        Assert.assertNotNull(str_array2);
        Assert.assertTrue(b4 == true);
        Assert.assertNotNull(stream_str5);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertNotNull(str_array13);
        Assert.assertTrue(b15 == true);
        Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        Assert.assertTrue(b17 == false);
        Assert.assertTrue(i22 == 0);
        Assert.assertTrue(b23 == false);
        Assert.assertTrue(b24 == false);
        Assert.assertNotNull(iterator_str25);
        Assert.assertNull(str26);
        Assert.assertNotNull(iterator_str27);
    }

    @Test
    public void test123() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Set<Histogram> set_histogram1 = multiset_histogram0.keySet();
        String str2 = multiset_histogram0.toString();
        boolean b5 = multiset_histogram0.remove(100.0d, 100);
        int i6 = multiset_histogram0.totalCount();
        multiset_histogram0.clear();
        Assert.assertNotNull(set_histogram1);
        Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        Assert.assertTrue(b5 == false);
        Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test124() throws Throwable {
        TextArea textArea0 = null;
        TextAreaAppender textAreaAppender1 = new TextAreaAppender(textArea0);
        Filter filter2 = textAreaAppender1.getFilter();
        Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        Formatter formatter5 = textAreaAppender1.getFormatter();
        Filter filter6 = null;
        textAreaAppender1.setFilter(filter6);
        textAreaAppender1.flush();
        textAreaAppender1.flush();
        String str10 = textAreaAppender1.getEncoding();
        Assert.assertNull(filter2);
        Assert.assertNotNull(level3);
        Assert.assertNotNull(formatter5);
        Assert.assertNull(str10);
    }

    @Test
    public void test125() throws Throwable {
        List<String> list_str1 = Tokenization.split("{}");
        Assert.assertNotNull(list_str1);
    }

    @Test
    public void test126() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (byte) 100);
        String[] str_array4 = new String[] { "", "" };
        ArrayList<String> arraylist_str5 = new ArrayList<>();
        boolean b6 = Collections.addAll(arraylist_str5, str_array4);
        Stream<String> stream_str7 = arraylist_str5.stream();
        Stream<String> stream_str8 = arraylist_str5.parallelStream();
        String[] str_array11 = new String[] { "", "" };
        ArrayList<String> arraylist_str12 = new ArrayList<>();
        boolean b13 = Collections.addAll(arraylist_str12, str_array11);
        Stream<String> stream_str14 = arraylist_str12.stream();
        String[] str_array17 = new String[] { "", "" };
        ArrayList<String> arraylist_str18 = new ArrayList<>();
        boolean b19 = Collections.addAll(arraylist_str18, str_array17);
        Stream<String> stream_str20 = arraylist_str18.stream();
        Stream<String> stream_str21 = arraylist_str18.parallelStream();
        String[] str_array24 = new String[] { "", "" };
        ArrayList<String> arraylist_str25 = new ArrayList<>();
        boolean b26 = Collections.addAll(arraylist_str25, str_array24);
        Stream<String> stream_str27 = arraylist_str25.stream();
        Stream<String> stream_str28 = arraylist_str25.parallelStream();
        String[] str_array31 = new String[] { "", "" };
        ArrayList<String> arraylist_str32 = new ArrayList<>();
        boolean b33 = Collections.addAll(arraylist_str32, str_array31);
        Stream<String> stream_str34 = arraylist_str32.stream();
        String[] str_array37 = new String[] { "", "" };
        ArrayList<String> arraylist_str38 = new ArrayList<>();
        boolean b39 = Collections.addAll(arraylist_str38, str_array37);
        Stream<String> stream_str40 = arraylist_str38.stream();
        Stream<String> stream_str41 = arraylist_str38.parallelStream();
        Stream[] stream_array43 = new Stream[6];
        @SuppressWarnings("unchecked") Stream<String>[] stream_str_array44 = (Stream<String>[]) stream_array43;
        stream_str_array44[0] = stream_str8;
        stream_str_array44[1] = stream_str14;
        stream_str_array44[2] = stream_str21;
        stream_str_array44[3] = stream_str28;
        stream_str_array44[4] = stream_str34;
        stream_str_array44[5] = stream_str41;
        Stream<String>[] stream_str_array57 = heapwithfixedsize_str1.toArray(stream_str_array44);
        HeapWithFixedSize<String> heapwithfixedsize_str59 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str61 = new HeapWithFixedSize<>((int) (byte) 100);
        int i62 = heapwithfixedsize_str61.size();
        boolean b63 = heapwithfixedsize_str59.retainAll(heapwithfixedsize_str61);
        boolean b64 = heapwithfixedsize_str1.containsAll(heapwithfixedsize_str59);
        String str65 = heapwithfixedsize_str1.peek();
        String str66 = heapwithfixedsize_str1.poll();
        Stream<String> stream_str67 = heapwithfixedsize_str1.parallelStream();
        Assert.assertNotNull(str_array4);
        Assert.assertTrue(b6 == true);
        Assert.assertNotNull(stream_str7);
        Assert.assertNotNull(stream_str8);
        Assert.assertNotNull(str_array11);
        Assert.assertTrue(b13 == true);
        Assert.assertNotNull(stream_str14);
        Assert.assertNotNull(str_array17);
        Assert.assertTrue(b19 == true);
        Assert.assertNotNull(stream_str20);
        Assert.assertNotNull(stream_str21);
        Assert.assertNotNull(str_array24);
        Assert.assertTrue(b26 == true);
        Assert.assertNotNull(stream_str27);
        Assert.assertNotNull(stream_str28);
        Assert.assertNotNull(str_array31);
        Assert.assertTrue(b33 == true);
        Assert.assertNotNull(stream_str34);
        Assert.assertNotNull(str_array37);
        Assert.assertTrue(b39 == true);
        Assert.assertNotNull(stream_str40);
        Assert.assertNotNull(stream_str41);
        Assert.assertNotNull(stream_array43);
        Assert.assertNotNull(stream_str_array44);
        Assert.assertNotNull(stream_str_array57);
        Assert.assertTrue(i62 == 0);
        Assert.assertTrue(b63 == false);
        Assert.assertTrue(b64 == true);
        Assert.assertNull(str65);
        Assert.assertNull(str66);
        Assert.assertNotNull(stream_str67);
    }

    @Test
    public void test127() throws Throwable {
        Levenshtein levenshtein0 = new Levenshtein();
    }

    @Test
    public void test128() throws Throwable {
        String[] str_array2 = new String[] { "", "" };
        ArrayList<String> arraylist_str3 = new ArrayList<>();
        boolean b4 = Collections.addAll(arraylist_str3, str_array2);
        Stream<String> stream_str5 = arraylist_str3.stream();
        String[] str_array8 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str9 = new ArrayList<>();
        boolean b10 = Collections.addAll(arraylist_str9, str_array8);
        String[] str_array13 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str14 = new ArrayList<>();
        boolean b15 = Collections.addAll(arraylist_str14, str_array13);
        Boolean b16 = Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        HeapWithFixedSize<String> heapwithfixedsize_str19 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str21 = new HeapWithFixedSize<>((int) (byte) 100);
        int i22 = heapwithfixedsize_str21.size();
        boolean b23 = heapwithfixedsize_str19.retainAll(heapwithfixedsize_str21);
        boolean b24 = arraylist_str14.removeAll(heapwithfixedsize_str21);
        String str25 = heapwithfixedsize_str21.poll();
        MultiSet<Histogram> multiset_histogram26 = new MultiSet<>();
        String[] str_array29 = new String[] { "", "" };
        ArrayList<String> arraylist_str30 = new ArrayList<>();
        boolean b31 = Collections.addAll(arraylist_str30, str_array29);
        Stream<String> stream_str32 = arraylist_str30.stream();
        String[] str_array35 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str36 = new ArrayList<>();
        boolean b37 = Collections.addAll(arraylist_str36, str_array35);
        String[] str_array40 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str41 = new ArrayList<>();
        boolean b42 = Collections.addAll(arraylist_str41, str_array40);
        Boolean b43 = Tokenization.contains(arraylist_str36, arraylist_str41);
        boolean b44 = arraylist_str30.containsAll(arraylist_str41);
        String[] str_array47 = new String[] { "", "" };
        ArrayList<String> arraylist_str48 = new ArrayList<>();
        boolean b49 = Collections.addAll(arraylist_str48, str_array47);
        Stream<String> stream_str50 = arraylist_str48.stream();
        String[] str_array53 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str54 = new ArrayList<>();
        boolean b55 = Collections.addAll(arraylist_str54, str_array53);
        String[] str_array58 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str59 = new ArrayList<>();
        boolean b60 = Collections.addAll(arraylist_str59, str_array58);
        Boolean b61 = Tokenization.contains(arraylist_str54, arraylist_str59);
        boolean b62 = arraylist_str48.containsAll(arraylist_str59);
        double d63 = TokenShareRatio.setTokenShareRatioFkLD(arraylist_str30, arraylist_str48);
        boolean b64 = arraylist_str48.isEmpty();
        Integer i66 = multiset_histogram26.getOrDefault(b64, 3);
        Set<Histogram> set_histogram67 = multiset_histogram26.keySet();
        boolean b68 = heapwithfixedsize_str21.contains(set_histogram67);
        Assert.assertNotNull(str_array2);
        Assert.assertTrue(b4 == true);
        Assert.assertNotNull(stream_str5);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertNotNull(str_array13);
        Assert.assertTrue(b15 == true);
        Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        Assert.assertTrue(b17 == false);
        Assert.assertTrue(i22 == 0);
        Assert.assertTrue(b23 == false);
        Assert.assertTrue(b24 == false);
        Assert.assertNull(str25);
        Assert.assertNotNull(str_array29);
        Assert.assertTrue(b31 == true);
        Assert.assertNotNull(stream_str32);
        Assert.assertNotNull(str_array35);
        Assert.assertTrue(b37 == true);
        Assert.assertNotNull(str_array40);
        Assert.assertTrue(b42 == true);
        Assert.assertTrue("'" + b43 + "' != '" + true + "'", b43.equals(true));
        Assert.assertTrue(b44 == false);
        Assert.assertNotNull(str_array47);
        Assert.assertTrue(b49 == true);
        Assert.assertNotNull(stream_str50);
        Assert.assertNotNull(str_array53);
        Assert.assertTrue(b55 == true);
        Assert.assertNotNull(str_array58);
        Assert.assertTrue(b60 == true);
        Assert.assertTrue("'" + b61 + "' != '" + true + "'", b61.equals(true));
        Assert.assertTrue(b62 == false);
        Assert.assertTrue(d63 == 1.0d);
        Assert.assertTrue(b64 == false);
        Assert.assertTrue("'" + i66 + "' != '" + 3 + "'", i66.equals(3));
        Assert.assertNotNull(set_histogram67);
        Assert.assertTrue(b68 == false);
    }

    @Test
    public void test129() throws Throwable {
        TextArea textArea0 = null;
        TextAreaAppender textAreaAppender1 = new TextAreaAppender(textArea0);
        Filter filter2 = textAreaAppender1.getFilter();
        Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        Formatter formatter5 = textAreaAppender1.getFormatter();
        Filter filter6 = null;
        textAreaAppender1.setFilter(filter6);
        Filter filter8 = textAreaAppender1.getFilter();
        TextArea textArea9 = null;
        TextAreaAppender textAreaAppender10 = new TextAreaAppender(textArea9);
        Filter filter11 = textAreaAppender10.getFilter();
        Level level12 = textAreaAppender10.getLevel();
        textAreaAppender10.flush();
        Formatter formatter14 = textAreaAppender10.getFormatter();
        textAreaAppender1.setFormatter(formatter14);
        Assert.assertNull(filter2);
        Assert.assertNotNull(level3);
        Assert.assertNotNull(formatter5);
        Assert.assertNull(filter8);
        Assert.assertNull(filter11);
        Assert.assertNotNull(level12);
        Assert.assertNotNull(formatter14);
    }

    @Test
    public void test130() throws Throwable {
        String[] str_array2 = new String[] { "", "" };
        ArrayList<String> arraylist_str3 = new ArrayList<>();
        boolean b4 = Collections.addAll(arraylist_str3, str_array2);
        Stream<String> stream_str5 = arraylist_str3.stream();
        HeapWithFixedSize<String> heapwithfixedsize_str7 = new HeapWithFixedSize<>((int) (byte) 100);
        String[] str_array10 = new String[] { "", "" };
        ArrayList<String> arraylist_str11 = new ArrayList<>();
        boolean b12 = Collections.addAll(arraylist_str11, str_array10);
        Stream<String> stream_str13 = arraylist_str11.stream();
        Stream<String> stream_str14 = arraylist_str11.parallelStream();
        String[] str_array17 = new String[] { "", "" };
        ArrayList<String> arraylist_str18 = new ArrayList<>();
        boolean b19 = Collections.addAll(arraylist_str18, str_array17);
        Stream<String> stream_str20 = arraylist_str18.stream();
        String[] str_array23 = new String[] { "", "" };
        ArrayList<String> arraylist_str24 = new ArrayList<>();
        boolean b25 = Collections.addAll(arraylist_str24, str_array23);
        Stream<String> stream_str26 = arraylist_str24.stream();
        Stream<String> stream_str27 = arraylist_str24.parallelStream();
        String[] str_array30 = new String[] { "", "" };
        ArrayList<String> arraylist_str31 = new ArrayList<>();
        boolean b32 = Collections.addAll(arraylist_str31, str_array30);
        Stream<String> stream_str33 = arraylist_str31.stream();
        Stream<String> stream_str34 = arraylist_str31.parallelStream();
        String[] str_array37 = new String[] { "", "" };
        ArrayList<String> arraylist_str38 = new ArrayList<>();
        boolean b39 = Collections.addAll(arraylist_str38, str_array37);
        Stream<String> stream_str40 = arraylist_str38.stream();
        String[] str_array43 = new String[] { "", "" };
        ArrayList<String> arraylist_str44 = new ArrayList<>();
        boolean b45 = Collections.addAll(arraylist_str44, str_array43);
        Stream<String> stream_str46 = arraylist_str44.stream();
        Stream<String> stream_str47 = arraylist_str44.parallelStream();
        Stream[] stream_array49 = new Stream[6];
        @SuppressWarnings("unchecked") Stream<String>[] stream_str_array50 = (Stream<String>[]) stream_array49;
        stream_str_array50[0] = stream_str14;
        stream_str_array50[1] = stream_str20;
        stream_str_array50[2] = stream_str27;
        stream_str_array50[3] = stream_str34;
        stream_str_array50[4] = stream_str40;
        stream_str_array50[5] = stream_str47;
        Stream<String>[] stream_str_array63 = heapwithfixedsize_str7.toArray(stream_str_array50);
        Iterator<String> iterator_str64 = heapwithfixedsize_str7.iterator();
        boolean b66 = heapwithfixedsize_str7.offer("hi!");
        int i67 = heapwithfixedsize_str7.size();
        String str68 = heapwithfixedsize_str7.poll();
        boolean b69 = arraylist_str3.containsAll(heapwithfixedsize_str7);
        Assert.assertNotNull(str_array2);
        Assert.assertTrue(b4 == true);
        Assert.assertNotNull(stream_str5);
        Assert.assertNotNull(str_array10);
        Assert.assertTrue(b12 == true);
        Assert.assertNotNull(stream_str13);
        Assert.assertNotNull(stream_str14);
        Assert.assertNotNull(str_array17);
        Assert.assertTrue(b19 == true);
        Assert.assertNotNull(stream_str20);
        Assert.assertNotNull(str_array23);
        Assert.assertTrue(b25 == true);
        Assert.assertNotNull(stream_str26);
        Assert.assertNotNull(stream_str27);
        Assert.assertNotNull(str_array30);
        Assert.assertTrue(b32 == true);
        Assert.assertNotNull(stream_str33);
        Assert.assertNotNull(stream_str34);
        Assert.assertNotNull(str_array37);
        Assert.assertTrue(b39 == true);
        Assert.assertNotNull(stream_str40);
        Assert.assertNotNull(str_array43);
        Assert.assertTrue(b45 == true);
        Assert.assertNotNull(stream_str46);
        Assert.assertNotNull(stream_str47);
        Assert.assertNotNull(stream_array49);
        Assert.assertNotNull(stream_str_array50);
        Assert.assertNotNull(stream_str_array63);
        Assert.assertNotNull(iterator_str64);
        Assert.assertTrue(b66 == true);
        Assert.assertTrue(i67 == 1);
        Assert.assertTrue("'" + str68 + "' != '" + "hi!" + "'", str68.equals("hi!"));
        Assert.assertTrue(b69 == true);
    }

    @Test
    public void test131() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        MultiSet<Histogram> multiset_histogram14 = new MultiSet<>();
        Histogram histogram15 = new Histogram();
        Integer i17 = multiset_histogram14.put(histogram15, 0);
        Histogram histogram18 = new Histogram();
        multiset_histogram14.add(histogram18);
        Integer i21 = multiset_histogram0.replace(histogram18, 2);
        DataSourceFactory dataSourceFactory22 = new DataSourceFactory();
        boolean b23 = multiset_histogram0.containsKey(dataSourceFactory22);
        MultiSet<Histogram> multiset_histogram24 = new MultiSet<>();
        Histogram histogram25 = new Histogram();
        Integer i27 = multiset_histogram24.put(histogram25, 0);
        Histogram histogram28 = new Histogram();
        multiset_histogram24.add(histogram28);
        String[] str_array32 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str33 = new PriorityQueue<>();
        boolean b34 = Collections.addAll(priorityqueue_str33, str_array32);
        boolean b36 = priorityqueue_str33.offer("");
        Integer i37 = multiset_histogram24.remove("");
        MultiSet<Histogram> multiset_histogram38 = new MultiSet<>();
        Histogram histogram39 = new Histogram();
        Integer i41 = multiset_histogram38.put(histogram39, 0);
        Histogram histogram42 = new Histogram();
        multiset_histogram38.add(histogram42);
        Integer i45 = multiset_histogram24.replace(histogram42, 2);
        DataSourceFactory dataSourceFactory46 = new DataSourceFactory();
        boolean b47 = multiset_histogram24.containsKey(dataSourceFactory46);
        Histogram histogram48 = new Histogram();
        multiset_histogram24.add(histogram48);
        multiset_histogram0.add(histogram48);
        MultiSet<Histogram> multiset_histogram51 = new MultiSet<>();
        Histogram histogram52 = new Histogram();
        Integer i54 = multiset_histogram51.put(histogram52, 0);
        Histogram histogram55 = new Histogram();
        multiset_histogram51.add(histogram55);
        String[] str_array59 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str60 = new PriorityQueue<>();
        boolean b61 = Collections.addAll(priorityqueue_str60, str_array59);
        boolean b63 = priorityqueue_str60.offer("");
        Integer i64 = multiset_histogram51.remove("");
        MultiSet<Histogram> multiset_histogram65 = new MultiSet<>();
        Histogram histogram66 = new Histogram();
        Integer i68 = multiset_histogram65.put(histogram66, 0);
        Histogram histogram69 = new Histogram();
        multiset_histogram65.add(histogram69);
        Integer i72 = multiset_histogram51.replace(histogram69, 2);
        MultiSet<Histogram> multiset_histogram73 = new MultiSet<>();
        Histogram histogram74 = new Histogram();
        Integer i76 = multiset_histogram73.put(histogram74, 0);
        Histogram histogram77 = new Histogram();
        multiset_histogram73.add(histogram77);
        String[] str_array81 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str82 = new PriorityQueue<>();
        boolean b83 = Collections.addAll(priorityqueue_str82, str_array81);
        boolean b85 = priorityqueue_str82.offer("");
        Integer i86 = multiset_histogram73.remove("");
        Set<Histogram> set_histogram87 = multiset_histogram73.keySet();
        MultiSet<Histogram> multiset_histogram88 = new MultiSet<>();
        Histogram histogram89 = new Histogram();
        Integer i91 = multiset_histogram88.put(histogram89, 0);
        Histogram histogram92 = new Histogram();
        multiset_histogram88.add(histogram92);
        int i94 = multiset_histogram73.count(histogram92);
        int i95 = multiset_histogram51.count(histogram92);
        Object obj96 = multiset_histogram51.clone();
        multiset_histogram0.putAll(multiset_histogram51);
        multiset_histogram51.clear();
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNull(i17);
        Assert.assertNull(i21);
        Assert.assertTrue(b23 == false);
        Assert.assertNull(i27);
        Assert.assertNotNull(str_array32);
        Assert.assertTrue(b34 == true);
        Assert.assertTrue(b36 == true);
        Assert.assertNull(i37);
        Assert.assertNull(i41);
        Assert.assertNull(i45);
        Assert.assertTrue(b47 == false);
        Assert.assertNull(i54);
        Assert.assertNotNull(str_array59);
        Assert.assertTrue(b61 == true);
        Assert.assertTrue(b63 == true);
        Assert.assertNull(i64);
        Assert.assertNull(i68);
        Assert.assertNull(i72);
        Assert.assertNull(i76);
        Assert.assertNotNull(str_array81);
        Assert.assertTrue(b83 == true);
        Assert.assertTrue(b85 == true);
        Assert.assertNull(i86);
        Assert.assertNotNull(set_histogram87);
        Assert.assertNull(i91);
        Assert.assertTrue(i94 == 0);
        Assert.assertTrue(i95 == 0);
        Assert.assertNotNull(obj96);
    }

    @Test
    public void test132() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (byte) 100);
        int i2 = heapwithfixedsize_str1.size();
        Stream<String> stream_str3 = heapwithfixedsize_str1.parallelStream();
        Assert.assertTrue(i2 == 0);
        Assert.assertNotNull(stream_str3);
    }

    @Test
    public void test133() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        Set<Histogram> set_histogram14 = multiset_histogram0.keySet();
        boolean b15 = multiset_histogram0.isEmpty();
        String str16 = multiset_histogram0.toString();
        PrefixSelectionCustomizer prefixSelectionCustomizer17 = new PrefixSelectionCustomizer();
        Integer i18 = multiset_histogram0.get(prefixSelectionCustomizer17);
        Histogram histogram19 = null;
        int i20 = multiset_histogram0.count(histogram19);
        Collection<Integer> collection_i21 = multiset_histogram0.values();
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNotNull(set_histogram14);
        Assert.assertTrue(b15 == false);
        Assert.assertNull(i18);
        Assert.assertTrue(i20 == 0);
        Assert.assertNotNull(collection_i21);
    }

    @Test
    public void test134() throws Throwable {
        Table[] table_array0 = new Table[] {};
        ArrayList<Table> arraylist_table1 = new ArrayList<>();
        boolean b2 = Collections.addAll(arraylist_table1, table_array0);
        Chen chen3 = new Chen(arraylist_table1);
        String[] str_array6 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str7 = new ArrayList<>();
        boolean b8 = Collections.addAll(arraylist_str7, str_array6);
        String[] str_array11 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str12 = new ArrayList<>();
        boolean b13 = Collections.addAll(arraylist_str12, str_array11);
        Boolean b14 = Tokenization.contains(arraylist_str7, arraylist_str12);
        boolean b15 = arraylist_str12.isEmpty();
        String[] str_array18 = new String[] { "", "" };
        ArrayList<String> arraylist_str19 = new ArrayList<>();
        boolean b20 = Collections.addAll(arraylist_str19, str_array18);
        Stream<String> stream_str21 = arraylist_str19.stream();
        String[] str_array24 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str25 = new ArrayList<>();
        boolean b26 = Collections.addAll(arraylist_str25, str_array24);
        String[] str_array29 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str30 = new ArrayList<>();
        boolean b31 = Collections.addAll(arraylist_str30, str_array29);
        Boolean b32 = Tokenization.contains(arraylist_str25, arraylist_str30);
        boolean b33 = arraylist_str19.containsAll(arraylist_str30);
        boolean b34 = arraylist_str12.removeAll(arraylist_str30);
        String[] str_array37 = new String[] { "", "" };
        ArrayList<String> arraylist_str38 = new ArrayList<>();
        boolean b39 = Collections.addAll(arraylist_str38, str_array37);
        Stream<String> stream_str40 = arraylist_str38.stream();
        double d41 = chen3.getTableChenSimilarity(arraylist_str30, arraylist_str38);
        Stream<String> stream_str42 = arraylist_str38.stream();
        boolean b43 = arraylist_str38.isEmpty();
        boolean b44 = arraylist_str38.isEmpty();
        Assert.assertNotNull(table_array0);
        Assert.assertTrue(b2 == false);
        Assert.assertNotNull(str_array6);
        Assert.assertTrue(b8 == true);
        Assert.assertNotNull(str_array11);
        Assert.assertTrue(b13 == true);
        Assert.assertTrue("'" + b14 + "' != '" + true + "'", b14.equals(true));
        Assert.assertTrue(b15 == false);
        Assert.assertNotNull(str_array18);
        Assert.assertTrue(b20 == true);
        Assert.assertNotNull(stream_str21);
        Assert.assertNotNull(str_array24);
        Assert.assertTrue(b26 == true);
        Assert.assertNotNull(str_array29);
        Assert.assertTrue(b31 == true);
        Assert.assertTrue("'" + b32 + "' != '" + true + "'", b32.equals(true));
        Assert.assertTrue(b33 == false);
        Assert.assertTrue(b34 == true);
        Assert.assertNotNull(str_array37);
        Assert.assertTrue(b39 == true);
        Assert.assertNotNull(stream_str40);
        Assert.assertEquals(d41, Double.NaN, 0);
        Assert.assertNotNull(stream_str42);
        Assert.assertTrue(b43 == false);
        Assert.assertTrue(b44 == false);
    }

    @Test
    public void test135() throws Throwable {
        String[] str_array2 = new String[] { "", "" };
        PriorityQueue<String> priorityqueue_str3 = new PriorityQueue<>();
        boolean b4 = Collections.addAll(priorityqueue_str3, str_array2);
        int i5 = priorityqueue_str3.size();
        HeapWithFixedSize<String> heapwithfixedsize_str7 = new HeapWithFixedSize<>((int) (byte) 100);
        String[] str_array10 = new String[] { "", "" };
        ArrayList<String> arraylist_str11 = new ArrayList<>();
        boolean b12 = Collections.addAll(arraylist_str11, str_array10);
        Stream<String> stream_str13 = arraylist_str11.stream();
        Stream<String> stream_str14 = arraylist_str11.parallelStream();
        String[] str_array17 = new String[] { "", "" };
        ArrayList<String> arraylist_str18 = new ArrayList<>();
        boolean b19 = Collections.addAll(arraylist_str18, str_array17);
        Stream<String> stream_str20 = arraylist_str18.stream();
        String[] str_array23 = new String[] { "", "" };
        ArrayList<String> arraylist_str24 = new ArrayList<>();
        boolean b25 = Collections.addAll(arraylist_str24, str_array23);
        Stream<String> stream_str26 = arraylist_str24.stream();
        Stream<String> stream_str27 = arraylist_str24.parallelStream();
        String[] str_array30 = new String[] { "", "" };
        ArrayList<String> arraylist_str31 = new ArrayList<>();
        boolean b32 = Collections.addAll(arraylist_str31, str_array30);
        Stream<String> stream_str33 = arraylist_str31.stream();
        Stream<String> stream_str34 = arraylist_str31.parallelStream();
        String[] str_array37 = new String[] { "", "" };
        ArrayList<String> arraylist_str38 = new ArrayList<>();
        boolean b39 = Collections.addAll(arraylist_str38, str_array37);
        Stream<String> stream_str40 = arraylist_str38.stream();
        String[] str_array43 = new String[] { "", "" };
        ArrayList<String> arraylist_str44 = new ArrayList<>();
        boolean b45 = Collections.addAll(arraylist_str44, str_array43);
        Stream<String> stream_str46 = arraylist_str44.stream();
        Stream<String> stream_str47 = arraylist_str44.parallelStream();
        Stream[] stream_array49 = new Stream[6];
        @SuppressWarnings("unchecked") Stream<String>[] stream_str_array50 = (Stream<String>[]) stream_array49;
        stream_str_array50[0] = stream_str14;
        stream_str_array50[1] = stream_str20;
        stream_str_array50[2] = stream_str27;
        stream_str_array50[3] = stream_str34;
        stream_str_array50[4] = stream_str40;
        stream_str_array50[5] = stream_str47;
        Stream<String>[] stream_str_array63 = heapwithfixedsize_str7.toArray(stream_str_array50);
        boolean b65 = heapwithfixedsize_str7.add("");
        boolean b67 = heapwithfixedsize_str7.contains(0L);
        Comparator<? super String> comparator_wildcard68 = heapwithfixedsize_str7.comparator();
        boolean b69 = priorityqueue_str3.remove(heapwithfixedsize_str7);
        Assert.assertNotNull(str_array2);
        Assert.assertTrue(b4 == true);
        Assert.assertTrue(i5 == 2);
        Assert.assertNotNull(str_array10);
        Assert.assertTrue(b12 == true);
        Assert.assertNotNull(stream_str13);
        Assert.assertNotNull(stream_str14);
        Assert.assertNotNull(str_array17);
        Assert.assertTrue(b19 == true);
        Assert.assertNotNull(stream_str20);
        Assert.assertNotNull(str_array23);
        Assert.assertTrue(b25 == true);
        Assert.assertNotNull(stream_str26);
        Assert.assertNotNull(stream_str27);
        Assert.assertNotNull(str_array30);
        Assert.assertTrue(b32 == true);
        Assert.assertNotNull(stream_str33);
        Assert.assertNotNull(stream_str34);
        Assert.assertNotNull(str_array37);
        Assert.assertTrue(b39 == true);
        Assert.assertNotNull(stream_str40);
        Assert.assertNotNull(str_array43);
        Assert.assertTrue(b45 == true);
        Assert.assertNotNull(stream_str46);
        Assert.assertNotNull(stream_str47);
        Assert.assertNotNull(stream_array49);
        Assert.assertNotNull(stream_str_array50);
        Assert.assertNotNull(stream_str_array63);
        Assert.assertTrue(b65 == true);
        Assert.assertTrue(b67 == false);
        Assert.assertNotNull(comparator_wildcard68);
        Assert.assertTrue(b69 == false);
    }

    @Test
    public void test136() throws Throwable {
        String[] str_array2 = new String[] { "", "" };
        ArrayList<String> arraylist_str3 = new ArrayList<>();
        boolean b4 = Collections.addAll(arraylist_str3, str_array2);
        Stream<String> stream_str5 = arraylist_str3.stream();
        String[] str_array8 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str9 = new ArrayList<>();
        boolean b10 = Collections.addAll(arraylist_str9, str_array8);
        String[] str_array13 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str14 = new ArrayList<>();
        boolean b15 = Collections.addAll(arraylist_str14, str_array13);
        Boolean b16 = Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        HeapWithFixedSize<String> heapwithfixedsize_str19 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str21 = new HeapWithFixedSize<>((int) (byte) 100);
        int i22 = heapwithfixedsize_str21.size();
        boolean b23 = heapwithfixedsize_str19.retainAll(heapwithfixedsize_str21);
        boolean b24 = arraylist_str14.removeAll(heapwithfixedsize_str21);
        String str25 = heapwithfixedsize_str21.poll();
        List<String> list_str27 = Tokenization.split("");
        boolean b28 = heapwithfixedsize_str21.removeAll(list_str27);
        Comparator<? super String> comparator_wildcard29 = heapwithfixedsize_str21.comparator();
        Assert.assertNotNull(str_array2);
        Assert.assertTrue(b4 == true);
        Assert.assertNotNull(stream_str5);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertNotNull(str_array13);
        Assert.assertTrue(b15 == true);
        Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        Assert.assertTrue(b17 == false);
        Assert.assertTrue(i22 == 0);
        Assert.assertTrue(b23 == false);
        Assert.assertTrue(b24 == false);
        Assert.assertNull(str25);
        Assert.assertNotNull(list_str27);
        Assert.assertTrue(b28 == false);
        Assert.assertNotNull(comparator_wildcard29);
    }

    @Test
    public void test137() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        String[] str_array3 = new String[] { "", "" };
        ArrayList<String> arraylist_str4 = new ArrayList<>();
        boolean b5 = Collections.addAll(arraylist_str4, str_array3);
        Stream<String> stream_str6 = arraylist_str4.stream();
        String[] str_array9 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str10 = new ArrayList<>();
        boolean b11 = Collections.addAll(arraylist_str10, str_array9);
        String[] str_array14 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str15 = new ArrayList<>();
        boolean b16 = Collections.addAll(arraylist_str15, str_array14);
        Boolean b17 = Tokenization.contains(arraylist_str10, arraylist_str15);
        boolean b18 = arraylist_str4.containsAll(arraylist_str15);
        String[] str_array21 = new String[] { "", "" };
        ArrayList<String> arraylist_str22 = new ArrayList<>();
        boolean b23 = Collections.addAll(arraylist_str22, str_array21);
        Stream<String> stream_str24 = arraylist_str22.stream();
        String[] str_array27 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str28 = new ArrayList<>();
        boolean b29 = Collections.addAll(arraylist_str28, str_array27);
        String[] str_array32 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str33 = new ArrayList<>();
        boolean b34 = Collections.addAll(arraylist_str33, str_array32);
        Boolean b35 = Tokenization.contains(arraylist_str28, arraylist_str33);
        boolean b36 = arraylist_str22.containsAll(arraylist_str33);
        double d37 = TokenShareRatio.setTokenShareRatioFkLD(arraylist_str4, arraylist_str22);
        boolean b38 = arraylist_str22.isEmpty();
        Integer i40 = multiset_histogram0.getOrDefault(b38, 3);
        Set<Histogram> set_histogram41 = multiset_histogram0.keySet();
        boolean b42 = multiset_histogram0.isEmpty();
        Assert.assertNotNull(str_array3);
        Assert.assertTrue(b5 == true);
        Assert.assertNotNull(stream_str6);
        Assert.assertNotNull(str_array9);
        Assert.assertTrue(b11 == true);
        Assert.assertNotNull(str_array14);
        Assert.assertTrue(b16 == true);
        Assert.assertTrue("'" + b17 + "' != '" + true + "'", b17.equals(true));
        Assert.assertTrue(b18 == false);
        Assert.assertNotNull(str_array21);
        Assert.assertTrue(b23 == true);
        Assert.assertNotNull(stream_str24);
        Assert.assertNotNull(str_array27);
        Assert.assertTrue(b29 == true);
        Assert.assertNotNull(str_array32);
        Assert.assertTrue(b34 == true);
        Assert.assertTrue("'" + b35 + "' != '" + true + "'", b35.equals(true));
        Assert.assertTrue(b36 == false);
        Assert.assertTrue(d37 == 1.0d);
        Assert.assertTrue(b38 == false);
        Assert.assertTrue("'" + i40 + "' != '" + 3 + "'", i40.equals(3));
        Assert.assertNotNull(set_histogram41);
        Assert.assertTrue(b42 == true);
    }

    @Test
    public void test138() throws Throwable {
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double[] d_array14 = new double[] { (byte) 1, (short) 1 };
        double[] d_array17 = Histogram.rel2abs(d_array14, (double) 100.0f, (double) ' ');
        double d19 = Logistic.classify(d_array11, d_array17, (double) 100.0f);
        Double d20 = Histogram.jaccard(d_array5, d_array11);
        double[] d_array23 = new double[] { (byte) 1, (short) 1 };
        double[] d_array26 = Histogram.rel2abs(d_array23, (double) 100.0f, (double) ' ');
        double[] d_array29 = new double[] { (byte) 1, (short) 1 };
        double[] d_array32 = Histogram.rel2abs(d_array29, (double) 100.0f, (double) ' ');
        double[] d_array35 = new double[] { (byte) 1, (short) 1 };
        double[] d_array38 = Histogram.rel2abs(d_array35, (double) 100.0f, (double) ' ');
        double d40 = Logistic.classify(d_array32, d_array38, (double) 100.0f);
        Double d41 = Histogram.jaccard(d_array26, d_array32);
        double[] d_array42 = Multiplication.elementWise(d_array11, d_array26);
        double[] d_array45 = new double[] { (byte) 1, (short) 1 };
        double[] d_array48 = Histogram.rel2abs(d_array45, (double) 100.0f, (double) ' ');
        double[] d_array51 = new double[] { (byte) 1, (short) 1 };
        double[] d_array54 = Histogram.rel2abs(d_array51, (double) 100.0f, (double) ' ');
        double d56 = Logistic.classify(d_array48, d_array54, (double) 100.0f);
        double[] d_array60 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array63 = new double[] { (byte) 1, (short) 1 };
        double[] d_array66 = Histogram.rel2abs(d_array63, (double) 100.0f, (double) ' ');
        double[] d_array69 = new double[] { (byte) 1, (short) 1 };
        double[] d_array72 = Histogram.rel2abs(d_array69, (double) 100.0f, (double) ' ');
        double d74 = Logistic.classify(d_array66, d_array72, (double) 100.0f);
        Double d75 = Histogram.jaccard(d_array60, d_array72);
        double[] d_array78 = new double[] { (byte) 1, (short) 1 };
        double[] d_array81 = Histogram.rel2abs(d_array78, (double) 100.0f, (double) ' ');
        double[] d_array82 = Multiplication.elementWise(d_array60, d_array81);
        double d84 = Logistic.classify(d_array48, d_array60, (double) (byte) 1);
        double d86 = Logistic.classify(d_array26, d_array60, (double) 0L);
        double[] d_array89 = Histogram.rel2abs(d_array60, 0.0d, (double) (short) 100);
        Assert.assertNotNull(d_array2);
        Assert.assertNotNull(d_array5);
        Assert.assertNotNull(d_array8);
        Assert.assertNotNull(d_array11);
        Assert.assertNotNull(d_array14);
        Assert.assertNotNull(d_array17);
        Assert.assertTrue(d19 == 1.0d);
        Assert.assertEquals(d20, Double.NaN, 0);
        Assert.assertNotNull(d_array23);
        Assert.assertNotNull(d_array26);
        Assert.assertNotNull(d_array29);
        Assert.assertNotNull(d_array32);
        Assert.assertNotNull(d_array35);
        Assert.assertNotNull(d_array38);
        Assert.assertTrue(d40 == 1.0d);
        Assert.assertEquals(d41, Double.NaN, 0);
        Assert.assertNotNull(d_array42);
        Assert.assertNotNull(d_array45);
        Assert.assertNotNull(d_array48);
        Assert.assertNotNull(d_array51);
        Assert.assertNotNull(d_array54);
        Assert.assertTrue(d56 == 1.0d);
        Assert.assertNotNull(d_array60);
        Assert.assertNotNull(d_array63);
        Assert.assertNotNull(d_array66);
        Assert.assertNotNull(d_array69);
        Assert.assertNotNull(d_array72);
        Assert.assertTrue(d74 == 1.0d);
        Assert.assertTrue("'" + d75 + "' != '" + 0.0d + "'", d75.equals(0.0d));
        Assert.assertNotNull(d_array78);
        Assert.assertNotNull(d_array81);
        Assert.assertNotNull(d_array82);
        Assert.assertTrue(d84 == 1.0d);
        Assert.assertTrue(d86 == 1.0d);
        Assert.assertNotNull(d_array89);
    }

    @Test
    public void test139() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        Set<Histogram> set_histogram14 = multiset_histogram0.keySet();
        MultiSet<Histogram> multiset_histogram15 = new MultiSet<>();
        Histogram histogram16 = new Histogram();
        Integer i18 = multiset_histogram15.put(histogram16, 0);
        Histogram histogram19 = new Histogram();
        multiset_histogram15.add(histogram19);
        String[] str_array23 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str24 = new PriorityQueue<>();
        boolean b25 = Collections.addAll(priorityqueue_str24, str_array23);
        boolean b27 = priorityqueue_str24.offer("");
        Integer i28 = multiset_histogram15.remove("");
        Set<Histogram> set_histogram29 = multiset_histogram15.keySet();
        MultiSet<Histogram> multiset_histogram30 = new MultiSet<>();
        Histogram histogram31 = new Histogram();
        Integer i33 = multiset_histogram30.put(histogram31, 0);
        Histogram histogram34 = new Histogram();
        multiset_histogram30.add(histogram34);
        int i36 = multiset_histogram15.count(histogram34);
        int i37 = multiset_histogram0.count(histogram34);
        Set<Entry<Histogram, Integer>> set_entry_histogram_i38 = multiset_histogram0.entrySet();
        String str39 = multiset_histogram0.toString();
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNotNull(set_histogram14);
        Assert.assertNull(i18);
        Assert.assertNotNull(str_array23);
        Assert.assertTrue(b25 == true);
        Assert.assertTrue(b27 == true);
        Assert.assertNull(i28);
        Assert.assertNotNull(set_histogram29);
        Assert.assertNull(i33);
        Assert.assertTrue(i36 == 0);
        Assert.assertTrue(i37 == 0);
        Assert.assertNotNull(set_entry_histogram_i38);
    }

    @Test
    public void test140() throws Throwable {
        double[] d_array3 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array6 = new double[] { (byte) 1, (short) 1 };
        double[] d_array9 = Histogram.rel2abs(d_array6, (double) 100.0f, (double) ' ');
        double[] d_array12 = new double[] { (byte) 1, (short) 1 };
        double[] d_array15 = Histogram.rel2abs(d_array12, (double) 100.0f, (double) ' ');
        double d17 = Logistic.classify(d_array9, d_array15, (double) 100.0f);
        Double d18 = Histogram.jaccard(d_array3, d_array15);
        double[] d_array21 = new double[] { (byte) 1, (short) 1 };
        double[] d_array24 = Histogram.rel2abs(d_array21, (double) 100.0f, (double) ' ');
        double[] d_array25 = Multiplication.elementWise(d_array3, d_array24);
        Assert.assertNotNull(d_array3);
        Assert.assertNotNull(d_array6);
        Assert.assertNotNull(d_array9);
        Assert.assertNotNull(d_array12);
        Assert.assertNotNull(d_array15);
        Assert.assertTrue(d17 == 1.0d);
        Assert.assertTrue("'" + d18 + "' != '" + 0.0d + "'", d18.equals(0.0d));
        Assert.assertNotNull(d_array21);
        Assert.assertNotNull(d_array24);
        Assert.assertNotNull(d_array25);
    }

    @Test
    public void test141() throws Throwable {
        MultiMap multiMap0 = new MultiMap();
        int i1 = multiMap0.size();
        List<String> list_str3 = multiMap0.get("{}");
        Assert.assertTrue(i1 == 0);
        Assert.assertNotNull(list_str3);
    }

    @Test
    public void test142() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        MultiSet<Histogram> multiset_histogram14 = new MultiSet<>();
        Histogram histogram15 = new Histogram();
        Integer i17 = multiset_histogram14.put(histogram15, 0);
        Histogram histogram18 = new Histogram();
        multiset_histogram14.add(histogram18);
        Integer i21 = multiset_histogram0.replace(histogram18, 2);
        DataSourceFactory dataSourceFactory22 = new DataSourceFactory();
        boolean b23 = multiset_histogram0.containsKey(dataSourceFactory22);
        MultiSet<Histogram> multiset_histogram24 = new MultiSet<>();
        Histogram histogram25 = new Histogram();
        Integer i27 = multiset_histogram24.put(histogram25, 0);
        Histogram histogram28 = new Histogram();
        multiset_histogram24.add(histogram28);
        String[] str_array32 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str33 = new PriorityQueue<>();
        boolean b34 = Collections.addAll(priorityqueue_str33, str_array32);
        boolean b36 = priorityqueue_str33.offer("");
        Integer i37 = multiset_histogram24.remove("");
        MultiSet<Histogram> multiset_histogram38 = new MultiSet<>();
        Histogram histogram39 = new Histogram();
        Integer i41 = multiset_histogram38.put(histogram39, 0);
        Histogram histogram42 = new Histogram();
        multiset_histogram38.add(histogram42);
        Integer i45 = multiset_histogram24.replace(histogram42, 2);
        DataSourceFactory dataSourceFactory46 = new DataSourceFactory();
        boolean b47 = multiset_histogram24.containsKey(dataSourceFactory46);
        Histogram histogram48 = new Histogram();
        multiset_histogram24.add(histogram48);
        multiset_histogram0.add(histogram48);
        TextArea textArea51 = null;
        TextAreaAppender textAreaAppender52 = new TextAreaAppender(textArea51);
        Filter filter53 = textAreaAppender52.getFilter();
        Level level54 = textAreaAppender52.getLevel();
        textAreaAppender52.flush();
        Formatter formatter56 = textAreaAppender52.getFormatter();
        Filter filter57 = null;
        textAreaAppender52.setFilter(filter57);
        TextArea textArea59 = null;
        TextAreaAppender textAreaAppender60 = new TextAreaAppender(textArea59);
        TextArea textArea61 = null;
        TextAreaAppender textAreaAppender62 = new TextAreaAppender(textArea61);
        Filter filter63 = textAreaAppender62.getFilter();
        Level level64 = textAreaAppender62.getLevel();
        textAreaAppender60.setLevel(level64);
        boolean b66 = multiset_histogram0.remove(filter57, textAreaAppender60);
        TextArea textArea67 = null;
        TextAreaAppender textAreaAppender68 = new TextAreaAppender(textArea67);
        TextArea textArea69 = null;
        TextAreaAppender textAreaAppender70 = new TextAreaAppender(textArea69);
        Filter filter71 = textAreaAppender70.getFilter();
        Level level72 = textAreaAppender70.getLevel();
        textAreaAppender68.setLevel(level72);
        textAreaAppender60.setLevel(level72);
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNull(i17);
        Assert.assertNull(i21);
        Assert.assertTrue(b23 == false);
        Assert.assertNull(i27);
        Assert.assertNotNull(str_array32);
        Assert.assertTrue(b34 == true);
        Assert.assertTrue(b36 == true);
        Assert.assertNull(i37);
        Assert.assertNull(i41);
        Assert.assertNull(i45);
        Assert.assertTrue(b47 == false);
        Assert.assertNull(filter53);
        Assert.assertNotNull(level54);
        Assert.assertNotNull(formatter56);
        Assert.assertNull(filter63);
        Assert.assertNotNull(level64);
        Assert.assertTrue(b66 == false);
        Assert.assertNull(filter71);
        Assert.assertNotNull(level72);
    }

    @Test
    public void test143() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (byte) 100);
        String[] str_array4 = new String[] { "", "" };
        ArrayList<String> arraylist_str5 = new ArrayList<>();
        boolean b6 = Collections.addAll(arraylist_str5, str_array4);
        Stream<String> stream_str7 = arraylist_str5.stream();
        String[] str_array10 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str11 = new ArrayList<>();
        boolean b12 = Collections.addAll(arraylist_str11, str_array10);
        String[] str_array15 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str16 = new ArrayList<>();
        boolean b17 = Collections.addAll(arraylist_str16, str_array15);
        Boolean b18 = Tokenization.contains(arraylist_str11, arraylist_str16);
        boolean b19 = arraylist_str5.containsAll(arraylist_str16);
        HeapWithFixedSize<String> heapwithfixedsize_str21 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str23 = new HeapWithFixedSize<>((int) (byte) 100);
        int i24 = heapwithfixedsize_str23.size();
        boolean b25 = heapwithfixedsize_str21.retainAll(heapwithfixedsize_str23);
        boolean b26 = arraylist_str16.removeAll(heapwithfixedsize_str23);
        String str27 = heapwithfixedsize_str23.poll();
        String[] str_array30 = new String[] { "", "" };
        ArrayList<String> arraylist_str31 = new ArrayList<>();
        boolean b32 = Collections.addAll(arraylist_str31, str_array30);
        Stream<String> stream_str33 = arraylist_str31.stream();
        String[] str_array36 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str37 = new ArrayList<>();
        boolean b38 = Collections.addAll(arraylist_str37, str_array36);
        String[] str_array41 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str42 = new ArrayList<>();
        boolean b43 = Collections.addAll(arraylist_str42, str_array41);
        Boolean b44 = Tokenization.contains(arraylist_str37, arraylist_str42);
        boolean b45 = arraylist_str31.containsAll(arraylist_str42);
        String[] str_array48 = new String[] { "", "" };
        ArrayList<String> arraylist_str49 = new ArrayList<>();
        boolean b50 = Collections.addAll(arraylist_str49, str_array48);
        Stream<String> stream_str51 = arraylist_str49.stream();
        String[] str_array54 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str55 = new ArrayList<>();
        boolean b56 = Collections.addAll(arraylist_str55, str_array54);
        String[] str_array59 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str60 = new ArrayList<>();
        boolean b61 = Collections.addAll(arraylist_str60, str_array59);
        Boolean b62 = Tokenization.contains(arraylist_str55, arraylist_str60);
        boolean b63 = arraylist_str49.containsAll(arraylist_str60);
        double d64 = TokenShareRatio.setTokenShareRatioFkLD(arraylist_str31, arraylist_str49);
        boolean b65 = arraylist_str49.isEmpty();
        List<String> list_str67 = Tokenization.split("");
        double d68 = TokenShareRatio.setTokenShareRatioFkLD(arraylist_str49, list_str67);
        boolean b69 = heapwithfixedsize_str23.contains(arraylist_str49);
        Iterator<String> iterator_str70 = heapwithfixedsize_str23.iterator();
        boolean b71 = heapwithfixedsize_str1.removeAll(heapwithfixedsize_str23);
        Assert.assertNotNull(str_array4);
        Assert.assertTrue(b6 == true);
        Assert.assertNotNull(stream_str7);
        Assert.assertNotNull(str_array10);
        Assert.assertTrue(b12 == true);
        Assert.assertNotNull(str_array15);
        Assert.assertTrue(b17 == true);
        Assert.assertTrue("'" + b18 + "' != '" + true + "'", b18.equals(true));
        Assert.assertTrue(b19 == false);
        Assert.assertTrue(i24 == 0);
        Assert.assertTrue(b25 == false);
        Assert.assertTrue(b26 == false);
        Assert.assertNull(str27);
        Assert.assertNotNull(str_array30);
        Assert.assertTrue(b32 == true);
        Assert.assertNotNull(stream_str33);
        Assert.assertNotNull(str_array36);
        Assert.assertTrue(b38 == true);
        Assert.assertNotNull(str_array41);
        Assert.assertTrue(b43 == true);
        Assert.assertTrue("'" + b44 + "' != '" + true + "'", b44.equals(true));
        Assert.assertTrue(b45 == false);
        Assert.assertNotNull(str_array48);
        Assert.assertTrue(b50 == true);
        Assert.assertNotNull(stream_str51);
        Assert.assertNotNull(str_array54);
        Assert.assertTrue(b56 == true);
        Assert.assertNotNull(str_array59);
        Assert.assertTrue(b61 == true);
        Assert.assertTrue("'" + b62 + "' != '" + true + "'", b62.equals(true));
        Assert.assertTrue(b63 == false);
        Assert.assertTrue(d64 == 1.0d);
        Assert.assertTrue(b65 == false);
        Assert.assertNotNull(list_str67);
        Assert.assertTrue(d68 == 1.0d);
        Assert.assertTrue(b69 == false);
        Assert.assertNotNull(iterator_str70);
        Assert.assertTrue(b71 == false);
    }

    @Test
    public void test144() throws Throwable {
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double[] d_array14 = new double[] { (byte) 1, (short) 1 };
        double[] d_array17 = Histogram.rel2abs(d_array14, (double) 100.0f, (double) ' ');
        double d19 = Logistic.classify(d_array11, d_array17, (double) 100.0f);
        Double d20 = Histogram.jaccard(d_array5, d_array11);
        double[] d_array23 = Histogram.rel2abs(d_array11, (double) 4, (double) 4);
        double[] d_array24 = new double[] {};
        Double d25 = Histogram.jaccard(d_array23, d_array24);
        double[] d_array28 = new double[] { (byte) 1, (short) 1 };
        double[] d_array31 = Histogram.rel2abs(d_array28, (double) 100.0f, (double) ' ');
        double[] d_array34 = new double[] { (byte) 1, (short) 1 };
        double[] d_array37 = Histogram.rel2abs(d_array34, (double) 100.0f, (double) ' ');
        double[] d_array40 = new double[] { (byte) 1, (short) 1 };
        double[] d_array43 = Histogram.rel2abs(d_array40, (double) 100.0f, (double) ' ');
        double d45 = Logistic.classify(d_array37, d_array43, (double) 100.0f);
        Double d46 = Histogram.jaccard(d_array31, d_array37);
        double[] d_array49 = Histogram.rel2abs(d_array37, (double) 4, (double) 4);
        double[] d_array50 = new double[] {};
        Double d51 = Histogram.jaccard(d_array49, d_array50);
        try {
            double[] d_array52 = Multiplication.elementWise(d_array24, d_array49);
            Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (RuntimeException e) {
        }
        Assert.assertNotNull(d_array2);
        Assert.assertNotNull(d_array5);
        Assert.assertNotNull(d_array8);
        Assert.assertNotNull(d_array11);
        Assert.assertNotNull(d_array14);
        Assert.assertNotNull(d_array17);
        Assert.assertTrue(d19 == 1.0d);
        Assert.assertEquals(d20, Double.NaN, 0);
        Assert.assertNotNull(d_array23);
        Assert.assertNotNull(d_array24);
        Assert.assertEquals(d25, Double.NaN, 0);
        Assert.assertNotNull(d_array28);
        Assert.assertNotNull(d_array31);
        Assert.assertNotNull(d_array34);
        Assert.assertNotNull(d_array37);
        Assert.assertNotNull(d_array40);
        Assert.assertNotNull(d_array43);
        Assert.assertTrue(d45 == 1.0d);
        Assert.assertEquals(d46, Double.NaN, 0);
        Assert.assertNotNull(d_array49);
        Assert.assertNotNull(d_array50);
        Assert.assertEquals(d51, Double.NaN, 0);
    }

    @Test
    public void test145() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        Set<Histogram> set_histogram14 = multiset_histogram0.keySet();
        MultiSet<Histogram> multiset_histogram15 = new MultiSet<>();
        Histogram histogram16 = new Histogram();
        Integer i18 = multiset_histogram15.put(histogram16, 0);
        Histogram histogram19 = new Histogram();
        multiset_histogram15.add(histogram19);
        int i21 = multiset_histogram0.count(histogram19);
        int i22 = multiset_histogram0.totalCount();
        Set<Histogram> set_histogram23 = multiset_histogram0.keySet();
        Collection<Integer> collection_i24 = multiset_histogram0.values();
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNotNull(set_histogram14);
        Assert.assertNull(i18);
        Assert.assertTrue(i21 == 0);
        Assert.assertTrue(i22 == 1);
        Assert.assertNotNull(set_histogram23);
        Assert.assertNotNull(collection_i24);
    }

    @Test
    public void test146() throws Throwable {
        TextArea textArea0 = null;
        TextAreaAppender textAreaAppender1 = new TextAreaAppender(textArea0);
        Filter filter2 = textAreaAppender1.getFilter();
        Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        Filter filter5 = null;
        textAreaAppender1.setFilter(filter5);
        textAreaAppender1.close();
        textAreaAppender1.close();
        ErrorManager errorManager9 = textAreaAppender1.getErrorManager();
        TextArea textArea10 = null;
        TextAreaAppender textAreaAppender11 = new TextAreaAppender(textArea10);
        Filter filter12 = textAreaAppender11.getFilter();
        Level level13 = textAreaAppender11.getLevel();
        textAreaAppender11.flush();
        Formatter formatter15 = textAreaAppender11.getFormatter();
        textAreaAppender1.setFormatter(formatter15);
        Assert.assertNull(filter2);
        Assert.assertNotNull(level3);
        Assert.assertNotNull(errorManager9);
        Assert.assertNull(filter12);
        Assert.assertNotNull(level13);
        Assert.assertNotNull(formatter15);
    }

    @Test
    public void test147() throws Throwable {
        Table[] table_array0 = new Table[] {};
        ArrayList<Table> arraylist_table1 = new ArrayList<>();
        boolean b2 = Collections.addAll(arraylist_table1, table_array0);
        Chen chen3 = new Chen(arraylist_table1);
        Table[] table_array4 = new Table[] {};
        ArrayList<Table> arraylist_table5 = new ArrayList<>();
        boolean b6 = Collections.addAll(arraylist_table5, table_array4);
        Chen chen7 = new Chen(arraylist_table5);
        String[] str_array10 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str11 = new ArrayList<>();
        boolean b12 = Collections.addAll(arraylist_str11, str_array10);
        String[] str_array15 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str16 = new ArrayList<>();
        boolean b17 = Collections.addAll(arraylist_str16, str_array15);
        Boolean b18 = Tokenization.contains(arraylist_str11, arraylist_str16);
        boolean b19 = arraylist_str16.isEmpty();
        String[] str_array22 = new String[] { "", "" };
        ArrayList<String> arraylist_str23 = new ArrayList<>();
        boolean b24 = Collections.addAll(arraylist_str23, str_array22);
        Stream<String> stream_str25 = arraylist_str23.stream();
        String[] str_array28 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str29 = new ArrayList<>();
        boolean b30 = Collections.addAll(arraylist_str29, str_array28);
        String[] str_array33 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str34 = new ArrayList<>();
        boolean b35 = Collections.addAll(arraylist_str34, str_array33);
        Boolean b36 = Tokenization.contains(arraylist_str29, arraylist_str34);
        boolean b37 = arraylist_str23.containsAll(arraylist_str34);
        boolean b38 = arraylist_str16.removeAll(arraylist_str34);
        String[] str_array41 = new String[] { "", "" };
        ArrayList<String> arraylist_str42 = new ArrayList<>();
        boolean b43 = Collections.addAll(arraylist_str42, str_array41);
        Stream<String> stream_str44 = arraylist_str42.stream();
        double d45 = chen7.getTableChenSimilarity(arraylist_str34, arraylist_str42);
        Stream<String> stream_str46 = arraylist_str42.stream();
        String[] str_array50 = new String[] { "hi!", "[, hi!]", "" };
        ArrayList<String> arraylist_str51 = new ArrayList<>();
        boolean b52 = Collections.addAll(arraylist_str51, str_array50);
        double d53 = chen3.getTableChenSimilarity(arraylist_str42, arraylist_str51);
        String str54 = arraylist_str51.toString();
        Assert.assertNotNull(table_array0);
        Assert.assertTrue(b2 == false);
        Assert.assertNotNull(table_array4);
        Assert.assertTrue(b6 == false);
        Assert.assertNotNull(str_array10);
        Assert.assertTrue(b12 == true);
        Assert.assertNotNull(str_array15);
        Assert.assertTrue(b17 == true);
        Assert.assertTrue("'" + b18 + "' != '" + true + "'", b18.equals(true));
        Assert.assertTrue(b19 == false);
        Assert.assertNotNull(str_array22);
        Assert.assertTrue(b24 == true);
        Assert.assertNotNull(stream_str25);
        Assert.assertNotNull(str_array28);
        Assert.assertTrue(b30 == true);
        Assert.assertNotNull(str_array33);
        Assert.assertTrue(b35 == true);
        Assert.assertTrue("'" + b36 + "' != '" + true + "'", b36.equals(true));
        Assert.assertTrue(b37 == false);
        Assert.assertTrue(b38 == true);
        Assert.assertNotNull(str_array41);
        Assert.assertTrue(b43 == true);
        Assert.assertNotNull(stream_str44);
        Assert.assertEquals(d45, Double.NaN, 0);
        Assert.assertNotNull(stream_str46);
        Assert.assertNotNull(str_array50);
        Assert.assertTrue(b52 == true);
        Assert.assertEquals(d53, Double.NaN, 0);
        Assert.assertTrue("'" + str54 + "' != '" + "[hi!, [, hi!], ]" + "'", str54.equals("[hi!, [, hi!], ]"));
    }

    @Test
    public void test148() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (byte) 100);
        String[] str_array4 = new String[] { "", "" };
        ArrayList<String> arraylist_str5 = new ArrayList<>();
        boolean b6 = Collections.addAll(arraylist_str5, str_array4);
        Stream<String> stream_str7 = arraylist_str5.stream();
        Stream<String> stream_str8 = arraylist_str5.parallelStream();
        String[] str_array11 = new String[] { "", "" };
        ArrayList<String> arraylist_str12 = new ArrayList<>();
        boolean b13 = Collections.addAll(arraylist_str12, str_array11);
        Stream<String> stream_str14 = arraylist_str12.stream();
        String[] str_array17 = new String[] { "", "" };
        ArrayList<String> arraylist_str18 = new ArrayList<>();
        boolean b19 = Collections.addAll(arraylist_str18, str_array17);
        Stream<String> stream_str20 = arraylist_str18.stream();
        Stream<String> stream_str21 = arraylist_str18.parallelStream();
        String[] str_array24 = new String[] { "", "" };
        ArrayList<String> arraylist_str25 = new ArrayList<>();
        boolean b26 = Collections.addAll(arraylist_str25, str_array24);
        Stream<String> stream_str27 = arraylist_str25.stream();
        Stream<String> stream_str28 = arraylist_str25.parallelStream();
        String[] str_array31 = new String[] { "", "" };
        ArrayList<String> arraylist_str32 = new ArrayList<>();
        boolean b33 = Collections.addAll(arraylist_str32, str_array31);
        Stream<String> stream_str34 = arraylist_str32.stream();
        String[] str_array37 = new String[] { "", "" };
        ArrayList<String> arraylist_str38 = new ArrayList<>();
        boolean b39 = Collections.addAll(arraylist_str38, str_array37);
        Stream<String> stream_str40 = arraylist_str38.stream();
        Stream<String> stream_str41 = arraylist_str38.parallelStream();
        Stream[] stream_array43 = new Stream[6];
        @SuppressWarnings("unchecked") Stream<String>[] stream_str_array44 = (Stream<String>[]) stream_array43;
        stream_str_array44[0] = stream_str8;
        stream_str_array44[1] = stream_str14;
        stream_str_array44[2] = stream_str21;
        stream_str_array44[3] = stream_str28;
        stream_str_array44[4] = stream_str34;
        stream_str_array44[5] = stream_str41;
        Stream<String>[] stream_str_array57 = heapwithfixedsize_str1.toArray(stream_str_array44);
        Iterator<String> iterator_str58 = heapwithfixedsize_str1.iterator();
        Spliterator<String> spliterator_str59 = heapwithfixedsize_str1.spliterator();
        String str60 = heapwithfixedsize_str1.poll();
        Assert.assertNotNull(str_array4);
        Assert.assertTrue(b6 == true);
        Assert.assertNotNull(stream_str7);
        Assert.assertNotNull(stream_str8);
        Assert.assertNotNull(str_array11);
        Assert.assertTrue(b13 == true);
        Assert.assertNotNull(stream_str14);
        Assert.assertNotNull(str_array17);
        Assert.assertTrue(b19 == true);
        Assert.assertNotNull(stream_str20);
        Assert.assertNotNull(stream_str21);
        Assert.assertNotNull(str_array24);
        Assert.assertTrue(b26 == true);
        Assert.assertNotNull(stream_str27);
        Assert.assertNotNull(stream_str28);
        Assert.assertNotNull(str_array31);
        Assert.assertTrue(b33 == true);
        Assert.assertNotNull(stream_str34);
        Assert.assertNotNull(str_array37);
        Assert.assertTrue(b39 == true);
        Assert.assertNotNull(stream_str40);
        Assert.assertNotNull(stream_str41);
        Assert.assertNotNull(stream_array43);
        Assert.assertNotNull(stream_str_array44);
        Assert.assertNotNull(stream_str_array57);
        Assert.assertNotNull(iterator_str58);
        Assert.assertNotNull(spliterator_str59);
        Assert.assertNull(str60);
    }

    @Test
    public void test149() throws Throwable {
        TextArea textArea0 = null;
        TextAreaAppender textAreaAppender1 = new TextAreaAppender(textArea0);
        TextArea textArea2 = null;
        TextAreaAppender textAreaAppender3 = new TextAreaAppender(textArea2);
        Filter filter4 = textAreaAppender3.getFilter();
        Level level5 = textAreaAppender3.getLevel();
        textAreaAppender1.setLevel(level5);
        MultiSet<Histogram> multiset_histogram7 = new MultiSet<>();
        Histogram histogram8 = new Histogram();
        Integer i10 = multiset_histogram7.put(histogram8, 0);
        Histogram histogram11 = new Histogram();
        multiset_histogram7.add(histogram11);
        String[] str_array15 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str16 = new PriorityQueue<>();
        boolean b17 = Collections.addAll(priorityqueue_str16, str_array15);
        boolean b19 = priorityqueue_str16.offer("");
        Integer i20 = multiset_histogram7.remove("");
        Set<Histogram> set_histogram21 = multiset_histogram7.keySet();
        MultiSet<Histogram> multiset_histogram22 = new MultiSet<>();
        Histogram histogram23 = new Histogram();
        Integer i25 = multiset_histogram22.put(histogram23, 0);
        Histogram histogram26 = new Histogram();
        multiset_histogram22.add(histogram26);
        String[] str_array30 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str31 = new PriorityQueue<>();
        boolean b32 = Collections.addAll(priorityqueue_str31, str_array30);
        boolean b34 = priorityqueue_str31.offer("");
        Integer i35 = multiset_histogram22.remove("");
        Set<Histogram> set_histogram36 = multiset_histogram22.keySet();
        MultiSet<Histogram> multiset_histogram37 = new MultiSet<>();
        Histogram histogram38 = new Histogram();
        Integer i40 = multiset_histogram37.put(histogram38, 0);
        Histogram histogram41 = new Histogram();
        multiset_histogram37.add(histogram41);
        int i43 = multiset_histogram22.count(histogram41);
        int i44 = multiset_histogram7.count(histogram41);
        Set<Entry<Histogram, Integer>> set_entry_histogram_i45 = multiset_histogram7.entrySet();
        TextArea textArea46 = null;
        TextAreaAppender textAreaAppender47 = new TextAreaAppender(textArea46);
        TextArea textArea48 = null;
        TextAreaAppender textAreaAppender49 = new TextAreaAppender(textArea48);
        Filter filter50 = textAreaAppender49.getFilter();
        Level level51 = textAreaAppender49.getLevel();
        textAreaAppender47.setLevel(level51);
        Integer i53 = multiset_histogram7.remove(level51);
        textAreaAppender1.setLevel(level51);
        Assert.assertNull(filter4);
        Assert.assertNotNull(level5);
        Assert.assertNull(i10);
        Assert.assertNotNull(str_array15);
        Assert.assertTrue(b17 == true);
        Assert.assertTrue(b19 == true);
        Assert.assertNull(i20);
        Assert.assertNotNull(set_histogram21);
        Assert.assertNull(i25);
        Assert.assertNotNull(str_array30);
        Assert.assertTrue(b32 == true);
        Assert.assertTrue(b34 == true);
        Assert.assertNull(i35);
        Assert.assertNotNull(set_histogram36);
        Assert.assertNull(i40);
        Assert.assertTrue(i43 == 0);
        Assert.assertTrue(i44 == 0);
        Assert.assertNotNull(set_entry_histogram_i45);
        Assert.assertNull(filter50);
        Assert.assertNotNull(level51);
        Assert.assertNull(i53);
    }

    @Test
    public void test150() throws Throwable {
        Table[] table_array0 = new Table[] {};
        ArrayList<Table> arraylist_table1 = new ArrayList<>();
        boolean b2 = Collections.addAll(arraylist_table1, table_array0);
        Chen chen3 = new Chen(arraylist_table1);
        Chen chen4 = new Chen(arraylist_table1);
        Column column5 = null;
        Column column6 = null;
        try {
            double d7 = chen4.getChenSimilarity(column5, column6);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNotNull(table_array0);
        Assert.assertTrue(b2 == false);
    }

    @Test
    public void test151() throws Throwable {
        Table[] table_array0 = new Table[] {};
        ArrayList<Table> arraylist_table1 = new ArrayList<>();
        boolean b2 = Collections.addAll(arraylist_table1, table_array0);
        Chen chen3 = new Chen(arraylist_table1);
        String[] str_array6 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str7 = new ArrayList<>();
        boolean b8 = Collections.addAll(arraylist_str7, str_array6);
        String[] str_array11 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str12 = new ArrayList<>();
        boolean b13 = Collections.addAll(arraylist_str12, str_array11);
        Boolean b14 = Tokenization.contains(arraylist_str7, arraylist_str12);
        boolean b15 = arraylist_str12.isEmpty();
        String[] str_array18 = new String[] { "", "" };
        ArrayList<String> arraylist_str19 = new ArrayList<>();
        boolean b20 = Collections.addAll(arraylist_str19, str_array18);
        Stream<String> stream_str21 = arraylist_str19.stream();
        String[] str_array24 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str25 = new ArrayList<>();
        boolean b26 = Collections.addAll(arraylist_str25, str_array24);
        String[] str_array29 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str30 = new ArrayList<>();
        boolean b31 = Collections.addAll(arraylist_str30, str_array29);
        Boolean b32 = Tokenization.contains(arraylist_str25, arraylist_str30);
        boolean b33 = arraylist_str19.containsAll(arraylist_str30);
        boolean b34 = arraylist_str12.removeAll(arraylist_str30);
        String[] str_array37 = new String[] { "", "" };
        ArrayList<String> arraylist_str38 = new ArrayList<>();
        boolean b39 = Collections.addAll(arraylist_str38, str_array37);
        Stream<String> stream_str40 = arraylist_str38.stream();
        String[] str_array43 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str44 = new ArrayList<>();
        boolean b45 = Collections.addAll(arraylist_str44, str_array43);
        String[] str_array48 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str49 = new ArrayList<>();
        boolean b50 = Collections.addAll(arraylist_str49, str_array48);
        Boolean b51 = Tokenization.contains(arraylist_str44, arraylist_str49);
        boolean b52 = arraylist_str38.containsAll(arraylist_str49);
        HeapWithFixedSize<String> heapwithfixedsize_str54 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str56 = new HeapWithFixedSize<>((int) (byte) 100);
        int i57 = heapwithfixedsize_str56.size();
        boolean b58 = heapwithfixedsize_str54.retainAll(heapwithfixedsize_str56);
        boolean b59 = arraylist_str49.removeAll(heapwithfixedsize_str56);
        String[] str_array62 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str63 = new ArrayList<>();
        boolean b64 = Collections.addAll(arraylist_str63, str_array62);
        String[] str_array67 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str68 = new ArrayList<>();
        boolean b69 = Collections.addAll(arraylist_str68, str_array67);
        Boolean b70 = Tokenization.contains(arraylist_str63, arraylist_str68);
        boolean b71 = arraylist_str68.isEmpty();
        String[] str_array74 = new String[] { "", "" };
        ArrayList<String> arraylist_str75 = new ArrayList<>();
        boolean b76 = Collections.addAll(arraylist_str75, str_array74);
        Stream<String> stream_str77 = arraylist_str75.stream();
        String[] str_array80 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str81 = new ArrayList<>();
        boolean b82 = Collections.addAll(arraylist_str81, str_array80);
        String[] str_array85 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str86 = new ArrayList<>();
        boolean b87 = Collections.addAll(arraylist_str86, str_array85);
        Boolean b88 = Tokenization.contains(arraylist_str81, arraylist_str86);
        boolean b89 = arraylist_str75.containsAll(arraylist_str86);
        boolean b90 = arraylist_str68.removeAll(arraylist_str86);
        double d91 = TokenShareRatio.setTokenShareRatioFkLD(arraylist_str49, arraylist_str86);
        double d92 = chen3.getTableChenSimilarity(arraylist_str12, arraylist_str49);
        Column column93 = null;
        Column column94 = null;
        try {
            double d95 = chen3.getChenSimilarity(column93, column94);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNotNull(table_array0);
        Assert.assertTrue(b2 == false);
        Assert.assertNotNull(str_array6);
        Assert.assertTrue(b8 == true);
        Assert.assertNotNull(str_array11);
        Assert.assertTrue(b13 == true);
        Assert.assertTrue("'" + b14 + "' != '" + true + "'", b14.equals(true));
        Assert.assertTrue(b15 == false);
        Assert.assertNotNull(str_array18);
        Assert.assertTrue(b20 == true);
        Assert.assertNotNull(stream_str21);
        Assert.assertNotNull(str_array24);
        Assert.assertTrue(b26 == true);
        Assert.assertNotNull(str_array29);
        Assert.assertTrue(b31 == true);
        Assert.assertTrue("'" + b32 + "' != '" + true + "'", b32.equals(true));
        Assert.assertTrue(b33 == false);
        Assert.assertTrue(b34 == true);
        Assert.assertNotNull(str_array37);
        Assert.assertTrue(b39 == true);
        Assert.assertNotNull(stream_str40);
        Assert.assertNotNull(str_array43);
        Assert.assertTrue(b45 == true);
        Assert.assertNotNull(str_array48);
        Assert.assertTrue(b50 == true);
        Assert.assertTrue("'" + b51 + "' != '" + true + "'", b51.equals(true));
        Assert.assertTrue(b52 == false);
        Assert.assertTrue(i57 == 0);
        Assert.assertTrue(b58 == false);
        Assert.assertTrue(b59 == false);
        Assert.assertNotNull(str_array62);
        Assert.assertTrue(b64 == true);
        Assert.assertNotNull(str_array67);
        Assert.assertTrue(b69 == true);
        Assert.assertTrue("'" + b70 + "' != '" + true + "'", b70.equals(true));
        Assert.assertTrue(b71 == false);
        Assert.assertNotNull(str_array74);
        Assert.assertTrue(b76 == true);
        Assert.assertNotNull(stream_str77);
        Assert.assertNotNull(str_array80);
        Assert.assertTrue(b82 == true);
        Assert.assertNotNull(str_array85);
        Assert.assertTrue(b87 == true);
        Assert.assertTrue("'" + b88 + "' != '" + true + "'", b88.equals(true));
        Assert.assertTrue(b89 == false);
        Assert.assertTrue(b90 == true);
        Assert.assertTrue(d91 == 1.0d);
        Assert.assertEquals(d92, Double.NaN, 0);
    }

    @Test
    public void test152() throws Throwable {
        MultiMap multiMap0 = new MultiMap();
        multiMap0.put("hi!", "hi!");
        int i4 = multiMap0.size();
        Assert.assertTrue(i4 == 1);
    }

    @Test
    public void test153() throws Throwable {
        TextArea textArea0 = null;
        TextAreaAppender textAreaAppender1 = new TextAreaAppender(textArea0);
        Filter filter2 = textAreaAppender1.getFilter();
        Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        Formatter formatter5 = textAreaAppender1.getFormatter();
        Filter filter6 = null;
        textAreaAppender1.setFilter(filter6);
        textAreaAppender1.flush();
        textAreaAppender1.flush();
        textAreaAppender1.flush();
        Assert.assertNull(filter2);
        Assert.assertNotNull(level3);
        Assert.assertNotNull(formatter5);
    }

    @Test
    public void test154() throws Throwable {
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = Histogram.rel2abs(d_array2, (double) 5, 1.0d);
        double[] d_array11 = new double[] { (byte) 1, (short) 1 };
        double[] d_array14 = Histogram.rel2abs(d_array11, (double) 100.0f, (double) ' ');
        double[] d_array17 = new double[] { (byte) 1, (short) 1 };
        double[] d_array20 = Histogram.rel2abs(d_array17, (double) 100.0f, (double) ' ');
        double d22 = Logistic.classify(d_array14, d_array20, (double) 100.0f);
        try {
            double[] d_array23 = Multiplication.elementWise(d_array2, d_array20);
            Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (RuntimeException e) {
        }
        Assert.assertNotNull(d_array2);
        Assert.assertNotNull(d_array5);
        Assert.assertNotNull(d_array8);
        Assert.assertNotNull(d_array11);
        Assert.assertNotNull(d_array14);
        Assert.assertNotNull(d_array17);
        Assert.assertNotNull(d_array20);
        Assert.assertTrue(d22 == 1.0d);
    }

    @Test
    public void test155() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str3 = new HeapWithFixedSize<>((int) (byte) 100);
        int i4 = heapwithfixedsize_str3.size();
        boolean b5 = heapwithfixedsize_str1.retainAll(heapwithfixedsize_str3);
        Collection<String> collection_str6 = null;
        try {
            boolean b7 = heapwithfixedsize_str3.addAll(collection_str6);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(b5 == false);
    }

    @Test
    public void test156() throws Throwable {
        TextArea textArea0 = null;
        TextAreaAppender textAreaAppender1 = new TextAreaAppender(textArea0);
        Filter filter2 = textAreaAppender1.getFilter();
        Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        Formatter formatter5 = textAreaAppender1.getFormatter();
        Filter filter6 = null;
        textAreaAppender1.setFilter(filter6);
        textAreaAppender1.flush();
        textAreaAppender1.flush();
        Filter filter10 = textAreaAppender1.getFilter();
        Assert.assertNull(filter2);
        Assert.assertNotNull(level3);
        Assert.assertNotNull(formatter5);
        Assert.assertNull(filter10);
    }

    @Test
    public void test157() throws Throwable {
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double d13 = Logistic.classify(d_array5, d_array11, (double) 100.0f);
        double[] d_array17 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array20 = new double[] { (byte) 1, (short) 1 };
        double[] d_array23 = Histogram.rel2abs(d_array20, (double) 100.0f, (double) ' ');
        double[] d_array26 = new double[] { (byte) 1, (short) 1 };
        double[] d_array29 = Histogram.rel2abs(d_array26, (double) 100.0f, (double) ' ');
        double d31 = Logistic.classify(d_array23, d_array29, (double) 100.0f);
        Double d32 = Histogram.jaccard(d_array17, d_array29);
        double[] d_array35 = new double[] { (byte) 1, (short) 1 };
        double[] d_array38 = Histogram.rel2abs(d_array35, (double) 100.0f, (double) ' ');
        double[] d_array39 = Multiplication.elementWise(d_array17, d_array38);
        double d41 = Logistic.classify(d_array5, d_array17, (double) (byte) 1);
        double[] d_array44 = new double[] { (byte) 1, (short) 1 };
        double[] d_array47 = Histogram.rel2abs(d_array44, (double) 100.0f, (double) ' ');
        double[] d_array50 = new double[] { (byte) 1, (short) 1 };
        double[] d_array53 = Histogram.rel2abs(d_array50, (double) 100.0f, (double) ' ');
        double[] d_array56 = new double[] { (byte) 1, (short) 1 };
        double[] d_array59 = Histogram.rel2abs(d_array56, (double) 100.0f, (double) ' ');
        double d61 = Logistic.classify(d_array53, d_array59, (double) 100.0f);
        Double d62 = Histogram.jaccard(d_array47, d_array53);
        double[] d_array65 = new double[] { (byte) 1, (short) 1 };
        double[] d_array68 = Histogram.rel2abs(d_array65, (double) 100.0f, (double) ' ');
        double[] d_array71 = new double[] { (byte) 1, (short) 1 };
        double[] d_array74 = Histogram.rel2abs(d_array71, (double) 100.0f, (double) ' ');
        double[] d_array77 = new double[] { (byte) 1, (short) 1 };
        double[] d_array80 = Histogram.rel2abs(d_array77, (double) 100.0f, (double) ' ');
        double d82 = Logistic.classify(d_array74, d_array80, (double) 100.0f);
        Double d83 = Histogram.jaccard(d_array68, d_array74);
        double[] d_array84 = Multiplication.elementWise(d_array53, d_array68);
        double d86 = Logistic.classify(d_array17, d_array68, (double) 1);
        double[] d_array92 = new double[] { (byte) 0, 0L, 1.0d, 100.0d, 7 };
        Double d93 = Histogram.jaccard(d_array68, d_array92);
        Assert.assertNotNull(d_array2);
        Assert.assertNotNull(d_array5);
        Assert.assertNotNull(d_array8);
        Assert.assertNotNull(d_array11);
        Assert.assertTrue(d13 == 1.0d);
        Assert.assertNotNull(d_array17);
        Assert.assertNotNull(d_array20);
        Assert.assertNotNull(d_array23);
        Assert.assertNotNull(d_array26);
        Assert.assertNotNull(d_array29);
        Assert.assertTrue(d31 == 1.0d);
        Assert.assertTrue("'" + d32 + "' != '" + 0.0d + "'", d32.equals(0.0d));
        Assert.assertNotNull(d_array35);
        Assert.assertNotNull(d_array38);
        Assert.assertNotNull(d_array39);
        Assert.assertTrue(d41 == 1.0d);
        Assert.assertNotNull(d_array44);
        Assert.assertNotNull(d_array47);
        Assert.assertNotNull(d_array50);
        Assert.assertNotNull(d_array53);
        Assert.assertNotNull(d_array56);
        Assert.assertNotNull(d_array59);
        Assert.assertTrue(d61 == 1.0d);
        Assert.assertEquals(d62, Double.NaN, 0);
        Assert.assertNotNull(d_array65);
        Assert.assertNotNull(d_array68);
        Assert.assertNotNull(d_array71);
        Assert.assertNotNull(d_array74);
        Assert.assertNotNull(d_array77);
        Assert.assertNotNull(d_array80);
        Assert.assertTrue(d82 == 1.0d);
        Assert.assertEquals(d83, Double.NaN, 0);
        Assert.assertNotNull(d_array84);
        Assert.assertTrue(d86 == 1.0d);
        Assert.assertNotNull(d_array92);
        Assert.assertTrue("'" + d93 + "' != '" + 0.0d + "'", d93.equals(0.0d));
    }

    @Test
    public void test158() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        Set<Histogram> set_histogram14 = multiset_histogram0.keySet();
        MultiSet<Histogram> multiset_histogram15 = new MultiSet<>();
        Histogram histogram16 = new Histogram();
        Integer i18 = multiset_histogram15.put(histogram16, 0);
        Histogram histogram19 = new Histogram();
        multiset_histogram15.add(histogram19);
        int i21 = multiset_histogram0.count(histogram19);
        int i22 = multiset_histogram0.totalCount();
        Set<Entry<Histogram, Integer>> set_entry_histogram_i23 = multiset_histogram0.entrySet();
        MultiSet<Histogram> multiset_histogram24 = new MultiSet<>();
        Histogram histogram25 = new Histogram();
        Integer i27 = multiset_histogram24.put(histogram25, 0);
        Histogram histogram28 = new Histogram();
        multiset_histogram24.add(histogram28);
        String[] str_array32 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str33 = new PriorityQueue<>();
        boolean b34 = Collections.addAll(priorityqueue_str33, str_array32);
        boolean b36 = priorityqueue_str33.offer("");
        Integer i37 = multiset_histogram24.remove("");
        MultiSet<Histogram> multiset_histogram38 = new MultiSet<>();
        Histogram histogram39 = new Histogram();
        Integer i41 = multiset_histogram38.put(histogram39, 0);
        Histogram histogram42 = new Histogram();
        multiset_histogram38.add(histogram42);
        Integer i45 = multiset_histogram24.replace(histogram42, 2);
        DataSourceFactory dataSourceFactory46 = new DataSourceFactory();
        boolean b47 = multiset_histogram24.containsKey(dataSourceFactory46);
        MultiSet<Histogram> multiset_histogram48 = new MultiSet<>();
        Histogram histogram49 = new Histogram();
        Integer i51 = multiset_histogram48.put(histogram49, 0);
        Histogram histogram52 = new Histogram();
        multiset_histogram48.add(histogram52);
        String[] str_array56 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str57 = new PriorityQueue<>();
        boolean b58 = Collections.addAll(priorityqueue_str57, str_array56);
        boolean b60 = priorityqueue_str57.offer("");
        Integer i61 = multiset_histogram48.remove("");
        MultiSet<Histogram> multiset_histogram62 = new MultiSet<>();
        Histogram histogram63 = new Histogram();
        Integer i65 = multiset_histogram62.put(histogram63, 0);
        Histogram histogram66 = new Histogram();
        multiset_histogram62.add(histogram66);
        Integer i69 = multiset_histogram48.replace(histogram66, 2);
        DataSourceFactory dataSourceFactory70 = new DataSourceFactory();
        boolean b71 = multiset_histogram48.containsKey(dataSourceFactory70);
        Histogram histogram72 = new Histogram();
        multiset_histogram48.add(histogram72);
        multiset_histogram24.add(histogram72);
        multiset_histogram0.add(histogram72);
        Set<Entry<Histogram, Integer>> set_entry_histogram_i76 = multiset_histogram0.entrySet();
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNotNull(set_histogram14);
        Assert.assertNull(i18);
        Assert.assertTrue(i21 == 0);
        Assert.assertTrue(i22 == 1);
        Assert.assertNotNull(set_entry_histogram_i23);
        Assert.assertNull(i27);
        Assert.assertNotNull(str_array32);
        Assert.assertTrue(b34 == true);
        Assert.assertTrue(b36 == true);
        Assert.assertNull(i37);
        Assert.assertNull(i41);
        Assert.assertNull(i45);
        Assert.assertTrue(b47 == false);
        Assert.assertNull(i51);
        Assert.assertNotNull(str_array56);
        Assert.assertTrue(b58 == true);
        Assert.assertTrue(b60 == true);
        Assert.assertNull(i61);
        Assert.assertNull(i65);
        Assert.assertNull(i69);
        Assert.assertTrue(b71 == false);
        Assert.assertNotNull(set_entry_histogram_i76);
    }

    @Test
    public void test159() throws Throwable {
        String[] str_array2 = new String[] { "", "" };
        ArrayList<String> arraylist_str3 = new ArrayList<>();
        boolean b4 = Collections.addAll(arraylist_str3, str_array2);
        Stream<String> stream_str5 = arraylist_str3.stream();
        String[] str_array8 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str9 = new ArrayList<>();
        boolean b10 = Collections.addAll(arraylist_str9, str_array8);
        String[] str_array13 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str14 = new ArrayList<>();
        boolean b15 = Collections.addAll(arraylist_str14, str_array13);
        Boolean b16 = Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        String[] str_array20 = new String[] { "", "" };
        ArrayList<String> arraylist_str21 = new ArrayList<>();
        boolean b22 = Collections.addAll(arraylist_str21, str_array20);
        Stream<String> stream_str23 = arraylist_str21.stream();
        String[] str_array26 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str27 = new ArrayList<>();
        boolean b28 = Collections.addAll(arraylist_str27, str_array26);
        String[] str_array31 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str32 = new ArrayList<>();
        boolean b33 = Collections.addAll(arraylist_str32, str_array31);
        Boolean b34 = Tokenization.contains(arraylist_str27, arraylist_str32);
        boolean b35 = arraylist_str21.containsAll(arraylist_str32);
        double d36 = TokenShareRatio.setTokenShareRatioFkLD(arraylist_str3, arraylist_str21);
        HeapWithFixedSize<String> heapwithfixedsize_str38 = new HeapWithFixedSize<>((int) (byte) 100);
        String[] str_array41 = new String[] { "", "" };
        ArrayList<String> arraylist_str42 = new ArrayList<>();
        boolean b43 = Collections.addAll(arraylist_str42, str_array41);
        Stream<String> stream_str44 = arraylist_str42.stream();
        Stream<String> stream_str45 = arraylist_str42.parallelStream();
        String[] str_array48 = new String[] { "", "" };
        ArrayList<String> arraylist_str49 = new ArrayList<>();
        boolean b50 = Collections.addAll(arraylist_str49, str_array48);
        Stream<String> stream_str51 = arraylist_str49.stream();
        String[] str_array54 = new String[] { "", "" };
        ArrayList<String> arraylist_str55 = new ArrayList<>();
        boolean b56 = Collections.addAll(arraylist_str55, str_array54);
        Stream<String> stream_str57 = arraylist_str55.stream();
        Stream<String> stream_str58 = arraylist_str55.parallelStream();
        String[] str_array61 = new String[] { "", "" };
        ArrayList<String> arraylist_str62 = new ArrayList<>();
        boolean b63 = Collections.addAll(arraylist_str62, str_array61);
        Stream<String> stream_str64 = arraylist_str62.stream();
        Stream<String> stream_str65 = arraylist_str62.parallelStream();
        String[] str_array68 = new String[] { "", "" };
        ArrayList<String> arraylist_str69 = new ArrayList<>();
        boolean b70 = Collections.addAll(arraylist_str69, str_array68);
        Stream<String> stream_str71 = arraylist_str69.stream();
        String[] str_array74 = new String[] { "", "" };
        ArrayList<String> arraylist_str75 = new ArrayList<>();
        boolean b76 = Collections.addAll(arraylist_str75, str_array74);
        Stream<String> stream_str77 = arraylist_str75.stream();
        Stream<String> stream_str78 = arraylist_str75.parallelStream();
        Stream[] stream_array80 = new Stream[6];
        @SuppressWarnings("unchecked") Stream<String>[] stream_str_array81 = (Stream<String>[]) stream_array80;
        stream_str_array81[0] = stream_str45;
        stream_str_array81[1] = stream_str51;
        stream_str_array81[2] = stream_str58;
        stream_str_array81[3] = stream_str65;
        stream_str_array81[4] = stream_str71;
        stream_str_array81[5] = stream_str78;
        Stream<String>[] stream_str_array94 = heapwithfixedsize_str38.toArray(stream_str_array81);
        Iterator<String> iterator_str95 = heapwithfixedsize_str38.iterator();
        boolean b96 = arraylist_str21.containsAll(heapwithfixedsize_str38);
        Assert.assertNotNull(str_array2);
        Assert.assertTrue(b4 == true);
        Assert.assertNotNull(stream_str5);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertNotNull(str_array13);
        Assert.assertTrue(b15 == true);
        Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        Assert.assertTrue(b17 == false);
        Assert.assertNotNull(str_array20);
        Assert.assertTrue(b22 == true);
        Assert.assertNotNull(stream_str23);
        Assert.assertNotNull(str_array26);
        Assert.assertTrue(b28 == true);
        Assert.assertNotNull(str_array31);
        Assert.assertTrue(b33 == true);
        Assert.assertTrue("'" + b34 + "' != '" + true + "'", b34.equals(true));
        Assert.assertTrue(b35 == false);
        Assert.assertTrue(d36 == 1.0d);
        Assert.assertNotNull(str_array41);
        Assert.assertTrue(b43 == true);
        Assert.assertNotNull(stream_str44);
        Assert.assertNotNull(stream_str45);
        Assert.assertNotNull(str_array48);
        Assert.assertTrue(b50 == true);
        Assert.assertNotNull(stream_str51);
        Assert.assertNotNull(str_array54);
        Assert.assertTrue(b56 == true);
        Assert.assertNotNull(stream_str57);
        Assert.assertNotNull(stream_str58);
        Assert.assertNotNull(str_array61);
        Assert.assertTrue(b63 == true);
        Assert.assertNotNull(stream_str64);
        Assert.assertNotNull(stream_str65);
        Assert.assertNotNull(str_array68);
        Assert.assertTrue(b70 == true);
        Assert.assertNotNull(stream_str71);
        Assert.assertNotNull(str_array74);
        Assert.assertTrue(b76 == true);
        Assert.assertNotNull(stream_str77);
        Assert.assertNotNull(stream_str78);
        Assert.assertNotNull(stream_array80);
        Assert.assertNotNull(stream_str_array81);
        Assert.assertNotNull(stream_str_array94);
        Assert.assertNotNull(iterator_str95);
        Assert.assertTrue(b96 == true);
    }

    @Test
    public void test160() throws Throwable {
        String[] str_array3 = new String[] { "[hi!, hi!]", "[, hi!]", "{}" };
        PriorityQueue<String> priorityqueue_str4 = new PriorityQueue<>();
        boolean b5 = Collections.addAll(priorityqueue_str4, str_array3);
        String str6 = priorityqueue_str4.poll();
        double[] d_array10 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array13 = new double[] { (byte) 1, (short) 1 };
        double[] d_array16 = Histogram.rel2abs(d_array13, (double) 100.0f, (double) ' ');
        double[] d_array19 = new double[] { (byte) 1, (short) 1 };
        double[] d_array22 = Histogram.rel2abs(d_array19, (double) 100.0f, (double) ' ');
        double d24 = Logistic.classify(d_array16, d_array22, (double) 100.0f);
        Double d25 = Histogram.jaccard(d_array10, d_array22);
        HeapWithFixedSize<String> heapwithfixedsize_str27 = new HeapWithFixedSize<>((int) (byte) 100);
        int i28 = heapwithfixedsize_str27.size();
        double[] d_array32 = new double[] { 1.0d, (-1L), '#' };
        double[] d_array35 = new double[] { (byte) 1, (short) 1 };
        double[] d_array38 = Histogram.rel2abs(d_array35, (double) 100.0f, (double) ' ');
        double[] d_array41 = new double[] { (byte) 1, (short) 1 };
        double[] d_array44 = Histogram.rel2abs(d_array41, (double) 100.0f, (double) ' ');
        double d46 = Logistic.classify(d_array38, d_array44, (double) 100.0f);
        Double d47 = Histogram.jaccard(d_array32, d_array44);
        double[] d_array50 = new double[] { (byte) 1, (short) 1 };
        double[] d_array53 = Histogram.rel2abs(d_array50, (double) 100.0f, (double) ' ');
        double[] d_array54 = Multiplication.elementWise(d_array32, d_array53);
        boolean b55 = heapwithfixedsize_str27.remove(d_array32);
        Double d56 = Histogram.jaccard(d_array10, d_array32);
        boolean b57 = priorityqueue_str4.remove(d56);
        Assert.assertNotNull(str_array3);
        Assert.assertTrue(b5 == true);
        Assert.assertTrue("'" + str6 + "' != '" + "[, hi!]" + "'", str6.equals("[, hi!]"));
        Assert.assertNotNull(d_array10);
        Assert.assertNotNull(d_array13);
        Assert.assertNotNull(d_array16);
        Assert.assertNotNull(d_array19);
        Assert.assertNotNull(d_array22);
        Assert.assertTrue(d24 == 1.0d);
        Assert.assertTrue("'" + d25 + "' != '" + 0.0d + "'", d25.equals(0.0d));
        Assert.assertTrue(i28 == 0);
        Assert.assertNotNull(d_array32);
        Assert.assertNotNull(d_array35);
        Assert.assertNotNull(d_array38);
        Assert.assertNotNull(d_array41);
        Assert.assertNotNull(d_array44);
        Assert.assertTrue(d46 == 1.0d);
        Assert.assertTrue("'" + d47 + "' != '" + 0.0d + "'", d47.equals(0.0d));
        Assert.assertNotNull(d_array50);
        Assert.assertNotNull(d_array53);
        Assert.assertNotNull(d_array54);
        Assert.assertTrue(b55 == false);
        Assert.assertTrue("'" + d56 + "' != '" + 1.0d + "'", d56.equals(1.0d));
        Assert.assertTrue(b57 == false);
    }

    @Test
    public void test161() throws Throwable {
        String[] str_array2 = new String[] { "", "" };
        ArrayList<String> arraylist_str3 = new ArrayList<>();
        boolean b4 = Collections.addAll(arraylist_str3, str_array2);
        Stream<String> stream_str5 = arraylist_str3.stream();
        String[] str_array8 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str9 = new ArrayList<>();
        boolean b10 = Collections.addAll(arraylist_str9, str_array8);
        String[] str_array13 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str14 = new ArrayList<>();
        boolean b15 = Collections.addAll(arraylist_str14, str_array13);
        Boolean b16 = Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        HeapWithFixedSize<String> heapwithfixedsize_str19 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str21 = new HeapWithFixedSize<>((int) (byte) 100);
        int i22 = heapwithfixedsize_str21.size();
        boolean b23 = heapwithfixedsize_str19.retainAll(heapwithfixedsize_str21);
        boolean b24 = arraylist_str14.removeAll(heapwithfixedsize_str21);
        String str25 = heapwithfixedsize_str21.poll();
        String[] str_array28 = new String[] { "", "" };
        ArrayList<String> arraylist_str29 = new ArrayList<>();
        boolean b30 = Collections.addAll(arraylist_str29, str_array28);
        Stream<String> stream_str31 = arraylist_str29.stream();
        String[] str_array34 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str35 = new ArrayList<>();
        boolean b36 = Collections.addAll(arraylist_str35, str_array34);
        String[] str_array39 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str40 = new ArrayList<>();
        boolean b41 = Collections.addAll(arraylist_str40, str_array39);
        Boolean b42 = Tokenization.contains(arraylist_str35, arraylist_str40);
        boolean b43 = arraylist_str29.containsAll(arraylist_str40);
        String[] str_array46 = new String[] { "", "" };
        ArrayList<String> arraylist_str47 = new ArrayList<>();
        boolean b48 = Collections.addAll(arraylist_str47, str_array46);
        Stream<String> stream_str49 = arraylist_str47.stream();
        String[] str_array52 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str53 = new ArrayList<>();
        boolean b54 = Collections.addAll(arraylist_str53, str_array52);
        String[] str_array57 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str58 = new ArrayList<>();
        boolean b59 = Collections.addAll(arraylist_str58, str_array57);
        Boolean b60 = Tokenization.contains(arraylist_str53, arraylist_str58);
        boolean b61 = arraylist_str47.containsAll(arraylist_str58);
        double d62 = TokenShareRatio.setTokenShareRatioFkLD(arraylist_str29, arraylist_str47);
        boolean b63 = arraylist_str47.isEmpty();
        List<String> list_str65 = Tokenization.split("");
        double d66 = TokenShareRatio.setTokenShareRatioFkLD(arraylist_str47, list_str65);
        boolean b67 = heapwithfixedsize_str21.contains(arraylist_str47);
        Comparator<? super String> comparator_wildcard68 = heapwithfixedsize_str21.comparator();
        Assert.assertNotNull(str_array2);
        Assert.assertTrue(b4 == true);
        Assert.assertNotNull(stream_str5);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertNotNull(str_array13);
        Assert.assertTrue(b15 == true);
        Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        Assert.assertTrue(b17 == false);
        Assert.assertTrue(i22 == 0);
        Assert.assertTrue(b23 == false);
        Assert.assertTrue(b24 == false);
        Assert.assertNull(str25);
        Assert.assertNotNull(str_array28);
        Assert.assertTrue(b30 == true);
        Assert.assertNotNull(stream_str31);
        Assert.assertNotNull(str_array34);
        Assert.assertTrue(b36 == true);
        Assert.assertNotNull(str_array39);
        Assert.assertTrue(b41 == true);
        Assert.assertTrue("'" + b42 + "' != '" + true + "'", b42.equals(true));
        Assert.assertTrue(b43 == false);
        Assert.assertNotNull(str_array46);
        Assert.assertTrue(b48 == true);
        Assert.assertNotNull(stream_str49);
        Assert.assertNotNull(str_array52);
        Assert.assertTrue(b54 == true);
        Assert.assertNotNull(str_array57);
        Assert.assertTrue(b59 == true);
        Assert.assertTrue("'" + b60 + "' != '" + true + "'", b60.equals(true));
        Assert.assertTrue(b61 == false);
        Assert.assertTrue(d62 == 1.0d);
        Assert.assertTrue(b63 == false);
        Assert.assertNotNull(list_str65);
        Assert.assertTrue(d66 == 1.0d);
        Assert.assertTrue(b67 == false);
        Assert.assertNotNull(comparator_wildcard68);
    }

    @Test
    public void test162() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        Set<Histogram> set_histogram14 = multiset_histogram0.keySet();
        boolean b15 = multiset_histogram0.isEmpty();
        String str16 = multiset_histogram0.toString();
        MultiSet<Histogram> multiset_histogram17 = new MultiSet<>();
        Histogram histogram18 = new Histogram();
        Integer i20 = multiset_histogram17.put(histogram18, 0);
        Histogram histogram21 = new Histogram();
        multiset_histogram17.add(histogram21);
        String[] str_array25 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str26 = new PriorityQueue<>();
        boolean b27 = Collections.addAll(priorityqueue_str26, str_array25);
        boolean b29 = priorityqueue_str26.offer("");
        Integer i30 = multiset_histogram17.remove("");
        MultiSet<Histogram> multiset_histogram31 = new MultiSet<>();
        Histogram histogram32 = new Histogram();
        Integer i34 = multiset_histogram31.put(histogram32, 0);
        Histogram histogram35 = new Histogram();
        multiset_histogram31.add(histogram35);
        Integer i38 = multiset_histogram17.replace(histogram35, 2);
        DataSourceFactory dataSourceFactory39 = new DataSourceFactory();
        boolean b40 = multiset_histogram17.containsKey(dataSourceFactory39);
        MultiSet<Histogram> multiset_histogram41 = new MultiSet<>();
        Histogram histogram42 = new Histogram();
        Integer i44 = multiset_histogram41.put(histogram42, 0);
        Histogram histogram45 = new Histogram();
        multiset_histogram41.add(histogram45);
        String[] str_array49 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str50 = new PriorityQueue<>();
        boolean b51 = Collections.addAll(priorityqueue_str50, str_array49);
        boolean b53 = priorityqueue_str50.offer("");
        Integer i54 = multiset_histogram41.remove("");
        MultiSet<Histogram> multiset_histogram55 = new MultiSet<>();
        Histogram histogram56 = new Histogram();
        Integer i58 = multiset_histogram55.put(histogram56, 0);
        Histogram histogram59 = new Histogram();
        multiset_histogram55.add(histogram59);
        Integer i62 = multiset_histogram41.replace(histogram59, 2);
        DataSourceFactory dataSourceFactory63 = new DataSourceFactory();
        boolean b64 = multiset_histogram41.containsKey(dataSourceFactory63);
        Histogram histogram65 = new Histogram();
        multiset_histogram41.add(histogram65);
        multiset_histogram17.add(histogram65);
        int i68 = multiset_histogram0.count(histogram65);
        MultiSet<Histogram> multiset_histogram69 = new MultiSet<>();
        Histogram histogram70 = new Histogram();
        Integer i72 = multiset_histogram69.put(histogram70, 0);
        Histogram histogram73 = new Histogram();
        multiset_histogram69.add(histogram73);
        String[] str_array77 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str78 = new PriorityQueue<>();
        boolean b79 = Collections.addAll(priorityqueue_str78, str_array77);
        boolean b81 = priorityqueue_str78.offer("");
        Integer i82 = multiset_histogram69.remove("");
        MultiSet<Histogram> multiset_histogram83 = new MultiSet<>();
        Histogram histogram84 = new Histogram();
        Integer i86 = multiset_histogram83.put(histogram84, 0);
        Histogram histogram87 = new Histogram();
        multiset_histogram83.add(histogram87);
        Integer i90 = multiset_histogram69.replace(histogram87, 2);
        DataSourceFactory dataSourceFactory91 = new DataSourceFactory();
        boolean b92 = multiset_histogram69.containsKey(dataSourceFactory91);
        Histogram histogram93 = new Histogram();
        multiset_histogram69.add(histogram93);
        multiset_histogram0.add(histogram93);
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNotNull(set_histogram14);
        Assert.assertTrue(b15 == false);
        Assert.assertNull(i20);
        Assert.assertNotNull(str_array25);
        Assert.assertTrue(b27 == true);
        Assert.assertTrue(b29 == true);
        Assert.assertNull(i30);
        Assert.assertNull(i34);
        Assert.assertNull(i38);
        Assert.assertTrue(b40 == false);
        Assert.assertNull(i44);
        Assert.assertNotNull(str_array49);
        Assert.assertTrue(b51 == true);
        Assert.assertTrue(b53 == true);
        Assert.assertNull(i54);
        Assert.assertNull(i58);
        Assert.assertNull(i62);
        Assert.assertTrue(b64 == false);
        Assert.assertTrue(i68 == 0);
        Assert.assertNull(i72);
        Assert.assertNotNull(str_array77);
        Assert.assertTrue(b79 == true);
        Assert.assertTrue(b81 == true);
        Assert.assertNull(i82);
        Assert.assertNull(i86);
        Assert.assertNull(i90);
        Assert.assertTrue(b92 == false);
    }

    @Test
    public void test163() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        Object obj14 = null;
        boolean b15 = multiset_histogram0.containsValue(obj14);
        Set<Histogram> set_histogram16 = multiset_histogram0.keySet();
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertTrue(b15 == false);
        Assert.assertNotNull(set_histogram16);
    }

    @Test
    public void test164() throws Throwable {
        MultiMap multiMap0 = new MultiMap();
        multiMap0.put("", "hi!");
        int i4 = multiMap0.size();
        List<String> list_str6 = multiMap0.get("{}");
        int i7 = multiMap0.size();
        boolean b8 = multiMap0.isEmpty();
        List<String> list_str10 = multiMap0.get("{}");
        Assert.assertTrue(i4 == 1);
        Assert.assertNotNull(list_str6);
        Assert.assertTrue(i7 == 1);
        Assert.assertTrue(b8 == false);
        Assert.assertNotNull(list_str10);
    }

    @Test
    public void test165() throws Throwable {
        TextArea textArea0 = null;
        TextAreaAppender textAreaAppender1 = new TextAreaAppender(textArea0);
        Filter filter2 = textAreaAppender1.getFilter();
        Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        Formatter formatter5 = textAreaAppender1.getFormatter();
        Filter filter6 = null;
        textAreaAppender1.setFilter(filter6);
        LogRecord logRecord8 = null;
        try {
            textAreaAppender1.publish(logRecord8);
            Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (IllegalStateException e) {
        }
        Assert.assertNull(filter2);
        Assert.assertNotNull(level3);
        Assert.assertNotNull(formatter5);
    }

    @Test
    public void test166() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        Set<Histogram> set_histogram14 = multiset_histogram0.keySet();
        boolean b15 = multiset_histogram0.isEmpty();
        String str16 = multiset_histogram0.toString();
        PrefixSelectionCustomizer prefixSelectionCustomizer17 = new PrefixSelectionCustomizer();
        Integer i18 = multiset_histogram0.get(prefixSelectionCustomizer17);
        Histogram histogram19 = null;
        int i20 = multiset_histogram0.count(histogram19);
        MultiSet<Histogram> multiset_histogram21 = new MultiSet<>();
        boolean b22 = multiset_histogram21.isEmpty();
        MultiSet<Histogram> multiset_histogram23 = new MultiSet<>();
        Histogram histogram24 = new Histogram();
        Integer i26 = multiset_histogram23.put(histogram24, 0);
        Histogram histogram27 = new Histogram();
        multiset_histogram23.add(histogram27);
        String[] str_array31 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str32 = new PriorityQueue<>();
        boolean b33 = Collections.addAll(priorityqueue_str32, str_array31);
        boolean b35 = priorityqueue_str32.offer("");
        Integer i36 = multiset_histogram23.remove("");
        Set<Histogram> set_histogram37 = multiset_histogram23.keySet();
        boolean b38 = multiset_histogram23.isEmpty();
        String str39 = multiset_histogram23.toString();
        MultiSet<Histogram> multiset_histogram40 = new MultiSet<>();
        Histogram histogram41 = new Histogram();
        Integer i43 = multiset_histogram40.put(histogram41, 0);
        Histogram histogram44 = new Histogram();
        multiset_histogram40.add(histogram44);
        String[] str_array48 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str49 = new PriorityQueue<>();
        boolean b50 = Collections.addAll(priorityqueue_str49, str_array48);
        boolean b52 = priorityqueue_str49.offer("");
        Integer i53 = multiset_histogram40.remove("");
        MultiSet<Histogram> multiset_histogram54 = new MultiSet<>();
        Histogram histogram55 = new Histogram();
        Integer i57 = multiset_histogram54.put(histogram55, 0);
        Histogram histogram58 = new Histogram();
        multiset_histogram54.add(histogram58);
        Integer i61 = multiset_histogram40.replace(histogram58, 2);
        DataSourceFactory dataSourceFactory62 = new DataSourceFactory();
        boolean b63 = multiset_histogram40.containsKey(dataSourceFactory62);
        MultiSet<Histogram> multiset_histogram64 = new MultiSet<>();
        Histogram histogram65 = new Histogram();
        Integer i67 = multiset_histogram64.put(histogram65, 0);
        Histogram histogram68 = new Histogram();
        multiset_histogram64.add(histogram68);
        String[] str_array72 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str73 = new PriorityQueue<>();
        boolean b74 = Collections.addAll(priorityqueue_str73, str_array72);
        boolean b76 = priorityqueue_str73.offer("");
        Integer i77 = multiset_histogram64.remove("");
        MultiSet<Histogram> multiset_histogram78 = new MultiSet<>();
        Histogram histogram79 = new Histogram();
        Integer i81 = multiset_histogram78.put(histogram79, 0);
        Histogram histogram82 = new Histogram();
        multiset_histogram78.add(histogram82);
        Integer i85 = multiset_histogram64.replace(histogram82, 2);
        DataSourceFactory dataSourceFactory86 = new DataSourceFactory();
        boolean b87 = multiset_histogram64.containsKey(dataSourceFactory86);
        Histogram histogram88 = new Histogram();
        multiset_histogram64.add(histogram88);
        multiset_histogram40.add(histogram88);
        int i91 = multiset_histogram23.count(histogram88);
        int i92 = multiset_histogram21.count(histogram88);
        multiset_histogram0.putAll(multiset_histogram21);
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNotNull(set_histogram14);
        Assert.assertTrue(b15 == false);
        Assert.assertNull(i18);
        Assert.assertTrue(i20 == 0);
        Assert.assertTrue(b22 == true);
        Assert.assertNull(i26);
        Assert.assertNotNull(str_array31);
        Assert.assertTrue(b33 == true);
        Assert.assertTrue(b35 == true);
        Assert.assertNull(i36);
        Assert.assertNotNull(set_histogram37);
        Assert.assertTrue(b38 == false);
        Assert.assertNull(i43);
        Assert.assertNotNull(str_array48);
        Assert.assertTrue(b50 == true);
        Assert.assertTrue(b52 == true);
        Assert.assertNull(i53);
        Assert.assertNull(i57);
        Assert.assertNull(i61);
        Assert.assertTrue(b63 == false);
        Assert.assertNull(i67);
        Assert.assertNotNull(str_array72);
        Assert.assertTrue(b74 == true);
        Assert.assertTrue(b76 == true);
        Assert.assertNull(i77);
        Assert.assertNull(i81);
        Assert.assertNull(i85);
        Assert.assertTrue(b87 == false);
        Assert.assertTrue(i91 == 0);
        Assert.assertTrue(i92 == 0);
    }

    @Test
    public void test167() throws Throwable {
        MultiMap multiMap0 = new MultiMap();
        multiMap0.put("", "hi!");
        multiMap0.put("{}", "hi!");
        List<String> list_str8 = multiMap0.get("[hi!, [, hi!], ]");
        Assert.assertNotNull(list_str8);
    }

    @Test
    public void test168() throws Throwable {
        MultiMap multiMap0 = new MultiMap();
        boolean b1 = multiMap0.isEmpty();
        Assert.assertTrue(b1 == true);
    }

    @Test
    public void test169() throws Throwable {
        List<String> list_str1 = Tokenization.split("[hi!, hi!]");
        Assert.assertNotNull(list_str1);
    }

    @Test
    public void test170() throws Throwable {
        TextArea textArea0 = null;
        TextAreaAppender textAreaAppender1 = new TextAreaAppender(textArea0);
        Filter filter2 = textAreaAppender1.getFilter();
        Level level3 = textAreaAppender1.getLevel();
        Level level4 = textAreaAppender1.getLevel();
        Assert.assertNull(filter2);
        Assert.assertNotNull(level3);
        Assert.assertNotNull(level4);
    }

    @Test
    public void test171() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Set<Histogram> set_histogram1 = multiset_histogram0.keySet();
        String str2 = multiset_histogram0.toString();
        boolean b5 = multiset_histogram0.remove(100.0d, 100);
        Collection<Integer> collection_i6 = multiset_histogram0.values();
        Assert.assertNotNull(set_histogram1);
        Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        Assert.assertTrue(b5 == false);
        Assert.assertNotNull(collection_i6);
    }

    @Test
    public void test172() throws Throwable {
        List<String> list_str1 = Tokenization.split("[, hi!]");
        Assert.assertNotNull(list_str1);
    }

    @Test
    public void test173() throws Throwable {
        String[] str_array2 = new String[] { "", "" };
        ArrayList<String> arraylist_str3 = new ArrayList<>();
        boolean b4 = Collections.addAll(arraylist_str3, str_array2);
        Stream<String> stream_str5 = arraylist_str3.stream();
        String[] str_array8 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str9 = new ArrayList<>();
        boolean b10 = Collections.addAll(arraylist_str9, str_array8);
        String[] str_array13 = new String[] { "hi!", "hi!" };
        ArrayList<String> arraylist_str14 = new ArrayList<>();
        boolean b15 = Collections.addAll(arraylist_str14, str_array13);
        Boolean b16 = Tokenization.contains(arraylist_str9, arraylist_str14);
        boolean b17 = arraylist_str3.containsAll(arraylist_str14);
        HeapWithFixedSize<String> heapwithfixedsize_str19 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str21 = new HeapWithFixedSize<>((int) (byte) 100);
        int i22 = heapwithfixedsize_str21.size();
        boolean b23 = heapwithfixedsize_str19.retainAll(heapwithfixedsize_str21);
        boolean b24 = arraylist_str14.removeAll(heapwithfixedsize_str21);
        String str25 = heapwithfixedsize_str21.poll();
        MultiSet<Histogram> multiset_histogram26 = new MultiSet<>();
        Histogram histogram27 = new Histogram();
        Integer i29 = multiset_histogram26.put(histogram27, 0);
        Histogram histogram30 = new Histogram();
        multiset_histogram26.add(histogram30);
        String[] str_array34 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str35 = new PriorityQueue<>();
        boolean b36 = Collections.addAll(priorityqueue_str35, str_array34);
        boolean b38 = priorityqueue_str35.offer("");
        Integer i39 = multiset_histogram26.remove("");
        Set<Histogram> set_histogram40 = multiset_histogram26.keySet();
        boolean b41 = multiset_histogram26.isEmpty();
        String str42 = multiset_histogram26.toString();
        PrefixSelectionCustomizer prefixSelectionCustomizer43 = new PrefixSelectionCustomizer();
        Integer i44 = multiset_histogram26.get(prefixSelectionCustomizer43);
        boolean b45 = heapwithfixedsize_str21.contains(i44);
        Stream<String> stream_str46 = heapwithfixedsize_str21.stream();
        boolean b48 = heapwithfixedsize_str21.offer("[hi!, [, hi!], ]");
        Spliterator<String> spliterator_str49 = heapwithfixedsize_str21.spliterator();
        Assert.assertNotNull(str_array2);
        Assert.assertTrue(b4 == true);
        Assert.assertNotNull(stream_str5);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertNotNull(str_array13);
        Assert.assertTrue(b15 == true);
        Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
        Assert.assertTrue(b17 == false);
        Assert.assertTrue(i22 == 0);
        Assert.assertTrue(b23 == false);
        Assert.assertTrue(b24 == false);
        Assert.assertNull(str25);
        Assert.assertNull(i29);
        Assert.assertNotNull(str_array34);
        Assert.assertTrue(b36 == true);
        Assert.assertTrue(b38 == true);
        Assert.assertNull(i39);
        Assert.assertNotNull(set_histogram40);
        Assert.assertTrue(b41 == false);
        Assert.assertNull(i44);
        Assert.assertTrue(b45 == false);
        Assert.assertNotNull(stream_str46);
        Assert.assertTrue(b48 == true);
        Assert.assertNotNull(spliterator_str49);
    }

    @Test
    public void test174() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Set<Histogram> set_histogram1 = multiset_histogram0.keySet();
        String str2 = multiset_histogram0.toString();
        boolean b5 = multiset_histogram0.remove(100.0d, 100);
        Set<Entry<Histogram, Integer>> set_entry_histogram_i6 = multiset_histogram0.entrySet();
        Assert.assertNotNull(set_histogram1);
        Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        Assert.assertTrue(b5 == false);
        Assert.assertNotNull(set_entry_histogram_i6);
    }

    @Test
    public void test175() throws Throwable {
        TextArea textArea0 = null;
        TextAreaAppender textAreaAppender1 = new TextAreaAppender(textArea0);
        Filter filter2 = textAreaAppender1.getFilter();
        Level level3 = textAreaAppender1.getLevel();
        textAreaAppender1.flush();
        Formatter formatter5 = textAreaAppender1.getFormatter();
        Filter filter6 = null;
        textAreaAppender1.setFilter(filter6);
        Filter filter8 = textAreaAppender1.getFilter();
        Filter filter9 = textAreaAppender1.getFilter();
        Assert.assertNull(filter2);
        Assert.assertNotNull(level3);
        Assert.assertNotNull(formatter5);
        Assert.assertNull(filter8);
        Assert.assertNull(filter9);
    }

    @Test
    public void test176() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Set<Histogram> set_histogram1 = multiset_histogram0.keySet();
        String str2 = multiset_histogram0.toString();
        MultiSet<Histogram> multiset_histogram3 = new MultiSet<>();
        Histogram histogram4 = new Histogram();
        Integer i6 = multiset_histogram3.put(histogram4, 0);
        Histogram histogram7 = new Histogram();
        multiset_histogram3.add(histogram7);
        String[] str_array11 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str12 = new PriorityQueue<>();
        boolean b13 = Collections.addAll(priorityqueue_str12, str_array11);
        boolean b15 = priorityqueue_str12.offer("");
        Integer i16 = multiset_histogram3.remove("");
        Set<Histogram> set_histogram17 = multiset_histogram3.keySet();
        MultiSet<Histogram> multiset_histogram18 = new MultiSet<>();
        Histogram histogram19 = new Histogram();
        Integer i21 = multiset_histogram18.put(histogram19, 0);
        Histogram histogram22 = new Histogram();
        multiset_histogram18.add(histogram22);
        String[] str_array26 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str27 = new PriorityQueue<>();
        boolean b28 = Collections.addAll(priorityqueue_str27, str_array26);
        boolean b30 = priorityqueue_str27.offer("");
        Integer i31 = multiset_histogram18.remove("");
        Set<Histogram> set_histogram32 = multiset_histogram18.keySet();
        MultiSet<Histogram> multiset_histogram33 = new MultiSet<>();
        Histogram histogram34 = new Histogram();
        Integer i36 = multiset_histogram33.put(histogram34, 0);
        Histogram histogram37 = new Histogram();
        multiset_histogram33.add(histogram37);
        int i39 = multiset_histogram18.count(histogram37);
        int i40 = multiset_histogram3.count(histogram37);
        DataSourceFactory dataSourceFactory41 = new DataSourceFactory();
        boolean b42 = multiset_histogram0.remove(histogram37, dataSourceFactory41);
        Integer i44 = multiset_histogram0.remove(-1L);
        Set<Histogram> set_histogram45 = multiset_histogram0.keySet();
        Assert.assertNotNull(set_histogram1);
        Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        Assert.assertNull(i6);
        Assert.assertNotNull(str_array11);
        Assert.assertTrue(b13 == true);
        Assert.assertTrue(b15 == true);
        Assert.assertNull(i16);
        Assert.assertNotNull(set_histogram17);
        Assert.assertNull(i21);
        Assert.assertNotNull(str_array26);
        Assert.assertTrue(b28 == true);
        Assert.assertTrue(b30 == true);
        Assert.assertNull(i31);
        Assert.assertNotNull(set_histogram32);
        Assert.assertNull(i36);
        Assert.assertTrue(i39 == 0);
        Assert.assertTrue(i40 == 0);
        Assert.assertTrue(b42 == false);
        Assert.assertNull(i44);
        Assert.assertNotNull(set_histogram45);
    }

    @Test
    public void test177() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Histogram histogram1 = new Histogram();
        Integer i3 = multiset_histogram0.put(histogram1, 0);
        Histogram histogram4 = new Histogram();
        multiset_histogram0.add(histogram4);
        String[] str_array8 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str9 = new PriorityQueue<>();
        boolean b10 = Collections.addAll(priorityqueue_str9, str_array8);
        boolean b12 = priorityqueue_str9.offer("");
        Integer i13 = multiset_histogram0.remove("");
        MultiSet<Histogram> multiset_histogram14 = new MultiSet<>();
        Histogram histogram15 = new Histogram();
        Integer i17 = multiset_histogram14.put(histogram15, 0);
        Histogram histogram18 = new Histogram();
        multiset_histogram14.add(histogram18);
        Integer i21 = multiset_histogram0.replace(histogram18, 2);
        DataSourceFactory dataSourceFactory22 = new DataSourceFactory();
        boolean b23 = multiset_histogram0.containsKey(dataSourceFactory22);
        MultiSet<Histogram> multiset_histogram24 = new MultiSet<>();
        Histogram histogram25 = new Histogram();
        Integer i27 = multiset_histogram24.put(histogram25, 0);
        Histogram histogram28 = new Histogram();
        multiset_histogram24.add(histogram28);
        String[] str_array32 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str33 = new PriorityQueue<>();
        boolean b34 = Collections.addAll(priorityqueue_str33, str_array32);
        boolean b36 = priorityqueue_str33.offer("");
        Integer i37 = multiset_histogram24.remove("");
        MultiSet<Histogram> multiset_histogram38 = new MultiSet<>();
        Histogram histogram39 = new Histogram();
        Integer i41 = multiset_histogram38.put(histogram39, 0);
        Histogram histogram42 = new Histogram();
        multiset_histogram38.add(histogram42);
        Integer i45 = multiset_histogram24.replace(histogram42, 2);
        DataSourceFactory dataSourceFactory46 = new DataSourceFactory();
        boolean b47 = multiset_histogram24.containsKey(dataSourceFactory46);
        Histogram histogram48 = new Histogram();
        multiset_histogram24.add(histogram48);
        multiset_histogram0.add(histogram48);
        String[] str_array53 = new String[] { "", "" };
        ArrayList<String> arraylist_str54 = new ArrayList<>();
        boolean b55 = Collections.addAll(arraylist_str54, str_array53);
        Stream<String> stream_str56 = arraylist_str54.stream();
        boolean b58 = multiset_histogram0.remove(arraylist_str54, (byte) 100);
        multiset_histogram0.clear();
        Assert.assertNull(i3);
        Assert.assertNotNull(str_array8);
        Assert.assertTrue(b10 == true);
        Assert.assertTrue(b12 == true);
        Assert.assertNull(i13);
        Assert.assertNull(i17);
        Assert.assertNull(i21);
        Assert.assertTrue(b23 == false);
        Assert.assertNull(i27);
        Assert.assertNotNull(str_array32);
        Assert.assertTrue(b34 == true);
        Assert.assertTrue(b36 == true);
        Assert.assertNull(i37);
        Assert.assertNull(i41);
        Assert.assertNull(i45);
        Assert.assertTrue(b47 == false);
        Assert.assertNotNull(str_array53);
        Assert.assertTrue(b55 == true);
        Assert.assertNotNull(stream_str56);
        Assert.assertTrue(b58 == false);
    }

    @Test
    public void test178() throws Throwable {
        int i2 = LCS.getLongestCommonSubsequence("hi!", "[, hi!]");
        Assert.assertTrue(i2 == 3);
    }

    @Test
    public void test179() throws Throwable {
        double[] d_array2 = new double[] { (byte) 1, (short) 1 };
        double[] d_array5 = Histogram.rel2abs(d_array2, (double) 100.0f, (double) ' ');
        double[] d_array8 = new double[] { (byte) 1, (short) 1 };
        double[] d_array11 = Histogram.rel2abs(d_array8, (double) 100.0f, (double) ' ');
        double d13 = Logistic.classify(d_array5, d_array11, (double) 100.0f);
        double[] d_array16 = new double[] { (byte) 1, (short) 1 };
        double[] d_array19 = Histogram.rel2abs(d_array16, (double) 100.0f, (double) ' ');
        double[] d_array22 = new double[] { (byte) 1, (short) 1 };
        double[] d_array25 = Histogram.rel2abs(d_array22, (double) 100.0f, (double) ' ');
        double[] d_array28 = new double[] { (byte) 1, (short) 1 };
        double[] d_array31 = Histogram.rel2abs(d_array28, (double) 100.0f, (double) ' ');
        double d33 = Logistic.classify(d_array25, d_array31, (double) 100.0f);
        Double d34 = Histogram.jaccard(d_array19, d_array25);
        double[] d_array37 = Histogram.rel2abs(d_array25, (double) 4, (double) 4);
        double[] d_array38 = new double[] {};
        Double d39 = Histogram.jaccard(d_array37, d_array38);
        double[] d_array40 = null;
        Double d41 = Histogram.jaccard(d_array38, d_array40);
        try {
            double d43 = Logistic.classify(d_array11, d_array40, 10.0d);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNotNull(d_array2);
        Assert.assertNotNull(d_array5);
        Assert.assertNotNull(d_array8);
        Assert.assertNotNull(d_array11);
        Assert.assertTrue(d13 == 1.0d);
        Assert.assertNotNull(d_array16);
        Assert.assertNotNull(d_array19);
        Assert.assertNotNull(d_array22);
        Assert.assertNotNull(d_array25);
        Assert.assertNotNull(d_array28);
        Assert.assertNotNull(d_array31);
        Assert.assertTrue(d33 == 1.0d);
        Assert.assertEquals(d34, Double.NaN, 0);
        Assert.assertNotNull(d_array37);
        Assert.assertNotNull(d_array38);
        Assert.assertEquals(d39, Double.NaN, 0);
        Assert.assertNull(d41);
    }

    @Test
    public void test180() throws Throwable {
        HeapWithFixedSize<String> heapwithfixedsize_str1 = new HeapWithFixedSize<>((int) (byte) 100);
        String[] str_array4 = new String[] { "", "" };
        ArrayList<String> arraylist_str5 = new ArrayList<>();
        boolean b6 = Collections.addAll(arraylist_str5, str_array4);
        Stream<String> stream_str7 = arraylist_str5.stream();
        Stream<String> stream_str8 = arraylist_str5.parallelStream();
        String[] str_array11 = new String[] { "", "" };
        ArrayList<String> arraylist_str12 = new ArrayList<>();
        boolean b13 = Collections.addAll(arraylist_str12, str_array11);
        Stream<String> stream_str14 = arraylist_str12.stream();
        String[] str_array17 = new String[] { "", "" };
        ArrayList<String> arraylist_str18 = new ArrayList<>();
        boolean b19 = Collections.addAll(arraylist_str18, str_array17);
        Stream<String> stream_str20 = arraylist_str18.stream();
        Stream<String> stream_str21 = arraylist_str18.parallelStream();
        String[] str_array24 = new String[] { "", "" };
        ArrayList<String> arraylist_str25 = new ArrayList<>();
        boolean b26 = Collections.addAll(arraylist_str25, str_array24);
        Stream<String> stream_str27 = arraylist_str25.stream();
        Stream<String> stream_str28 = arraylist_str25.parallelStream();
        String[] str_array31 = new String[] { "", "" };
        ArrayList<String> arraylist_str32 = new ArrayList<>();
        boolean b33 = Collections.addAll(arraylist_str32, str_array31);
        Stream<String> stream_str34 = arraylist_str32.stream();
        String[] str_array37 = new String[] { "", "" };
        ArrayList<String> arraylist_str38 = new ArrayList<>();
        boolean b39 = Collections.addAll(arraylist_str38, str_array37);
        Stream<String> stream_str40 = arraylist_str38.stream();
        Stream<String> stream_str41 = arraylist_str38.parallelStream();
        Stream[] stream_array43 = new Stream[6];
        @SuppressWarnings("unchecked") Stream<String>[] stream_str_array44 = (Stream<String>[]) stream_array43;
        stream_str_array44[0] = stream_str8;
        stream_str_array44[1] = stream_str14;
        stream_str_array44[2] = stream_str21;
        stream_str_array44[3] = stream_str28;
        stream_str_array44[4] = stream_str34;
        stream_str_array44[5] = stream_str41;
        Stream<String>[] stream_str_array57 = heapwithfixedsize_str1.toArray(stream_str_array44);
        HeapWithFixedSize<String> heapwithfixedsize_str59 = new HeapWithFixedSize<>((int) (byte) 100);
        HeapWithFixedSize<String> heapwithfixedsize_str61 = new HeapWithFixedSize<>((int) (byte) 100);
        int i62 = heapwithfixedsize_str61.size();
        boolean b63 = heapwithfixedsize_str59.retainAll(heapwithfixedsize_str61);
        boolean b64 = heapwithfixedsize_str1.containsAll(heapwithfixedsize_str59);
        String str65 = heapwithfixedsize_str1.peek();
        String str66 = heapwithfixedsize_str1.poll();
        boolean b67 = heapwithfixedsize_str1.isEmpty();
        Assert.assertNotNull(str_array4);
        Assert.assertTrue(b6 == true);
        Assert.assertNotNull(stream_str7);
        Assert.assertNotNull(stream_str8);
        Assert.assertNotNull(str_array11);
        Assert.assertTrue(b13 == true);
        Assert.assertNotNull(stream_str14);
        Assert.assertNotNull(str_array17);
        Assert.assertTrue(b19 == true);
        Assert.assertNotNull(stream_str20);
        Assert.assertNotNull(stream_str21);
        Assert.assertNotNull(str_array24);
        Assert.assertTrue(b26 == true);
        Assert.assertNotNull(stream_str27);
        Assert.assertNotNull(stream_str28);
        Assert.assertNotNull(str_array31);
        Assert.assertTrue(b33 == true);
        Assert.assertNotNull(stream_str34);
        Assert.assertNotNull(str_array37);
        Assert.assertTrue(b39 == true);
        Assert.assertNotNull(stream_str40);
        Assert.assertNotNull(stream_str41);
        Assert.assertNotNull(stream_array43);
        Assert.assertNotNull(stream_str_array44);
        Assert.assertNotNull(stream_str_array57);
        Assert.assertTrue(i62 == 0);
        Assert.assertTrue(b63 == false);
        Assert.assertTrue(b64 == true);
        Assert.assertNull(str65);
        Assert.assertNull(str66);
        Assert.assertTrue(b67 == true);
    }

    @Test
    public void test181() throws Throwable {
        MultiSet<Histogram> multiset_histogram0 = new MultiSet<>();
        Set<Histogram> set_histogram1 = multiset_histogram0.keySet();
        MultiSet<Histogram> multiset_histogram2 = new MultiSet<>();
        Histogram histogram3 = new Histogram();
        Integer i5 = multiset_histogram2.put(histogram3, 0);
        Histogram histogram6 = new Histogram();
        multiset_histogram2.add(histogram6);
        String[] str_array10 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str11 = new PriorityQueue<>();
        boolean b12 = Collections.addAll(priorityqueue_str11, str_array10);
        boolean b14 = priorityqueue_str11.offer("");
        Integer i15 = multiset_histogram2.remove("");
        MultiSet<Histogram> multiset_histogram16 = new MultiSet<>();
        Histogram histogram17 = new Histogram();
        Integer i19 = multiset_histogram16.put(histogram17, 0);
        Histogram histogram20 = new Histogram();
        multiset_histogram16.add(histogram20);
        Integer i23 = multiset_histogram2.replace(histogram20, 2);
        Integer i25 = multiset_histogram0.getOrDefault(i23, 7);
        MultiSet<Histogram> multiset_histogram26 = new MultiSet<>();
        Histogram histogram27 = new Histogram();
        Integer i29 = multiset_histogram26.put(histogram27, 0);
        Histogram histogram30 = new Histogram();
        multiset_histogram26.add(histogram30);
        String[] str_array34 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str35 = new PriorityQueue<>();
        boolean b36 = Collections.addAll(priorityqueue_str35, str_array34);
        boolean b38 = priorityqueue_str35.offer("");
        Integer i39 = multiset_histogram26.remove("");
        Set<Histogram> set_histogram40 = multiset_histogram26.keySet();
        boolean b41 = multiset_histogram26.isEmpty();
        String str42 = multiset_histogram26.toString();
        MultiSet<Histogram> multiset_histogram43 = new MultiSet<>();
        Histogram histogram44 = new Histogram();
        Integer i46 = multiset_histogram43.put(histogram44, 0);
        Histogram histogram47 = new Histogram();
        multiset_histogram43.add(histogram47);
        String[] str_array51 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str52 = new PriorityQueue<>();
        boolean b53 = Collections.addAll(priorityqueue_str52, str_array51);
        boolean b55 = priorityqueue_str52.offer("");
        Integer i56 = multiset_histogram43.remove("");
        MultiSet<Histogram> multiset_histogram57 = new MultiSet<>();
        Histogram histogram58 = new Histogram();
        Integer i60 = multiset_histogram57.put(histogram58, 0);
        Histogram histogram61 = new Histogram();
        multiset_histogram57.add(histogram61);
        Integer i64 = multiset_histogram43.replace(histogram61, 2);
        DataSourceFactory dataSourceFactory65 = new DataSourceFactory();
        boolean b66 = multiset_histogram43.containsKey(dataSourceFactory65);
        MultiSet<Histogram> multiset_histogram67 = new MultiSet<>();
        Histogram histogram68 = new Histogram();
        Integer i70 = multiset_histogram67.put(histogram68, 0);
        Histogram histogram71 = new Histogram();
        multiset_histogram67.add(histogram71);
        String[] str_array75 = new String[] { "hi!", "" };
        PriorityQueue<String> priorityqueue_str76 = new PriorityQueue<>();
        boolean b77 = Collections.addAll(priorityqueue_str76, str_array75);
        boolean b79 = priorityqueue_str76.offer("");
        Integer i80 = multiset_histogram67.remove("");
        MultiSet<Histogram> multiset_histogram81 = new MultiSet<>();
        Histogram histogram82 = new Histogram();
        Integer i84 = multiset_histogram81.put(histogram82, 0);
        Histogram histogram85 = new Histogram();
        multiset_histogram81.add(histogram85);
        Integer i88 = multiset_histogram67.replace(histogram85, 2);
        DataSourceFactory dataSourceFactory89 = new DataSourceFactory();
        boolean b90 = multiset_histogram67.containsKey(dataSourceFactory89);
        Histogram histogram91 = new Histogram();
        multiset_histogram67.add(histogram91);
        multiset_histogram43.add(histogram91);
        int i94 = multiset_histogram26.count(histogram91);
        TextArea textArea95 = null;
        TextAreaAppender textAreaAppender96 = new TextAreaAppender(textArea95);
        ErrorManager errorManager97 = textAreaAppender96.getErrorManager();
        boolean b98 = multiset_histogram0.remove(histogram91, textAreaAppender96);
        Object obj99 = multiset_histogram0.clone();
        Assert.assertNotNull(set_histogram1);
        Assert.assertNull(i5);
        Assert.assertNotNull(str_array10);
        Assert.assertTrue(b12 == true);
        Assert.assertTrue(b14 == true);
        Assert.assertNull(i15);
        Assert.assertNull(i19);
        Assert.assertNull(i23);
        Assert.assertTrue("'" + i25 + "' != '" + 7 + "'", i25.equals(7));
        Assert.assertNull(i29);
        Assert.assertNotNull(str_array34);
        Assert.assertTrue(b36 == true);
        Assert.assertTrue(b38 == true);
        Assert.assertNull(i39);
        Assert.assertNotNull(set_histogram40);
        Assert.assertTrue(b41 == false);
        Assert.assertNull(i46);
        Assert.assertNotNull(str_array51);
        Assert.assertTrue(b53 == true);
        Assert.assertTrue(b55 == true);
        Assert.assertNull(i56);
        Assert.assertNull(i60);
        Assert.assertNull(i64);
        Assert.assertTrue(b66 == false);
        Assert.assertNull(i70);
        Assert.assertNotNull(str_array75);
        Assert.assertTrue(b77 == true);
        Assert.assertTrue(b79 == true);
        Assert.assertNull(i80);
        Assert.assertNull(i84);
        Assert.assertNull(i88);
        Assert.assertTrue(b90 == false);
        Assert.assertTrue(i94 == 0);
        Assert.assertNotNull(errorManager97);
        Assert.assertTrue(b98 == false);
        Assert.assertNotNull(obj99);
    }
}

