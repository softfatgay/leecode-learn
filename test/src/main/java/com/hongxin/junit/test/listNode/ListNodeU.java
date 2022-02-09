package com.hongxin.junit.test.listNode;

import java.util.Arrays;

public class ListNodeU {

    public static ListNode getListNode(int[] arr) {
        Arrays.sort(arr);

        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return head;
    }


    public static void printNode(ListNode node) {
        ListNode head = node;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
