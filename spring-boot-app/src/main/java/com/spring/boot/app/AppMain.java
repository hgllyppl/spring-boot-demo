package com.spring.boot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xin on 2019/4/28.
 */
@SpringBootApplication
public class AppMain {

    // 如何确定环境配置
    // 如何统一日志
    // 自动配置-条件
    public static void main(String[] args) {
        SpringApplication.run(AppMain.class, args);
    }
}
