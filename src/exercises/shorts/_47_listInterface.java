package exercises.shorts;

import java.util.*;

public class _47_listInterface {

    /*
            LIST INTERFACE

            List Difference
                - Child interface of Collection
                - Duplicates are ALLOWED
                - Insertion order preserved
                - Has index numbers
                - import java.util.List;
     */

    public static void main(String[] args) {
        /*
            ArrayList Class:
                - Implements the list interface
                - Internally uses Array
                - Retrieving the element is faster
                - "import java.util.Arraylist;"
         */
        List<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1, 2, 3, 4, 5));
        arrayList.addAll(Arrays.asList(1, 2, 3, 4, 5)); // Duplicates ALLOWED
        System.out.println("arrayList = " + arrayList);

        System.out.println("ArrayList Elements with for loop");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
        System.out.println("ArrayList Elements with foreach");
        for (Integer each : arrayList) {
            System.out.print(each);
        }

        /*
            LinkedList Class
                - Implements the List interface
                - Internally uses doubly linked list
                - Each value will have pointer to the next value
                - Inserting and deleting the elements is faster
                - "import java.util.LinkedList;"
         */
        List<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(1, 2, 3, 4, 5));
        linkedList.addAll(Arrays.asList(1, 2, 3, 4, 5));  // Duplicates ALLOWED
        System.out.println("linkedList = " + linkedList);

        System.out.println();
        System.out.println("LinkedList Elements with for loop");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }

        System.out.println();
        System.out.println("LinkedList Elements with foreach");
        for (Integer each : linkedList) {
            System.out.print(each);
        }

        /*
            Vector Class
                - Implements the Link interface
                - Internally uses Array
                - Is synchronized (Thread-safe)
         */
        List<Integer> vector = new Vector<>();
        vector.addAll(Arrays.asList(1, 2, 3, 4, 5));
        vector.addAll(Arrays.asList(1, 2, 3, 4, 5));  // Duplicates ALLOWED
        System.out.println("vector = " + vector);

        System.out.println();
        System.out.println("Vector Elements with for loop");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " ");
        }

        System.out.println();
        System.out.println("Vector Elements with foreach");
        for (Integer each : vector) {
            System.out.print(each);
        }

        /*
            Stack Class
                - Child class of Vector
                - Synchronized (Thread-safe)
                - Last-in First-out (LIFO)
         */
        List<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(1, 2, 3, 4, 5));
        stack.addAll(Arrays.asList(1, 2, 3, 4, 5));  // Duplicates ALLOWED
        System.out.println("stack = " + stack);

        System.out.println();
        System.out.println("Stack Elements with for loop");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }

        System.out.println();
        System.out.println("Vector Elements with foreach");
        for (Integer each : stack) {
            System.out.print(each);
        }
        System.out.println();

        System.out.println("stack = " + stack);
        // LIFO example; pop() method is Stack Class method and need to make DownCasting
        ((Stack<Integer>) stack).pop(); // DownCasting for reach the stack class methods
        System.out.println("stack = " + stack);

    }

}
