package com.hongxin.junit.test.some;

import java.util.HashMap;
import java.util.Map;

public class LeetCode138 {

    public static void main(String[] args) {

        RandomNode head = RandomNodeU.getRandomNode();

        copyNodeList(head);
    }

    private static RandomNode copyNodeList(RandomNode head) {
        Map<RandomNode, RandomNode> cachedNode = new HashMap<RandomNode, RandomNode>();

        if (head == null) {
            return null;
        }

        if (!cachedNode.containsKey(head)) {
            RandomNode headNew = new RandomNode(head.val);
            cachedNode.put(head, headNew);
            headNew.next = copyNodeList(head.next);
            headNew.random = copyNodeList(head.random);
        }

        return cachedNode.get(head);
    }
}
