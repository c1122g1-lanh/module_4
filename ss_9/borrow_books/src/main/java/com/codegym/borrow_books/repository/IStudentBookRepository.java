package com.codegym.borrow_books.repository;

import com.codegym.borrow_books.model.StudentBook;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentBookRepository extends PagingAndSortingRepository<StudentBook,Integer> {
}
