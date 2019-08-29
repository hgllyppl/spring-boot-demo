package com.spring.boot.app;

import com.alibaba.fastjson.JSON;

/**
 * Created by xin on 2019/8/28.
 */
public class Student {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public Student setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
