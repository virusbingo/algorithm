package com.learn.algorithm;

/**
 * TODO
 *
 * @author zhaozhichao@cestc.cn
 * @date 2021/08/25 2:39 下午
 **/
public class BTree {

    static class Node {
        Node left;
        Node right;
        int value;
    }

    public void pre(Node tree) {
        if (tree == null) {
            return;
        }
        System.out.println(tree.value);
        pre(tree.left);
        pre(tree.right);
    }

    public void in(Node tree) {
        if (tree == null) {
            return;
        }
        pre(tree.left);
        System.out.println(tree.value);
        pre(tree.right);
    }

    public void order(Node tree) {
        if (tree == null) {
            return;
        }
        pre(tree.left);
        pre(tree.right);
        System.out.println(tree.value);
    }

}
