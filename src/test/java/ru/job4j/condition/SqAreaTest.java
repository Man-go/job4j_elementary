package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP7K4Square195() {
        int p = 7;
        double k = 4;
        double expected = 1.95;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP11K3Square567() {
        int p = 11;
        double k = 3;
        double expected = 5.67;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}