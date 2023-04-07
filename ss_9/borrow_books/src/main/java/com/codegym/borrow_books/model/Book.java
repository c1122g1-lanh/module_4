package com.codegym.borrow_books.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_book")
    private String nameBook;
    @Column(name = "quantity")
    private Integer quantity;

    @ManyToMany(mappedBy = "bookSet")
    private Set<Student> studentSet;

    public Book() {
    }

    public Book(Integer id, String nameBook, Set<Student> studentSet) {
        this.id = id;
        this.nameBook = nameBook;
        this.studentSet = studentSet;
    }

    public Book(Integer id, String nameBook, Integer quantity) {
        this.id = id;
        this.nameBook = nameBook;
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getId_book() {
        return id;
    }

    public void setId_book(Integer id_book) {
        this.id = id_book;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }
}
