package com.cuishuhao.consumer;

import com.cuishuhao.consumer.dto.ConsumeRsp;
import com.cuishuhao.consumer.dto.LoginReq;
import com.cuishuhao.consumer.dto.LoginRsp;
import com.cuishuhao.consumer.thirdparty.HelloRsp;
import com.cuishuhao.consumer.thirdparty.MyProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ConsumerController {

    @Autowired
    MyProducer producer;

    @PostMapping("/login")
    public LoginRsp login(@RequestBody LoginReq req) {
        return new LoginRsp();
    }

    @GetMapping("/consume")
    public ConsumeRsp consume() {
        HelloRsp rsp = producer.hello();
        return new ConsumeRsp(UUID.randomUUID().toString(), rsp.key, rsp.value);
    }
}