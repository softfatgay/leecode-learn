package com.hongxin.junit.test.learn;

public class L283 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 3, 12};
        int[] solution = solution(arr);

        for (int i : solution) {
            System.out.println(i);
        }
    }

    private static int[] solution(int[] arr) {
        int left = 0;
        int right =0;

        while (right <arr.length) {
            if (arr[right] != 0) {
                awap(arr, left, right);
                left++;
            }
            right++;
        }

        return arr;
    }

    private static void awap(int[] arr, int left, int right) {
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }
}
