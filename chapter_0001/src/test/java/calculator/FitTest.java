package calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void Man() {
        double in = 180;
        double expected = 91.9;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.1);
    }
    @Test
    public void Woman() {
        double in = 170;
        double expected = 68.9;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.1);
    }
}
