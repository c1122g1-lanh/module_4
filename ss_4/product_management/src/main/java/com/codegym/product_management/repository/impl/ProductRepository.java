package com.codegym.product_management.repository.impl;

import com.codegym.product_management.model.Product;
import com.codegym.product_management.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    static private List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Coca", 15.0, "Coca", "OK"));
        productList.add(new Product(2, "Milk", 10.0, "Vinamilk", "OK"));
        productList.add(new Product(3, "Pepsi", 11.0, "Coca", "NO"));
        productList.add(new Product(4, "Bánh", 20.0, "Oshi", "NO"));
        productList.add(new Product(5, "Kẹo", 11.0, "Oshi", "OK"));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void createProduct(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product product : productList) {
            if (id == product.getCodeProduct()) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        Product product1 = findById(id);
        productList.set(productList.indexOf(product1), product);
    }

    public void remove(int id) {
        productList.remove(findById(id));
    }
    public List<Product> findByName(String name){
        List<Product> list = new ArrayList<>();
        for (Product product : productList){
            if (product.getNameProduct().toLowerCase().contains(name.toLowerCase())){
                list.add(product);
            }
        }return list;
    }
}
