package oop.JOOP48_Collections_Part03;

import java.util.*;

/**
 * @author esalkan
 * @project java-notes
 * @github https://github.com/esalkan/java-notes
 */
public class MapExample {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<String, Double> items = new HashMap<>();
        // Apple, Flower, Water are keys and they are unique
        // 3.49, 10.99, 0.25 are value and they can be updatable.
        items.put("Apple", 3.49);
        items.put("Flower", 10.99);
        items.put("Water", 0.25);
        items.put("Milk", 1.99);
        items.put("Banana",null);


        // print out the items.size()
        System.out.println("items.size() = " + items.size());
        // print out the items list.
        System.out.println("items = " + items);
        // print out the items list.
        System.out.println("items.toString() = " + items.toString());

        // Get the item key's value.
        System.out.println("items.get(\"Apple\") = " + items.get("Apple"));

        System.out.println("items.entrySet() = " + items.entrySet());

        // checking items list is empty or not. that code will return false
        System.out.println("items.isEmpty() = " + items.isEmpty());



        // That below code will update Apple price from 3.49 to 5.49
        items.put("Apple", 5.49);
        // print out the items.size()
        System.out.println("items.size() = " + items.size());
        // print out the items list.
        System.out.println("items (items.put(\"Apple\", 5.49);) = " + items);

        // remove the item.
        items.remove("Flower");
        System.out.println("items (items.remove(\"Flower\");) = " + items);


        // item is in list
        System.out.println("\"is Banana in there?\" = " + items.containsKey("Banana"));
        System.out.println("\"is Flower in there?\" = " + items.containsKey("Flower"));

        // replacing
        items.replace("Water", 0.25,1.25);
        // items.replace("Water", 1.25);
        System.out.println("items.get(\"Water\") = " + items.get("Water"));


        // increase banana price to 2$
        items.replace("Banana", (double) 2);
        System.out.println("items.get(\"Banana\") new price is = " + items.get("Banana"));


        // Clear the items
        items.clear();
        System.out.println("items = " + items);

        // checking items list is empty or not. that code will return true.
        System.out.println("items.isEmpty() = " + items.isEmpty());
    }
}
