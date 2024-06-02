package in.com.CollectionInterfaces;

import java.util.Collection;

public class CIUtility {
    public static <E> void print(Collection<E> collection){
        System.out.println("Printing ...");
        for (E e : collection) {
            System.out.printf(" %s", e);
        }
        System.out.println();
    }
}
