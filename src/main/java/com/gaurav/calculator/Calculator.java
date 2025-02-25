package com.gaurav.calculator;

public class Calculator {

    public static double sqrt(double x) {
        return Math.sqrt(x);
    }

    public static long factorial(int x) {
        if (x < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        long result = 1;
        for (int i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static double ln(double x) {
        return Math.log(x);
    }

    public static double power(double x, double b) {
        return Math.pow(x, b);
    }
}