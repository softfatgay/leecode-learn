package com.hongxin.junit.test.xiaohongshu;


import java.util.HashSet;
import java.util.Set;

//202. 快乐数
public class LeetCode202 {
    public static void main(String[] args) {

        int a = 19;
        solution(a);
    }

    private static boolean solution(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    private static int getNext(int n) {

        int total = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            total += d * d;
        }

        return total;
    }
}
