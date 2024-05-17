package com.datastructures.recusrsion;

public class Gcd {
    public static void main(String[] args) {
        Gcd gcd=new Gcd();
        System.out.println(gcd.calGcd(8,4));
    }
    public int calGcd(int a,int b){
        if(a<0 || b<0){
            return -1;
        }
        if(b==0){
            return a;
        }
        return calGcd(b,a%b);
    }

}
