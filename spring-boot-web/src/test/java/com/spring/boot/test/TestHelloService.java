package com.spring.boot.test;

import com.spring.boot.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by xin on 2019/9/16.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
@TestServiceConf
public class TestHelloService {

    @Autowired
    private MockMvc mockMvc;

//    @MockBean
//    private HelloService helloService;

    @Test
    public void test() throws Exception {
        mockMvc.perform(post("/hello"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn()
        ;
    }
}
