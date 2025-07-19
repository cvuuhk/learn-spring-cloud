package com.cuishuhao.scaffold.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(String name) {
        return "Hello, " + (name == null ? "there" : name);
    }
}