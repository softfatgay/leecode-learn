package com.hongxin.junit.test.some;

import com.hongxin.junit.test.listNode.ListNode;
import com.hongxin.junit.test.listNode.ListNodeU;

import java.util.List;

public class LeetCode18 {
    public static void main(String[] args) {
        ListNode listNode = ListNodeU.getListNode(new int[]{4, 5, 1, 9});


//        ListNode solution = solution(listNode, 9);
//        ListNodeU.printNode(solution);


        ListNode node = deleteNode(listNode, 9);
        ListNodeU.printNode(node);
    }

    private static ListNode deleteNode(ListNode listNode, int target) {

        if (listNode.val == target) {
            return listNode.next;
        }
        ListNode cur = listNode;
        while (cur.next != null) {
            if (cur.next.val == target) {
                cur.next = cur.next.next;
                return listNode;
            }
            cur = cur.next;
        }

        return listNode;
    }

    private static ListNode solution(ListNode head, int target) {

        if (head.val == target) {
            return head.next;
        }
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.val == target) {
                cur.next = cur.next.next;
                return head;
            }
            cur = cur.next;
        }
        return head;
    }
}
