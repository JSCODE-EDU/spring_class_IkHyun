package com.example.test.storage.service;

import com.example.test.storage.model.entity.Product;
import com.example.test.storage.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        return productRepository.findById(id)
                .map(product -> product)
                .orElseGet(() -> null);
    }

    public List<Product> findAllByName(String name){
        return productRepository.findAllByName(name);
    }

    public List<Product> findAllByNameAndPrice(String name, long price){
        return productRepository.findAllByNameAndPrice(name, price);
    }

    public void save(Product product){
        productRepository.save(product);
    }
}
