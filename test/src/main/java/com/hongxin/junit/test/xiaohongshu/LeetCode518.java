package com.hongxin.junit.test.xiaohongshu;

public class LeetCode518 {
    public static void main(String[] args) {

        int amount = 5;
        int[] arr = {1, 2, 5};
        solution(arr, amount);
    }


//                0  1  2  3  4  5  6   7   8(背包容量)
//            1   1  1  1  1  1  1  1   1   1
//            2         2  2  3  3  4   4   5
//            5                  4  5   6   7

    private static void solution(int[] coins, int amount) {

        int[] res = new int[amount + 1];
        res[0] = 1;

        for (int i = 0; i < coins.length; i++) {
            int val = coins[i];
            for (int j = val; j <= amount; j++) {
                res[j] = res[j] + res[j - val];
            }
        }

        System.out.println(res[amount]);
    }
}
