package com.example.demo.aop;

import com.example.demo.aop.cglib.Person;
import com.example.demo.aop.jdk.PersonImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhaobo
 * @date 2020/3/26 15:02
 */
@RestController
@RequestMapping("/aop")
public class AopController {
    @Autowired
    PersonImpl person;

    @Autowired
    Person person2;

    @RequestMapping("/jdkTest")
    public void aop_JdkTest(){
        person.sayHello("zhaobo");
        System.out.println(person.getClass());
    }

    @RequestMapping("/cglibTest")
    public void aop_CglibTest(){
        person2.sayHello("zhaobo");
        System.out.println(person2.getClass());
    }
}
