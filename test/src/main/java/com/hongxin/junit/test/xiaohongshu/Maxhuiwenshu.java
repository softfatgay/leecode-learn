package com.hongxin.junit.test.xiaohongshu;

//最长回文数
public class Maxhuiwenshu {
    public static void main(String[] args) {

        String a = "babad";
        String solution = solution(a);

        System.out.println(solution);

    }

    private static String solution(String a) {
        int len = a.length();
        char[] cs = a.toCharArray();

        int maxLen = 1;
        int begin = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (isPad(cs, i, j)) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }

        return a.substring(begin, begin + maxLen);
    }

    private static boolean isPad(char[] cs, int i, int j) {

        while (i < j) {
            if (cs[i] != cs[j]) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
