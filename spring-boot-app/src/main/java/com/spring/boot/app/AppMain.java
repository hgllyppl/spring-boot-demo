package com.spring.boot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationImportSelector;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.boot.context.logging.LoggingApplicationListener;

/**
 * Created by xin on 2019/4/28.
 */
@SpringBootApplication
public class AppMain {

    /**
     * 如何确定环境配置
     * 如何统一日志
     * 自动配置-过滤
     * 禁用自动配置(--spring.boot.enableautoconfiguration=false)
     * @see ConfigFileApplicationListener
     * @see LoggingApplicationListener
     * @see AutoConfigurationImportSelector#filter
     */
    public static void main(String[] args) {
        SpringApplication.run(AppMain.class, args);
    }
}
