package com.hongxin.junit.test.xiaohongshu;

import com.hongxin.junit.test.listNode.ListNode;

public class LeetCode206 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode solution = solution(head);

        ListNode a = solution;

        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }
    }

    private static ListNode solution(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;

            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;

    }
}
