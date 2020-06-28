package com.dx.system.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author dx
 * @version 1.0
 * @date 2020/6/28 0028 8:57
 */
@Aspect
@Component
public class UserAspectJ {

   @Pointcut("execution(public * com.dx.system.service.UserService.addUser(*))")
    private void processUser(){

   }

   @Before("processUser()")
    private void doBeforeProcessUser(){
       System.out.println("执行开始添加用户之前");
   }

   @After("processUser()")
    private void doAfterProcessUser(){
       System.out.println("执行开始添加用户之后");
   }

   @AfterReturning("processUser()")
    private void doAfterReturningProcessUser(){
       System.out.println("方法返回信息之后");
   }
   @AfterThrowing("processUser()")
   private void doAfterThrowingProcessUser(){
       System.out.println("抛出异常之后");
   }
}
