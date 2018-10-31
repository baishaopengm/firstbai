package com.soft.threadstudy;

import static java.lang.Thread.sleep;

/**
 * @program: OnlyJava
 * @description: 多线程join方法练习
 * @author: baisp
 * @create: 2018-09-26 22:48
 */
public class TestThreadJoin extends Thread {
    private String name;
    public TestThreadJoin(String name){
        super(name);
        this.name = name;
    }
    public void run() {
         System.out.println(Thread.currentThread().getName()+"线程开始运行");
         for( int i = 0;i < 5;i++){
             System.out.println(Thread.currentThread().getName()+i);
             try {
                 sleep((int)Math.random()*10);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
        System.out.println(Thread.currentThread().getName()+"线程结束");
    }
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName()+"主线程开始");
        TestThreadJoin thread1 = new TestThreadJoin("A");
        TestThreadJoin thread2 = new TestThreadJoin("B");
        thread1.setPriority(MAX_PRIORITY);
        thread2.setPriority(MIN_PRIORITY);
        try {
            thread1.start();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"主线程结束");
    }
}
