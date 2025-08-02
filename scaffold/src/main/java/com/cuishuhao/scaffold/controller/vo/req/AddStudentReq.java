package com.cuishuhao.scaffold.controller.vo.req;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AddStudentReq {

  @NotEmpty(message = "姓名不能为空")
  @Size(max = 100, message = "姓名不能超过 {max} 个字符")
  private String name;

  @NotNull(message = "年龄不能为空")
  private Integer age;

  @NotNull(message = "专业不能为空")
  private String major;
}