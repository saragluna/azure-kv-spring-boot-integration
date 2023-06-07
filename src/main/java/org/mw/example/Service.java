package org.mw.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Service {

    @Value("${info.from-kv}")
    private String valueFromKV;

    @GetMapping("/")
    public String getVal() {
        return valueFromKV;
    }
}
