package com.learn.algorithm;

import java.util.Arrays;

/**
 * 快速排序算法
 * @author zhaozhichao@cestc.cn
 * @date 2021/06/28 5:44 下午
 **/
public class QuickSort {

    public static void main(String[] args) {
        // 需要排序的数组
        int[] arr = new int[]{6,5,26,90,2,9,4,3,8,1,7};
        quickSort(arr, 0, (arr.length - 1));
        System.out.println(Arrays.toString(arr));

    }


    /**
     * 快速排序算法
     * @param arr 需要排序的数组
     * @param left 数组起始位置
     * @param right 数组结束位置
     * @author zhaozhichao@cestc.cn
     * @date 2021/06/28 17:51:35
     */
    private static void quickSort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int i = left;
        int j = right;
        int flag = arr[left];
        int temp;
        while (i <= j) {
            while (i <= j && arr[i] < flag) {
                i++;
            }
            while (i <=j && arr[j] > flag) {
                j--;
            }
            if (i <= j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(arr, left, j);
        quickSort(arr, i, right);
    }
}
