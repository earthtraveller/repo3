package com.wenbo.lambda;

public class Demo3 {
    public static void main(String[] args) {
        /*invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });*/
        invokeCalc(1,3,(a,b)->a+b);
    }

    public static void invokeCalc(int a, int b, Calculator calculator) {
        int sum = calculator.calc(a, b);
        System.out.println(sum);
    }
}
