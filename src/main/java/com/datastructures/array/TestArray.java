package com.datastructures.array;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int[] intarray;
        intarray=new int[3];
        intarray[0]=1;//o(1)} o(n)
        intarray[1]=2;//o(1)
        intarray[2]=3;//o(1)
        System.out.println(Arrays.toString(intarray));

        //All together
        String strArray[]={"a","b","c"};//O(1)
        System.out.println(Arrays.toString(strArray));
    }
}
