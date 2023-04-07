package com.codegym.product_management.repository;

import com.codegym.product_management.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void createProduct(Product product);

    Product findById(int id);

    void update(int id,Product product);

    void remove(int id);

    List<Product> findByName(String name);
}
