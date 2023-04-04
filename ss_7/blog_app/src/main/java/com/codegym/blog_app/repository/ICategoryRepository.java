package com.codegym.blog_app.repository;

import com.codegym.blog_app.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICategoryRepository extends PagingAndSortingRepository<Category,Integer> {
}
