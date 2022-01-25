package com.hongxin.junit.test.xiaohongshu;

public class LeetCode198 {
    public static void main(String[] args) {

        int[] arr = {2,7,9,3,1};

        int max = solution(arr);
        System.out.println(max);
    }


    private static int solution(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        if (arr.length == 1) {
            return arr[0];
        }

        int pre = arr[0];
        int cur = Math.max(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            int tem = cur;
            cur = Math.max(cur, pre + arr[i]);
            pre = tem;
        }

        return cur;
    }
}
