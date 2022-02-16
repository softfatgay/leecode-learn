package com.hongxin.junit.test.some;

public class LeetCode42 {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        getMaxArray(arr);
    }

    private static void getMaxArray(int[] arr) {

        int pre = arr[0];
        int cur = Math.max(pre, pre + arr[1]);


        int  max = Math.max(cur,pre);
        for (int i = 2; i < arr.length; i++) {
        }
    }


}
