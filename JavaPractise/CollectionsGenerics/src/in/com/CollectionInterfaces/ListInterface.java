package in.com.CollectionInterfaces;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("Zohaib");
        myList.add("Momin");

        CIUtility.print(myList);
        System.out.println(myList.remove("momin")); //will return false

        myList.remove("Zohaib");
        CIUtility.print(myList);
    }
}
