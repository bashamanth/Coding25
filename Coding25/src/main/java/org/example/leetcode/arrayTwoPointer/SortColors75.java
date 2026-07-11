package org.example.leetcode.arrayTwoPointer;

import java.util.Arrays;

public class SortColors75 {

    public static void sortColors(int[] nums) {

        int i=0,j=0,k = nums.length-1;
        while (j<=k){
            if (nums[j]==0){
                nums[j]= nums[i];
                nums[i]=0;
                i++;
                j++;
            } else if (nums[j]==2) {
                nums[j]= nums[k];
                nums[k]=2;
                k--;
//                j++;
            }
            else
                j++;
        }

     }

    public static void main(String[] args) {

        int[] nums = new int[]{2,0,2,1,1,0,2};
        SortColors75.sortColors(nums);
        Arrays.stream(nums).forEach(System.out::println);

    }
}
