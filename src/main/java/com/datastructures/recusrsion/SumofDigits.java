package com.datastructures.recusrsion;

public class SumofDigits {
    public static void main(String[] args) {
        SumofDigits sm=new SumofDigits();
        System.out.println(sm.sumdidgitd(111));
    }
    public int sumdidgitd(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 0;
        }
        return n%10+sumdidgitd(n/10);
    }
}
