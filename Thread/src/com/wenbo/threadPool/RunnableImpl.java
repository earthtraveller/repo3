package com.wenbo.threadPool;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread()+"创建了一个线程......");
    }
}
