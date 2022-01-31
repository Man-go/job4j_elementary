package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int middle, int right) {
        return max(max(left, middle), right);
    }

    public static int max(int left, int middle1, int middle2, int right) {
        return max(max(left, middle1), max(middle2, right));
    }
}
