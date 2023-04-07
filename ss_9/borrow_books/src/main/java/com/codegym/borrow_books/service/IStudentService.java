package com.codegym.borrow_books.service;

import com.codegym.borrow_books.model.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    List<Student> findAll();

    Optional<Student> findById(int id);
    Student create(Student student);
}
