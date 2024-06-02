package in.com.challengeVarArgsCollections;

import in.com.CollectionInterfaces.CIUtility;

import java.util.Arrays;
import java.util.List;

public class ElementSwap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

        CIUtility.print(list);
        swap(list,2,6);
        CIUtility.print(list);

        swap(list,6,2);
        CIUtility.print(list);//same order

    }

    public static void swap(List<Integer> list,int x, int y){
            int swap = list.get(x);
            list.set(x,list.get(y));
            list.set(y,swap);
    }
}
