package com.example.test.storage.product.controller;

import com.example.test.storage.model.HttpResponse;
import com.example.test.storage.model.ProductRequestParam;
import com.example.test.storage.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@Slf4j
public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping("/{id}")
    public HttpResponse productFindId(@PathVariable long id){
        return productService.findById(id);
    }

    @GetMapping("")
    public HttpResponse productFindName(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "monetaryUnit", required = false) String monetaryUnit){
        log.info(name);
        if(name == null){
            return productService.findAll();
        }
        return productService.findByName(name, monetaryUnit);
    }

    @PostMapping("")
    public HttpResponse productCreate(ProductRequestParam productRequestParam){
        return productService.create(productRequestParam);
    }
}
