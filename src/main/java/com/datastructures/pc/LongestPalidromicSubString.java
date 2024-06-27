package com.datastructures.pc;


public class LongestPalidromicSubString {

    int resultStart;
    int resultLength;

    public String longestPalindrome(String s) {

        int length=s.length();
        if(length<2){
            return s;
        }
        for (int start = 0; start < length ; start++) {
            expandMiddle(s,start,start);
            expandMiddle(s,start,start+1);
        }
        return s.substring(resultStart,resultStart+resultLength);
    }

    private void expandMiddle(String str, int begin, int end) {

        while (begin>=0 && end <str.length() && str.charAt(begin) == str.charAt(end) ){
            begin--;
            end++;
        }
        if(resultLength <end-begin-1){
            resultStart =begin+1;
            resultLength = end-begin-1;
        }
    }

    public static void main(String[] args) {
        LongestPalidromicSubString ls=new LongestPalidromicSubString();
        System.out.println(ls.longestPalindrome("babab"));
    }

}
