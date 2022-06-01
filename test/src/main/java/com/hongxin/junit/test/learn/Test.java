package com.hongxin.junit.test.learn;

public class Test {
    public static void main(String[] args) {

        int[] arr = {2, 3, -2, 4};

        int solution = solution(arr);

        System.out.println(solution);
    }

    private static int solution(int[] nums) {

        int ans = nums[0];
        int mx = nums[0];
        int mn = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int max = mx, min = mn;
            mx = Math.max(max * nums[i], Math.max(nums[i] * min, nums[i]));
            mn = Math.min(min * nums[i], Math.min(nums[i] * max, nums[i]));
            ans = Math.max(ans, max);
        }
        return mx;
    }
}
