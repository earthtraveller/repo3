package com.wenbo.threadSafe;

public class MyThread implements Runnable {
    private int ticket = 100;
    Object object = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (object){
                if(ticket > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                    ticket--;
                }else{
                    break;
                }
            }
        }
    }
}
