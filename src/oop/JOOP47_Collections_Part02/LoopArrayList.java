package oop.JOOP47_Collections_Part02;

import java.util.*;
import java.util.List;

/**
 * @author esalkan
 * @project java-notes
 */
public class LoopArrayList {
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

        // Looping using foreach loop
        System.out.println("Looping using foreach loop");
        for (Integer num : nums) {
            System.out.print(num + " | ");
        }

        System.out.println("\n");

        // Looping using for iterator loop
        System.out.println("Looping using for iterator loop");
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " | ");
        }

        System.out.println("\n");

        // Looping using forEach method. Lambda expression.
        System.out.println("Looping using forEach method. Lambda expression.");
        nums.forEach(n -> System.out.print(n + " | "));

        System.out.println("\n");

        // removing less than 500
        System.out.println("Looping using forEach method. Lambda expression.");
        System.out.println("removing less than 500");
        nums.removeIf(n -> n < 500);
        nums.forEach(n -> System.out.print(n + " | "));
        // forEach working just for COLLECTIONS not for other structures.

        System.out.println("\n");

        // sort an arrayList
        System.out.println("Before Sort an arraylist");
        System.out.println("nums.toString() = " + nums.toString());

        System.out.println("After Sort an arraylist");
        Collections.sort(nums);
        System.out.println("nums = " + nums);

    }
}
