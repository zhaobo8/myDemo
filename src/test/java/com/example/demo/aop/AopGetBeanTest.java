package com.example.demo.aop;

import com.example.demo.aop.cglib.PersonCglib;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * @author Zhaobo
 * @date 2020/7/4 17:17
 */
@SpringBootTest
public class AopGetBeanTest {
    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void getBeanTest(){
        PersonCglib personCglib = applicationContext.getBean( com.example.demo.aop.cglib.PersonCglib.class);
        System.out.println(personCglib.getClass());
    }
}
