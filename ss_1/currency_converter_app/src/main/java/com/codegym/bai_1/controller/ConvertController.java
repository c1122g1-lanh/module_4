package com.codegym.bai_1.controller;

import com.codegym.bai_1.service.impl.ConvertService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()
public class ConvertController {

    private ConvertService convertService = new ConvertService();

    @GetMapping("/index")
    String index() {
        return "index";
    }

    @PostMapping("/convert")
    public String convert(@RequestParam(name = "usd") Double usd, Model model) {
        Double result = convertService.convert(usd);
        model.addAttribute("result", result);
        model.addAttribute("usd", usd);
        return "submit";
    }
}
