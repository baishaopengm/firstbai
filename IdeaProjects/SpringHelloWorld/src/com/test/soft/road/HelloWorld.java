package com.test.soft.road;

/**
 * @program: SpringHelloWorld
 * @description: 基本类
 * @author: baisp
 * @create: 2018-09-17 22:26
 */
public class HelloWorld {
      private String name;

    public void setName(String name) {
        this.name = name;
    }
     public void sayHelloWorld(){
        System.out.println("HelloWorld"+name);
     }
}
