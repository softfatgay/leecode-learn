package com.hongxin.junit.test.learn;

import com.hongxin.junit.test.listNode.ListNode;
import com.hongxin.junit.test.listNode.ListNodeU;

public class L876 {
    public static void main(String[] args) {
        ListNode listNode = ListNodeU.getListNode(new int[]{1, 2, 3, 4, 5, 6});
        ListNode solution = solution(listNode);
        System.out.println(solution.val);
    }

    private static ListNode solution(ListNode node) {
        ListNode slow = node;
        ListNode fast = node;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
