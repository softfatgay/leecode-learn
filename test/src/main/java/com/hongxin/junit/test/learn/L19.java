package com.hongxin.junit.test.learn;

import com.hongxin.junit.test.listNode.ListNode;
import com.hongxin.junit.test.listNode.ListNodeU;

public class L19 {
    public static void main(String[] args) {
        ListNode node = ListNodeU.getListNode(new int[]{1, 2, 3, 4, 5});
        ListNode fast = node;
        ListNode slow = node;
        ListNode ans = slow;
        int target = 2;
        int count = 0;
        while (fast != null) {
            if (count > target) {
                slow = slow.next;
            }
            fast = fast.next;
            count++;
        }
        if (slow.next != null) {
            slow.next = slow.next.next;
        }
        ListNodeU.printNode(ans);
    }
}
