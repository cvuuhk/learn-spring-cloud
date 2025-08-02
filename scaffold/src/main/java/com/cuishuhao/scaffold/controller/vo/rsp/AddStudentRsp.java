package com.cuishuhao.scaffold.controller.vo.rsp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddStudentRsp {

  @JsonSerialize(using = ToStringSerializer.class)
  private Long id;

  public AddStudentRsp(Long id) {
    this.id = id;
  }
}