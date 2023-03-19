package com.example.test.storage.product.service;

import com.example.test.storage.model.Header;
import com.example.test.storage.model.HttpResponse;
import com.example.test.storage.model.ProductRequestParam;
import com.example.test.storage.product.Product;
import com.example.test.storage.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
        // 시작할때 데이터 등록
        productRepository.create(Product.builder()
                .name("맥북 m2pro")
                .price(3000000l)
                .id(productRepository.setID())
                .build());
        productRepository.create(Product.builder()
                .name("갤럭시 북3 pro")
                .price(2000000l)
                .id(productRepository.setID())
                .build());
        productRepository.create(Product.builder()
                .name("아이패드 프로")
                .price(1200000l)
                .id(productRepository.setID())
                .build());
        productRepository.create(Product.builder()
                .name("갤럭시 탭 pro")
                .price(1000000l)
                .id(productRepository.setID())
                .build());
    }
    /*
     * 상품 모두찾기
     */
    public HttpResponse findAll(){
        return productRepository.findAll()
                .map(products -> response(products))
                .orElseGet(() -> ERROR("데이터가 없습니다."));
    }

    /*
     *  상품 키값으로 찾기
     */
    public HttpResponse findById(long id){
        return productRepository.findById(id)
                .map(product -> response(product))
                .orElseGet(() -> ERROR("데이터가 없습니다."));

    }

    /**
     * 상품 명으로 찾기
     * @param name
     * @return
     */
    public HttpResponse findByName(String name){
        return productRepository.findByName(name)
                .map(product -> response(product))
                .orElseGet(() -> ERROR("데이터가 없습니다."));
    }

    /**
     * 상품 등록
     * @param product
     * @return
     */
    public HttpResponse create(ProductRequestParam product){
        Product saveProduct = Product.builder()
                .id(productRepository.setID())
                .name(product.getName())
                .price(product.getPrice())
                .build();
        productRepository.create(saveProduct);
        return response(saveProduct);
    }


    public HttpResponse response(Product product){
        return HttpResponse.builder()
                .header(Header.OK())
                .body(product)
                .build();
    }


    public HttpResponse response(List<Product> products){
        return HttpResponse.builder()
                .header(Header.OK())
                .body(products)
                .build();
    }

    public HttpResponse ERROR(String message){
        return HttpResponse.builder()
                .header(Header.error(message, 404))
                .body(null)
                .build();
    }
}
