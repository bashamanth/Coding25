package org.example.Concepts;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};

        int[] sortedArray = cyclicSort(arr);

        Arrays.stream(sortedArray).forEach(System.out::println);
    }

    private static int[] cyclicSort(int[] arr) {

        int i=0;
        while(i < arr.length) {
            if(arr[i]!= i+1){
                int x = arr[i];
                int y = arr[x-1];
                arr[i]=y;
                arr[x-1]=x;
            }
            else {
                i++;
            }

        }
        return  arr;
    }
}
