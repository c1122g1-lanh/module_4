package com.codegym.product_management.service.impl;

import com.codegym.product_management.model.Product;
import com.codegym.product_management.repository.impl.ProductRepository;
import com.codegym.product_management.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    private ProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void createProduct(Product product) {
        productRepository.createProduct(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);
    }

    @Override
    public void update(int id, Product product) {
        productRepository.update(id,product);
    }
}
