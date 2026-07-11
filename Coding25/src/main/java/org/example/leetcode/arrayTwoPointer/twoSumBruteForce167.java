package org.example.leetcode.arrayTwoPointer;

import java.util.Arrays;

public class twoSumBruteForce167 {

    public static int[] twoSum(int[] numbers, int target) {

        int[] a = new int[2];

        for(int i=0;i<numbers.length;i++){
            for(int j = i+1; j< numbers.length;j++){
                if(numbers[i]+numbers[j]== target){
                    return new int[]{i+1, j+1};
                }


            }
        }

    return a;
    }

    public static void main(String[] args) {
        Arrays.stream(twoSum(new int[]{2, 3, 4}, 6)).forEach(System.out::println);
    }
}
