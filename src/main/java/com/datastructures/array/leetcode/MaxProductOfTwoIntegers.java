package com.datastructures.array.leetcode;

import java.util.Arrays;

public class MaxProductOfTwoIntegers {
    public static void main(String[] args) {
        int[] intArray = {10,20,30,40,50};
        System.out.println(maxProduct(intArray));
    }

    public static  String maxProduct(int[] intArray) {
        int maxProduct=0;
        String maxProductIndexes=null;
        for (int i = 0; i < intArray.length; i++) {

            for (int j = i+1; j < intArray.length; j++) {
                int sum =intArray[i]*intArray[j];
                if(sum > maxProduct){
                    maxProduct=sum;
                    maxProductIndexes =Integer.toString(intArray[i])+","+Integer.toString(intArray[j]);
                }
            }
        }
        return maxProductIndexes;
    }
}
