package com.calculatoronspring.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiseImpTest {
    final CalculatorServiceImp calculator = new CalculatorServiceImp();
    private int two, five, seven, zero;

    @BeforeEach
    public void setUp(){
        two = 2;
        five = 5;
        seven = 7;
        zero = 0;
    }
    @Test
    public void add(){
        int actual = calculator.add(two, five);
        int expected = two + five;
        assertEquals(expected, actual);
    }
    @Test
    public void minus(){
        int actual = calculator.minus(seven, five);
        int expected = seven - five;
        assertEquals(expected, actual);
    }
    @Test
    public void divide(){
        int actual = calculator.divide(seven, five);
        int expected = seven / five;
        assertEquals(expected, actual);
    }
    @Test
    public void multiply() {
        int actual = calculator.multiply(seven, two);
        int expected = seven * two;
        assertEquals(expected, actual);
    }
}
