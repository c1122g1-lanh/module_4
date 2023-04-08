package com.codegym.borrow_books.controller;

import com.codegym.borrow_books.model.StudentBook;
import com.codegym.borrow_books.service.IBookService;
import com.codegym.borrow_books.service.IStudentBookService;
import com.codegym.borrow_books.service.IStudentService;
import com.codegym.borrow_books.service.impl.StudentBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class StudentBookController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private IStudentService studentService;
    @Autowired
    private StudentBookService iStudentBookService;

    @GetMapping("/l")
    public String findAllStudentBook(Model model) {
        List< StudentBook > listStudentBook = iStudentBookService.findAllStudentBook();
        System.out.println(listStudentBook);
        model.addAttribute("listStudentBook", listStudentBook);
        System.out.println();
        return "list_book_student";
    }

    @GetMapping("/{idBook}/{idStudent}")
    public String borrowBook(@PathVariable Integer idBook, @PathVariable Integer idStudent) {
        Integer quantity = bookService.findById(idBook).get().getQuantity();
        if (quantity <= 0) {
            return "error";
        } else {
            iStudentBookService.borrowBook(idBook, idStudent);
            bookService.saveBook(bookService.findById(idBook).get());
            return "redirect:/l";
        }
    }
}

