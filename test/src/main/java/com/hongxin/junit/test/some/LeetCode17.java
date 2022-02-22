package com.hongxin.junit.test.some;



///面试题17/21. 直方图的水量
public class LeetCode17 {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int solution = solution(arr);

        System.out.println(solution);
    }

    private static int solution(int[] arr) {
        int ans = 0;
        int n = arr.length - 1;
        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];

            int l = 0;
            for (int j = i - 1; j > 0; j--) {
                l = Math.max(l, arr[j]);
            }
            if (l < cur) {
                continue;
            }

            int r = 0;
            for (int j = i + 1; j < n; j++) {
                r = Math.max(r, arr[j]);
            }

            if (r < cur) {
                continue;
            }

            ans += Math.min(l, r) - cur;
        }

        return ans;

    }

}
