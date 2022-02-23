package com.hongxin.junit.test.some;

import com.hongxin.junit.test.listNode.ListNode;
import com.hongxin.junit.test.listNode.ListNodeU;

public class LeetCode83 {


    public static void main(String[] args) {

        ListNode listNode = ListNodeU.getListNode(new int[]{1, 2, 2, 3, 4, 4, 5, 5, 5});

//        ListNodeU.printNode(listNode);
        ListNode solution = solution(listNode);
        ListNodeU.printNode(solution);

    }

    private static ListNode solution(ListNode head) {
        ListNode cur = head;

        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }
}
