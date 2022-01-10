package oop.JOOP47_Collections_Part02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author esalkan
 * @project java-notes
 */
public class SetTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /**
         * SET
         * • Set is child interface of Collection.
         *      - Set, Collection'ın alt arayüzüdür.
         * • If we want to represent a group of individual objects as a single entity where duplicates are NOT allowed,
         * and insertion order NOT preserved then we should go for Set.
         *      - Bir grup tekil nesneyi, kopyalara izin verilmeyen ve ekleme sırasının korunmadığı tek bir varlık olarak
         *        temsil etmek istiyorsak, o zaman Set'e gitmeliyiz.
         */


        /**
         * HashSet
         * • HashSet class is used to create a collection that uses a hash table for storage.
         *      - HashSet sınıfı, depolama için bir karma tablo kullanan bir koleksiyon oluşturmak için kullanılır.
         * • HashSet contains unique elements only.
         *      - HashSet yalnızca benzersiz öğeler içerir.
         * • HashSet class is not synchronized.
         *      - HashSet sınıfı senkronize değildir.
         * • HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
         *      - HashSet, ekleme sırasını korumaz. Burada öğeler, hashcode'larına göre eklenir.
         */

        // Creating a HashSet<>() Object. Via Polymorphic way.
        // Here Set is an interface of HashSet, LinkedHashSet
        Set<Integer> mySet = new HashSet<>();
        mySet.add(54);
        mySet.add(34);
        mySet.add(61);
        mySet.add(571);
        mySet.add(571);
        mySet.add(571);

        // If you go and check printed values. you will see ordering list is different than add order.
        // and duplicated values are shown just one. not all. this is the SET specifications.
        System.out.println("mySet.toString() = " + mySet.toString());
        mySet.size();

        System.out.println("+---------------o---------------o---------------+");

        // Creating a list.
        List<String> list = Arrays.asList("23","23","a","a","bb","jj","q","t","t");
        System.out.println("list.toString() = " + list.toString());

        // I taking that "list" and passing it to Set. Like that way just having unique elements store in unique SET inside.
        Set<String> unique = new HashSet<>(list);
        // Then print and see...
        System.out.println("unique.toString() = " + unique.toString());



    }
}
