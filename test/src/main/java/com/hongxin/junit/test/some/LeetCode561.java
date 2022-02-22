package com.hongxin.junit.test.some;

import java.util.Arrays;

public class LeetCode561 {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        int solution = solution(arr);
        System.out.println(solution);
    }

    private static int solution(int[] arr) {

        Arrays.sort(arr);

        int res = 0;
        for (int i = 0; i < arr.length; i+=2) {
            res += arr[i];
        }

        return res;
    }
}
