package com.hongxin.junit.test.some;

public class LeetCode53 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

//        int maxAnd = getMaxAnd(arr);
//        System.out.println(maxAnd);


        int max1 = getMax1(arr);
        System.out.println(max1);
    }

    private static int getMax1(int[] nums) {
//        int sum = 0;
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            if (sum >= 0) {
//                sum+=nums[i];
//            }else{
//                sum = nums[i];
//            }
//            max = Math.max(max, sum);
//        }
//        return max;


        int curMax = 0;
        int max = 0;
        for (int num : nums) {
            curMax = Math.max(curMax + num, num);
            max = Math.max(curMax, max);
        }

        return max;
    }


    private static int getMaxAnd(int[] arr) {

//        int max = arr[1], pre = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            pre = Math.max(pre + arr[i], arr[i]);
//            max = Math.max(max, pre);
//        }


        int sum = 0;
        int tem = arr[0];
        for (int i : arr) {
            if (sum > 0) {
                sum += i;
            }else{
                sum = i;
            }
            tem = Math.max(sum, tem);
        }
        return tem;
    }
}
