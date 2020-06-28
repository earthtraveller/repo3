package com.wenbo.thread;

public class MyThread2 extends Thread{
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Thread Two-"+i);
        }
    }
}
