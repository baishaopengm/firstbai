package com.soft.Study;

import java.util.Date;

public class LongTest {
    /**
     * 优先使用基本类型而不是装箱基本类型，要当心无意识的自动装箱。 可以提高程序的运行效率
     * @param args
     */
         public static void main(String[] args){
             /*long sum = 0L;
             for(long i = 0;i < Integer.MAX_VALUE; i++){
                 sum += i;
             }
             System.out.println(sum);*/
             /*Date  drm = new Date();
             System.out.println("时间是："+new Date());
             System.out.println("时间是："+drm);*/
             String a = "abc";
             String b = "abc";
             System.out.println(a == b);
         }
         public enum SeasonEnum{
             SPRING(1),SUMMER(2),AUTUMN(3),WINTER(4);
             private int seq;
             SeasonEnum(int seq){
                 this.seq = seq;
             }
         }

}
