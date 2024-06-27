package com.datastructures.pl;

public class ReverseInteger {

    public int reverse(int x) {
        int reverse =0;
        while (x!=0){
            int remainder=x%10;
            x/=10;
            int max =Integer.MAX_VALUE/10;
            int min= Integer.MIN_VALUE/10;
            if( (reverse > max || reverse==max && remainder >7) || (reverse < min || reverse==min && remainder <-8)){
                return 0;
            }

            reverse = (reverse*10)+remainder;
            
        }
        return reverse;

    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger=new ReverseInteger();
        System.out.println(reverseInteger.reverse(-90000000));
    }
}
