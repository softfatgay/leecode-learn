package com.hongxin.junit.test.xiaohongshu;

import com.hongxin.junit.test.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode101 {

    public static void main(String[] args) {
        TreeNode u = TreeNodeU.getTreeNode();
        TreeNode v = TreeNodeU.getTreeNode1();


        boolean check = check(u, v);
        boolean check1 = check1(u, v);

        System.out.println(check1);

    }

    private static boolean check1(TreeNode u, TreeNode v) {
        if (u == null && v == null) {
            return true;
        }
        if (u == null || v == null) {
            return false;
        }

        return u.val == v.val && check1(u.left, v.right) && check1(u.right, v.left);
    }


    //递归
    private static boolean check(TreeNode u, TreeNode v) {
        LinkedList<TreeNode> q = new LinkedList<>();

        q.offer(u);
        q.offer(v);

        while (!q.isEmpty()) {
            u = q.poll();
            v = q.poll();

            if (u == null && v == null) {
                continue;
            }

            if ((u == null || v == null) || u.val != v.val) {
                return false;
            }

            q.offer(u.left);
            q.offer(v.right);

            q.offer(u.right);
            q.offer(v.left);
        }

        return true;
    }
}
