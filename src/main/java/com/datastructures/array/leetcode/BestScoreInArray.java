package com.datastructures.array.leetcode;

import java.util.Arrays;

public class BestScoreInArray {
    public static void main(String[] args) {

        int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int[] topTwoScores1 = findTopTwoScores(myArray);// {90, 87}
        System.out.println(Arrays.toString(topTwoScores1));
    }
    public static int[] findTopTwoScores(int[] array){

        int firstHighest=0;
        int secondHighest=0;
        for (int score : array) {
            if (score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else if (score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }
        return new int[]{firstHighest, secondHighest};
    }

}
