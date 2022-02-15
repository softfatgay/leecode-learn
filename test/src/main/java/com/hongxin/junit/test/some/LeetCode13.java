package com.hongxin.junit.test.some;

import java.util.HashMap;

public class LeetCode13 {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        int solution = solution(s);

        System.out.println(solution);
    }

    private static int solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (i < length - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                res -= map.get(s.charAt(i));
            } else {
                res += map.get(s.charAt(i));
            }
        }

        return res;
    }
}
