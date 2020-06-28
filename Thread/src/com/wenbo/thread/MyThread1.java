package com.wenbo.thread;

public class MyThread1 extends Thread{
    public void run() {
        for (int i = 0; i < 20; i++) {
//            System.out.println("Thread-"+i);
            System.out.println(i+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
