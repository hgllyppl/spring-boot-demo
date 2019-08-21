package com.spring.boot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xin on 2019/4/28.
 */
@SpringBootApplication
public class AppMain {

    // TODO 如何确定扫描路径
    public static void main(String[] args) {
        SpringApplication.run(AppMain.class, args);
    }
}
