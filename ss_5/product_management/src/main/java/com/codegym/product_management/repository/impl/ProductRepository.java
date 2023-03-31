package com.codegym.product_management.repository.impl;

import com.codegym.product_management.model.Product;
import com.codegym.product_management.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

import static com.codegym.product_management.repository.impl.BaseRepository.entityManager;

@Repository
public class ProductRepository implements IProductRepository {
    static private List<Product> productList = new ArrayList<>();


    @Override
    public List<Product> findAll() {
        List<Product> productList = entityManager
                .createQuery("select s from Product s", Product.class)
                .getResultList();
        return productList;
    }

    @Override
    public void createProduct(Product product) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(product);
        entityTransaction.commit();
    }

    @Override
    public Product findById(int id) {
        productList = findAll();
        for (Product product : productList) {
            if (id == product.getCodeProduct()) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        product = findById(id);
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.merge(product);
        entityTransaction.commit();
    }

    public void remove(int id) {
        Product product = findById(id);
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.remove(product);
        entityTransaction.commit();


    }

    public List<Product> findByName(String name) {
        productList = findAll();
        List<Product> list = new ArrayList<>();
        for (Product product : productList) {
            if (product.getNameProduct().toLowerCase().contains(name.toLowerCase())) {
                list.add(product);
            }
        }
        return list;
    }
}
