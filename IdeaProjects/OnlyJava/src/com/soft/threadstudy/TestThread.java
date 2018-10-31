package com.soft.threadstudy;

import static java.lang.Thread.sleep;

/**
 * @program: OnlyJava
 * @description: 多线程练习
 * @author: baisp
 * @create: 2018-09-25 07:26
 */
public class TestThread implements  Runnable {
    private String name;
    public TestThread(String name){
        this.name =  name;
    }
    @Override
    public void run() {
          for (int i = 0;i < 5;i++){
              System.out.println(name+"运行"+i);
              try {
                  sleep((int)Math.random()*10);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
    }
    /*
      * 启动线程的时候，需要先通过Thread类的构造方法Thread构造出对象，然后调用Thread对象的Start（）方法来运行多线程代码
    */
     public static void main(String[] args){
         TestThread thread1 = new TestThread("A");
         TestThread thread2 = new TestThread("B");
         new Thread(thread1).start();
         new Thread(thread2).start();
     }
}
