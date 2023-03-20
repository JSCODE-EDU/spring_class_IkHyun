package com.example.test.storage.product.repository;

import com.example.test.storage.product.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {

    static private long key = 0l;

    public long setID(){
        key++;
        return key ;
    }
    List<Product> products = new ArrayList<>();

    /*
     * 상품 모두찾기
     */
    public Optional<List<Product>> findAll(){
        return Optional.of(products);
    }

    /*
     *  상품 키값으로 찾기
     */
    public Optional<Product> findById(long id){
        for(Product product : products){
            if(product.getId() == id){
                return Optional.of(product);
            }
        }
        return Optional.ofNullable(null);
    }

    /**
     * 상품 명으로 찾기
     * @param name
     * @return
     */
    public Optional<Product>  findByName(String name){
        for(Product product : products){
            if(product.getName().equals(name)){
                return Optional.of(product);
            }
        }
        return Optional.ofNullable(null);
    }

    /**
     * 상품 등록
     * @param product
     * @return
     */
    public int create(Product saveProduct){
        for(Product product : products){
            if(saveProduct.getName().isEmpty() || product.getName().equals(saveProduct.getName())){
                return 0;
            }
        }
        products.add(saveProduct);
        return 1;
    }



}
