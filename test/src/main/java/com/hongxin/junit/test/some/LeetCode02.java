package com.hongxin.junit.test.some;

import com.hongxin.junit.test.listNode.ListNode;
import com.hongxin.junit.test.listNode.ListNodeU;

public class LeetCode02 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        ListNode node = ListNodeU.getListNode(arr);
//        ListNode target = getTargetIndex(node, 2);
//        System.out.println(target.val);


        revers(node);


//        revertNode(node);
    }

    private static ListNode getTargetIndex(ListNode head, int k) {
        ListNode cur = head;
        for (int i = 0; i < k; i++) {
            cur = cur.next;
        }

        ListNode pre = head;
        while (cur != null) {
            cur = cur.next;
            pre = pre.next;
        }
        return pre;
    }

    private static void revertNode(ListNode node) {
        ListNode pre = null;
        ListNode cur = node;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }


        ListNodeU.printNode(pre);
    }


    private static void revers(ListNode node) {
        ListNode pre = null;
        ListNode cur = node;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        ListNodeU.printNode(pre);

    }


}
