package com.cuishuhao.scaffold.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.cuishuhao.scaffold.util.SnowFlakeUtil;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class BaseEntity {

  @TableId(type = IdType.INPUT)
  protected Long id;

  // 精度：毫秒
  protected Instant createdAt;

  // 精度：毫秒
  protected Instant lastUpdatedAt;

  public BaseEntity() {
    this.id = SnowFlakeUtil.nextId();
  }
}