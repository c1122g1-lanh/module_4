package com.codegym.blog_app.controller;

import com.codegym.blog_app.model.Blog;
import com.codegym.blog_app.service.IBlogService;
import com.codegym.blog_app.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.awt.print.Pageable;
import java.util.Optional;

@Controller
public class BlogController {
    private final IBlogService blogService;

    public BlogController(IBlogService blogService, ICategoryService service) {
        this.blogService = blogService;
        this.service = service;
    }
    private final ICategoryService service;

    @GetMapping("create")
    public String showCreateForm(Model model) {
        model.addAttribute("list",new Blog());
        model.addAttribute("category", service.findAll());
        return "/create";
    }

    @PostMapping("create")
    public String saveBlog(Blog blog) {
        blogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/blog")
    public ModelAndView listBlog(@RequestParam(defaultValue = "0") int page) {
        ModelAndView modelAndView = new ModelAndView("/list");
        Sort sort = Sort.by("dateOfCreate").descending();
        modelAndView.addObject("blogList", blogService.findAll(PageRequest.of(page,3,sort)));
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id).get());
        model.addAttribute("category",service.findAll());
        return "/edit";
    }

    @PostMapping("/edit")
    public ModelAndView update(@ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("message", "Blog updated successfully");
        return modelAndView;
    }

    @PostMapping("/delete")
    public String delete(@RequestParam(name = "id") Integer id, RedirectAttributes redirectAttributes) {
        blogService.remove(id);
        redirectAttributes.addFlashAttribute("message", "Delete success");
        return "redirect:/blog";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable Integer id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "/detail";
    }

    @GetMapping("/seach")
    public String seachByName(@RequestParam(defaultValue = "0") int page, String name,Model model){
        Sort sort = Sort.by("dateOfCreate").descending();
        model.addAttribute("blogList",blogService.findByName(name,PageRequest.of(page,3,sort)));
        return "/list";
    }
}
