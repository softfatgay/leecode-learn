package com.hongxin.junit.test.some;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode227 {

    public static void main(String[] args) {

        String s = "3+ 2 *2";

        int solution = solution(s);
        System.out.println(solution);

    }

    private static int solution(String a) {

        String s = a.replaceAll(" ", "");
        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int num = c - '0';
            if (i == 0) {
                queue.offer(num);
            } else {
                if (i % 2 == 0) {
                    char pre = s.charAt(i - 1);
                    switch (pre) {
                        case '+':
                            queue.push(num);
                            break;
                        case '-':
                            queue.push(-num);
                            break;
                        case '*':
                            queue.push(queue.pop() * num);
                            break;
                        case '/':
                            queue.push(queue.pop() / num);
                            break;
                    }

                }
            }
        }

        int sum = 0;
        for (Integer item : queue) {
            sum += item;
        }
        return sum;
    }

}
