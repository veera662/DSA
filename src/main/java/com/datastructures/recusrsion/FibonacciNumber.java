package com.datastructures.recusrsion;

public class FibonacciNumber {
    public static void main(String[] args) {
        FibonacciNumber fb=new FibonacciNumber();
        System.out.println(fb.fibonacci(5));

    }
    public int fibonacci(int n){
        if(n<0){
            return -1;
        }
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
