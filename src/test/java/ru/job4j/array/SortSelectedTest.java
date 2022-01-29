package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort10() {
        int[] data = new int[] {1, 2, 5, 10, 0, -10, -3, -7, -15, 0, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-15, -10, -7, -3, 0, 0, 1, 2, 5, 10, 10};
        Assert.assertArrayEquals(expected, result);
    }
}