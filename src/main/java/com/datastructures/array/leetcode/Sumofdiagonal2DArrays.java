package com.datastructures.array.leetcode;

import java.util.Arrays;

public class Sumofdiagonal2DArrays {
    public static void main(String[] args) {
        int [][] myArray2D= {{2,2,3},{4,6,6},{7,8,8}};
        int sumDiagonalElements = sumDiagonalElements(myArray2D);
        System.out.println(sumDiagonalElements);
    }
    public static int sumDiagonalElements(int[][] array) {
    int length=array.length;
        System.out.println("Arrays length :"+length);
        int sum= 0;
        for(int i=0;i<array.length;i++){
            sum+=array[i][i];
        }
        return sum;
    }
}
