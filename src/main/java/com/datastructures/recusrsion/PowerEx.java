package com.datastructures.recusrsion;

public class PowerEx {
    public static void main(String[] args) {
        PowerEx ex=new PowerEx();
        System.out.println(ex.calculatePower(2,5));
    }
    public int calculatePower(int base,int exp){
        if(exp<0){
            return -1;
        }
        if(exp ==0){
            return  1;
        }
        return base*calculatePower(base,exp-1);
    }
}
