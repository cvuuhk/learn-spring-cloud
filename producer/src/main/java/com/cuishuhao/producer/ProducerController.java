package com.cuishuhao.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ProducerController {

    @Value("${my.key:default_key}")
    String key;

    @Value("${my.value:default_value}")
    String value;

    @GetMapping("/hello")
    HelloRsp hello() {
        return new HelloRsp(key, value);
    }
}