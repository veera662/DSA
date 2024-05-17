package com.datastructures.recusrsion;

public class Decimaltobinary {
    public static void main(String[] args) {
        Decimaltobinary dc=new Decimaltobinary();
        System.out.println(dc.dcb(13));
    }
    public int dcb(int n){

        if(n==0){
            return 0;
        }
        return n%2+10*dcb(n/2);
    }
}
