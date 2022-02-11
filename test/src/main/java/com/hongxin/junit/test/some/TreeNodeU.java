package com.hongxin.junit.test.some;

import com.hongxin.junit.test.tree.TreeNode;

public class TreeNodeU {

    public static TreeNode getTreeNode(){
        /**
         *   		 5
         *         /  \
         *       4     3
         *     / \    / \
         *    3  1   2   6
         */

        TreeNode root = new TreeNode(5);
        TreeNode level_1_1 = new TreeNode(4);
        TreeNode level_1_2 = new TreeNode(3);

        TreeNode level_2_1 = new TreeNode(3);
        TreeNode level_2_2 = new TreeNode(1);
        TreeNode level_2_3 = new TreeNode(2);
        TreeNode level_2_4 = new TreeNode(6);


        root.left = level_1_1;
        root.right = level_1_2;

        level_1_1.left = level_2_1;
        level_1_1.right = level_2_2;
        level_1_2.left = level_2_3;
        level_1_2.right = level_2_4;

        return root;
    }


    public static TreeNode getTreeNode1(){
        /**
         *   		 5
         *         /  \
         *       4     3
         *     / \    / \
         *    3  1   2   6
         */

        /**
         *   		 5
         *         /  \
         *       3     4
         *     / \    / \
         *    6  2   1   3
         */

        TreeNode root = new TreeNode(5);
        TreeNode level_1_1 = new TreeNode(3);
        TreeNode level_1_2 = new TreeNode(4);

        TreeNode level_2_1 = new TreeNode(6);
        TreeNode level_2_2 = new TreeNode(2);
        TreeNode level_2_3 = new TreeNode(1);
        TreeNode level_2_4 = new TreeNode(3);


        root.left = level_1_1;
        root.right = level_1_2;

        level_1_1.left = level_2_1;
        level_1_1.right = level_2_2;
        level_1_2.left = level_2_3;
        level_1_2.right = level_2_4;

        return root;
    }

    public static TreeNode getTreeNode2(){
        /**
         *     		    5
         *           /    \
         *         4       3
         *       /  \     / \
         *     3     1   2   6
         *   /  \             \
         *  8    1             5
         */

        TreeNode root = new TreeNode(5);
        TreeNode level_1_1 = new TreeNode(4);
        TreeNode level_1_2 = new TreeNode(3);

        TreeNode level_2_1 = new TreeNode(3);
        TreeNode level_2_2 = new TreeNode(1);
        TreeNode level_2_3 = new TreeNode(2);
        TreeNode level_2_4 = new TreeNode(6);


        TreeNode level_3_1 = new TreeNode(8);
        TreeNode level_3_2 = new TreeNode(5);
        TreeNode level_3_3 = new TreeNode(5);


        root.left = level_1_1;
        root.right = level_1_2;

        level_1_1.left = level_2_1;
        level_1_1.right = level_2_2;
        level_1_2.left = level_2_3;
        level_1_2.right = level_2_4;

        level_2_1.left = level_3_1;
        level_2_1.right = level_3_2;
//        level_2_4.right = level_3_3;


        return root;
    }



}
