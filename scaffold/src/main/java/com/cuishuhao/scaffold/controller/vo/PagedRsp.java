package com.cuishuhao.scaffold.controller.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PagedRsp<T> {

  protected Long total;

  protected List<T> data;
}