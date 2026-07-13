package org.example.leetcode.binarySearch;

public class SearchInsertPosition35 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int k=4;
        int result = SearchInsertPosition35.searchInsert(nums, k);
        System.out.println(result);
    }


    public static int searchInsert(int[] nums, int target) {
        int l=0, r= nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                r=mid-1;
            else
                l=mid+1;


        }

        return r+1;
    }
}
