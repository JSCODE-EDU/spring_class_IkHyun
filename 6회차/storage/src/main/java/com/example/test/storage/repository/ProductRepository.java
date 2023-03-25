package com.example.test.storage.repository;

import com.example.test.storage.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findAllById(Long id);

    @Query("SELECT P FROM Product P WHERE P.name LIKE %:name%")
    List<Product> findByAllName(String name);

    @Query("SELECT P FROM Product P WHERE P.name LIKE %:name% AND P.price = :price")
    List<Product> findAllByNameAndPrice(String name, long price);

}
