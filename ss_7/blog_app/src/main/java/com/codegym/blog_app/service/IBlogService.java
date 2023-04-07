package com.codegym.blog_app.service;

import com.codegym.blog_app.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogService{
    void remove(Integer id);
    Page<Blog> findAll(Pageable pageable);

    void save(Blog blog);

    Optional<Blog> findById(Integer id);

    Page<Blog> findByName(String name,PageRequest pageable);
}
