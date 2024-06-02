package in.com.CollectionInterfaces;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceExample {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        mySet.add("Hello");

//        mySet.add(2); This is not allowed because Set is told to contain <String>
        CIUtility.print(mySet);
        System.out.println(mySet.contains("Hello"));
        mySet.add("Hello");//Hello was ignored because duplicates cannot be added. It returns false
        CIUtility.print(mySet);

    }
}
