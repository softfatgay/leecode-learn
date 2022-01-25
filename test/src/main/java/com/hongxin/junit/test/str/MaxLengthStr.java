package com.hongxin.junit.test.str;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. 无重复字符的最长子串
 */
public class MaxLengthStr {

    public static void main(String[] args) {
        String str = "saluoen,aefhas";
        int i = maxLen(str);

        System.out.println(System.currentTimeMillis());
        System.out.println(i);
        System.out.println(System.currentTimeMillis());

    }

    private static int maxLen(String str) {
        int n = str.length();
        int res = 0;
        int end = 0, start = 0;
        HashSet<Character> set = new HashSet<>();

        while (start < n && end < n) {
            if (set.contains(str.charAt(end))) {
                set.remove(str.charAt(start));
                start++;
            } else {
                set.add(str.charAt(end));
                end++;
                res = Math.max(res, end - start);
            }
        }

        return res;

    }


    public int getMaxLen(String a) {
        int length = a.length();
        int start = 0;
        int end = 0;

        int max = 0;

        Set<Character> set = new HashSet<>();

        while (start < length && end < length) {
            if (set.contains(a.charAt(end))) {
                set.remove(a.charAt(start));
                start++;
            } else {
                set.add(a.charAt(end));
                end++;
                max = Math.max(end - start, max);
            }


        }

        return max;
    }
}
