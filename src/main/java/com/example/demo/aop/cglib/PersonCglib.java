package com.example.demo.aop.cglib;

import com.example.demo.aop.AopPointcut;
import org.springframework.stereotype.Component;

/**
 * @author Zhaobo
 * @date 2020/3/26 15:24
 */
@Component
public class PersonCglib {

    @AopPointcut
    public void sayHello(String name) {
        System.out.println("Hello!....Cglib..."+name);
    }
}
