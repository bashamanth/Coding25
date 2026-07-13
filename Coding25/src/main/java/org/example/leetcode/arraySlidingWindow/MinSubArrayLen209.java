package org.example.leetcode.arraySlidingWindow;

public class MinSubArrayLen209 {

    public static void main(String[] args) {

        int[] nums = new int[]{ 1,1,5,2};
        int result = MinSubArrayLen209.minSubArrayLen(20, nums);
        System.out.println(result);
    }

    public static int minSubArrayLen(int target, int[] nums) {

        int minLength = Integer.MAX_VALUE;
        int sum =0;
        int l=0, r=0;


        while(l<nums.length && r< nums.length){
            sum+= nums[r];
            while(sum>=target){
                minLength=Math.min(minLength,r-l+1);
                sum-=nums[l];
                l++;
            }
            r++;
        }

        minLength=  (minLength==Integer.MAX_VALUE)? 0: minLength;


        return minLength;
    }
}
