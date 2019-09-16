package com.spring.boot.service;

import com.spring.boot.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xin on 2019/4/28.
 */
@Service
public class HelloService {

    @Autowired
    private HelloDao helloDao;

    public String hello(String name) {
        return helloDao.hello(name);
    }
}
