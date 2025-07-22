package com.cuishuhao.scaffold.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
public class BaseEntity {

    @TableId(type = IdType.ASSIGN_ID)
    protected Long id;

    // 精度：毫秒
    protected Instant createdAt;

    // 精度：毫秒
    protected Instant lastUpdatedAt;
}