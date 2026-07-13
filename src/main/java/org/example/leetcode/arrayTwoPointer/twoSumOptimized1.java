package org.example.leetcode.arrayTwoPointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSumOptimized1 {

    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};

        int target = 26;

      Arrays.stream( twoSumOptimized1.twoSum(arr, target)).forEach(System.out::println);

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int current = nums[i];

            if (map.containsKey(current)) {
                return new int[] { map.get(current), i };
            } else
                map.put(target - current, i);

        }

        return nums;
    }

}
