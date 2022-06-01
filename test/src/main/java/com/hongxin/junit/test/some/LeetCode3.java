package com.hongxin.junit.test.some;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCode3 {
    public static void main(String[] args) {

//        String aaa = "adweqwdasdaw";
        String aaa = "abcdcdsa";


        getMaxL(aaa);

//        int i = maxLengthStr(aaa);
//        System.out.println(i);
    }

    private static void getMaxL(String aaa) {
        int start = 0;
        int end = 0;
        int maxL = 1;
        HashMap<Character, Integer> map = new HashMap<>();
        int length = aaa.length();
        while (end < length) {
            char c = aaa.charAt(end);
            if (map.containsKey(c)) {
                start = Math.max(map.get(c) + 1, start);
            }
            maxL = Math.max(end - start + 1, maxL);
            map.put(c, end);
            end++;
        }

        System.out.println(maxL);
    }


    private static int maxLengthStr(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0, start = 0;
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (map.containsKey(ch)) {
                start = Math.max(map.get(ch) + 1, start);
            }
            max = Math.max(max, end - start + 1);
            map.put(ch, end);
        }
        return max;
    }
}
