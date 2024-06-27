package com.datastructures.strings;

public class Main {
    public static void main(String[] args) {
        LongestCommonSequence longestPalindormicSequence = new LongestCommonSequence();
        try {
            String distance = "fifty";
            int time = Integer.parseInt(distance);
            System.out.println(time);

        }catch (Exception ex){
            System.out.println("ex");
        }finally {
            System.out.println("fina");
        }
    }
}
