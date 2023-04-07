package com.codegym.borrow_books.service.impl;

import com.codegym.borrow_books.model.Student;
import com.codegym.borrow_books.repository.IStudentRepository;
import com.codegym.borrow_books.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository iStudentRepository;
    @Override
    public List<Student> findAll() {
        return (List<Student>) iStudentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(int id) {
        return iStudentRepository.findById(id);
    }

    @Override
    public Student create(Student student) {
        return iStudentRepository.save(student);
    }
}
