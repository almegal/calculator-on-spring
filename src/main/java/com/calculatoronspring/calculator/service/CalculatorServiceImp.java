package com.calculatoronspring.calculator.service;

public class CalculatorServiceImp  implements CalculatorService {

    @Override
    public int add(Integer a, Integer b) throws IllegalArgumentException {
        isNotNullArgs(a,b);
        return a + b;
    }

    @Override
    public int minus(Integer a, Integer b) {
        isNotNullArgs(a,b);
        return a - b;
    }

    @Override
    public int divide(Integer a, Integer b) {
        isNotNullArgs(a,b);
        if(b == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
        return a / b;
    }

    @Override
    public int multiply(Integer a, Integer b) {
        isNotNullArgs(a,b);
        return a * b;
    }

    private void isNotNullArgs(Integer a, Integer b)  throws IllegalArgumentException {
        if (a == null || b == null) throw new IllegalArgumentException("Не введен один или два параметра для вычисления");
    }
}
