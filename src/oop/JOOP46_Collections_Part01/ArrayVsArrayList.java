package oop.JOOP46_Collections_Part01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author esalkan
 * @project java-notes
 */
public class ArrayVsArrayList {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Array vs ArrayList

        int[] numsArray = {57134, 54, 61, 541}; // int array just keep inside integers
        String[] days = new String[7]; // String array, just keep inside Strings
        days[0] = "Monday"; // Add to 0 index a string

        Object[] obj = {"Apple", 54, "Orange", false, "Mt-09", 34.61};  // Object array, keep inside it different type
                                                                        // of objects


        // ArrayList<WrapperClass> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();   // Represents Collection, Object way ArrayList Creation
        List<Integer> list2 = new ArrayList<>();        // Represents Collection, polymorphic way ArrayList Creation
        Collection<Integer> list3 = new ArrayList<>();  // Represents Collection, polymorphic way ArrayList Creation

        list1.add(54);
        list1.add(34);
        list1.add(61);


        System.out.println("numsArray[0] = " + numsArray[0]);

        System.out.println("list1.get(0) = " + list1.get(0));


    }
}
