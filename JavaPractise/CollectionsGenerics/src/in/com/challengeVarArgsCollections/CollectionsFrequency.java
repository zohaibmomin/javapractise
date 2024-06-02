package in.com.challengeVarArgsCollections;

import java.util.*;

public class CollectionsFrequency {
    public static void main(String[] args) {
        List<String> mystr = new ArrayList<>();
        mystr.add("ABC");
        mystr.add("ABC");
        mystr.add("XyZ");
        mystr.add("xyz");
        mystr.add("xyz");
        mystr.add("pqr");
        mystr.add("uyb");

//        List<Integer> mystr = Arrays.asList(1,2,-1,4,5,6,7,22,2,1,4);

        System.out.println(Collections.frequency(mystr,"xyz"));
    }
}
