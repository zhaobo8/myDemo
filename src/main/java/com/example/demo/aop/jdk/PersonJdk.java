package com.example.demo.aop.jdk;

import com.example.demo.aop.AopPointcut;
import org.springframework.stereotype.Component;

/**
 * @author Zhaobo
 * @date 2020/3/26 11:38
 */
@Component
public class PersonJdk implements Person {
    @Override
    @AopPointcut
    public void sayHello(String name) {
        System.out.println("Hello!"+name);
    }

}
