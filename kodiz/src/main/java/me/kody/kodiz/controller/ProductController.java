package me.kody.kodiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.kody.kodiz.model.Product;
import me.kody.kodiz.service.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;


    @GetMapping("/products")
    public List<Product> getAllProduct(){
        return service.getAllProduct();
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id){

        return service.getAllProductById(id);
    }

}