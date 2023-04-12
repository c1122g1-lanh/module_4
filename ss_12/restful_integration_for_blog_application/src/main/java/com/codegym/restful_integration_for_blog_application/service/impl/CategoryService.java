package com.codegym.restful_integration_for_blog_application.service.impl;

import com.codegym.restful_integration_for_blog_application.model.Blog;
import com.codegym.restful_integration_for_blog_application.model.TypeBlog;
import com.codegym.restful_integration_for_blog_application.repository.ICategoryRepository;
import com.codegym.restful_integration_for_blog_application.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;
    @Override
    public List<TypeBlog> getAll() {
        return (List<TypeBlog>) iCategoryRepository.findAll();
    }
//
//    @Override
//    public Page<Blog> findAllByTypeBlog_Id(int id, Pageable pageable) {
//        return iCategoryRepository.findAllByTypeBlog_Id(id, pageable);
//    }


}
