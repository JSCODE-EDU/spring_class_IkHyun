package com.test.firstproject.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController

public class TestController {

    @GetMapping("/api/test")
    public Map<String, Object> test(){
        Map<String, Object> result = new HashMap<>();
        result.put("result", "test");
        return result;
    }

    @GetMapping("/name")
    public String name(@RequestParam("name") String name){
        return "안녕하세요! 내 이름은 " + name + " 입니다.";
    }


}
