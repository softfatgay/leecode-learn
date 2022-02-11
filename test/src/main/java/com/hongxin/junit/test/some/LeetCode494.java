package com.hongxin.junit.test.some;

public class LeetCode494 {

   static int count = 0;
    public static void main(String[] args) {

        int[] arr = {1,1,1,1,1};
        int target = 3;
        int sum = 0;
        backToAnd(arr,target,0,sum);


        System.out.println(count);
    }

    private static void backToAnd(int[] arr, int target, int i,int sum) {
        if (sum + arr[i] == target) {
            count++;
        }else{
            if (i >= arr.length - 1) {
                return;
            }
            backToAnd(arr, target, i + 1, sum + arr[i + 1]);
            backToAnd(arr, target, i + 1, sum - arr[i + 1]);
        }
    }
}
