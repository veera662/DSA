package com.datastructures.array.leetcode;

import java.util.Arrays;

public class IsUniqueArray {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6};
        System.out.println(isUnique(intArray));// true
    }

    public static boolean isUnique(int[] intArray) {

        boolean duplicate=true;
        for (int i = 0; i < intArray.length ; i++) {
            for (int j = i+1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j]) {
                    duplicate= false;

                }
            }
        }
       return duplicate;
    }
}
