package com.hongxin.junit.test.xiaohongshu;

import java.util.HashMap;
import java.util.Map;

public class LeetCode3 {
    public static void main(String[] args) {

        String aaa = "adweqwdasdaw";

        maxLengthStr(aaa);
    }

    private static void maxLengthStr(String a) {

        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxL = 1;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (map.containsKey(a.charAt(i))) {
                start = Math.max(map.get(c)+1, start);
            }
            map.put(a.charAt(i),i);
            maxL = Math.max(maxL, i - start + 1);
        }
    }
}
