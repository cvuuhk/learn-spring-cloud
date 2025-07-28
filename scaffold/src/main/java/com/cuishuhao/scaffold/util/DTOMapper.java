package com.cuishuhao.scaffold.util;

import com.cuishuhao.scaffold.controller.vo.req.AddStudentReq;
import com.cuishuhao.scaffold.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DTOMapper {

    DTOMapper INSTANCE = Mappers.getMapper(DTOMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "admission", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "lastUpdatedAt", ignore = true)
    Student toEntity(AddStudentReq dto);
}