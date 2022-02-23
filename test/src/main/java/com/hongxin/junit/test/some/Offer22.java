package com.hongxin.junit.test.some;

import com.hongxin.junit.test.listNode.ListNode;
import com.hongxin.junit.test.listNode.ListNodeU;

public class Offer22 {


    public static void main(String[] args) {
        ListNode node = ListNodeU.getListNode(new int[]{1, 2, 3, 4, 5, 6, 7});
        ListNode solution = solution(node, 4);


        ListNodeU.printNode(solution);
    }

    private static ListNode solution(ListNode node, int target) {
        int index = 0;
        ListNode cur = node;
        ListNode pre = node;
        while (cur != null) {
            if (index >= target) {
                pre = pre.next;
            }
            index++;
            cur = cur.next;
        }

        return pre;

    }
}
