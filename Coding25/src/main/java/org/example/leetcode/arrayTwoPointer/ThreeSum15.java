package org.example.leetcode.arrayTwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        int target =0;


        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (i > 0 && nums[i] == nums[i+1]) {
                continue;
            }

            int j = i + 1;
            int k = length - 1;
            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j<k && nums[j]==nums[j+1]) j++;
                    while(j<k && nums[k]==nums[k-1]) k--;

                    j++;
                    k--;

                } else if (sum>target) {
                    k--;
                }
                else{
                   j++;
                }


            }
        }


        return result;
    }


    public static void main(String[] args) {
        List<List<Integer>> result = threeSum(new int[]{-1,-1,-1,0,0,0,1,2,2,3});

        assert result != null;
        result.stream().flatMap(List::stream).forEach(num -> System.out.println(num + " "));


    }
}
