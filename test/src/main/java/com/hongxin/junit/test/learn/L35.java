package com.hongxin.junit.test.learn;

import java.lang.annotation.Target;

public class L35 {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 6, 8};

        int search = search(arr, 7);

        System.out.println(search);
    }

    private static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = arr.length;
        while (left <= right) {
            int middle = (right - left) / 2 + left;

            if (target <= arr[middle]) {
                ans = middle;
                right = middle - 1;

            } else {
                left = middle + 1;
            }
        }
        return ans;
    }
}
