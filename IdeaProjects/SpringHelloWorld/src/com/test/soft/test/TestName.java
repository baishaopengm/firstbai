package com.test.soft.test;

import com.test.soft.road.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: SpringHelloWorld
 * @description: 测试IOC容器
 * @author: baisp
 * @create: 2018-09-17 22:33
 */
public class TestName {
      public static void main(String[] args){
          //创建spring的IOC容器
          ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
          //从IOC容器中获取bean的实例
          HelloWorld  hello =  (HelloWorld)context.getBean("HelloWorld");
          //调用sayhelloworld方法
          hello.sayHelloWorld();
      }
}
