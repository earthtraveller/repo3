package com.wenbo.lambda;

import javax.xml.stream.events.StartDocument;

public class Demo4 {
    public static void main(String[] args) {
        new Thread(()->System.out.println("hello world!")).start();
    }
}
