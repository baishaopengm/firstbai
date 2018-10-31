package com.soft.joris;

public class ChineseLesson {


    public static void main(String [] args){
        NameStudy name = new NameStudy.Builder(200,20).calories(10)
                .fat(2).pages(12).sodium(23).size(20).build();

       System.out.print(name);
        Long a = 2L;
        String  str = "ABC";
        String st = "abc";
        System.out.print("不区分大小写比较两个字符串："+str.equals(st) );
    }
}
