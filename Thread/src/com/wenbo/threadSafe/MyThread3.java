package com.wenbo.threadSafe;

public class MyThread3 implements Runnable {
    private static int ticket = 100;
    Object object = new Object();

    @Override
    public void run() {
        System.out.println("this:"+this);
        while (true) {
            runIt();
        }
    }

    public /*static */synchronized void runIt() {
        synchronized (MyThread3.class){
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-lwb-正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
