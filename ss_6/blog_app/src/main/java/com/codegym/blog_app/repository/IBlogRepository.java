package com.codegym.blog_app.repository;

import com.codegym.blog_app.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer>, PagingAndSortingRepository<Blog,Integer> {

}
