package com.datastructures.test;

import java.util.List;

public class HacktonTest {

    public static void fizzBuzz(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            if (i < 0 || i > 2 * Math.pow(10,5)) {
                System.out.println("NONE");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        fizzBuzz(15);


    }

    public static long countSubarrays(List<Integer> numbers, int k) {
        // Write your code here
        int size =numbers.size();
        long p=1;
        int resp=0;

        for (int start=0,end=0;end<size;end++){
            p*=numbers.get(end);
            while (start<end&& p>=k){
                p/=numbers.get((start++));
                if(p<k){
                    int len=end-start+1;
                    resp+=len;
                }
            }
        }
        return resp;

    }
}
