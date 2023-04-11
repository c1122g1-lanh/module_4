package com.codegym.restful_integration_for_blog_application.model;

import javax.persistence.*;

@Entity
@Table(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBlog;
    private String name;

    private String content;
    @ManyToOne
    @JoinColumn(name = "idType")
    private TypeBlog typeBlog;

    public Blog() {
    }

    public Blog(Integer idBlog, String name, String content, TypeBlog typeBlog) {
        this.idBlog = idBlog;
        this.name = name;
        this.content = content;
        this.typeBlog = typeBlog;
    }

    public Integer getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(Integer idBlog) {
        this.idBlog = idBlog;
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

    public TypeBlog getTypeBlog() {
        return typeBlog;
    }

    public void setTypeBlog(TypeBlog typeBlog) {
        this.typeBlog = typeBlog;
    }
}
