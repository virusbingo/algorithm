package com.learn.algorithm.offer.part11;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如，数组[3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。
 *
 * @author zhaozhichao@cestc.cn
 * @date 2021/08/04 3:52 下午
 **/
public class MinArray {

    public static void main(String[] args) {
        int[] numbers = new int[]{3,4,5,1,2};
        int minNum = minArray(numbers);
        System.out.println(minNum);
    }

    private static int minArray(int[] numbers) {
        return 0;
    }

}
