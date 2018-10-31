package com.soft.Study;

import java.util.Date;

/**
 * @program: OnlyJava
 * @description: builder模式练习
 * @author: baisp
 * @create: 2018-09-23 22:18
 */
public class Computer {
     private   Double price;
     private   int color;
     private   Date  startDate;
     private   String name;
     private   int age;
     private   String company;
     private   Date endDate;
     private   long number;
     private   String mainComp;
     private   int   height;

     public static class Builder{
         private   Double price;
         private   int color;
         private   Date  startDate;
         private   String name;
         private   int age;
         private   String company;
         private   Date endDate;
         private   long number;
         private   String mainComp;
         private   int   height;

         public Builder(Double price, int color) {
             this.price = price;
             this.color = color;
         }
         public Builder startDate(Date val){
             startDate = val;
             return  this;
         }
         public Builder name(String val){
             name = val;
             return  this;
         }
         public Builder age(int val){
             System.out.println("age");
             age = val;
             return  this;
         }
         public Builder company(String val){
             company = val;
             return  this;
         }
         public Builder endDate(Date val){
             endDate = val;
             return  this;
         }
         public Builder number(long val){
             number = val;
             return  this;
         }
         public Builder mainComp(String val){
             System.out.println("mainComp");
             mainComp = val;
             return  this;
         }
         public Builder height(int val){
             System.out.println("height");
             height = val;
             return  this;
         }
         public  Computer  build(){
             System.out.println("this");
             return  new Computer(this);
         }
     }
     private  Computer (Builder builder){
         price = builder.price;
         color = builder.color;
         startDate = builder.startDate;
         name = builder.name;
         age = builder.age;
         company = builder.company;
         endDate = builder.endDate;
         number = builder.number;
         mainComp = builder.mainComp;
         height = builder.height;
         System.out.println("this1");
     }

}
