package com.learn.algorithm.offer.part05;

import java.util.Arrays;

/**
 * TODO
 *
 * @author zhaozhichao@cestc.cn
 * @date 2021/07/28 3:31 下午
 **/
public class LeetCoin {

    public int[] bonus(int n, int[][] leadership, int[][] operations) {
        return null;
    }

    public static void main(String[] args) {
        int[][] leadership = new int[][] {
                {1, 2},
                {1, 6},
                {2, 3},
                {2, 5},
                {1, 4}
        };
        int[][] operations = new int[][]{
                {1, 1, 500},
                {2, 2, 50},
                {3, 1},
                {2, 6, 15},
                {3, 1}
        };
        int n = 6;


        LeetCoin leetCoin = new LeetCoin();
        System.out.println(Arrays.toString(leetCoin.bonus(n, leadership, operations)));
    }

}
