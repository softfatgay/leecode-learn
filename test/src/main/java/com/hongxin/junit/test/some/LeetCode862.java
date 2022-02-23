package com.hongxin.junit.test.some;

public class LeetCode862 {

    public static void main(String[] args) {
        int[] arr = {1,2};
        int target = 4;
        int solution = solution(arr, target);

        System.out.println(solution);
    }

    private static int solution(int[] arr, int target) {

        int n = arr.length;
        int l = 0;
        int r = 0;

        int sum = 0;
        int minL = Integer.MAX_VALUE;
        while (r < n) {
            sum = getSum(arr, l, r);
            if (sum >= target) {
                minL = Math.min(minL, r - l + 1);
                while (l < r) {
                    sum -= arr[l];
                    if (sum >= target) {
                        minL = Math.min(minL, r - l + 1);
                    }
                    l++;
                }
            }
            r++;
        }

        return minL == Integer.MAX_VALUE ? -1 : minL;
    }

    private static int getSum(int[] arr, int l, int r) {
        int sum = 0;
        while (l <= r) {
            sum += arr[l];
            l++;
        }

        return sum;
    }
}
