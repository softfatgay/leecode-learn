package com.hongxin.junit.test;

//LeetCode 121.买卖股票的最佳时机(只允许交易一次)
public class LeetCode21 {

    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};

        int max = getMAx(arr);
        System.out.println(max);
    }

    private static int getMAx(int[] arr) {

        int min = arr[0];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (arr[i] - min > max) {
                max = arr[i] - min;
            }
        }


        return max;
    }
}
