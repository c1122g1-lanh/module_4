package com.codegym.borrow_books.service;

import com.codegym.borrow_books.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    List<Book> findAll();

    Optional<Book> findById(int id);

    public void saveBook(Book book);
}
