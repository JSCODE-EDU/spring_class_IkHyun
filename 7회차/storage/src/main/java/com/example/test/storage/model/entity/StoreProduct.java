package com.example.test.storage.model.entity;

import com.example.test.storage.model.entity.Product;
import com.example.test.storage.model.entity.Store;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "StoreToProduct", schema = "test")
@Entity
@Getter
@Setter
@ToString(exclude = {"store", "product"})
public class StoreProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int stock; // 물량

    public StoreProduct (){

    }
}
