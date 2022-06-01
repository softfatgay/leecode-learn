package com.hongxin.junit.test.some;

import com.hongxin.junit.test.listNode.ListNode;
import com.hongxin.junit.test.listNode.ListNodeU;

public class LeetCode21 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ListNode node = ListNodeU.getListNode(arr);

        int[] arr1 = {1, 3, 4};
        ListNode node1 = ListNodeU.getListNode(arr1);


//        mergeListNode(node, node1);

        ListNode node2 = mergeListNode1(node, node1);


        ListNodeU.printNode(node2);


    }

    private static void mergeListNode(ListNode node, ListNode node1) {
        ListNode m = node;
        ListNode n = node1;


        ListNode cur = new ListNode();
        ListNode head = cur;
        while (m != null && n != null) {
            if (m.val > n.val) {
                cur.next = n;
                n = n.next;
            } else {
                cur.next = m;
                m = m.next;
            }
            cur = cur.next;
        }

        cur.next = m == null ? n : m;

        ListNodeU.printNode(head.next);
    }


    private static ListNode mergeListNode1(ListNode m1, ListNode n1) {
        ListNode m = m1;
        ListNode n = n1;
        ListNode res = new ListNode(-1);
        ListNode head = res;
        while (m != null && n != null) {
            if (m.val > n.val) {
                res.next = n;
                n = n.next;
            } else {
                res.next = m;
                m = m.next;
            }

            res = res.next;
        }

        res.next = m == null ? n : m;

        return head.next;
    }


}
