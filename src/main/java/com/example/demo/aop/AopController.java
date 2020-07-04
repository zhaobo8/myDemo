package com.example.demo.aop;

import com.example.demo.aop.cglib.PersonCglib;
import com.example.demo.aop.jdk.Person;
import org.springframework.beans.factory.annotation.Autowired;
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
    Person person;

    @Autowired
    PersonCglib personCglib;

    @RequestMapping("/jdkTest")
    public void aop_Test(){
        System.out.println("jdk-------");
        person.sayHello("zhaobo");
        System.out.println(person.getClass());
        System.out.println("cglib-------");
        personCglib.sayHello("zhaobo");
        System.out.println(personCglib.getClass());
    }

}
