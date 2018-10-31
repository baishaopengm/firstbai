package com.soft.study1;

/**
 * @program: OnlyJava
 * @description: do while 练习
 * @author: baisp
 * @create: 2018-09-24 21:38
 */
public class Testdowhile {
    public static void main(String[] args){
         int  count = 10;
         do {
             System.out.println("开始"+count);
             count --;

         }while (count > 0);
         System.out.println("开始");

        /*while(count > 0){
            count -- ;
            System.out.println("开始"+count);
        }
        System.out.println("开始");*/
    }
}
