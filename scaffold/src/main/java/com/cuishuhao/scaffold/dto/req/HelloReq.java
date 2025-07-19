package com.cuishuhao.scaffold.dto.req;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HelloReq {

    @NotNull
    @Size(max = 100)
    private String name;
}