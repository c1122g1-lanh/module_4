package com.codegym.restful_integration_for_blog_application.repository;

import com.codegym.restful_integration_for_blog_application.model.Blog;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog,Integer> {

}
