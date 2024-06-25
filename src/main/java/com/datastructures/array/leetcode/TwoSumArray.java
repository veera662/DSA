package com.datastructures.array.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 26;

        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for(int i=0; i<nums.length; i++) {
            int expectedKey = target - nums[i];
            if(map.containsKey(expectedKey)) {
                return new int[]{map.get(expectedKey), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution found");
    }



}
