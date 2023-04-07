package com.codegym.exercise_2.controller;

import com.codegym.exercise_2.service.impl.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CalculatorController {
    @GetMapping("index")
    public String showCalculator() {
        return "index";
    }

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("calculator")
    public String calculate(
            @RequestParam(name = "numberFirst") Double numberFirst,
            @RequestParam(name = "numberSecond") Double numberSecond,
            @RequestParam(name = "subtend") String subtend,
            Model model) {
        double result = calculatorService.calculate(numberFirst, numberSecond, subtend);
        if (subtend.equals("/") && numberSecond == 0) {
            String error = "by zero";
            model.addAttribute("result", error);
        } else {
            model.addAttribute("result", result);
        }
        model.addAttribute("subtend", subtend);
        model.addAttribute("numberFirst", numberFirst);
        model.addAttribute("numberSecond", numberSecond);
        return "calculator";
    }
}
