package com.wenbo.threadSafe;

public class Main3 {
    public static void main(String[] args) {
        Runnable runnable = new MyThread3();
        Thread thread1= new Thread(runnable);
        Thread thread2= new Thread(runnable);
        Thread thread3= new Thread(runnable);
        System.out.println("runnable:"+runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
