package com.wenbo.threadSafe;

public class MainLock {
    public static void main(String[] args) {
        Runnable runnable = new MyThread4();
        Thread thread1= new Thread(runnable);
        Thread thread2= new Thread(runnable);
        Thread thread3= new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
