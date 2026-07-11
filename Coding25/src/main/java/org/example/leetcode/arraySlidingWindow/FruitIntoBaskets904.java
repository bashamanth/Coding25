package org.example.leetcode.arraySlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FruitIntoBaskets904 {
    public static void main(String[] args) {

        int[] nums = new int[]{0,1,2,2};
        int result = FruitIntoBaskets904.maxFruits(nums);
        System.out.println(result);
    }

    private static int maxFruits(int[] nums) {

        int maxFruits= 0;
        int countDifferentFruits = 0;
        Map<Integer,Integer> distinctFruits = new HashMap<>();

        for(int l=0, r=0; r< nums.length;r++){
            if(!distinctFruits.containsKey(nums[r])){

                if(distinctFruits.size()>=2){
                    while(distinctFruits.size()>1){
                        int value = distinctFruits.get(nums[l])-1;
                        if(value==0){
                            distinctFruits.remove(nums[l]);
                        }
                        else {
                            distinctFruits.put(nums[l], value );
                        }


                        l++;
                    }

                }

                distinctFruits.put(nums[r],1);

            }
            else{
                distinctFruits.put(nums[r],distinctFruits.get(nums[r])+1 );
            }

            maxFruits=Math.max(r-l+1,maxFruits);

        }
        return maxFruits;
    }
}
