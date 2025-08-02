package com.cuishuhao.scaffold.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AuditableEntity extends BaseEntity {

  protected String createdBy;

  protected String lastUpdatedBy;
}