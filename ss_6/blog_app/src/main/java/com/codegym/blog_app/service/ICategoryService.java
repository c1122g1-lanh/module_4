package com.codegym.blog_app.service;

import com.codegym.blog_app.model.Blog;
import com.codegym.blog_app.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    void remove(Integer id);
    Iterable<Category> findAll();

    void save(Category category);

    Optional<Blog> findById(Integer id);
}
