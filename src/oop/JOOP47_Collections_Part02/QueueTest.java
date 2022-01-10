package oop.JOOP47_Collections_Part02;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author esalkan
 * @project java-notes
 */
public class QueueTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /**         QUEUE
         * It is child interface of Collection.
         *      - Collection'ın alt arayüzüdür.
         * • If we want to represent a group of individual objects prior to processing then we should go for Queue.
         *      - İşlemeden önce bir grup bireysel nesneyi temsil etmek istiyorsak, QUEUE(Kuyruk)'a gitmeliyiz.
         * • A Queue is a First In First Out (FIFO) data structure.
         *      - Queue(Kuyruk) ta her zaman, İlk Giren İlk Çıkar (FIFO) veri yapısındadır.
         */

        // Polymorphic way creating a Queue
        Queue<String> queue = new LinkedList<String>();
        // add() elements inside the queue which is coming from collections interface.
        queue.add("Alkan");
        queue.add("Ipek");
        queue.add("Azra");
        queue.add("Esma");

        // Printing the elements
        System.out.println("queue.toArray() = " + queue.toString());

        String name = queue.remove(); // remove() : Retrieves and removes the head of this queue. (FIFO)
                                      // This method differs from poll() only in that it throws an exception
                                      // if this queue is empty.
        System.out.println("name = " + name);

        // Last Status of the queue. Alkan was first element and remove() removed it. because it was first in.
        // Rule is first in first out.
        System.out.println("queue.toArray() = " + queue.toString());

        // Doing same thing with remove(). There is just minor difference with remove().
        name = queue.poll(); // Retrieves and removes the head of this queue(FIFO), or returns null if this queue is empty.
        System.out.println("queue.toArray() = " + queue.toString());

        // Getting the element at the front of the queue without removing it using peek()
        name = queue.peek();
        System.out.println("name = queue.peek(); = " + name);
        System.out.println("queue.toString() = " + queue.toString());


    }
}
