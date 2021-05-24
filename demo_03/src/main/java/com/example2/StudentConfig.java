package com.example2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2021/5/8
 **/
@Configuration
public class StudentConfig {

    @Bean
    // @Order(2)
    public Student student1() {
        return createStudent(1, "a");
    }

    @Bean
    // @Order(1)
    public Student student2() {
        return createStudent(2, "b");
    }

    private Student createStudent(int id, String name) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        return student;
    }

    // 1. 直接装配方式
    @Bean
    public List<Student> students() {
        Student student3 = createStudent(3, "liu");
        Student student4 = createStudent(4, "fu");
        return Arrays.asList(student3, student4);
    }
}
