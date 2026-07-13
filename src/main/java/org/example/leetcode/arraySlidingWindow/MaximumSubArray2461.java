package org.example.leetcode.arraySlidingWindow;

import org.example.leetcode.arrayTwoPointer.ContainerWithMostWaterOptimized11;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumSubArray2461 {


    private static int maxSum(int[] nums, int k) {
        int maxSum = 0,sum =0;
        Set<Integer> integerSet = new HashSet<>();

        for (int l = 0, r = 0; r < nums.length; r++) {

            if(r-l+1<k){
                if(integerSet.contains(nums[r])){

                }
                sum+=nums[r];
                integerSet.add(nums[r]);

            }

            else if(r-l+1>k){
                integerSet.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
            else if(r-l+1==k){

                if(!integerSet.contains(nums[r])){
                    sum += nums[r];
                }else
                    continue;
                maxSum = Math.max(sum, maxSum);

            }
            integerSet.add(nums[r]);


        }


        return maxSum;
    }


    public static void main(String[] args) {

        int[] nums = new int[]{ 9, 9, 9};
        int result = MaximumSubArray2461.maxSum(nums, 3);
        System.out.println(result);
    }


}
