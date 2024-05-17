package com.datastructures.recusrsion;

public class reverseString {
    public static void main(String[] args) {
        reverseString ss = new reverseString();
        System.out.println(ss.reverse("abcd"));
    }
public String reverse(String str){
        if(str ==null ||str.isEmpty()){
            return "";
        }
    System.out.println(str.substring((1)));
        return reverse(str.substring((1)))+str.charAt(0);
}
}
