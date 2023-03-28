package com.codegym.exercise_2.controller;

import com.codegym.exercise_2.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("index")
    public String showCalculator(){
        return "index";
    }
    @Autowired
    private CalculatorService calculatorService;
    @PostMapping("calculator")
    public String calculate(
            @RequestParam (name= "number1") Double number1,
            @RequestParam (name= "number2") Double number2,
            @RequestParam (name= "subtend") String subtend,
            Model model)
    {
        double result = calculatorService.calculate(number1,number2,subtend);
        model.addAttribute("number1",number1);
        model.addAttribute("number2",number2);
        model.addAttribute("subtend",subtend);
        model.addAttribute("result",result);
        return "calculator";
    }
}
