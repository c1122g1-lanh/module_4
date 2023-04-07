package com.codegym.borrow_books.repository;

import com.codegym.borrow_books.model.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends PagingAndSortingRepository<Student,Integer> {
}
