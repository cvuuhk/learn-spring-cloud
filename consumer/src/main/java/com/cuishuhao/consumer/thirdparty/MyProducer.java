package com.cuishuhao.consumer.thirdparty;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "learn-spring-cloud-producer")
public interface MyProducer {

    @GetMapping("/hello")
    HelloRsp hello();
}