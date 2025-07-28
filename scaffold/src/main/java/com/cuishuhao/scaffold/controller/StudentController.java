package com.cuishuhao.scaffold.controller;

import com.cuishuhao.scaffold.controller.vo.req.AddStudentReq;
import com.cuishuhao.scaffold.controller.vo.rsp.AddStudentRsp;
import com.cuishuhao.scaffold.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping("/student/add")
    public AddStudentRsp addStudent(@Valid @RequestBody AddStudentReq req) {
        return new AddStudentRsp(service.addStudent(req).getId());
    }

}