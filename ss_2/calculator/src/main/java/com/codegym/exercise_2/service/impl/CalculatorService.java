package com.codegym.exercise_2.service.impl;

import com.codegym.exercise_2.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {

    @Override
    public double calculate(Double numberFirst, Double numberSecond, String subtend) {
        double result = 0.0;
        switch (subtend) {
            case "+":
                result = numberFirst + numberSecond;
                break;
            case "-":
                result = numberFirst - numberSecond;
                break;
            case "*":
                result = numberFirst * numberSecond;
                break;
            case "/":
                result = numberFirst / numberSecond;
                break;
        }
        return result;
    }
}
