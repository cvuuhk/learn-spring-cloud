package com.cuishuhao.scaffold.controller;

import com.cuishuhao.scaffold.dto.req.HelloReq;
import com.cuishuhao.scaffold.dto.rsp.HelloRsp;
import com.cuishuhao.scaffold.service.HelloService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {

    private final HelloService service;

    public HelloController(HelloService service) {
        this.service = service;
    }

    @PostMapping("/hello")
    public HelloRsp hello(@Valid @RequestBody HelloReq req) {
        String name = service.hello(req.getFirstName());
        return new HelloRsp(name);
    }

}