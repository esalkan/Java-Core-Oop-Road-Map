package exercises.shorts;

import java.util.*;

public class _49_queueInterface {
    /*
        QUEUE INTERFACE
            - Child interface of the Collection
            - Duplicates are ALLOWED
            - Insertion NOT ORDER PRESERVED
            - First-In, First-Out (FIFO)
            - "import java.util.Queue;"
     */

    public static void main(String[] args) {
        /*
            PriorityQue Class
                - Implements the Queue Interface
                - Maintains the random order
                - Does NOT ACCEPT null values
                - "import java.util.PriorityQue;"
         */

        Queue<Integer> priorityQue = new PriorityQueue<>();
        priorityQue.addAll(Arrays.asList(10, 200, 300, 40, 90));
        priorityQue.addAll(Arrays.asList(10, 200, 300, 40, 90)); // DUPLICATES ALLOWED
        // priorityQue.add(null); // Null is not allowed
        priorityQue.poll(); // FIFO 10 will be removed.
        System.out.println("priorityQue = " + priorityQue); // RANDOM ORDER WILL DISPLAYED

        // With for loop can not iterate
//        for (int i = 0; i < priorityQue.size(); i++) {
//            System.out.println("priorityQue = " + priorityQue.get(i));
//        }

        // Foreach loop for use
        for (Integer each :
                priorityQue) {
            System.out.println("priorityQue = " + each);
        }


        /*
            ArrayDeque Class
                - Implements the Deque Interface
                - Maintain the insertion order
                - NOT Accepts NULL values
                - "import java.util.ArrayDeque;"
         */
        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10, 200, 300, 40, 90));
        arrayDeque.addAll(Arrays.asList(10, 200, 300, 40, 90)); // DUPLICATES ALLOWED
        // arrayDeque.add(null); // NOT ACCEPTS Nulls
        priorityQue.poll(); // FIFO 10 will be removed.
        System.out.println("arrayDeque = " + arrayDeque); // INSERTION ORDER WILL DISPLAYED

        // With for loop can not iterate
//        for (int i = 0; i < priorityQue.size(); i++) {
//            System.out.println("priorityQue = " + priorityQue.get(i));
//        }

        // Foreach loop for use
        for (Integer each :
                arrayDeque) {
            System.out.println("arrayDeque = " + each);
        }

        /*
            LinkedList Class
                - Implements the Deque Interface
                - Maintain the insertion order
                - NOT Accepts NULL values
                - HAS INDEX NUMBERS
                - "import java.util.LinkedList;"
         */
        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedList.addAll(Arrays.asList(10, 200, 300, 40, 90)); // DUPLICATES ALLOWED
        linkedList.add(null); // NOT ACCEPTS Nulls
        linkedList.poll(); // FIFO 10 will be removed.
        System.out.println("linkedList = " + linkedList); // INSERTION ORDER WILL DISPLAYED

        // With for loop can not iterate
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("linkedList for loop = " + ((LinkedList<Integer>) linkedList).get(i));
        }

        // Foreach loop for use
        for (Integer each :
                linkedList) {
            System.out.println("linkedList = " + each);
        }


    }
}
