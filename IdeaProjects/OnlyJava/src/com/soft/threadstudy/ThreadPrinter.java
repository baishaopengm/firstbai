package com.soft.threadstudy;

/**
 * @program: OnlyJava
 * @description: 交替打印ABC10次   对象锁  wait notify 理解练习
 * @author: baisp
 * @create: 2018-09-27 07:35
 */
public class ThreadPrinter implements Runnable {

    private String name;
    private Object prev;
    private Object self;

    public ThreadPrinter(String name,Object prev,Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
             int count = 10;
             while(count > 0){
                 synchronized (prev){
                     synchronized (self){
                         System.out.print(name);
                         count--;
                         self.notify();
                     }
                     try {
                         prev.wait();
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
             }
    }
    public static void main(String[] args){
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        ThreadPrinter pa = new ThreadPrinter("A",c,a);
        ThreadPrinter pb = new ThreadPrinter("B",a,b);
        ThreadPrinter pc = new ThreadPrinter("C",b,c);
        new Thread(pa).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(pb).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(pc).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
