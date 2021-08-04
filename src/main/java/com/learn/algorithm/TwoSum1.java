package com.learn.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 * @author VirusBingo
 * @date 2021/06/28 10:25 下午
 **/
public class TwoSum1 {

    public static void main(String[] args) {
        int[] nums = new int[] {3, 2, 4};
        int target = 6;
        int[] twoSum = twoSum(nums, target);
        System.out.println(Arrays.toString(twoSum));
        System.out.println(5 +( (10 - 5) >> 1));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int index = target - nums[i];
            if (map.containsKey(index)) {
                return new int[]{map.get(index), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
