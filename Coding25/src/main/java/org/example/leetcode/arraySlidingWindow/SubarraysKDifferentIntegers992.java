package org.example.leetcode.arraySlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SubarraysKDifferentIntegers992 {


    public static void main(String[] args) {

        int[] nums = new int[]{1,2,1,2,3};
        int k=2;
        int result = SubarraysKDifferentIntegers992.subarraysWithKDistinct(nums, k);
        System.out.println(result);
    }

    private static int subarraysWithKDistinct(int[] nums, int k) {

        return subarraysWithLessthanOrEqualToK(nums, k)- subarraysWithLessthanOrEqualToK(nums, k-1);
    }

    private static int subarraysWithLessthanOrEqualToK(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int l = 0, r = 0; r < nums.length; r++) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            while (map.size() > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0)
                    map.remove(nums[l]);
                l++;
            }
            count += r - l + 1;
        }
        return count;
    }
}
