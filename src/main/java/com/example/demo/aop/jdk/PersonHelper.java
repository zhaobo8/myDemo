package com.example.demo.aop.jdk;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Zhaobo
 * @date 2020/3/26 11:54
 *
 * 1）execution(* *(..))
//表示匹配所有方法
2）execution(public * com. savage.service.UserService.*(..))
//表示匹配com.savage.server.UserService中所有的公有方法
3）execution(* com.savage.server..*.*(..))
//表示匹配com.savage.server包及其子包下的所有方法
 *
 */
@Component
@Aspect
public class PersonHelper {
    @Pointcut("@annotation(com.example.demo.aop.AopPointcut)")
    public void myPointcut(){}

    @Before("myPointcut()")
    public void before(){
        System.out.println("before");
    }

}
