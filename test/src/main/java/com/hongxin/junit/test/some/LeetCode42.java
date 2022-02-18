package com.hongxin.junit.test.some;

public class LeetCode42 {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxArray = getMaxArray(arr);

        System.out.println(maxArray);

        String s = "hello";
        revertStr(s);
    }

    private static void revertStr(String s) {
        int n = s.length();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            char tem = s.charAt(l);


        }

    }

    private static int getMaxArray(int[] arr) {

        int pre = arr[0];
        int max = arr[0];


        for (int i = 1; i < arr.length; i++) {
            pre = Math.max(pre + arr[i], arr[i]);
            max = Math.max(pre, max);
        }

        return  max;
    }





}
