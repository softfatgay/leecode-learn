package com.hongxin.junit.test.qingwa;

public class Gupiao {


    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};

        int max = getMax(arr);

        System.out.println(max);

    }

    private static int getMax(int[] arr) {

        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                sum += arr[i] - arr[i - 1];
            }
        }

        return sum;
    }
}
