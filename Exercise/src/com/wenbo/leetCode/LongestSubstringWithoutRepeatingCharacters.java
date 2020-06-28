package com.wenbo.leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcdefgggaabcdefghi"));
    }
    public static int lengthOfLongestSubstring(String s) {
        Set set = new HashSet();
        int times = 0;
        int max = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (set.add(s.charAt(j))) {
                    times++;
                }else{
                    set.clear();
                    break;
                }
            }
            if (times > max) {
                max = times;
            }
            times = 0;
        }
        return max;
    }
}
