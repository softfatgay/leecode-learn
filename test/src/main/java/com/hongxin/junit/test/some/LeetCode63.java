package com.hongxin.junit.test.some;

public class LeetCode63 {

    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};

        solution(arr);

    }

    private static int solution(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int[] res = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    res[j] = 0;
                    continue;
                }
                if (j-1>0&&arr[i][j-1] == 0) {
                    res[j] += res[j - 1];
                }

            }
        }
        return res[m - 1];
    }
}
