package com.smuproject.grocery.service;

import com.smuproject.grocery.entity.Product;
import com.smuproject.grocery.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    public List<Product> getProductByName(String name) {
        return repository.getByName(name);
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Delete product : "+id;
    }

    public Product updateProduct(Product product) {
        Product existing = repository.findById(product.getId()).orElse(null);
        existing.setName(product.getName());
        existing.setPrice(product.getPrice());
        return repository.save(existing);
    }

}
