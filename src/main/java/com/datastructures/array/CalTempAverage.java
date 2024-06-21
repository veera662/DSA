package com.datastructures.array;

import java.util.Scanner;

public class CalTempAverage {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print(" How many dats Temperature ?");
        int numDays= scanner.nextInt();
        int[] temp=new int[numDays];
        // record temperature and find average
        int sum=0;
        for(int i=0;i<numDays;i++){
            System.out.print("day "+ (i+1) +"'s High temp");
            temp[i]=scanner.nextInt();
            
            sum +=temp[i];
        }

        double average =sum/numDays;
        //count days  above average
        int above=0;
        for(int i=0;i<temp.length;i++){
            above++;
        }
        System.out.println();
        System.out.println("Average Temp "+average);
        System.out.println(above +"Average Temp ");

    }
}
