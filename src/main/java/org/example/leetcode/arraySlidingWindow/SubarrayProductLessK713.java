package org.example.leetcode.arraySlidingWindow;

public class SubarrayProductLessK713 {

    public static void main(String[] args) {

        int[] nums = new int[]{10,5,2,6};
        int result = SubarrayProductLessK713.maxProduct(nums, 100);
        System.out.println(result);
    }

    private static int maxProduct(int[] nums, int k) {
        if (k <= 1) return 0;
        int count = 0;
        int product = 1;
        for (int l = 0, r = 0; r < nums.length; r++) {
            product *= nums[r];

            while (product >= k) {
                product /= nums[l];
                l++;
            }
            count += r - l + 1;
        }
        return count;
    }
}
