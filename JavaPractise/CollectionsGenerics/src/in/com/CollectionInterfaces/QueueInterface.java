package in.com.CollectionInterfaces;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue <Integer> myQueue = new LinkedList<>();

        myQueue.add(1);
        myQueue.add(5);
        myQueue.add(7);
        myQueue.add(8);

        CIUtility.print(myQueue);

        //removing
        myQueue.remove();
        CIUtility.print(myQueue);
//        myQueue.remove();//throws exception
        myQueue.poll();//gracefully returns false Queue empty
        CIUtility.print(myQueue);

        System.out.println(myQueue.element());// only retrieves and does not remove from the head
    }
}
