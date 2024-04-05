package com.datastructures.array.leetcode;

public class MissingNumberInArray {
    static int findMissingNumberInArray(int[] arr) {
        int n=arr.length+1;
        int expectedSum=(n*(n+1))/2;
        int actuvalSum=0;
        for(int number:arr){
            actuvalSum+=number;
        }
        return expectedSum-actuvalSum;
    }

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,9};
        System.out.println(findMissingNumberInArray(myArray)); // 5
    }
}
