package com.example.test.storage.model.table;


import com.example.test.storage.code.ClassCode;

import javax.persistence.*;

@Table(name = "student", schema = "test")
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "class")
    @Enumerated(EnumType.STRING)
    private ClassCode Class;

}
