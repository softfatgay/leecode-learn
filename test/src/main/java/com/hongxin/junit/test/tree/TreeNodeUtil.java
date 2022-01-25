package com.hongxin.junit.test.tree;


public class TreeNodeUtil {

    public static TreeNode getTreeNode(){
        /**
         *   		5
         *         / \
         *        4   8
         *       /   / \
         *      11  13  4
         *     /  \    / \
         *    7    2  5   1
         */

        TreeNode root = new TreeNode(5);
        TreeNode level_1_1 = new TreeNode(4);
        TreeNode level_1_2 = new TreeNode(8);

        TreeNode level_2_1 = new TreeNode(11);
        TreeNode level_2_2 = new TreeNode(13);
        TreeNode level_2_3 = new TreeNode(4);

        TreeNode level_3_1 = new TreeNode(7);
        TreeNode level_3_2 = new TreeNode(2);
        TreeNode level_3_3 = new TreeNode(5);
        TreeNode level_3_4 = new TreeNode(1);

        root.left = level_1_1;
        root.right = level_1_2;

        level_1_1.left = level_2_1;
        level_1_2.left = level_2_2;
        level_1_2.right = level_2_3;

        level_2_1.left = level_3_1;
        level_2_1.right = level_3_2;

        level_2_3.left = level_3_3;
        level_2_3.right = level_3_4;

        return root;
    }
}
