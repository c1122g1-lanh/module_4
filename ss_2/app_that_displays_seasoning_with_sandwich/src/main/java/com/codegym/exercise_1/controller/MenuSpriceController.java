package com.codegym.exercise_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MenuSpriceController {
    @GetMapping("choose")
    public String showMenuChoose() {
        return "choose";
    }

    @PostMapping("list")
    public String save(@RequestParam(value = "condiment", required = false) String[] condiment, Model model) {
        boolean flag = true;
        if (condiment == null) {
            flag = false;
        }
        if (flag == false) {
            return showMenuChoose();
        }
        model.addAttribute("condiment", condiment);
        return "list";
    }
}
