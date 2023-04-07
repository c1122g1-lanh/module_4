package com.codegym.blog_app.service.impl;

import com.codegym.blog_app.model.Blog;
import com.codegym.blog_app.model.Category;
import com.codegym.blog_app.repository.ICategoryRepository;
import com.codegym.blog_app.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;
    @Override
    public void remove(Integer id) {

    }

    @Override
    public List<Category> findAll() {
        return (List<Category>) categoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Optional<Blog> findById(Integer id) {
        return Optional.empty();
    }
}
