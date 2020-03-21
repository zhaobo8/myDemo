package com.example.demo.HelloWordTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhaobo
 * @date 2020/3/21 19:29
 */
@RestController
@RequestMapping("/HelloWord")
public class HalloWordTest {

    @GetMapping
    public String sayHello(){
        return "Hello Word!";
    }
}
