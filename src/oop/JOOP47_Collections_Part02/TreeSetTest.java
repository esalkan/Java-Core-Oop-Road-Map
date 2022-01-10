package oop.JOOP47_Collections_Part02;

import java.util.TreeSet;

/**
 * @author esalkan
 * @project java-notes
 */
public class TreeSetTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /**
         * TreeSet
         * • TreeSet implements the SortedSet interface so duplicate values are not allowed.
         *      - TreeSet, SortedSet arabirimini uygular(kullanır/gerçekleştirir), böylece yinelenen değerlere izin verilmez.
         *
         * • Objects in a TreeSet are stored in a sorted and ascending order.
         *      - Bir TreeSet'teki nesneler, sıralı ve artan bir düzende depolanır.
         *
         * • TreeSet does not preserve the insertion order of elements but elements are sorted by keys.
         *      - TreeSet, öğelerin ekleme sırasını korumaz, ancak öğeler anahtarlara göre sıralanır.
         *
         * • TreeSet serves as an excellent choice for storing large amounts of sorted information which are supposed
         * to be accessed quickly because of its faster access and retrieval time.
         *      - TreeSet, daha hızlı erişim ve geri alma süresi nedeniyle hızlı bir şekilde erişilmesi gereken
         *      büyük miktarda sıralanmış bilgiyi depolamak için mükemmel bir seçimdir.
         */

        // Duplicates are not alowed.
        // Sort the list with ASC order.
        TreeSet<Integer> tSet = new TreeSet<>();
        tSet.add(500);
        tSet.add(500);
        tSet.add(100);
        tSet.add(54);
        tSet.add(571);
        tSet.add(8000);
        tSet.add(5);

        // Check the output and see there is not any Duplicates and sorted ASC order.
        System.out.println("tSet.toString() = " + tSet.toString());
    }
}
