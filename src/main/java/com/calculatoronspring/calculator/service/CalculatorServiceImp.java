package com.calculatoronspring.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImp  implements CalculatorService {

    @Override
    public String add(Integer a, Integer b) throws IllegalArgumentException {
        isNotNullArgs(a,b);
        return String.format("%d + %d = %d", a, b, a+ b);
    }

    @Override
    public String minus(Integer a, Integer b) {
        isNotNullArgs(a,b);
        return String.format("%d - %d = %d", a, b, a - b);
    }

    @Override
    public String divide(Integer a, Integer b) {
        isNotNullArgs(a,b);
        if(b == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
        return String.format("%d / %d = %d", a, b, a / b);
    }

    @Override
    public String multiply(Integer a, Integer b) {
        isNotNullArgs(a,b);
        return String.format("%d * %d = %d", a, b, a * b);
    }

    private void isNotNullArgs(Integer a, Integer b)  throws IllegalArgumentException {
        if (a == null || b == null) throw new IllegalArgumentException("Не введен один или два параметра для вычисления");
    }
}
