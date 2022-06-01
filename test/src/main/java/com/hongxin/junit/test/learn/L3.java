package com.hongxin.junit.test.learn;

import java.util.HashMap;

public class L3 {
    public static void main(String[] args) {
        String s = "abcabcbdfg";
        int solution = solution(s);

        System.out.println(solution);
    }

    private static int solution(String s) {
        if (s.length() < 1) {
            return 1;
        }
        int n = s.length();
        int start = 0;
        int end = 0;
        int maxL = 1;
        HashMap<Character, Integer> map = new HashMap<>();
        while (end < n) {
            if (!map.containsKey(s.charAt(end))) {
                map.put(s.charAt(end), end);
                maxL = Math.max(maxL, end - start + 1);
                end++;
            } else {
                map.remove(s.charAt(start));
                start++;
            }
        }

        return maxL;
    }
}
