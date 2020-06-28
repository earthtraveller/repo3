package com.wenbo.leetCode;

import java.util.*;

public class ChongFuZiFuChuan {
    public static void main(String[] args) {
        System.out.println(group(Arrays.asList("a", "a", "a", "b", "b", "c","a", "b", "b", "c")));
    }

    public static Map<String, Integer> group(List<String> list) {
        Set set = new HashSet();
        Map<String, Integer> result = new HashMap();
        for (String str : list) {
            if (!set.add(str)) {//如果这个字符串已经存在
                result.put(str, result.get(str) + 1);
            } else {
                result.put(str, 1);
            }
        }
        return result;
    }
}
