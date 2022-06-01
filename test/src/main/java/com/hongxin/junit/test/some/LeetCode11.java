package com.hongxin.junit.test.some;

public class LeetCode11 {

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};

//        int i = maxSave(arr);
//        System.out.println(i);
//

        maxSave1(arr);
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


    private static int maxSave1(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int max = 0;
        while (left < right) {
            int start = arr[left];
            int end = arr[right];
            max = Math.max(Math.min(start, end) * (right - left),max);
            if (start < end) {
                left++;
            }else{
                right--;
            }
        }

        System.out.println(max);
        return max;
    }


}
