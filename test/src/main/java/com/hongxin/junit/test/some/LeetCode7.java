package com.hongxin.junit.test.some;

public class LeetCode7 {
    public static void main(String[] args) {
        int a = -123456700;
        int i = reverseInt(a);
        System.out.println(i);
    }

    private static int reverseInt(int a) {
        int res = 0;
        while (a != 0) {
            int digit = a % 10;
            res = res * 10 + digit;
            a /= 10;
        }
        return res;
    }
}
