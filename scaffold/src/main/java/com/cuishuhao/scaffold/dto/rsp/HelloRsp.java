package com.cuishuhao.scaffold.dto.rsp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HelloRsp {
    private String message;

    public HelloRsp(String message) {
        this.message = message;
    }
}