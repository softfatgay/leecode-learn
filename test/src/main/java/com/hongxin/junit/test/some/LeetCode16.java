package com.hongxin.junit.test.some;

import java.util.Arrays;

public class LeetCode16 {

    public static void main(String[] args) {

        int[] arr = {-1, 2, 1, -4};
        int target = 2;

        int solution = solution(arr, target);
        System.out.println(solution);

    }



    private static int solution(int[] arr, int target) {
        Arrays.sort(arr);
        int res = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = arr.length - 1;
            while (l < r) {
                int cur = arr[i] + arr[l] + arr[r];
                int abs = Math.abs(target - cur);
                int abs1 = Math.abs(res - cur);
                int min = Math.min(abs, abs1);
                if (cur == target) {
                    res = target;
                    return res;
                } else if (cur < target) {
                    if (min == abs) res = cur;
                    l++;
                } else {
                    if (min == abs) res = cur;
                    r--;
                }
            }
        }

        return res;
    }


}
