package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        System.out.println("Running testAdd");
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtract() {
        System.out.println("Running testSubtract");
        assertEquals(4, calc.subtract(7, 3));
    }

    @Test
    void testMultiply() {
        System.out.println("Running testMultiply");
        assertEquals(15, calc.multiply(3, 5));
    }

    @Test
    void testDivide() {
        System.out.println("Running testDivide");
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        System.out.println("Running testDivideByZero");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
        assertEquals("Division by zero", exception.getMessage());
    }
}
