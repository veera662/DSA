package com.datastructures.array.leetcode;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array={1, 1, 2, 2, 3, 4, 5};
        int[] withOutDuplicate = removeDuplicates(array);
        System.out.println(Arrays.toString(withOutDuplicate));
        // Output : [1, 2, 3, 4, 5]
    }
    public static int[] removeDuplicates(int[] arr) {

        int[] withoutDuplicate=new int[arr.length];
        int index=0;

        for (int i = 0; i < arr.length ; i++) {

            boolean duplicate=false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                withoutDuplicate[index]=arr[i];
                index++;
            }

        }
        return Arrays.copyOf(withoutDuplicate,index);
    }

}
