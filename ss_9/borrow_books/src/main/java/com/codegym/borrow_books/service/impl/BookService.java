package com.codegym.borrow_books.service.impl;

import com.codegym.borrow_books.model.Book;
import com.codegym.borrow_books.repository.IBookRepository;
import com.codegym.borrow_books.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository iBookRepository;


    @Override
    public List<Book> findAll() {
        return (List<Book>) iBookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(int id) {
        return iBookRepository.findById(id);
    }

    @Override
    public void saveBook(Book book) {
        iBookRepository.save(book);
    }
}
