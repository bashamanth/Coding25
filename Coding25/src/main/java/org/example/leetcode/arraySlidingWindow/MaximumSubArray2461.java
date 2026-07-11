package org.example.leetcode.arraySlidingWindow;

import org.example.leetcode.arrayTwoPointer.ContainerWithMostWaterOptimized11;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumSubArray2461 {


    private static int maxSum(int[] nums, int k) {

        int maxSum = 0;

        Set<Integer> uniqueElements = new HashSet<>();
        for (int i = 0; i < k; i++) {
            if (uniqueElements.contains(nums[i])) {
                maxSum = 0;
                break;
            }
            else {
                uniqueElements.add(nums[i]);
                maxSum += nums[i];

            }
        }

        for (int i = k; i < nums.length-k ; i++) {


        }






        for (int i = 0; i < nums.length-k; i++) {
            int sum = 0;
            if (!uniqueElements.contains(nums[i])) {
                sum += nums[i];
                uniqueElements.add(nums[i]);

                if(i<k){

                }
            }

        }
        return maxSum;
    }


    public static void main(String[] args) {

        int[] nums = new int[]{5, 1, 5, 4, 2, 9, 9, 9};
        int result = MaximumSubArray2461.maxSum(nums, 3);
        System.out.println(result);
    }


}
