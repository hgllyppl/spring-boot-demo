package com.spring.boot.test;

import com.spring.boot.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by xin on 2019/9/16.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestServiceConf.class)
public class TestHelloService {

    @Autowired
    private HelloService helloService;

    @Test
    public void test() {
        helloService.hello("z3");
    }
}
