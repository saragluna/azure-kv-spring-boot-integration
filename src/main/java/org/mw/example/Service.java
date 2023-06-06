package org.mw.example;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;

@org.springframework.stereotype.Service
public class Service {

    @Value("${info.from-kv}")
    private String valueFromKV;

    @PostConstruct
    public void init() {
        System.out.println(valueFromKV);
    }
}
