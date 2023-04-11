package com.codegym.restful_integration_for_blog_application.controller;

import com.codegym.restful_integration_for_blog_application.model.Blog;
import com.codegym.restful_integration_for_blog_application.service.impl.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("")
    public ResponseEntity<Page<Blog>> showListBlog(@RequestParam(defaultValue = "0") int page){
         Sort sort = Sort.by("name").descending();
         return new ResponseEntity<>(blogService.findAll(PageRequest.of(page,3,sort)), HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Blog> showDetailBlog(@PathVariable int id){
        return new ResponseEntity<>(blogService.findById(id),HttpStatus.OK);
    }
}
