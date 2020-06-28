package com.wenbo.thread;

public class Main {
    public static void main(String[] args) {
      MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
      Runnable runnable = new MyRunnable();
      Thread thread = new Thread(runnable);
      thread.start();
    }
}
