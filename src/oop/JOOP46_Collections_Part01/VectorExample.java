package oop.JOOP46_Collections_Part01;

import java.util.List;
import java.util.Vector;

/**
 * @author esalkan
 * @project java-notes
 */
public class VectorExample {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Vector
         * • Vector implements a dynamic array. It is similar to ArrayList, but with two differences :
         *      • Vector is synchronized(thread-safe)
         *      • Vector contains many legacy methods that are not part of the collection framework.
         */
        List<String> v = new Vector<>();
        v.add("Water");
        v.add("Tea");
        v.add("Green Tea");

        for (String each : v) {
            System.out.println("each = " + each);
        }

        System.out.println("v.size() = " + v.size());
        System.out.println("v.get(2) = " + v.get(2));

        /**
         * Synchronize
         * - Code Synchronization helps in preventing multiple threads executing a code simultaneously.
         * - Code Synchronization is implemented with help of Locks.
         * - A thread that is trying to access the code that is marked as Synchronized should acquire the lock from object.
         * - Locks:
         *   • Every object has a lock. Only one lock per object.
         * - Synchronize can only be applied for methods and block of code.
         */
    }
}
