package com.codegym.restful_integration_for_blog_application.controller;

import com.codegym.restful_integration_for_blog_application.model.Blog;
import com.codegym.restful_integration_for_blog_application.model.TypeBlog;
import com.codegym.restful_integration_for_blog_application.service.impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @GetMapping("")
    public ResponseEntity<List<TypeBlog>> showList(){
        return new ResponseEntity<>(categoryService.getAll(), HttpStatus.OK);
    }
//    @GetMapping("/{id}")
//    public ResponseEntity<Page<Blog>> showBlogListByTypeBlog(@PathVariable int id, Pageable pageable) {
//        return new ResponseEntity<>(categoryService.findAllByTypeBlog_Id(id,pageable), HttpStatus.OK);
//    }
}
