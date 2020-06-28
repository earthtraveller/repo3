package com.wenbo.thread;

public class InnerClass {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("inner class"+i);
                }
            }
        }).start();
    }
}
