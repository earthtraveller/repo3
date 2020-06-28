package com.wenbo.leetCode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Cache {
    private LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    private int capacity = 0;

    public Cache(int capacity) {
        this.capacity = capacity;
    }

    public int getHeadKey(Map map) {//获取第一个元素，最久未使用的元素
        Set<Integer> set = map.keySet();
        int temp = 0;
        for (Integer i : set) {
            temp = i;
            break;
        }
        return temp;
    }

    public int get(int key) {//元素被访问后，将其移动到末尾
        if (!map.containsKey(key)) return -1;
        int value = map.get(key);
        map.remove(key);
        map.put(key, value);
        return value;
    }

    public void put(int key, int value) {//插入元素
        if (map.containsKey(key)) {//如果这个元素存在，将其放在末尾
            map.remove(key);
        } else if (map.size() == capacity) {//如果容量满了，删除第一个元素
            map.remove(getHeadKey(map));
        }
        map.put(key, value);
    }
}