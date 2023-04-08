package com.codegym.borrow_books.service;

import com.codegym.borrow_books.model.StudentBook;

import java.util.List;

public interface IStudentBookService {
    List<StudentBook> findAllStudentBook();
    StudentBook findByIdStudentBook(Integer id);
    void saveStudentBook(StudentBook studentBook);
    void deleteStudentBook(Integer id);
    void borrowBook(Integer idBook, Integer idStudent);
}
