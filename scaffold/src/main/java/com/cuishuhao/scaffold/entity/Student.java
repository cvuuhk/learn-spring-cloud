package com.cuishuhao.scaffold.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@TableName("t_student")
public class Student extends BaseEntity {

  private String name;

  private Integer age;

  private String major;

  private LocalDate admission;

  @Override
  public String toString() {
    return "Student{" + "id='" + id + '\'' + ", createdAt=" + createdAt + ", lastUpdatedAt=" + lastUpdatedAt + ", " + "name='" + name + '\'' + ", age=" + age + ", major='" + major + '\'' + ", admission=" + admission + '}';
  }
}