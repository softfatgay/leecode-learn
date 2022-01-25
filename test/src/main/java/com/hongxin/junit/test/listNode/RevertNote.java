package com.hongxin.junit.test.listNode;

public class RevertNote {

    public static void main(String[] args) {
        ListNode nodeA = new ListNode(1);
        nodeA.next = new ListNode(2);
        nodeA.next.next = new ListNode(3);
        nodeA.next.next.next = new ListNode(4);

        ListNode listNode = reverseList(nodeA);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;

        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}

