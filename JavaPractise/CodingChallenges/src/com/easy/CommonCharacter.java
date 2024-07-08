package com.easy;

import java.util.*;

//https://www.algoexpert.io/questions/common-characters
public class CommonCharacter {
    public static void main(String[] args) {
        String[] str = {"abc", "bcd", "cbaccd"};
        System.out.println(Arrays.toString(commonCharacters(str)));

    }

    public static String[] commonCharacters(String[] strings) {
        // Write your code here.
        String[] temp = {};
        Map<Character, Integer> myMap = new HashMap<>();
        List<Character> myChar = new ArrayList<>();
        List<Character> result = new ArrayList<>();

        for (String stringEle : strings) {
            Set<Character> mySet = new HashSet<>();
            for (int i = 0; i < stringEle.length(); i++) {
                mySet.add(stringEle.charAt(i));
            }
            for (char c : mySet) {
                myChar.add(c);
                if (myMap.containsKey(c)) {
                    myMap.put(c, myMap.get(c) + 1);
                } else {
                    myMap.put(c, 1);
                }
                if (myMap.get(c) == strings.length) {
                    result.add(c);
                }
            }
        }
        System.out.printf("Characters - %s", Arrays.toString(myChar.toArray()));
        System.out.printf("\n Result - %s", Arrays.toString(result.toArray()));
        System.out.printf("\nMap - %s", myMap.toString());

        temp = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            temp[i] = result.get(i).toString();
        }
        return temp;
    }
}
