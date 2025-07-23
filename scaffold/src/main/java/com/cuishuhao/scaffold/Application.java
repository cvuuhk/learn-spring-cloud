package com.cuishuhao.scaffold;

import com.cuishuhao.scaffold.entity.Student;
import com.cuishuhao.scaffold.mapper.StudentMapper;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
        Collection<Student> collection = new ArrayList<>();
        logger.warn("insert null");
        studentMapper.insertBatch(null);
        logger.warn("insert empty");
        studentMapper.insertBatch(Collections.emptyList());

        logger.warn("{}", tt());
    }

}