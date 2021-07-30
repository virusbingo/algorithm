package com.learn.algorithm.offer.part06;

import java.util.Stack;

/**
 * 从尾到头打印链表
 *
 * @author zhaozhichao@cestc.cn
 * @date 2021/07/29 11:12 上午
 **/
public class Part06 {

    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop().val;
        }
        return print;
    }

    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }

}
