package com.codegym.blog_app.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "blog_app")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name",columnDefinition = "varchar(45)")
    private String name;

    @Column(name = "date_of_create",columnDefinition = "varchar(45)")
    private String dateOfCreate;

    @Column(name = "content",columnDefinition =  "varchar(255)")
    private String content;
    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    public Blog() {
    }

    public Blog(int id, String name, String dateOfCreate, String content, Category category) {
        this.id = id;
        this.name = name;
        this.dateOfCreate = dateOfCreate;
        this.content = content;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(String dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
