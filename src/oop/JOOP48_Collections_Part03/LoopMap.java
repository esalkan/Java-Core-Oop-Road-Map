package oop.JOOP48_Collections_Part03;
import java.util.*;
import oop.JOOP46_Collections_Part01.Product;
/**
 * @author esalkan
 * @project java-notes
 * @github https://github.com/esalkan/java-notes
 */
public class LoopMap {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("url", "qa.sdetroadmap.com");
        dataMap.put("username", "qaUser");
        dataMap.put("password", "qaUserPassword");
        dataMap.put("browser", "chrome");
        dataMap.put("editor","eyup");
        dataMap.put("admin", "alkan");

        System.out.println("dataMap = " + dataMap);

        // keySet() -> returns set with all the keys in the map.
        // values() -> returns with all the values in the map
        System.out.println("+-----o-----keySet()-----o-----+");
        for (String key : dataMap.keySet()) {
            System.out.println("key = " + key);
        }

        System.out.println("+-----o-----values()-----o-----+");
        for (String value : dataMap.values()) {
            System.out.println("value = " + value);
        }

        System.out.println("+-----o-----Keys & Values -----o-----+");
        System.out.println("dataMap = " + dataMap);
        for (String key : dataMap.keySet()) {
            System.out.println("Key : " + key + " | Value : " + dataMap.get(key));
        }

        System.out.println("+-----o-----Keys & Values -> lambda Expression -----o-----+");
        dataMap.forEach((k,v) -> System.out.println("Key : " + k + ", Value :" + v));

        System.out.println("+-----o-----o -----o-----+");

        // Different ways.
        Map<Integer, Product> map1 = new HashMap<>();
        Map<String, String[]> map2 = new HashMap<>();
        Map<Integer, List<String>> map3 = new HashMap<>();
        Map<Integer, List<String[]>> map4 = new HashMap<>();
        Map<String, Map<Integer,Integer>> map5 = new HashMap<>();
        Map<String, Map<Integer, Product>> map6 = new HashMap<>();




    }
}
