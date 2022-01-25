package com.hongxin.junit.test.str;

//LeetCode 121.买卖股票的最佳时机(允许多次交易最大化)
public class LeetCode21More {

    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};

        int sum = getMAx(arr);
        System.out.println(sum);


    }

    private static int getMAx(int[] arr) {

        int min = arr[0];
        int max = 0;
        int sum = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i + 1] > arr[i]) {
                sum += arr[i + 1] - arr[i];
            }
        }


        return sum;
    }
}
