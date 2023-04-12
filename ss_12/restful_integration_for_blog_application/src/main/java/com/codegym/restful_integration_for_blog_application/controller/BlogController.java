package com.codegym.restful_integration_for_blog_application.controller;

import com.codegym.restful_integration_for_blog_application.service.impl.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@CrossOrigin({"*"})
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/blog")
    public String showList(Model model, @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("blogList", blogService.findAll(PageRequest.of(page, 3)));
        return "blog/list";
    }

    @GetMapping("/search")
    public String search(Model model, @RequestParam(defaultValue = "0", required = false) int page, String name) {
        model.addAttribute("blogList", blogService.getByName(name, PageRequest.of(page, 2)));
        return "blog/list";
    }
}
