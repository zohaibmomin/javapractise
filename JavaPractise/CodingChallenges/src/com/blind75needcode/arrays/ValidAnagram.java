package com.blind75needcode.arrays;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";

        System.out.println("isAnagram(s,t);" + isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {

        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();

        Arrays.sort(schar);
        Arrays.sort(tchar);

        return Arrays.equals(schar, tchar);


    }
}
