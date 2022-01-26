package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double  sumDivisionAndDifference(double first, double second) {
        return division(first, second) + difference(first, second);
    }

    public static double sumAll4Operations(double first, double second) {
        return sumAndMultiply(first, second) + sumDivisionAndDifference(first, second);
    }
}
