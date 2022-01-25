package com.hongxin.junit.test.array;

/**
 * 这个需要懂得一个技巧，如何确定这个是不是一个新的子数组的开头，就是看前一个位置的值是否是正值，如果是正值，那么对于当前的值就是有增加效果的。
 * 如果前面一个值是负的，那么当前值就是最大值就是nums[i]
 * 如果前面一个值是正的，那么当前的最大值就是last + nums[i]
 */
public class MaxInnerArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int i = maxSum(arr);

        System.out.println("最大值"+i);
    }

    private static int maxSum(int[] arr) {

        int lastMax = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (lastMax > 0) {
                lastMax += arr[i];
            }else{
                lastMax = arr[i];
            }

            max = Math.max(lastMax, max);
        }


        return max;
    }
}
