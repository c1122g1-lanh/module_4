package com.codegym.restful_integration_for_blog_application.service;

import com.codegym.restful_integration_for_blog_application.model.Blog;
import com.codegym.restful_integration_for_blog_application.model.TypeBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICategoryService {
    List<TypeBlog> getAll();
    Page<Blog> findAllByTypeBlog_Id(int id, Pageable pageable);
}
