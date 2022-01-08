package oop.JOOP46_Collections_Part01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author esalkan
 * @project java-notes
 */
public class SortingArrayList {
    /**
     * @param args
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // polymorphic way creating an ArrayList
        list.add("Java");
        list.add("Python");
        list.add("Css");
        list.add("Ruby");
        list.add("Cotlin");
        list.add("C++");

        System.out.println("Before Sorting");
        System.out.println(list.toString());

        System.out.println("After Sorting");
        Collections.sort(list); // first char upperCase and lowerCase sensitive
        System.out.println(list.toString());

        List<Product> prodList = new ArrayList<>();
        prodList.add(new Product("Phone", 1099));
        prodList.add(new Product("coffee", 3.55));
        prodList.add(new Product("Glass", 125));
        prodList.add(new Product("bag", 54));

        System.out.println("Before Sorting");
        System.out.println("prodList.toString() = " + prodList.toString());

        // To use Collections.sort() we need to create in our product class implements Comparable<Product> and
        // @override the compareTo() method and write custom conditions for our program purpose.
        System.out.println("After Sorting");
        Collections.sort(prodList);
        System.out.println("prodList.toString() = " + prodList.toString());


        Product p1 = new Product("spoon", 25.34);
        Product p2 = new Product("chair", 7.99);
        System.out.println("p1.compareTo(p2) = " + p1.compareTo(p2));
        System.out.println("p2.compareTo(p1)" + p2.compareTo(p1));
    }
}
