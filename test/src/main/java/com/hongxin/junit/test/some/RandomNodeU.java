package com.hongxin.junit.test.some;

public class RandomNodeU {


    public static RandomNode getRandomNode(){

        RandomNode head = new RandomNode(1);
        RandomNode node1 = new RandomNode(2);
        RandomNode node2 = new RandomNode(3);
        RandomNode node3 = new RandomNode(4);
        RandomNode node4 = new RandomNode(5);
        RandomNode node5 = new RandomNode(6);


        head.next = node1;
        head.random = node5;

        node1.next = node2;
        node1.random = node1;

        node2.next = node3;
        node2.random = node1;

        node3.next = node4;
        node3.random = node5;

        node4.next = node5;
        node4.random = node3;

        node5.next = null;
        node5.random = null;

        return head;
    }
}
