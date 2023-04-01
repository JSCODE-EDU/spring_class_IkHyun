package com.example.test.storage.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "product", schema = "test")
@Entity
@Getter
@Setter
@ToString(exclude = "storeList")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "name")
    @NonNull
    private String name;

    @Column
    private Long price;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private List<StoreProduct> storeList = new ArrayList<>();

    public Product() {

    }
}
