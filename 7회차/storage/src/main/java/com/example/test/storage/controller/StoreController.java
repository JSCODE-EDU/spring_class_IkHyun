package com.example.test.storage.controller;

import com.example.test.storage.model.entity.Product;
import com.example.test.storage.model.entity.Store;
import com.example.test.storage.model.response.RequestResisterProduct;
import com.example.test.storage.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/store")
public class StoreController {

    @Autowired
    StoreService storeService;

    @PostMapping("")
    public String storeSave(Store store){
        storeService.storeSave(store);
        return store + "\n 저장했습니다";
    }

    @GetMapping("")
    public List<Store> findByAll(){
        return storeService.findAll();
    }

    @GetMapping("/{id}")
    public Store findById(@PathVariable(value = "id") Long id){
        return storeService.findById(id);
    }

    @GetMapping("/{id}/product")
    public List<Product> findByProduct(@PathVariable(value = "id") Long id){
        return storeService.findByProduct(id);
    }

    @PatchMapping("/resister-product")
    public String registerProduct(RequestResisterProduct productData){
        storeService.registerProduct(productData);
        return "저장했습니다.";
    }

}
