package com.hongxin.junit.test.learn;

import com.hongxin.junit.test.listNode.ListNode;
import com.hongxin.junit.test.some.TreeNodeU;
import com.hongxin.junit.test.tree.TreeNode;
import com.hongxin.junit.test.tree.TreeNodeUtil;

public class L617 {

    static TreeNode root;
    public static void main(String[] args) {
        TreeNode node1 = TreeNodeU.getTreeNode3();
        TreeNode node2 = TreeNodeU.getTreeNode4();

        TreeNode solution = solution(node1, node2);

    }

    private static TreeNode solution( TreeNode node1, TreeNode node2) {
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }

        TreeNode merge = new TreeNode(node1.val+ node2.val);
        merge.left = solution(node1.left, node2.left);
        merge.right = solution(node1.right, node2.right);
        return merge;
    }
}
