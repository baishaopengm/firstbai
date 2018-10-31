package com.soft.Study;

public class ListTest {
    //泛型方法
     public static   void findArray(int[] inputArray ){
           //输出数组
         for(int i = 0; i< inputArray.length;i++){
              System.out.printf("%s" ,inputArray[i]);
         }
     }

     public static  void  main(String[] args){
           //创建一个int数组
         int[]  a = {1,5,6,6,6,5};
         findArray(a);
     }
}
