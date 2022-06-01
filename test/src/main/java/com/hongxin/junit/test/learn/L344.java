package com.hongxin.junit.test.learn;

public class L344 {
    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";
        solution(s);
    }

    private static void solution(String s) {
        StringBuilder build = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            int start = i;
            while (i < s.length() && s.charAt(i) != ' ') {
                i++;
            }

            int end = i;
            while (end > start) {
                build.append(s.charAt(end-1));
                end--;
            }

            while (i<s.length()&&s.charAt(i) == ' ') {
                build.append(' ');
                i++;
            }
        }
        System.out.println(build.toString());
    }
}
