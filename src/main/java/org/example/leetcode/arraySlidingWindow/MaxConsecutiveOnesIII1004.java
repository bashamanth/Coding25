package org.example.leetcode.arraySlidingWindow;

public class MaxConsecutiveOnesIII1004 {


    public static void main(String[] args) {

        int[] nums = new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int result = MaxConsecutiveOnesIII1004.maxSum(nums, 3);
        System.out.println(result);
    }

    private static int maxSum(int[] nums, int k) {
        int maxSum=0;
        int l=0;
        int sum;
        int numberOfZeros = 0;
        for (int r = 0; r < nums.length; r++) {

            if(nums[r]==0 && numberOfZeros>=k){
             while (numberOfZeros==k){
                 if(nums[l]==0){
                     numberOfZeros--;
                 }
                 l++;
             }
             numberOfZeros++;
            }
            else if (nums[r]==0){
                numberOfZeros++;
            }

            sum = r-l+1;
            maxSum= Math.max(sum,maxSum);


        }


        return  maxSum;
    }
}
