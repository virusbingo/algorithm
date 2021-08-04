package com.learn.algorithm.offer.part10;

/**
 * 斐波那契数列
 *
 * @author VirusBingo
 * @date 2021/07/28 3:02 下午
 **/
public class Fibonacci {

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int current = 0, next = 1;
        for (int i = 0; i < n; i++) {
            int temp = next;
            next = (current + next) % 1000000007;
            current = temp;

        }
        return current;
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
    }

}
