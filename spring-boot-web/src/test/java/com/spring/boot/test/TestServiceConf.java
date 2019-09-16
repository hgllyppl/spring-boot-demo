package com.spring.boot.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xin on 2019/9/16.
 */
@Configuration
@ComponentScan({"com.spring.boot.service", "com.spring.boot.dao"})
public class TestServiceConf {
}
