package com.codegym.borrow_books.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_student")
    private String nameStudent;

    @ManyToMany
    @JoinTable(name = "student_book",joinColumns = @JoinColumn(name = "id_student"),inverseJoinColumns = @JoinColumn(name = "id_book"))
    private Set<Book> bookSet;

    public Student() {
    }

    public Student(Integer id, String nameStudent, Set<Book> bookSet) {
        this.id = id;
        this.nameStudent = nameStudent;
        this.bookSet = bookSet;
    }

    public Student(Integer id_student, String nameStudent) {
        this.id = id_student;
        this.nameStudent = nameStudent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public Set<Book> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }
}
