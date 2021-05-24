package com._3引用内部类的Bean遗忘类名;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class StudentController {

    @Repository
    public static class InnerClassDataService implements DataService{
        @Override
        public void deleteStudent(int id) {
            //空实现
        }
    }

    @Autowired
    // @Qualifier("innerClassDataService")

    //下面为修正方法
    @Qualifier("studentController.InnerClassDataService")
    DataService innerClassDataService;

    @RequestMapping(path = "students/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable("id") int id){
        innerClassDataService.deleteStudent(id);
    };

}
