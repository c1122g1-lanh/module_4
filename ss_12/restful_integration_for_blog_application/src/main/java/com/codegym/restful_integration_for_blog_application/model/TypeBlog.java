package com.codegym.restful_integration_for_blog_application.model;

import javax.persistence.*;

@Entity
@Table(name = "type_blog")
public class TypeBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idType;
    private String name;

    public TypeBlog() {
    }

    public TypeBlog(Integer idType, String name) {
        this.idType = idType;
        this.name = name;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
