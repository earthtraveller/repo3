package com.wenbo.threadSafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread4 implements Runnable {
    private static int ticket = 100;
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-lwb-正在卖第" + ticket + "张票");
                ticket--;
            }else{
                break;
            }
            lock.unlock();
        }
    }
}
