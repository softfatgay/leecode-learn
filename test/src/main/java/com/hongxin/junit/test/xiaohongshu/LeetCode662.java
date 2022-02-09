package com.hongxin.junit.test.xiaohongshu;

import com.hongxin.junit.test.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode662 {

    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeU.getTreeNode2();

        getMaxDepth(treeNode);
    }

    private static int getMaxDepth(TreeNode root) {
        // 避免异常的产生
        if(root==null){
            return 0;
        }
        // 创建一个队列来进行广度优先遍历,注意这个地方就不要使用Queue<TreeNode> queue=new LinkedList<TreeNode>();
        // 因为父类不能调用子类的方法：getLast getFirst
        LinkedList<TreeNode> queue=new LinkedList<>();
        // 创建一个变量来保存最大宽度
        int maxwidth=0;
        // 将根节点入队列
        queue.offer(root);
        // 改变根结点的值
        root.val=0;

        while(!queue.isEmpty()){
            // 记录当前队列中的个数
            int cout=queue.size();
            //创建一个变量来计算每层的宽度
            int width=queue.getLast().val-queue.getFirst().val+1;
            for(int i=0;i<cout;i++){
                TreeNode temp=queue.poll();
                if(temp.left!=null){
                    queue.offer(temp.left);
                    temp.left.val=temp.val*2+1;
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                    temp.right.val=temp.val*2+2;
                }
            }
            // 求出每一层的宽度
            // 通过比较找除最大宽度
            if(width>maxwidth){
                maxwidth=width;
            }
        }
        
        System.out.println(maxwidth);

        return maxwidth;
    }
}
