package com.example.test.storage.model.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "product", schema = "test")
@Entity
@Data
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column
    private Long price;

    public Product() {

    }
}
