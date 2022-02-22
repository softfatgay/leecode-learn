package com.hongxin.junit.test.some;

public class LeetCode152 {
    public static void main(String[] args) {
        int arr[] = {2, 3, -2, 4, -1, 2, 5, 0, 10};
        solution(arr);
    }

    private static void solution(int[] arr) {
        int max = 0;
        int l = 0;
        int r = 1;
        while (r < arr.length) {
            if (arr[r] > 0) {
                int cur = getCur(arr, l, r);
                max = Math.max(max, cur);
            } else {
                r++;
                l = r;
            }
            r++;
        }

        System.out.println(max);
    }

    private static int getCur(int[] arr, int l, int r) {
        int res = 1;
        for (int i = l; i <= r; i++) {
            res *= arr[i];
        }

        return res;
    }
}
