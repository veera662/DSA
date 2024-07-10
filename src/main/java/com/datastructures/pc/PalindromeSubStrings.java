package com.datastructures.pc;

import java.util.*;

class PalindromeSubStrings {
    public static void findPalindromesInSubString(String input, int j, int k, Set<String> palindrome) {
        System.out.println("print"+j+"    :k: "+k);// comparing left and right side strings
        for (; j >= 0 && k < input.length(); --j, ++k) {    // if not palindrome, skip the next iteration
            if (input.charAt(j) != input.charAt(k)) {
                break;
            }
            // storing the palindromes in result
            String result= input.substring(j, k + 1);
            palindrome.add(input.substring(j, k + 1));
        }
    }

    // This function receives input string and returns the palindromes list
    public static Set<String> findAllPalindromeSubstrings(String input) {
        Set<String> palindrome = new HashSet<String>();
        for (int i = 0; i < input.length(); ++i) {
            //findPalindromesInSubString(input, i , i , palindrome);
            // left side comparison
            findPalindromesInSubString(input, i - 1, i + 1, palindrome);      // right side comparison
            findPalindromesInSubString(input, i, i + 1, palindrome);
        }
        System.out.println(palindrome.toString());
        return palindrome;
    }

    public static void main(String[] args) {

      // List<String> list = Arrays.asList("abc", "1Geeks", "2for",
      //          "3GeeksQuiz", "GeeksforGeeks", "GFG");
       // list.sort(String::compareTo);
       // System.out.println("The sorted stream is : ");

        // displaying the stream with elements
        // sorted in their natural order
       // list.stream().sorted().forEach(System.out::println);
        findAllPalindromeSubstrings("abccba");
    }

    public static boolean isPalidrome(String str) {
        // of the original str
        String rev = "";

        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }

    public static String palidronChecker(String input, List<Integer> startIndex, List<Integer> endIndex, List<Integer> subs) {
        for (int i = 0; i < input.length(); i++) {
            String substring = input.substring(startIndex.get(i), endIndex.get(i));
            isPalidrome(substring);
        }
        return null;
    }
}
