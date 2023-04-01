package com.example.test.storage.repository;

import com.example.test.storage.model.entity.StoreProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreProductRepository  extends JpaRepository<StoreProduct, Long> {
}
