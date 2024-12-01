package com.easy;

import java.util.HashMap;
import java.util.Set;

public class GenerateDocument {
    public static void main(String[] args) {
        String characters = "helloworld";
        String documentStr = "hello wOrld";

        boolean isDocPossible = canGenerateDoc(characters, documentStr);
        System.out.println("isDocPossible : " + isDocPossible);
    }

    private static boolean canGenerateDoc(String characters, String documentStr) {
        if (documentStr.isEmpty()) return true;
        HashMap<Character, Integer> uniqueChars = new HashMap();
        HashMap<Character, Integer> uniqueDocStr = new HashMap();

        for (int i = 0; i < characters.length(); i++) {
            char f = characters.charAt(i);
            Integer x = uniqueChars.get(f);
            if (x == null) {
                x = 0;
            } else {
                x = x + 1;
            }
            uniqueChars.put(f, x);

        }
        System.out.println(uniqueChars);


        for (int i = 0; i < documentStr.length(); i++) {
            char f = documentStr.charAt(i);
            Integer x = uniqueDocStr.get(f);
            if (x == null) {
                x = 0;
            } else {
                x = x + 1;
            }
            uniqueDocStr.put(f, x);
        }
        System.out.println(uniqueDocStr);

        Set<Character> uniqueCharsKeys = uniqueChars.keySet();
        Set<Character> uniqueDocsKeys = uniqueDocStr.keySet();
//        if (uniqueDocsKeys.size() < uniqueCharsKeys.size()) return true;
        for (Character uniqueCharsKey : uniqueCharsKeys) {
            Integer v1 = uniqueChars.get(uniqueCharsKey);
            Integer v2 = uniqueDocStr.get(uniqueCharsKey);
            if (v2 == null) {
                if (uniqueDocsKeys.size() < uniqueCharsKeys.size()) continue;
                return false;
            }
            if (v1 < v2) return false;
        }
        for (Character uniqueDocsKey : uniqueDocsKeys) {
            Integer v1 = uniqueChars.get(uniqueDocsKey);
            Integer v2 = uniqueDocStr.get(uniqueDocsKey);
            if (v1 == null) {
                //if (uniqueDocsKeys.size() < uniqueDocsKeys.size()) continue;
                return false;
            }
            //if (v1 < v2) return false;
        }
//        System.out.println("equals : " + uniqueDocStr.equals(uniqueChars));

        return true;
    }
}
