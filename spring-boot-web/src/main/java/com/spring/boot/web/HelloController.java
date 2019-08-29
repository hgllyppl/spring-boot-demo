package com.spring.boot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xin on 2019/4/28.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello, " + name;
    }
}
