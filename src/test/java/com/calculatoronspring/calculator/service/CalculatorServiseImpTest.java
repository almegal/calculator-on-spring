package com.calculatoronspring.calculator.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiseImpTest {
    final CalculatorServiceImp calculator = new CalculatorServiceImp();

    static Stream<Arguments> argsProvider(){
        return Stream.of(
                Arguments.of(1,3),
                Arguments.of(10,-14),
                Arguments.of(0,3),
                Arguments.of(100, 5000),
                Arguments.of(-10, 15)
        );
    }

    static Stream<Arguments> argsNull(){
        return Stream.of(
                Arguments.of(null, null),
                Arguments.of(null, 1),
                Arguments.of(1, null)
        );
    }

    @ParameterizedTest
    @MethodSource("argsProvider")
     public void minusParametizedTest(int a, int b){
        String actual = calculator.minus(a, b);
        String expected = String.format("%d - %d = %d", a, b, a - b);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("argsProvider")
    public void addWithParametizedTest(int a, int b) {
        String actual = calculator.add(a, b);
        String expected = String.format("%d + %d = %d", a, b, a + b);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("argsProvider")
    public void divide(int a, int b){
        String actual = calculator.divide(a, b);
        String expected = String.format("%d / %d = %d", a, b, a / b);
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @MethodSource("argsProvider")
    public void multiply(int a, int b) {
        String actual = calculator.multiply(a, b);
        String expected = String.format("%d * %d = %d", a, b, a * b);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("argsNull")
    void testMethodNullSource(Integer a, Integer b) {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.add(a,b);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.minus(a,b);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(a,b);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.multiply(a,b);
        });
    }

    @Test
    public void divideZero(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });

    }

}
