package com.learn.algorithm.offer.part04;

/**
 * TODO
 *
 * @author VirusBingo
 * @date 2021/07/27 2:23 下午
 **/
public class NumberIn2DArraySelf {

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        Boolean core = core(matrix, target, 0, matrix.length - 1, 0, matrix[0].length - 1);
        System.out.println(System.currentTimeMillis() - startTime);
        return core;
    }

    public static Boolean core(int[][] matrix, int target, int rowStart, int rowEnd, int columnStart, int columnEnd) {
        int leftTop = matrix[rowStart][columnStart];
        int rightDown = matrix[rowEnd][columnEnd];
        if (leftTop == target || rightDown == target) {
            return Boolean.TRUE;
        }
        if (rowStart == rowEnd && columnStart == columnEnd) {
            return Boolean.FALSE;
        }

        if (leftTop > target || rightDown < target) {
            return Boolean.FALSE;
        } else {
            int rowLength = matrix.length - 1;
            int columnLength = matrix[0].length - 1;
            int rowMid = rowStart + ((rowEnd - rowStart) >> 1);
            int columnMid = columnStart + ((columnEnd - columnStart) >> 1);
            if (core(matrix, target, rowStart, rowMid, columnStart, columnMid)) {
                return Boolean.TRUE;
            } else if (core(matrix, target, rowMid >= rowLength ? rowEnd : rowMid + 1, rowEnd, columnStart, columnMid)){
                return Boolean.TRUE;
            } else if (core(matrix, target, rowStart, rowMid, columnMid >= columnLength ? columnEnd : columnMid + 1, columnEnd)) {
                return Boolean.TRUE;
            } else if (core(matrix, target, rowMid >= rowLength ? rowEnd : rowMid + 1, rowEnd, columnMid >= columnLength ? columnEnd : columnMid + 1, columnEnd)) {
                return Boolean.TRUE;
            }
        }

        return Boolean.FALSE;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
//        int[][] matrix = new int[][]{{1},{3},{5}};
        System.out.println(findNumberIn2DArray(matrix,6));

    }


}
