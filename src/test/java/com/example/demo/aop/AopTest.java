package com.example.demo.aop;

import com.example.demo.aop.jdk.PersonImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Zhaobo
 * @date 2020/3/26 14:22
 */
@SpringBootTest
public class AopTest {
    @Autowired AopController aopController;

    @Test
    public void jdkTest(){
        aopController.aop_JdkTest();

    }

    @Test
    public void cglibTest(){
        aopController.aop_CglibTest();

    }
}
