package org.example.leetcode.arraySlidingWindow;

public class MaxConsecutiveOnes485 {

    public static void main(String[] args) {

        int[] nums = new int[]{1,0,1,1,1,0,1};
        int result = MaxConsecutiveOnes485.maxSum(nums);
        System.out.println(result);
    }

    private static int maxSum(int[] nums) {

        int maxSum=0;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                maxSum= Math.max(sum, maxSum);
                sum=0;
            }
            else{
                sum++;
            }



        }

        maxSum= Math.max(sum, maxSum);



        return maxSum;
    }
}
