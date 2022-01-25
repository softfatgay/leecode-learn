package com.hongxin.junit.test.listNode;


public class TwoListNodeAdd {


    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        a.next = new ListNode(3);
        a.next.next = new ListNode(7);


        ListNode b = new ListNode(1);
        b.next = new ListNode(2);
        b.next.next = new ListNode(3);
        b.next.next.next = new ListNode(5);
        b.next.next.next.next = new ListNode(6);

        getNewListNode(a, b);
    }

    private static ListNode getNewListNode(ListNode a, ListNode b) {
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;

        ListNode l1 = a;
        ListNode l2 = b;
        while (l1 != null || l2 != null) {
            int n1 = l1 == null ? 0 : l1.val;
            int n2 = l2 == null ? 0 : l2.val;
            int sum = n1 + n2 + carry;

            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;

            if (l1.next != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

        }

        if (carry > 0) {
            tail.next = new ListNode(carry);
        }


        return head;
    }


}
