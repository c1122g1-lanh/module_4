package com.codegym.product_management.service;

import com.codegym.product_management.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void createProduct(Product product);

    Product findById(int id);

    void remove(int id);

    void update(int id,Product product);

    List<Product> findByName(String name);
}
