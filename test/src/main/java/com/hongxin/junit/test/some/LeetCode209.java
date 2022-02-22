package com.hongxin.junit.test.some;

public class LeetCode209 {

    public static void main(String[] args) {

        int[] arr = {2,3,1,2,4,3};
        int target = 7;
//        int solution = solution(arr, target);

        int i = solution1(arr, target);
        System.out.println(i);
    }

    private static int solution1(int[] arr, int target) {


        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length - 1; j++) {
                sum += arr[j];
                if (sum >= target) {
                    ans = Math.min(ans, j - i + 1);
                }
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;

    }

    private static int solution(int[] arr, int target) {
        int n = arr.length;
        int ans = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;


        int sum = 0;
        while (end < n) {
            sum += arr[end];
            if (sum >= target) {
                ans = Math.min(ans, end - start + 1);
                while (start <= end) {
                    sum -= arr[start];
                    if (sum >= target) {
                        ans = Math.min(ans, end - start + 1);
                    }
                    start++;
                }
            }
            end++;
        }


        return ans == Integer.MAX_VALUE ? 0 : ans;
    }


}
