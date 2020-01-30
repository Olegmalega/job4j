package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void SqArea1() {
        double in = 8;
        double in2 = 2.6;
        double expected = 3.2;
        double out = SqArea.square(in, in2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
