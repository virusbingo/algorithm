package com.learn.algorithm.offer.part09;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 *
 * @author zhaozhichao@cestc.cn
 * @date 2021/07/21 4:36 下午
 **/
public class CQueue {

    Deque<Integer> cacheStack;
    Deque<Integer> deleteStack;

    public CQueue() {
        cacheStack = new LinkedList<>();
        deleteStack = new LinkedList<>();
    }

    public void appendTail(int value) {
        cacheStack.push(value);
    }

    public int deleteHead() {
        if (deleteStack.isEmpty()) {
            while (!cacheStack.isEmpty()) {
                deleteStack.push(cacheStack.pop());
            }
        }
        if (deleteStack.isEmpty()) {
            return -1;
        }
        return deleteStack.pop();
    }

}
