package com.example.test.storage.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "store", schema = "test")
@Entity
@Getter
@Setter
@ToString(exclude = "productList")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private Long id;

    @Column
    @NonNull
    private String name; // 상정 이름

    @Column
    private String address; // 주소

    @Column
    private String phone_number; // phoneNumber

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "store")
    private List<StoreProduct> productList = new ArrayList<>();

    public Store() {

    }
}
