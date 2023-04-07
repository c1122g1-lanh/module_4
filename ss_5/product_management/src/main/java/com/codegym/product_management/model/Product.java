package com.codegym.product_management.model;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code_product")
    private Integer codeProduct;
    @Column(name = "name_product",columnDefinition = "varchar(100)")
    private String nameProduct;
    @Column(name = "price_prodcut",columnDefinition = "Double")
    private Double priceProduct;
    @Column(name = "manufacturer",columnDefinition = "varchar(100)")
    private String manufacturer;
    @Column(name = "description",columnDefinition = "varchar(100)")
    private String description;

    public Product() {
    }

    public Product(Integer codeProduct, String nameProduct, Double priceProduct, String manufacturer, String description) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public Integer getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(Integer codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
