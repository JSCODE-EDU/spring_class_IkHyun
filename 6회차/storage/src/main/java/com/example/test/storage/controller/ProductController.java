package com.example.test.storage.controller;

import com.example.test.storage.model.entity.Product;
import com.example.test.storage.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("")
    public List<Product> findAll(@RequestParam(name = "name", required = false) String name,
                                 @RequestParam(name = "price", required = false) Long price){
        if(name == null || name.isEmpty()){
            return productService.findAll();
        }else if(price == null){
            return productService.findByAllName(name);
        }
        return productService.findAllByNameAndPrice(name, price);
    }

    @GetMapping("{id}")
    public Object findById(@PathVariable(value = "id") Long id) throws Exception {
        Product product = productService.findById(id);
        if(product == null){
            return "조회할 데이터 없습니다.";
        }
        return product;
    }

    @PostMapping("")
    public String saveProduct(Product product){
        productService.save(product);
        return product.toString() + "\n저장하였습니다";
    }


}
