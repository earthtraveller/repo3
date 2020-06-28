package com.wenbo.leetCode;

import java.util.*;

public class WordTimes {
    public static void main(String[] args) {
       /* Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();*/
        String str = "My name is liwenbo,I come from China.";
        System.out.println(getWordTimes(getString(str)));
    }

    public static List<String> getString(String str) {
        String[] strs = str.split("[^a-zA-Z]+");
        return Arrays.asList(strs);
    }

    public static HashMap getWordTimes(List<String> list) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        LinkedHashSet set = new LinkedHashSet();
        for (String str : list) {
            if (set.add(str)) {
                map.put(str, 1);
            } else {
                map.put(str, map.get(str) + 1);
            }
        }
        return map;
    }
}
