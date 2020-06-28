package com.wenbo.wait;

public class ObjectWait {
    public static void main(String[] args) {
        Object object = new Object();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (object) {
                        System.out.println("买包子，来两个包子!");
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("等了这么久，可算吃到了");
                        System.out.println("----------------------------------------");
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (object) {
                        System.out.println("做包子中...");
                        object.notify();
                    }
                }
            }
        }.start();
    }
}
