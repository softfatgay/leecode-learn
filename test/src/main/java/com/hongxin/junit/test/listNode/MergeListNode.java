package com.hongxin.junit.test.listNode;

import java.util.HashMap;

public class MergeListNode {


    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        a.next = new ListNode(3);
        a.next.next = new ListNode(7);


        ListNode b = new ListNode(1);
        b.next = new ListNode(2);
        b.next.next = new ListNode(3);
        b.next.next.next = new ListNode(5);
        b.next.next.next.next = new ListNode(6);
        ListNode merge = merge(a, b);

        ListNode aaa = merge;
        while (aaa != null) {
            int val = aaa.val;
            System.out.println(val);
            aaa = aaa.next;
        }

    }

    private static ListNode merge(ListNode a, ListNode b) {
//        if (a == null||b == null) {
//            return null;
//        }

        ListNode newNode = new ListNode();
        ListNode pre = newNode;
        while (a != null && b != null) {
            if (a.val < b.val) {
                newNode.next = a;
                a = a.next;
            }else{
                newNode.next = b;
                b = b.next;
            }
            newNode = newNode.next;
        }
        newNode.next = a == null ? b : a;
        return pre.next;
    }
}
