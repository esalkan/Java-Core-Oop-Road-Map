package exercises.shorts;

import java.util.*;

public class _51_map_interface {

    public static void main(String[] args) {
        /*
            MAP DATA STRUCTURES
                - Collection of pairs
                - Data structure based on key and value
                - Does NOT HAVE IS-A relation with Collection
                - Size can be increased or decreased
                - Key CAN NOT be NULL
                - import java.util.Map;

           MAP METHODS
            put()           : inserts the key & value as a pair to the map
            size()          : returns the size (total number of pairs) of the map
            get(key)        : returns the value of the given key from the map
            replace(key, value) : replaces the value of the given key
            remove(key)     : removes the given key, and it's value from the map
            containsKey(key): checks if the given key is contained in the map, returns boolean
            containsValue() : checks if the given value is contained in the map, returns boolean
            isEmpty()       : checks if the map is empty, returns boolean
            equals(MapObject) : checks if the map is equal to the given map in the argument, returns boolean
            clear()         : removes all the keys & values from the map. Size will be set to 0
         ITERATION
            keySet()        : returns all the keys of map (Set)
            values()        : returns all the values of map (Set)
            entrySet()      :
        */
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> hashTable = new Hashtable<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        /*
            HashMap Interface
                - Implements the Map interface
                - Maintains the RANDOM order
                - Accepts NULL as KEY
                - Duplicates NOT ACCEPTABLE
                - import java.util.HashMap;
         */

        System.out.println("----------o----------o----------o----------o----------o----------");

        System.out.println("Map<Integer, String> hashMap = new HashMap<>();");

        // Maintains the RANDOM ORDER
        hashMap.put(10, "Ali");
        hashMap.put(20, "Veli");
        hashMap.put(3, "Feyyaz");
        hashMap.put(40, "Hami");
        hashMap.put(40, "Hami"); // Duplicates NOT ALLOWED
        hashMap.put(40, "Hami"); // Duplicates NOT ALLOWED
        hashMap.put(null,"Alkan"); // Null Acceptable for key
        // hashMap.put(null, null);

        // printing will be IN RANDOM ORDER
        System.out.println("hashMap = " + hashMap); // Duplicates will not in it
        System.out.println("hashMap.size() = " + hashMap.size()); // size is 4 but we try put 6

        System.out.println("----------o----------o----------o----------o----------o----------");
        /*
            LinkedHashMap Class
                - Child class of HashMap
                - Maintains the INSERTION ORDER
                - ACCEPT NULL as KEY
                - import java.util.LinkedHashMap,
         */

        System.out.println("Map<Integer, String> linkedHashMap = new LinkedHashMap<>();");

        // Maintains the INSERTION ORDER
        linkedHashMap.put(10, "Ali");
        linkedHashMap.put(20, "Veli");
        linkedHashMap.put(3, "Feyyaz");
        linkedHashMap.put(40, "Hami");
        linkedHashMap.put(40, "Hami"); // Duplicates NOT ALLOWED
        linkedHashMap.put(40, "Hami"); // Duplicates NOT ALLOWED
        linkedHashMap.put(null,"Alkan"); // Null Acceptable for key

        // printing will be IN INSERTION ORDER
        System.out.println("linkedHashMap = " + linkedHashMap); // Duplicates will not in it
        System.out.println("linkedHashMap.size() = " + linkedHashMap.size()); // size is 5

        System.out.println("----------o----------o----------o----------o----------o----------");

        /*
            Hashtable Class
                - Implements the Map Interface
                - Maintains the RANDOM order
                - Does NOT ACCEPT NULL as a KEY
                - Synchronized (Thread-Safe)
                - import java.util.Hashtable;
         */

        System.out.println("Map<Integer, String> hashTable = new Hashtable<>();");

        // Maintains the RANDOM ORDER
        hashTable.put(10, "Ali");
        hashTable.put(20, "Veli");
        hashTable.put(3, "Feyyaz");
        hashTable.put(40, "Hami");
        hashTable.put(40, "Hami"); // Duplicates NOT ALLOWED
        hashTable.put(40, "Hami"); // Duplicates NOT ALLOWED
        // hashTable.put(null,"Alkan"); // Null Acceptable for key

        // printing will be IN RANDOM ORDER
        System.out.println("hashTable = " + hashTable); // Duplicates will not in it
        System.out.println("hashTable.size() = " + hashTable.size()); // size is 5

        System.out.println("----------o----------o----------o----------o----------o----------");


        /*
            TreeMap Class
                - Implements the SortedMap Interface
                - Maintains the SORTED (ASCENDING) order
                - Does NOT ACCEPT NULL as KEY
                - import java.util.TreeMap;
         */

        System.out.println("Map<Integer, String> treeMap = new TreeMap<>();");

        // Maintains the SORTED (ASCENDING) ORDER
        treeMap.put(10, "Ali");
        treeMap.put(20, "Veli");
        treeMap.put(3, "Feyyaz");
        treeMap.put(40, "Hami");
        treeMap.put(40, "Hami"); // Duplicates NOT ALLOWED
        treeMap.put(40, "Hami"); // Duplicates NOT ALLOWED
        // hashTable.put(null,"Alkan"); // Null Acceptable for key

        // printing will be IN SORTED (ASCENDING) ORDER
        System.out.println("treeMap = " + treeMap); // Duplicates will not in it
        System.out.println("treeMap.size() = " + treeMap.size()); // size is 5

        System.out.println("----------o----------o----------o----------o----------o----------");

        System.out.println("\t\t\tMAP METHODS");

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // put()           : inserts the key & value as a pair to the map
        map.put(10,"Metin");
        map.put(20,"Ali");
        map.put(3,"Feyyaz");
        map.put(40,"Hami");
        map.put(61,"Hagi");
        
        System.out.println("map key & values = " + map);

        // size()          : returns the size (total number of pairs) of the map
        System.out.println("map.size() = " + map.size());
        
        // get(key)        : returns the value of the given key from the map
        System.out.println("map.get(10) = " + map.get(10));
        
        // replace(key, value) : replaces the value of the given key
        System.out.println("map.replace(10,\"Archil\") = " + map.replace(10,"Archil"));
        System.out.println("map.get(10) = " + map.get(10));

        // remove(key)     : removes the given key and it's value from the map
        map.remove(61);
        System.out.println("map.remove(61) = " + map);

        // containsKey(key): checks if the given key is contained in the map, returns boolean
        System.out.println("map.containsKey(61) = " + map.containsKey(61));

        // containsKey(value): checks if the given value is contained in the map, returns boolean
        System.out.println("map.containsValue('Hami') = " + map.containsValue("Hami"));

        // isEmpty()       : checks if the map is empty, returns boolean
        System.out.println("map.isEmpty() = " + map.isEmpty());
        
        // equals(MapObject) : checks if the map is equal to the given map in the argument, returns boolean
        System.out.println("equals(MapObject) -- map.equals(hashMap) = " + map.equals(hashMap));
        System.out.println(map == hashMap);

        // clear() : removes all the keys & values from the map. Size will be set to 0
        map.clear();
        System.out.println("map.clear(); = " + map);
        System.out.println("map.size() = " + map.size());
        System.out.println("map.isEmpty() = " + map.isEmpty());

        System.out.println("----------o----------o----------o----------o----------o----------");

        System.out.println("\t\t\tITERATING METHODS");

        LinkedHashMap<Integer, String> team = new LinkedHashMap<>();
        team.put(10,"Metin");
        team.put(20,"Ali");
        team.put(3,"Feyyaz");
        team.put(40,"Hami");
        team.put(61,"Hagi");

        // Iterating by keys : keySet();
        // returns all the keys of map (Set)

        System.out.println("team.keySet()");
        for (Integer teamNum : team.keySet()) {
            System.out.println("\tkeySet() = " + teamNum);
        }

        System.out.println("\nteam.values()");
        for (String teamName : team.values()){
            System.out.println("\tvalues() = " + teamName);
        }

        System.out.println("\nteam.entrySet()");
        for (Map.Entry<Integer, String> entries : team.entrySet()) {
            System.out.println("\tteam.entrySet(Map.Entry<Integer, String>) = " + entries);
        }

    }
}
