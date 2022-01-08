package oop.JOOP46_Collections_Part01;

import java.util.LinkedList;
import java.util.List;

/**
 * @author esalkan
 * @project java-notes
 */
public class LinkedListExample {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(50);
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(1) = " + list.get(1));

        /**
         * to use getFirst() method
         * getFirst() method specific to LinkedList<>(), Who decide to what to access? Reference,
         * who is the reference List<>, What you need to do it, casting, "DOWN-CASTING" thats all
         */
        // list.getFirst();
        System.out.println("((LinkedList<Integer>)list).getFirst() = " + ((LinkedList<Integer>) list).getFirst());
        ((LinkedList<Integer>) list).addFirst(1);
        ((LinkedList<Integer>) list).addLast(99);
        System.out.println("((LinkedList<Integer>)list).getFirst() = " + ((LinkedList<Integer>) list).getFirst());
        System.out.println("((LinkedList<Integer>) list).getLast() = " + ((LinkedList<Integer>) list).getLast());

    }
}
