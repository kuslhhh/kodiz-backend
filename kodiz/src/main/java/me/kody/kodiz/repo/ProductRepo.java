package me.kody.kodiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import me.kody.kodiz.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
