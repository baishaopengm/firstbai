package com.soft.Study;

/**
 * @program: OnlyJava
 * @description: builder模式测试
 * @author: baisp
 * @create: 2018-09-23 23:39
 */
public class CoputerTest {
     public static void main(String args[]){
            Computer  computer = new Computer.Builder(12.3,122).age(10).build();
     }
}
