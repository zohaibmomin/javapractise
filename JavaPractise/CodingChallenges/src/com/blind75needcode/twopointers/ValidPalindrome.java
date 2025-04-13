package com.blind75needcode.twopointers;

//Problem - https://neetcode.io/problems/is-palindrome
/*
Example 1:

Input: s = "Was it a car or a cat I saw?"

Output: true
Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidPalindrome {

    public static boolean isAlphaNum(Character ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "Was it a car or a cat I saw?????";

        System.out.println("Enter the string");
        Scanner input = new Scanner(System.in);
        str = input.nextLine();

        System.out.println("isValidPalindrome = " + isValidPalindrome(str));
    }

    public static boolean isValidPalindrome(String str) {
        //Left pointer from left
        //Right pointer from right
        //Skip alphanumeric.For this create a util function isAlphaNumeric

        str = str.toLowerCase();
        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length - 1;

//        List<Character> myList = new ArrayList<>();

        while (left < right) {

            //Skip alphanumerics from left side
            while (left < right && !isAlphaNum(chars[left])) {
                left++;
            }

            //Skip alphanumerics from right side
            while (right > left && !isAlphaNum(chars[right])) {
                right--;
            }

            if (chars[left] != chars[right]) {
                return false;
            } else {
                //char match so move to next comparison
                left++;
                right--;
            }
        }
        return true;

    }
}
