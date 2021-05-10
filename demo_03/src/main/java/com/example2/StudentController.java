package com.example2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2021/5/8
 **/
@RestController
public class StudentController {

    //2. 收集方式
    private List<Student> students;

    public StudentController(List students) {
        this.students = students;
    }

    @RequestMapping(path = "students", method = RequestMethod.GET)
    public String listStudents() {
        return students.toString();
    }
}
