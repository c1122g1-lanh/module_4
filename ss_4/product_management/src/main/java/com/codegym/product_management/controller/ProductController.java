package com.codegym.product_management.controller;

import com.codegym.product_management.model.Product;
import com.codegym.product_management.service.impl.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("list", productService.findAll());
        return "/list";
    }

    @GetMapping("/product/create")
    public String showCreate(Model model){
        model.addAttribute("product", new Product());
        return "/create";
    }
    @PostMapping("/create")
    public String save(Product product){
        productService.createProduct(product);
        return "redirect:/product";
    }
    @GetMapping("/edit/{id}")
    public String edit( @PathVariable int id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Product product) {
        productService.update(product.getCodeProduct(), product);
        return "redirect:/";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable int id,Model model){
        model.addAttribute("product",productService.findById(id));
        return "/detail";
    }

    @GetMapping("/delete/{id}")
    public  String delete(@PathVariable int id){
        productService.remove(id);
        return "redirect:/";
    }
}
