package com.example.test.storage.code;

public enum ClassCode {

    BASIC("basic", "기본"),
    MIDDLE("middle", "중금"),
    HARD("hard", "고급");


    private final String codeName;
    private final String description;

    private ClassCode(String name, String description){
        this.codeName = name;
        this.description = description;
    }
}
