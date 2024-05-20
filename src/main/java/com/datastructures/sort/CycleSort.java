package com.datastructures.sort;

public class CycleSort {

    public static void printArray(int arr[])
    {

        // Traverse the array
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int arr[]){
        for(int i=0;i<arr.length;){

            if(arr[i]==i+1){
                i++;
            } else
            {
                // Swap the value of
                // arr[i] and arr[arr[i]-1]
                int temp1 = arr[i];
                int temp2 = arr[arr[i] - 1];
                arr[i] = temp2;
                arr[temp1 - 1] = temp1;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,4,2,5,7,0,0,2,3,1};
        int N = arr.length;

        // Function call to sort the array
        sort(arr);

        // Function call to print the array
        printArray(arr);
    }
}
