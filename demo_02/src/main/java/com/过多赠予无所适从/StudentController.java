package com.过多赠予无所适从;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2021/5/8
 **/
@RestController
class StudentController {

    @Autowired
    // 修改方案1：指定注入名字
    // @Qualifier("oracleDataService")
    DataService dataService;

    //修改方案2：成员变量匹配名字
/*    @Autowired
    DataService oracleDataService;*/

    @RequestMapping(path = "students/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable("id") int id) {
        dataService.deleteStudent(id);
    }
}