package com.test.firstproject.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/log")
@Slf4j
public class LogController {

    @GetMapping("/test")
    public Map<String, Object> test(){
        log.info("test 로그 테스트 입니다.");
        Map<String, Object> result = new HashMap<>();
        result.put("result", "OK");
        return result;
    }
}
