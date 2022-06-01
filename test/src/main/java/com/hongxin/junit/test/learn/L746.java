package com.hongxin.junit.test.learn;

public class L746 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        solution(nums);
    }

    private static int solution(int[] nums) {
        int n = nums.length;
        int end = 0;
        int step = 0;
        int maxR = 0;
        for (int i = 0; i < n - 1; i++) {
            maxR = Math.max(maxR, i + nums[i]);
            if (i == end) {
                end = maxR;
                step++;
            }
        }
        return step;
    }
}
