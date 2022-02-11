package com.hongxin.junit.test.some;

import java.util.HashSet;
import java.util.Set;

public class LeetCode128 {


    public static void main(String[] args) {
        int[] arr = {};
        String a = "";
        for (int i : arr) {

        }
    }


    public int longestConsecutive(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }

        Set<Integer> set = new HashSet<>();
        for (int item : nums) {
            set.add(item);
        }

        int res = 1;

        for (int i : set) {
            if (set.contains(i - 1)) {
                continue;
            }

            int ans = 1;
            while (set.contains(++i)) {
                ans++;
                res = Math.max(ans, res);
            }
        }

        return res;

    }
}
