package com.soft.threadstudy;

/**
 * @program: OnlyJava
 * @description: 多线程学习
 * @author: baisp
 * @create: 2018-09-26 07:03
 */
public class Main {
          public static void main(String[] args){
              Thread1 th1 = new Thread1("A");
              //Thread1 th2 = new Thread1("B");
              th1.start();
              th1.start();
              //th2.start();
          }
}
class Thread1 extends Thread{
    private String name;
    public Thread1(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0;i < 5;i++){
            System.out.println(name+"运行："+i);
            try {
                sleep((int) Math.random() * 10);
            }catch (InterruptedException e){
                 e.printStackTrace();
            }
        }
    }

}