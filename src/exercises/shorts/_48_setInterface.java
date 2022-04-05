package exercises.shorts;

import java.util.*;

public class _48_setInterface {
    /*
            SET INTERFACE
                - Child Interface of Collection
                - Duplicates are not allowed
                - Insertion order not preserved
                - Does not have indexes
                - "import java.util.Set;"
     */

    public static void main(String[] args) {
        /*
            HashSet Class
                - Implements the set interface
                - Maintains the random order
                - Accepts null values
                - "import java.util.HashSet;"
         */
        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90)); // In random order will be added to the hashSet
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90)); // Duplicated elements are not allowed and when print just will see same elements
        hashSet.add(null); // Accepting null
        System.out.println("hashSet = " + hashSet);

        /*
            LinkedHashSet Class
                - Child class of HashSet
                - Maintains insertion order
                - Accepts null values
                - "import java.util.LinkedHashSet;"
         */
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90)); // In insertion order will be added.
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90)); // Duplicated elements are not allowed and when print just will see same elements
        linkedHashSet.add(null); // Accepting null
        System.out.println("linkedHashSet = " + linkedHashSet);

        /*
            TreeSet Class
                - Implements the SortedSet Interface
                - Maintains the sorted (Ascending) order
                - Does not accept null values
                - "import java.util.TreeSet;"
         */
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90)); // In SORTED (ASCENDING) order will be added.
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90)); // Duplicated elements are not allowed and when print just will see same elements
        // treeSet.add(null); // NOT Accepting null
        System.out.println("treeSet = " + treeSet);

        System.out.println("----------o----------o----------");

        // All above types does not have INDEX numbers, you can not iterate with regular for loop
        // for that using foreach loop

//        for (int i = 0; i < treeSet.size(); i++) {
//            System.out.println("treeSet = " + treeSet.get(i));
//        }

        int counter = 1;
        for (Integer each : linkedHashSet) {
            System.out.println(counter + " : " + each);
            counter++;
        }
    }
}
