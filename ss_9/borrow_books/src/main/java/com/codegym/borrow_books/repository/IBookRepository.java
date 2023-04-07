package com.codegym.borrow_books.repository;

import com.codegym.borrow_books.model.Book;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends PagingAndSortingRepository<Book,Integer> {
}
