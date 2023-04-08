package com.codegym.borrow_books.model;

import javax.persistence.*;

@Entity
@Table(name="book_user")
public class StudentBook {
        @EmbeddedId
        BookKey id;
        @ManyToOne
        @MapsId("id_book")
        @JoinColumn(name="id_book")
        private Book book;

        @ManyToOne
        @MapsId("id_student")
        @JoinColumn(name="id_student")
        private Student student;
        private Integer IdBorrowBook;

    public StudentBook() {
    }


    public StudentBook(BookKey id, Book book, Student student, Integer idBorrowBook) {
        this.id = id;
        this.book = book;
        this.student = student;
        IdBorrowBook = idBorrowBook;
    }

    public BookKey getId() {
        return id;
    }

    public void setId(BookKey id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getIdBorrowBook() {
        return IdBorrowBook;
    }

    public void setIdBorrowBook(Integer idBorrowBook) {
        IdBorrowBook = idBorrowBook;
    }
}
