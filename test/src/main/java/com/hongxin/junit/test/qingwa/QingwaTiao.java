package com.hongxin.junit.test.qingwa;

public class QingwaTiao {

    public static void main(String[] args) {

        int i = numWays(4);


        System.out.println(i);
    }

    private static int numWays(int n) {
        if (n == 1) {
            return 1;
        }
        int a = 1, b = 1;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
}
