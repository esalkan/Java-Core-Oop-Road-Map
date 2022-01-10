package oop.JOOP47_Collections_Part02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author esalkan
 * @project java-notes
 */
public class LoopWithIterator {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Creating basic Collection
        List<Integer> nums = new ArrayList<>();
        nums.add(54);
        nums.add(950);
        nums.add(34);
        nums.add(61);
        nums.add(1000);
        nums.add(541);
        nums.add(571);
        nums.add(81);
        nums.add(1453);
        nums.add(1000);
        nums.add(1881);

        // Create Iterator Object
        Iterator<Integer> it = nums.iterator(); // Why you did this one? : Because there is right now some methods
        // available. Which is helping you! To do LOOP. without using index num.

        // Call hasNext() method. This method working as like. if there is any element existing checking next to element.
        // hasNext() return true, if there is till next element (value)
        //           return false, when it reaches end or empty.
        System.out.println("it.hasNext() = " + it.hasNext());
        System.out.println("it.next() = " + it.next());
        System.out.println("it.next() = " + it.next());
        System.out.println("it.next() = " + it.next());

        /*
        // Looping with while loop
        System.out.println("Looping with while loop");
        boolean checkPoint = it.hasNext();
        while (checkPoint == true){
            System.out.println("it.next() = " + it.next());
            if (it.hasNext() != true){
                checkPoint = false;
            }
        }
        */
        while (it.hasNext()) {
            System.out.println("it.next() = " + it.next());
        }

        //System.out.println("it.next(): " + it.next());  //??

        Iterator<Integer> it2 = nums.iterator();

        //What is the difference between for each loop and iterator?
        //we can remove objects while looping

        while (it2.hasNext()) {
            int val = it2.next();
            if (val > 1000) {
                it2.remove();
            }
        }

        System.out.print(nums.toString() + "|");

        List<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Boston");
        cities.add("Viriginia");
        cities.add("DC");

        for (String city : cities) {
            if (city.equals("Boston")) {
                cities.remove(city);
            }
        }


    }
}
