package com.hongxin.junit.test.some;

import com.hongxin.junit.test.tree.TreeNode;

public class LeetCode55 {

    public static void main(String[] args) {
        TreeNode node = TreeNodeU.getTreeNode();

        int i = maxDepth(node);

        System.out.println(i);
    }

    private static int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = maxDepth(node.left);
        int right = maxDepth(node.right);

        return Math.max(left + 1, right + 1);
    }

}
