package com.example;

public class Calculator {
    public int add(int a, int b) {
        System.out.println("Adding " + a + " + " + b);
        return a + b;
    }

    public int subtract(int a, int b) {
        System.out.println("Subtracting " + a + " - " + b);
        return a - b;
    }

    public int multiply(int a, int b) {
        System.out.println("Multiplying " + a + " * " + b);
        return a * b;
    }

    public int divide(int a, int b) {
        System.out.println("Dividing " + a + " / " + b);
        if (b == 0) throw new IllegalArgumentException("Division by zero");
        return a / b;
    }
}
