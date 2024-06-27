package com.datastructures.pc;

import java.util.*;
class PalindromeSubStrings
{
    public static void findPalindromesInSubString(String input, int j, int k,    List<String> palindrome)
    {   // comparing left and right side strings
        for (; j >= 0 && k < input.length(); --j, ++k)
        {    // if not palindrome, skip the next iteration
            if (input.charAt(j) != input.charAt(k))
            {     break;    }
            // storing the palindromes in result
            palindrome.add(input.substring(j, k + 1));
        }
    }
    // This function receives input string and returns the palindromes list
    public static List<String> findAllPalindromeSubstrings(String input) {
        List<String> palindrome = new ArrayList<String>();
        for (int i = 0; i < input.length(); ++i)
        {    // left side comparison
            findPalindromesInSubString(input, i - 1, i + 1, palindrome);      // right side comparison
            findPalindromesInSubString(input, i, i + 1, palindrome);
        }
        return palindrome;
    }
    public static void main(String[] args)
    {
        String[] inputStr = {"aabbbaa", "321230990", "educative"};
        for (int i = 0; i < inputStr.length; i++)
        {
            List<String> result = findAllPalindromeSubstrings(inputStr[i]);
            System.out.println((i + 1) + ". Input string: " + inputStr[i]);
            System.out.println("   Palindromes: " + result.toString());
            System.out.println("   Total palindrome substrings: " + result.size());
        }
    }
}
