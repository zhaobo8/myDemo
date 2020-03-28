package com.example.demo.aop.cglib;

import org.springframework.stereotype.Component;

/**
 * @author Zhaobo
 * @date 2020/3/26 15:24
 */
@Component
public class Person {
    public void sayHello(String name) {
        System.out.println("Hello!....Cglib..."+name);
    }

    public void eat(String food){
        System.out.println("我正在吃:"+food);
    }
}
