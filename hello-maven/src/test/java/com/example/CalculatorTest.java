package com.example;

import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void addTest() {
        Calculator calculator = new Calculator();

        int a = 1;
        int b = 1;

        assertEquals(2, calculator.add(a,b));

    }

    @Test
    void addTest2() {
        Calculator cal = new Calculator();

        int a = 3;
        int b = -1;
        assertEquals(2, cal.add(a,b));

    }

    @Test
    void divideTest() {
        Calculator cal = new Calculator();
        int a = 6;
        int b = 2;

        assertEquals(3, cal.divide(a,b));
    }

    @Test
    void divideTest2() {
        Calculator calculator = new Calculator();
        int a = 6;
        int b = 0;

        assertThrows(IllegalArgumentException.class, () -> calculator.divide(a,b));
    }

    @Test
    void divideTest3() {
        Calculator calculator = new Calculator();
        int a = 0;
        int b = 5;

        assertEquals(0, calculator.divide(a,b));
    }
}

