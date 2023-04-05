package com.codegym.validate_registration_form.controller;

import com.codegym.validate_registration_form.model.User;
import com.codegym.validate_registration_form.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/index")
    public String showCreateForm(Model model) {
        model.addAttribute("user", new User());
        return "/index";
    }

    @PostMapping("/result")
    public String createUser(@Valid @ModelAttribute User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "/index";
        } else {
            iUserService.create(user);
            model.addAttribute("message", "Create success");
            return "/result";
        }
    }
}
