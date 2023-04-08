package com.codegym.borrow_books.service.impl;

import com.codegym.borrow_books.model.StudentBook;
import com.codegym.borrow_books.repository.IStudentBookRepository;
import com.codegym.borrow_books.service.IStudentBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentBookService implements IStudentBookService {

    @Autowired
    private IStudentBookRepository iStudentBookRepository;
    @Autowired
    private BookService bookService;


    @Override
    public List<StudentBook> findAllStudentBook() {
        return (List<StudentBook>) iStudentBookRepository.findAll();
    }

    @Override
    public StudentBook findByIdStudentBook(Integer id) {
        return iStudentBookRepository.findById(id).get();
    }

    @Override
    public void saveStudentBook(StudentBook studentBook) {
       iStudentBookRepository.save(studentBook);
    }

    @Override
    public void deleteStudentBook(Integer id) {
      iStudentBookRepository.deleteById(id);
    }

    @Override
    public void borrowBook(Integer idBook, Integer idStudent) {
        Integer quantity = bookService.findById(idBook).get().getQuantity();
        bookService.findById(idBook).get().setQuantity(quantity-1);
    }
}
