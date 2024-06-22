package com.datastructures.array.pc;

public class StringBuilderTest{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("s");
        String str="helllo";
        System.out.println(str.charAt(0));
        System.out.println(sb.indexOf(String.valueOf(str.charAt(0))));
    }
}
