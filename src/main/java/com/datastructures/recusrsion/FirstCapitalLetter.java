package com.datastructures.recusrsion;

public class FirstCapitalLetter {
    public static void main(String[] args) {
        FirstCapitalLetter fcl=new FirstCapitalLetter();
        System.out.println(fcl.first("dddK"));
    }
    public static char first(String str) {
        if(str.isEmpty()) {
            return ' ';
        }
        if (Character.isUpperCase(str.charAt(0))) {
            return str.charAt(0);
        }else {
            return first(str.substring(1, str.length()));
        }
    }
}
