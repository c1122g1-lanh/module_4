package com.codegym.blog_app.controller;

import com.codegym.blog_app.model.Category;
import com.codegym.blog_app.service.impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/type_blog/create")
    public String showCreate(Model model){
        model.addAttribute("category",new Category());
        return "/type_blog/create";
    }

    @PostMapping("/type_blog/create")
    public String create(@ModelAttribute Category category){
        categoryService.save(category);
        return "/type_blog/create";
    }

    @GetMapping("/type_blog/list")
    public String list(Model model){
        model.addAttribute("category",categoryService.findAll());
        return "/type_blog/list";
    }
}
