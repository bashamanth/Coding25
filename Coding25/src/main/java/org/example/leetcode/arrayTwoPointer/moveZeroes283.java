package org.example.leetcode.arrayTwoPointer;

public class moveZeroes283 {
    public static void moveZeroes283(int[] nums) {

        int left =0;

        for (int right=0;right<nums.length; right++){

            if(nums[right]!=0){
                int temp= nums[right];
                nums[right] = nums[left];
                nums[left] = temp;

                left++;
            }



        }

    }

    public static void main(String[] args) {

    }
}
