package com.datastructures.pc;

import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {

    public static void main(String[] args) {
        int[] array={-2,11,4,6,7};
        int target =9;
        //System.out.println(twoSumArray(array,target));
    }

    private static int[] twoSumArray(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int expectedKey = target - nums[i];
            if(map.containsKey(expectedKey)) {
                return new int[]{map.get(expectedKey), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
