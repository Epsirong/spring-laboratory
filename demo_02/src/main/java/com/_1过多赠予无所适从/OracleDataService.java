package com._1过多赠予无所适从;

import org.springframework.stereotype.Repository;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2021/5/8
 **/
@Repository
public class OracleDataService implements DataService {

    @Override
    public void deleteStudent(int id) {
        System.out.println("delete student info maintained by oracle");
    }
}
