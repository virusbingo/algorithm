package com.learn.algorithm.offer.part04;

/**
 * 剑指 Offer 04. 二维数组中的查找
 *
 * @author zhaozhichao@cestc.cn
 * @date 2021/07/22 3:17 下午
 **/
public class NumberIn2DArray {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, columns = matrix[0].length;
        int row = 0, column = columns - 1;
        while (row < rows && column >= 0) {
            int num = matrix[row][column];
            if (num == target) {
                System.out.println((System.currentTimeMillis() - startTime));
                return true;
            } else if (num > target) {
                column--;
            } else {
                row++;
            }
        }
        System.out.println((System.currentTimeMillis() - startTime));
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(findNumberIn2DArray(matrix,5));
    }
}
