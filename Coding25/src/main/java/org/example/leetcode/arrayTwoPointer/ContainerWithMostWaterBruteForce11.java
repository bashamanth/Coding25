package org.example.leetcode.arrayTwoPointer;

public class ContainerWithMostWaterBruteForce11 {


    public static int maxArea(int[] height) {

        int maxHeight =0;
        for (int i = 0; i <=height.length-2; i++) {
            for (int j=i+1;j<=height.length-1;j++){
                int smallElement = Integer.min(height[i], height[j]);
                int volume = smallElement* (j-i);
                if(volume>maxHeight)
                    maxHeight=volume;
            }

        }
return maxHeight;
    }



    public static void main(String[] args) {

        int[] nums = new int[]{1,8,6,2,5,4,8,3,7};
        int result = ContainerWithMostWaterBruteForce11.maxArea(nums);
        System.out.println(result);
    }
}
