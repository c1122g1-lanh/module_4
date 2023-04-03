package com.codegym.blog_app.service;

import java.util.Optional;

public interface IGeneralService<T>{
    void save(T t);

    Iterable<T> findAll();

    void remove(Integer id);

    Optional<T> findById(Integer id);
}
