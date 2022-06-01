package com.hongxin.junit.test.learn;

import java.util.Arrays;

public class L567 {

    public static void main(String[] args) {

        String s1 = "ab", s2 = "eidbaooo";


        int[] a = {3, 1, 4, 2};

        Arrays.sort(a);

        s2.contains(s1);
        solution(s1, s2);

    }

    private static void solution(String s1, String s2) {
        int n = s1.length(), m = s2.length();

        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];

        for (int i = 0; i < n; ++i) {
            ++cnt1[s1.charAt(i) - 'a'];
            ++cnt2[s2.charAt(i) - 'a'];
        }

        for (int i : cnt1) {
            System.out.print(i + "  ");
        }

        System.out.println("  ");
        for (int i : cnt2) {
            System.out.print(i + "  ");
        }

    }
}
