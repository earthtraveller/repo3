package com.wenbo.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo2 {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("李四", 78),
                new Person("张三", 100),
                new Person("王五", 13)
        };
        /*Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/
        Arrays.sort(arr, (Person o1, Person o2) -> o1.getAge() - o2.getAge());
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
