package oop.JOOP48_Collections_Part03;

import oop.JOOP46_Collections_Part01.Product;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author esalkan
 * @project java-notes
 */
public class HashSetOfProducts {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Set<Product> prodSet = new TreeSet<>();

        // Add product to prodSet via Product Class
        prodSet.add(new Product("book", 25.99));
        prodSet.add(new Product("book", 19.99));
        prodSet.add(new Product("magazine", 7.99));
        prodSet.add(new Product("phone", 100));

        System.out.println(prodSet.toString());

        //print each product by using for each loop
        for (Product product : prodSet) {
            System.out.println(product.getPrice());
        }

        //print each product by using forEach method
        prodSet.forEach(x -> System.out.println(x.getName()));
        // prodSet.forEach(product -> System.out.println(product));
    }
}
