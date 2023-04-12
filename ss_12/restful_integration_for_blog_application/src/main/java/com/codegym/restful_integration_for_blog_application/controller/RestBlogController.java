package com.codegym.restful_integration_for_blog_application.controller;

import com.codegym.restful_integration_for_blog_application.model.Blog;
import com.codegym.restful_integration_for_blog_application.service.impl.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/blog")
@CrossOrigin({"*"})
public class RestBlogController {
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

    @GetMapping("/search")
    public ResponseEntity<Page<Blog>> search( @RequestParam(defaultValue = "0", required = false) int page, String name) {
        return new ResponseEntity<>(blogService.getByName(name, PageRequest.of(page, 2)),HttpStatus.OK);
    }

}
