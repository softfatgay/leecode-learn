package com.hongxin.junit.test.xiaohongshu;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LeetCode20 {

    public static void main(String[] args) {
        String aaa = "{[{}]}";
//        boolean valid = isValid(aaa);




        boolean aTrue = isTrue(aaa);
        System.out.println(aTrue);
    }

    private static boolean isTrue(String aaa) {
        Deque<Character> stack = new LinkedList();

        if (aaa.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i < aaa.length(); i++) {
            if (isLeft(aaa.charAt(i))) {
                stack.push(aaa.charAt(i));
            }else {
                stack.pop();
            }
        }

        return stack.isEmpty();

    }

    private static boolean isLeft(char charAt) {
        if (charAt == '{') {
            return true;
        }if (charAt == '(') {
            return true;
        }if (charAt == '[') {
            return true;
        }
        return false;
    }


    public static boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }


}
