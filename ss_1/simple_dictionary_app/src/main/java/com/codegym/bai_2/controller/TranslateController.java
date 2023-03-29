package com.codegym.bai_2.controller;

import com.codegym.bai_2.service.impl.TranslateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()
public class TranslateController {

    TranslateService translateService = new TranslateService();
    @GetMapping("home")
    String index() {
        return "home";
    }

    @PostMapping("/translate")
    String translate(@RequestParam(name = "word") String key, Model model){
        String word = translateService.translate(key);
        System.out.println(word);
        model.addAttribute("key",key);
        model.addAttribute("words",word);
       return "translate";
    }
}
