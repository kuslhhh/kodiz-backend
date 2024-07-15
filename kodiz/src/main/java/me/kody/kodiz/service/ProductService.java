package me.kody.kodiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.kody.kodiz.model.Product;
import me.kody.kodiz.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProduct() {
        return repo.findAll();
    }

    public Product getAllProductById(int id) {
    
        return repo.findById(id).get();
    }
}
