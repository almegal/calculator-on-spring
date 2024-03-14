package com.calculatoronspring.calculator.controller;

import com.calculatoronspring.calculator.service.CalculatorServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CalculatorController {
    final private CalculatorServiceImp calculator;

    public CalculatorController(CalculatorServiceImp calculator) {
        this.calculator = calculator;
    }

    @GetMapping
    public String startPage(){
        return "Добропожаловать в мегакалькулятор";
    }

    @GetMapping("/plus")
    public String plus(
            @RequestParam(name="num1",required = false) Integer a,
            @RequestParam(name="num2",required = false) Integer b){
        return calculator.add(a, b);
    }
    @GetMapping("/minus")
    public String minus(
            @RequestParam(name="num1",required = false) Integer a,
            @RequestParam(name="num2",required = false) Integer b){
        return calculator.minus(a, b);
    }
    @GetMapping("/divide")
    public String divide(
            @RequestParam(name="num1",required = false) Integer a,
            @RequestParam(name="num2",required = false) Integer b){
        return calculator.divide(a, b);
    }
    @GetMapping("/multiply")
    public String multiply(
            @RequestParam(name="num1",required = false) Integer a,
            @RequestParam(name="num2",required = false) Integer b){
        return calculator.add(a, b);
    }
}
