package com.codegym.borrow_books.model;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
public class BookKey implements Serializable{
        @Column(name = "id_book")
        Integer ibBook;
        @Column(name = "id_student")
        Integer idStudent;

    public BookKey() {
    }

    public BookKey(Integer ibBook, Integer idUser) {
        this.ibBook = ibBook;
        this.idStudent = idUser;
    }

    public Integer getIbBook() {
        return ibBook;
    }

    public void setIbBook(Integer ibBook) {
        this.ibBook = ibBook;
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idUser) {
        this.idStudent = idUser;
    }
}

