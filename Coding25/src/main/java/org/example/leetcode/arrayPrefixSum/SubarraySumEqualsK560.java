package org.example.leetcode.arrayPrefixSum;

import org.example.leetcode.arraySlidingWindow.SubarraysKDifferentIntegers992;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK560 {

    public static void main(String[] args) {

        int[] nums = new int[]{1,2,1,2,3};
        int k=3;
        int result = SubarraySumEqualsK560.subarraySum(nums, k);
        System.out.println(result);
    }

    private static int subarraySum(int[] nums, int k) {
        int count=0;
        int sum=0;
        Map<Integer,Integer> mapOfSumFrequency = new HashMap<>();
        mapOfSumFrequency.put(0,1);
        for(int r=0;r< nums.length;r++){
            sum+=nums[r];
            if(sum>=k){
                int target= sum-k;
                count+=mapOfSumFrequency.get(target);
            }
            mapOfSumFrequency.put(sum,mapOfSumFrequency.getOrDefault(sum,0)+1);

        }
        return count;
    }

}
