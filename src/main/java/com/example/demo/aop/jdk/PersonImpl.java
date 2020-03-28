package com.example.demo.aop.jdk;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Zhaobo
 * @date 2020/3/26 11:38
 */
@Component
public class PersonImpl implements Person {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello!"+name);
    }

    public void eat(String food){
        System.out.println("我正在吃:"+food);
    }
}
