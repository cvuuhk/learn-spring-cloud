package com.cuishuhao.scaffold.mapper;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cuishuhao.scaffold.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;

public interface StudentMapper extends BaseMapper<Student> {

    default void updateNameById(String name, Long id) {
        LambdaUpdateWrapper<Student> wrapper = new LambdaUpdateWrapper<>();
        wrapper.set(Student::getName, name);
        wrapper.eq(Student::getId, id);
        update(wrapper);
    }

    void insertBatch(@Param("students") Collection<Student> students);
}