package com.spring.boot.test;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by xin on 2019/9/16.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ContextConfiguration(classes = TestServiceConf.Conf.class, initializers = ConfigFileApplicationContextInitializer.class)
@ImportAutoConfiguration({})
public @interface TestServiceConf {

    @Configuration
    @ComponentScan(value = {"com.spring.boot"}, lazyInit = true)
    class Conf {}
}
