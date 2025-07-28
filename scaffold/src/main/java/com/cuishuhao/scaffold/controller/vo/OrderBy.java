package com.cuishuhao.scaffold.controller.vo;

import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OrderBy {

    private String column;

    // todo: 枚举
    @Pattern(regexp = "^(ASC|DESC)$")
    private String order;
}