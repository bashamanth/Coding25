package org.example.leetcode.arrayTwoPointer;

import java.util.Arrays;

public class twoSumOptimized167 {

    public static int[] twoSumOptimized167(int[] numbers, int target){

        int i=0;
        int j= numbers.length-1;

        while(i<j){
            if(numbers[i]+ numbers[j]== target){
                return new int[]{i+1,j+1};
            } else if (numbers[i]+ numbers[j] > target) {
                j--;
            }else
                i++;


        }


        return numbers;
    }

    public static void main(String[] args) {
        Arrays.stream(twoSumOptimized167.twoSumOptimized167(new int[]{2,7,11,15},20)).forEach(System.out::println);
    }
}
