package com.example.test.storage.model.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class RequestResisterProduct {

    private Long store_id;
    private Long product_id;
    private int stock;

}
