package com.hongxin.junit.test.some;

import java.util.ArrayList;
import java.util.List;

public class LeetCode524 {

    public static void main(String[] args) {

        String extracted = extracted();
        System.out.println(extracted);

    }

    private static String extracted() {
        List<String> d = new ArrayList<>();
        d.add("a");
        d.add("b");
        d.add("c");
        d.add("p");
        String s = "abpcplea";

        String res = "";
        for (String s1 : d) {

            int i = 0;
            int j = 0;

            while (i < s1.length() && j < s.length()) {
                if (s1.charAt(i) == s.charAt(j)) {
                    i++;
                }
                j++;
            }

            if (i == s1.length() ) {
                if (res.length() < s1.length()) {
                    res = s1;
                }
                if (res.length() == s1.length() && s1.compareTo(res) < 0) {
                    res = s1;
                }
            }
        }

        return res;
    }
}
