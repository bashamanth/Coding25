package org.example.leetcode.arrayTwoPointer;

public class ContainerWithMostWaterOptimized11 {


    public static int maxArea(int[] height) {

        int maxHeight = 0;

        int i = 0;
        int j = height.length - 1;
        while (i < j) {

            int smallElement = Integer.min(height[i], height[j]);
            int volume = smallElement * (j - i);
            if (volume > maxHeight)
                maxHeight = volume;

            if (height[i] <= height[j])
                i++;
            else
                j--;


        }
        return maxHeight;
    }


    public static void main(String[] args) {

        int[] nums = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = ContainerWithMostWaterOptimized11.maxArea(nums);
        System.out.println(result);
    }
}
