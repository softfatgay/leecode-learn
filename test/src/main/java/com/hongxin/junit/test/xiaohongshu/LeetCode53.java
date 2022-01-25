package com.hongxin.junit.test.xiaohongshu;

public class LeetCode53 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxAnd = getMaxAnd(arr);
        System.out.println(maxAnd);


    }

    private static int getMaxAnd(int[] arr) {

//        int max = arr[1], pre = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            pre = Math.max(pre + arr[i], arr[i]);
//            max = Math.max(max, pre);
//        }


        int sum = 0;
        int tem = arr[0];

        for (int i : arr) {
            if (sum > 0) {
                sum += i;
            }else{
                sum = i;
            }
            tem = Math.max(sum, tem);
        }


        return tem;
    }
}
