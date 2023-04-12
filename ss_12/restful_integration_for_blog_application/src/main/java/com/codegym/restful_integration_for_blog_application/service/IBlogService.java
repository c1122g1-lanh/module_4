package com.codegym.restful_integration_for_blog_application.service;

import com.codegym.restful_integration_for_blog_application.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(PageRequest pageRequest);

    Blog findById(int id);

    Page<Blog> getByName(String name, PageRequest pageRequest);
}
