package com.cuishuhao.scaffold.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PagedReq {

    // todo: 默认值
    @Max(value = 500)
    protected Integer pageSize;

    // todo: 默认值 1
    @Min(value = 1)
    protected Integer pageIndex;
}