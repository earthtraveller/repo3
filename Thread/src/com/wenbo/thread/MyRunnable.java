package com.wenbo.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 60; i++) {
            System.out.println("Runnable Thread-"+i);
        }
    }
}
