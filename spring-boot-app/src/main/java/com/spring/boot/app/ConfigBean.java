package com.spring.boot.app;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.List;
import java.util.Map;

/**
 * Created by xin on 2019/8/28.
 */
@Configuration
@ConfigurationProperties("config-bean")
public class ConfigBean implements InitializingBean, EnvironmentAware, Cloneable {

    @JSONField(ordinal = 1)
    private String string;

    @JSONField(ordinal = 2)
    private String[] array;

    @JSONField(ordinal = 3)
    private List<String> list;

    @JSONField(ordinal = 4)
    private Map<String, Object> map;

    @JSONField(ordinal = 5)
    private List<Map<String, Object>> listMap;

    @JSONField(ordinal = 6)
    private List<Student> students;

    public String[] getArray() {
        return array;
    }

    public ConfigBean setArray(String[] array) {
        this.array = array;
        return this;
    }

    public List<String> getList() {
        return list;
    }

    public ConfigBean setList(List<String> list) {
        this.list = list;
        return this;
    }

    public List<Map<String, Object>> getListMap() {
        return listMap;
    }

    public ConfigBean setListMap(List<Map<String, Object>> listMap) {
        this.listMap = listMap;
        return this;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public ConfigBean setMap(Map<String, Object> map) {
        this.map = map;
        return this;
    }

    public String getString() {
        return string;
    }

    public ConfigBean setString(String string) {
        this.string = string;
        return this;
    }

    public List<Student> getStudents() {
        return students;
    }

    public ConfigBean setStudents(List<Student> students) {
        this.students = students;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new ConfigBean()
                .setString(this.string)
                .setArray(this.array)
                .setList(this.list)
                .setMap(this.map)
                .setListMap(this.listMap)
                .setStudents(this.students);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(JSON.toJSONString(this.clone(), true));
//        Integer.parseInt("xx");
    }

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println();
    }
}
