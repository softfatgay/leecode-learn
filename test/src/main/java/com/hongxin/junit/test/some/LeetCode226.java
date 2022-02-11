package com.hongxin.junit.test.some;

import com.hongxin.junit.test.tree.TreeNode;

public class LeetCode226 {

    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeU.getTreeNode();
        TreeNode left = treeNode.left;
        TreeNode right = treeNode.right;
        revertNode(treeNode, left, right);
    }

    private static void revertNode(TreeNode node, TreeNode left, TreeNode right) {
        if (node == null) {
            return;
        }
        node.left = right;
        node.right = left;
        if (left.left != null) {
            revertNode(left.left, left.left.left, left.left.right);
        }

        if (left.right != null) {
            revertNode(left.right, left.right.left, left.right.right);
        }

    }
}
