package com.codegym.restful_integration_for_blog_application.repository;

import com.codegym.restful_integration_for_blog_application.model.Blog;
import com.codegym.restful_integration_for_blog_application.model.TypeBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICategoryRepository extends PagingAndSortingRepository<TypeBlog, Integer> {

    @Query(value = "select name from blog  where id_type ", nativeQuery = true)
    List<Blog> findByIdTypeBlog(int id_type);
    Page<Blog> findAllByTypeBlog_Id(int id, Pageable pageable);

}
