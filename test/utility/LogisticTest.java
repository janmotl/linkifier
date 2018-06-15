package utility;

import org.junit.Assert;
import org.junit.Test;

import static utility.Logistic.classify;

public class LogisticTest {

    @Test
    public void ok() throws Exception {
        double[] x = {1.0, 1.0};
        double[] weights = {1.0, 0.0};
        double bias = 0.0;

        Assert.assertEquals(0.7310585787, classify(x, weights, bias), 0.0000001);
    }

    @Test(expected = RuntimeException.class)
    public void exception() throws Exception {
        double[] x = {Double.NaN, 1.0};
        double[] weights = {1.0, 0.0};
        double bias = 0.0;

        classify(x, weights, bias);
    }

}