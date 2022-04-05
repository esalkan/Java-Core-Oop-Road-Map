package exercises.shorts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class _50_iterable_Interface {
    /*
            ITERABLE INTERFACE
                - Top interface of the collections

            - Parent interface of Collection interface
            - Allows the object to be iterated by using iterator
            - Iterator is used when we want to remove elements whilst we iterate over a collection.

            HOW TO USE ITERATOR?
                - We can obtain the iterator by using the iterator() method of an iterable.
                - Iterator provides the ready methods that can be used while traversing the collections.
                    --> hasNext()
                    --> next()
                    --> remove()
     */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));

        // Assume that we want to remove the numbers of < 4 in the list. in for loop
        /*
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4){
                list.remove(i);
            }
        }

        System.out.println("list = " + list);
        // Output : list = [2, 4, 5, 6, 6, 5, 4, 2, 1, 3, 4]
        // Why output so?
        // When remove an element in ArrayList, that list automatically change the index numbers of the elements
        // if you look at the first index of 0 it is 1, when u check output first element is looks 2
        // This is the reason. which list type is elastic and change the index numbers. depend on the
        // situation need to choose a loop ;) got it ?
        */

        // Assume that we want to remove the numbers of < 4 in the list. in for loop

        Iterator<Integer> iteratorList = list.iterator(); // assign the list to Iterator
        while (iteratorList.hasNext()){
            Integer getElement = iteratorList.next();
            if (getElement < 4){
                iteratorList.remove();
            }
        }
        System.out.println("list = " + list);

        System.out.println("----------o----------o----------o----------o----------o----------");

        System.out.println("Short way for iterator usage removeIf() ");

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));

        list2.removeIf( element -> element < 4);
        System.out.println("list2 = " + list2);

    }
}
