package com.smuproject.grocery.repository;

import com.smuproject.grocery.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> getByName(String name);
}
