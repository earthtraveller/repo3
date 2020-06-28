package com.wenbo.lambda;

public class Demo1 {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });
        invokeCook(()->{
            System.out.println("Lambda吃饭了");
        });
    }
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
