package org.example.leetcode.binarySearch;

import org.example.leetcode.arrayPrefixSum.SubarraySumEqualsK560;

public class BinarySearch704 {

    public static void main(String[] args) {

        int[] nums = new int[]{-1,0,3,5,9,12};
        int k=9;
        int result = BinarySearch704.search(nums, k);
        System.out.println(result);
    }

    public static int search(int[] nums, int target) {

        int l=0, r= nums.length-1;
        while(l<r){
            int mid = (l+r)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                r=mid-1;
            else
                l=mid+1;


        }

        return -1;
    }
}
