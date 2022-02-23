package com.hongxin.junit.test.some;

public class LeetCode125 {

    public static void main(String[] args) {
        String a = "amanaplanacanalpanama";
        boolean solution = solution(a);
        System.out.println(solution);
    }

    private static boolean solution(String a) {
        int n = a.length();
        int l = 0;
        int r = n - 1;

        while (l < r) {
            if (a.charAt(l) != a.charAt(r)) {
                return false;
            }
            l++;r--;
        }
        return true;
    }
}
