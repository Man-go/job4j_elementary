package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to34then5() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        double expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to11then1dot41() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        double expected = 1.41;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to20then5() {
        Point a = new Point(1, 1);
        Point b = new Point(5, 4);
        double expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11Minus1to5Minus49then6dot4() {
        Point a = new Point(1, 1, -1);
        Point b = new Point(5, -4, 9);
        double expected = 6.4;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to111hen1dot41() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double expected = 1.41;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}