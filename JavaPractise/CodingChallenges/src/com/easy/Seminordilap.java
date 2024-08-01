package com.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Seminordilap {
    public static void main(String[] args) {
        String[] str = new String[]{"dog", "hello", "god"};
        System.out.println(getSemiPairs(str).toString());
    }

    public static ArrayList<ArrayList<String>> getSemiPairs(String[] str) {
        //create hashSet from strings array
        HashSet<String> wordsSet = new HashSet<String>(Arrays.asList(str));

        //create list of pairs list to be returned
        ArrayList<ArrayList<String>> pairs = new ArrayList<ArrayList<String>>();

        for (String word : str) {
            String reverse = new StringBuilder(word).reverse().toString();

            //if set contains reverse and not same as existing word
            if (wordsSet.contains(reverse) && !reverse.equals(word)) {
                ArrayList<String> pair = new ArrayList<String>();
                pair.add(word);
                pair.add(reverse);
                pairs.add(pair);
                wordsSet.remove(word);
                wordsSet.remove(reverse);
            }
        }

        return pairs;
    }
}
