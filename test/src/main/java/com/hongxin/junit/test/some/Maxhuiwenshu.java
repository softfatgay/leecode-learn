package com.hongxin.junit.test.some;

//最长回文数
public class Maxhuiwenshu {
    public static void main(String[] args) {

        String a = "bammad";
        String solution = solution(a);

        System.out.println(solution);


//        String s = solution1(a);
//        System.out.println(s);

        String max = getMax(a);
        System.out.println(max);
    }

    private static String getMax(String a) {
        int n = a.length();
        if (a.length() < 2) {
            return a;
        }

        int start = 0;
        int end = 0;
        for (int i = 1; i < n; i++) {
            int len1 = getHuiwen(a, i, i);
            int len2 = getHuiwen(a, i, i + 1);
            int max = Math.max(len1, len2);

            if (max > end -start) {
                start = i - (max-1) / 2;
                end = i + max / 2;
            }
        }
        return a.substring(start, end + 1);
    }

    private static int getHuiwen(String a, int left, int right) {
        while (left >= 0 && right < a.length() && a.charAt(left) == a.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
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
