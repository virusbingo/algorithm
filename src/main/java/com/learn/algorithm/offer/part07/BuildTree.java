package com.learn.algorithm.offer.part07;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 重建二叉树
 *
 * @author VirusBingo
 * @date 2021/07/29 4:55 下午
 **/
public class BuildTree {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }

        // 前序遍历的第一个节点就是树的根节点
        TreeNode root = new TreeNode(preorder[0]);

        // 将根节点存入队列中
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);

        // 中序遍历的下标
        int inorderIndex = 0;

        // 遍历除根节点以外的节点
        for (int i = 1; i < preorder.length; i++) {
            // 第 i 个节点的值
            int preorderVal = preorder[i];
            TreeNode node = stack.peek();
            if (node.val != inorder[inorderIndex]) {
                node.left = new TreeNode(preorderVal);
                stack.push(node.left);
            } else {
                while (!stack.isEmpty() && stack.peek().val == inorder[inorderIndex]) {
                    node = stack.pop();
                    inorderIndex++;
                }
                node.right = new TreeNode(preorderVal);
                stack.push(node.right);
            }
        }
        return root;
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
