package com.datastructures.recusrsion;

public class Palidrome {
    public static void main(String[] args) {
        Palidrome palidrome=new Palidrome();
        System.out.println(palidrome.isPalindrome("dcc"));

    }
    public  boolean isPalindrome(String s)
    {   // if length is 0 or 1 then String is palindrome
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPalindrome(s.substring(1, s.length()-1));
        return false;
    }
}
