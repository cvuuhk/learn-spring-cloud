package com.cuishuhao.scaffold;

import com.cuishuhao.scaffold.entity.Student;
import com.cuishuhao.scaffold.mapper.StudentMapper;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;
import java.time.LocalDate;

@Slf4j
@SpringBootApplication
@MapperScan("com.cuishuhao.scaffold.mapper")
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    StudentMapper studentMapper;

    @Override
    public void run(String... args) throws Exception {
        Student student = new Student();
        student.setName("name");
        student.setAge(20);
        student.setMajor("计算机科学与技术");
        student.setAdmission(LocalDate.now());

        studentMapper.insert(student);

        try {
        Thread.sleep(Duration.ofSeconds(2));
        } catch (InterruptedException ignore) {
        }

        studentMapper.updateNameById("newName", student.getId());

        Student s = studentMapper.selectById(student.getId());
        logger.info("s = {}", s);
    }
}