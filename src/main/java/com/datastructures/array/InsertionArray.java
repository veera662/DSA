package com.datastructures.array;

public class InsertionArray {

    int arr[];

    public InsertionArray(int sizeOfArray){
        arr=new int[sizeOfArray];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }

    public void insert(int location ,int value){
        try {
            if(arr[location] == Integer.MIN_VALUE){
                arr[location]=value;
                System.out.println("successfully inserted");
            }else {
                System.out.println("This cell is already occupied");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Invalied index");
        }

    }

    public int getArr(int index) {

        return arr[index]; //O(1)

    }

    public void traversalArray(){
        try {
        for(int i=0;i<arr.length;i++){//O(n))
            System.out.print(arr[i] + " ");//O(1)

        }
        }catch (Exception ex){
            System.out.println("Array no longer exist");
        }
    }

    public void searchInArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {// O(N)
            if (arr[i] == valueToSearch) { //O(1)
                System.out.println("Value is found at the index of " + i);//O(1)
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");//O(1)
    }

    // Delete value from Array
    public void deleteValue(int valueToDeleteIndex) {
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array");

        }
    }
    public static void main(String[] args) {
        InsertionArray insertionArray=new InsertionArray(10);
        insertionArray.insert(0,0);
        insertionArray.insert(1,10);
        insertionArray.insert(2,20);
        insertionArray.insert(1,30);
        insertionArray.insert(11,0);
        //insertionArray.traversalArray();
        //insertionArray.searchInArray(10);
        //int local[]=new int[3];
        //System.out.println(local[0]);

    }
}
