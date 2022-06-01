package com.hongxin.junit.test.tree;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


/**
 * leetcode 113. 路径总和 II
 */
public class GetPath {

    static List<List<Integer>> res = new ArrayList<>();

    static Deque<Integer> path = new LinkedList<>();

    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.getTreeNode();
        getPath(treeNode);
    }

    private static void getPath(TreeNode root) {
        dfs(root, 22);
        for (List<Integer> re : res) {
            for (Integer integer : re) {
                System.out.print(integer + "  ,");
            }
            System.out.println();
        }
    }

    private static void dfs(TreeNode root, int sum) {
        if (root == null) return;

        path.offerLast(root.val);

        sum -= root.val;
        if (root.left == null && root.right == null && sum == 0) {
            res.add(new ArrayList<>(path));
        }

        dfs(root.left, sum);
        dfs(root.right, sum);
        path.removeLast();
    }
}
