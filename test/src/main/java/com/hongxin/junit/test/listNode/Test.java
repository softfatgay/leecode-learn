package com.hongxin.junit.test.listNode;

public class Test {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);

        ListNode nodeA = new ListNode(5);
        nodeA.next = new ListNode(2);
        nodeA.next.next = new ListNode(6);
        nodeA.next.next.next = new ListNode(7);





//        ListNode listNode = RevertNote.reverseList(node);
//        System.out.println(listNode.val);
//        System.out.println(listNode.next.val);
//        System.out.println(listNode.next.next.val);
//        System.out.println(listNode.next.next.next.val);

        ListNode intersectionNode = IntersectionNode.getIntersectionNode(node, nodeA);



        System.out.println(intersectionNode.val);
    }
}
