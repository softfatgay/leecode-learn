package com.hongxin.junit.test.xiaohongshu;

import com.hongxin.junit.test.tree.TreeNode;

import java.util.List;

public class LeetCode559 {


    public static void main(String[] args) {
        Node node = new Node();
        getHeight(node);
    }

    private static int getHeight(Node node) {
        if (node == null) return 0;

        int maxDepth = 0;
        List<Node> children = node.children;
        for (Node child : children) {
            int height = getHeight(child);
            maxDepth = Math.max(height, maxDepth);
        }

        return maxDepth + 1;

    }
}
