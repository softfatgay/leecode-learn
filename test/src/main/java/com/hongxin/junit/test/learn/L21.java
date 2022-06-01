package com.hongxin.junit.test.learn;

import com.hongxin.junit.test.listNode.ListNode;
import com.hongxin.junit.test.listNode.ListNodeU;

public class L21 {

    public static void main(String[] args) {
        ListNode node1 = ListNodeU.getListNode(new int[]{1, 3, 4, 5});
        ListNode node2 = ListNodeU.getListNode(new int[]{1, 2, 3});

        solution(node1,node2);
    }

    private static void solution(ListNode node1, ListNode node2) {
        ListNode root = new ListNode();
        ListNode head = root;

        while (node1 != null && node2 != null) {
            if (node1.val > node2.val) {
                head.next = node2;
                node2 = node2.next;
            }else{
                head.next = node1;
                node1 = node1.next;
            }
            head = head.next;
        }

        head.next = node1 == null ? node2 : node1;
        ListNodeU.printNode(root.next);
    }
}