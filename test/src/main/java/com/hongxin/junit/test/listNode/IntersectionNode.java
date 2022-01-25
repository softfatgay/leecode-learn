package com.hongxin.junit.test.listNode;

/**
 * 160. 相交链表
 */
public class IntersectionNode {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) return null;

        int lengthA = 0;
        int lengthB = 0;

        ListNode pA = headA;
        ListNode pB = headB;

        while (headA != null) {
            lengthA++;
            headA = headA.next;
        }
        while (headB != null) {
            lengthB++;
            headB = headB.next;
        }

        for (int i = 0;i<Math.abs(lengthA-lengthB);i++) {
            if (lengthA > lengthB) {
                headA = headA.next;
            } else {
                headB = headB.next;
            }
        }

        while (headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

}
