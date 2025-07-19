package com.cuishuhao.scaffold.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
public class BaseEntity {

    protected Long id;

    // 精度：毫秒
    protected Instant createdAt;

    // 精度：毫秒
    protected Instant lastUpdatedAt;
}