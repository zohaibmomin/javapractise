package in.com.challengeVarArgsCollections;

import in.com.CollectionInterfaces.CIUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDescendingStrings {
    public static void main(String[] args) {
        List<String> myStrings = new ArrayList<>();
        myStrings.add("My");
        myStrings.add("Name");
        myStrings.add("Zohaib");
        myStrings.add("Zzzzz");
        myStrings.add("Is");

        CIUtility.print(myStrings);
        myStrings.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) {
                    return 0;
                } else if (o1.charAt(0) < o2.charAt(0)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        CIUtility.print(myStrings);


    }
}
