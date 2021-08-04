package com.learn.algorithm.offer.part10;

/**
 * TODO
 *
 * @author zhaozhichao@cestc.cn
 * @date 2021/08/04 3:49 下午
 **/
public class NumWays {


    public static void main(String[] args) {
        int numWays = numWays(10);
        System.out.println(numWays);
    }

    private static int numWays(int n) {
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
