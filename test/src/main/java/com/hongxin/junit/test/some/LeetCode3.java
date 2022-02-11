package com.hongxin.junit.test.some;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCode3 {
    public static void main(String[] args) {

//        String aaa = "adweqwdasdaw";
        String aaa = "abcdafghemnca";


        getMaxL(aaa);

        int i = maxLengthStr(aaa);
        System.out.println(i);
    }

    private static void getMaxL(String aaa) {
        Set<Character> set = new HashSet<>();
        int length = aaa.length();

        int left = 0;
        int maxL = 1;
        for (int i = 0; i < length; i++) {

        }


    }


    private static int maxLengthStr(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0, start = 0;
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (map.containsKey(ch)){
                start = Math.max(map.get(ch)+1,start);
            }
            max = Math.max(max,end - start + 1);
            map.put(ch,end);
        }
        return max;
    }




}
