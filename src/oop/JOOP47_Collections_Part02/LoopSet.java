package oop.JOOP47_Collections_Part02;

import java.util.HashSet;
import java.util.Set;

/**
 * @author esalkan
 * @project java-notes
 */
public class LoopSet {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Set<Integer> numSet = new HashSet<>();
        numSet.add(54);
        numSet.add(950);
        numSet.add(34);
        numSet.add(61);
        numSet.add(1000);
        numSet.add(541);
        numSet.add(571);
        numSet.add(81);
        numSet.add(1453);
        numSet.add(1000);
        numSet.add(1881);

        // Looping using foreach loop
        System.out.println("Looping using foreach loop");
        for (Integer n : numSet) {
            System.out.print(n + " | ");
        }

        System.out.println("\n");
        /* You can not work with index number. for iterator loop won't work for SET
           Insertion should be in a order. but in set it is not in order and thats why you can't use
           for iterator for SET.

           numSet.get(i) will give error. // Compile error...

        for (int i = 0; i < numSet.size(); i++) {
            System.out.print(numSet.get(i) + " | ");
        }
        */


        // Looping using forEach method. Lambda expression.
        System.out.println("Looping using forEach method. Lambda expression.");
        numSet.forEach(n -> System.out.print(n + " | "));
    }
}
