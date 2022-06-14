package com.hongxin.junit.test.some;

public class LeetCode1111 {

    public static void main(String[] args) {
        paichu(100, 4);
    }

    private static int paichu(int end, int target) {
        int res = 0;
        for (int i = 0; i <= end; i++) {
            int j = i;
            while (j > 0) {
                if (j > 10) {
                    if (j % 10 == 4) {
                        res++;
                    }
                    j %= 10;
                } else {
                    if (j == 4) {
                        res++;
                    }
                    break;
                }
            }

        }

        return res;

    }

}
