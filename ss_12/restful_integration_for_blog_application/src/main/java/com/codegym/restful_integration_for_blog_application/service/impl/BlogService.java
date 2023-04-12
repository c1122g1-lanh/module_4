package com.codegym.restful_integration_for_blog_application.service.impl;

import com.codegym.restful_integration_for_blog_application.model.Blog;
import com.codegym.restful_integration_for_blog_application.repository.IBlogRepository;
import com.codegym.restful_integration_for_blog_application.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {

    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public Page<Blog> findAll(PageRequest pageRequest) {
        return iBlogRepository.findAll(pageRequest);
    }

    @Override
    public Blog findById(int id) {
        return iBlogRepository.findById(id).get();
    }

    @Override
    public Page<Blog> getByName(String name, PageRequest pageRequest) {
        return iBlogRepository.findBlogByNameContaining(name, pageRequest);
    }
}
