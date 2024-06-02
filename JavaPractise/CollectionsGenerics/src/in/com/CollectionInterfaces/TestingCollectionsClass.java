package in.com.CollectionInterfaces;

import java.util.*;

public class TestingCollectionsClass {
    public static void main(String[] args) {
        List <Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(5);
        myList.add(7);
        myList.add(8);
        myList.add(-99);
        myList.add(0);


        CIUtility.print(myList);

        Collections.sort(myList);
        CIUtility.print(myList);
        System.out.printf("Index of Search 3 %s",Collections.binarySearch(myList,9));

        Collections.reverse(myList);
        CIUtility.print(myList);

    }
}
