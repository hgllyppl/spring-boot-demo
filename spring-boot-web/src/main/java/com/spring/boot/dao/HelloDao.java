package com.spring.boot.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by xin on 2019/4/28.
 */
@Repository
public class HelloDao {

    public String hello(String name) {
        return "hello, " + name;
    }
}
