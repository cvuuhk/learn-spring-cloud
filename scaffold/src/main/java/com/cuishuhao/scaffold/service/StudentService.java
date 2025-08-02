package com.cuishuhao.scaffold.service;

import com.cuishuhao.scaffold.controller.vo.req.AddStudentReq;
import com.cuishuhao.scaffold.entity.Student;
import com.cuishuhao.scaffold.repository.StudentRepository;
import com.cuishuhao.scaffold.util.DTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class StudentService {

  @Autowired
  private StudentRepository repository;

  public Student addStudent(AddStudentReq req) {
    Student student = DTOMapper.INSTANCE.toEntity(req);
    student.setAdmission(LocalDate.now());

    repository.insertBatch(List.of(student));
    return student;
  }
}