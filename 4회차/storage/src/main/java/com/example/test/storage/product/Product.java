package com.example.test.storage.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Product {

    Long id; //  상품 번호
    String name; // 상품명
    long price; // 가격
}
