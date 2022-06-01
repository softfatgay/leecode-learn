package com.hongxin.junit.test.learn;

public class L704 {

    public static void main(String[] args) {
        int[] arr = {9};
        int target = 9;

        int search = search(arr, target);

        System.out.println(search);

    }

    private static int search(int[] arr, int target) {

        int n = arr.length - 1;
        int left = 0;
        int right = n;
        while (left <= right) {
            int middle = (right - left) / 2 +left;
            if (arr[middle] == target) {
                return middle;
            } else if (target > arr[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}
