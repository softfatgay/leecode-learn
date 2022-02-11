package com.hongxin.junit.test.some;

public class LeetCode11 {

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int i = maxSave(arr);
        System.out.println(i);
    }

    private static int maxSave(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int max = 0;
        while (l < r) {
            max = Math.max(Math.min(arr[l], arr[r]) * (r - l), max);
            if (arr[l] < arr[r]) {
                l++;
            }else{
                r--;
            }
        }

        return max;
    }
}
