package com.cuishuhao.scaffold.dto.req;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HelloReq {

    @NotEmpty(message = "姓不能为空")
    @Size(max = 100, message = "姓不能超过 {max} 个字符")
    private String firstName;

    @NotEmpty(message = "名不能为空")
    @Size(max = 100, message = "名不能超过 {max} 个字符")
    private String lastName;
}