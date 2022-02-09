package com.hongxin.junit.test.xiaohongshu;

import com.hongxin.junit.test.listNode.ListNode;
import com.hongxin.junit.test.tree.TreeNode;

public class LeetCode104 {

    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeU.getTreeNode();

        int i = maxLength(treeNode);

        System.out.println(i);
    }

    private static int maxLength(TreeNode treeNode) {

        if (treeNode == null) {
            return 0;
        }else{
            return Math.max(maxLength(treeNode.left), maxLength(treeNode.right)) + 1;
        }
    }

}
