package com.hongxin.junit.test.some;

import com.hongxin.junit.test.tree.TreeNode;

public class LeetCode68 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode root_l = new TreeNode(5);
        TreeNode root_r = new TreeNode(1);
        root.left = root_l;
        root.right = root_r;


        TreeNode node2_1 = new TreeNode(6);
        TreeNode node2_2 = new TreeNode(2);
        TreeNode node2_3 = new TreeNode(0);
        TreeNode node2_4 = new TreeNode(8);

        root_l.left = node2_1;
        root_l.right = node2_2;
        root_r.left = node2_3;
        root_r.right = node2_4;

        TreeNode node3_3 = new TreeNode(7);
        TreeNode node3_4 = new TreeNode(4);
        node2_2.left = node3_3;
        node2_2.right = node3_4;


        TreeNode node = lowP(root_l, root_l, node3_4);

        System.out.println(node.val);

    }

    private static TreeNode lowP(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.val == p.val || root.val == q.val) {
            return root;
        }

        TreeNode left = lowP(root.left, p, q);
        TreeNode right = lowP(root.left, p, q);
        if (left != null && right != null) {
            return root;
        }
        if (left != null) {
            return left;
        }
        if (right != null) {
            return right;
        }
        return null;
    }
}
