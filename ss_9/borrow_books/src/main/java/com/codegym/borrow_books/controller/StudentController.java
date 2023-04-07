package com.codegym.borrow_books.controller;

import com.codegym.borrow_books.model.Student;
import com.codegym.borrow_books.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;
    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("student",new Student());
        return "student/create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Student student, Model model, RedirectAttributes redirect){
        studentService.create(student);
        model.addAttribute("student",student);
        return "redirect:/student";
    }

    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("studentList",studentService.findAll());
        return "student/list";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable int id){
        model.addAttribute("student",studentService.findById(id));
        return "student/detail";
    }
}
