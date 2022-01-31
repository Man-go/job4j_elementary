package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7To3Then7() {
        int left = 7;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax9To9Then9() {
        int left = 9;
        int right = 9;
        int result = Max.max(left, right);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To5To12Then12() {
        int left = 10;
        int middle = 5;
        int right = 12;
        int result = Max.max(left, middle, right);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxMinus10To21To15To33Then12() {
        int first = -10;
        int second = 21;
        int third = 15;
        int fourth = 33;
        int result = Max.max(first, second, third, fourth);
        int expected = 33;
        Assert.assertEquals(result, expected);
    }
}