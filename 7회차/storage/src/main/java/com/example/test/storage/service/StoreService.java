package com.example.test.storage.service;

import com.example.test.storage.model.entity.Product;
import com.example.test.storage.model.entity.Store;
import com.example.test.storage.model.entity.StoreProduct;
import com.example.test.storage.model.response.RequestResisterProduct;
import com.example.test.storage.repository.ProductRepository;
import com.example.test.storage.repository.StoreProductRepository;
import com.example.test.storage.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StoreService {

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    StoreProductRepository storeProductRepository;

    public void storeSave(Store store){
        storeRepository.save(store);
    }

    public List<Store> findAll(){
        return storeRepository.findAll();
    }

    public Store findById(Long id){
        return storeRepository.findById(id)
                .map(store -> store)
                .orElseThrow(() -> new IllegalArgumentException("조회할 상점이 없습니다."));
    }

    public List<Product> findByProduct(Long id){
        return storeRepository.findById(id)
                .map(store -> store.getProductList())
                .map(storeProducts -> storeProducts.stream()
                                        .map(storeProduct -> storeProduct.getProduct()).collect(Collectors.toList()))
                .orElseThrow(() -> new IllegalArgumentException("조회할 상점이 없습니다."));
    }

    public void registerProduct(RequestResisterProduct productData){
        StoreProduct storeProduct = new StoreProduct();
        Product product = productRepository.findAllById(productData.getProduct_id());
        Store store = findById(productData.getStore_id());

        storeProduct.setStore(store);
        storeProduct.setProduct(product);
        storeProduct.setStock(productData.getStock());

        storeProductRepository.save(storeProduct);

    }

}
