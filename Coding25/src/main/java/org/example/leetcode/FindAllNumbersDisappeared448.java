package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappeared448 {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> resultArray = findAllNumbersDisappeared448(nums);
        resultArray.forEach(System.out::println);
    }

    private static List<Integer> findAllNumbersDisappeared448(int[] nums) {

        int i=0;

        ArrayList<Integer> result = new ArrayList<>();

        while(i<nums.length){

            if(nums[i]==nums[nums[i]-1]){
                i++;
            }

           else if(i+1!=nums[i]){
                int x = nums[i];
                int y = nums[x-1];

                nums[i] = y;
                nums[x-1]= x;
            }else {
                i++;
            }

        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j]-1!=j){
                result.add(j+1);
            }
        }


        return result;
    }
}
