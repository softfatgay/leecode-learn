package com.hongxin.junit.test.some;

public class LeetCode283 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        solution(arr);
    }

    private static void solution(int[] arr) {
        int l = 0;
        int r = 0;

        while (r < arr.length) {
            if (arr[r] != 0) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
            }
            r++;
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
