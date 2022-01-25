package com.hongxin.junit.test.xiaohongshu;

public class Leetcode1013 {

    public static void main(String[] args) {

        int[] arr = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};

        solution(arr);

    }

    private static boolean solution(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        if (sum % 3 != 0) {
            return false;
        }

        int i = 0;
        int res = 0;
        while (i < arr.length-1) {
            res += arr[i];
            if (res * 2 % 3 == 0) {
                return true;
            }
        }
        return false;
    }
}
