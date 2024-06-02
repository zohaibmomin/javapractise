package in.com.challengeVarArgsCollections;

import in.com.CollectionInterfaces.CIUtility;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacterSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = input.next();

        Set<Character> charStr = new HashSet<>();

        char[] charArr = str.toCharArray();
        for (Character c : charArr) {
            charStr.add(c);
        }

        System.out.println("Unique characters are ...");
        CIUtility.print(charStr);
        System.out.printf("No of unique characters are %s, ",charStr.size());
    }
}
