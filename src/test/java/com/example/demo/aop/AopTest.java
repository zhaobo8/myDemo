package com.example.demo.aop;

import com.example.demo.aop.cglib.PersonCglib;
import com.example.demo.aop.jdk.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author Zhaobo
 * @date 2020/3/26 14:22
 */
@SpringBootTest
public class AopTest {
    @Autowired
    Person person;

    @Autowired
    PersonCglib personCglib;

   @Test
    public void aop_Test(){
        System.out.println("jdk-------");
        person.sayHello("zhaobo");
        System.out.println(person.getClass());
        System.out.println("cglib-------");
        personCglib.sayHello("zhaobo");
        System.out.println(personCglib.getClass());
    }



}
