package oop.JOOP48_Collections_Part03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author esalkan
 * @project java-notes
 * @github https://github.com/esalkan/java-notes
 */
public class ListOfMaps {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Map<String, String>> emplooyes = new ArrayList<>();

        // Creating object
        Map<String, String> emp1Data = new HashMap<>();
        emp1Data.put("EmpID", "1");
        emp1Data.put("EmpName", "Eyüp");
        emp1Data.put("EmpJobTitle", "QA");
        emp1Data.put("Salary", "15000");

        // Creating object
        Map<String, String> emp2Data = new HashMap<>();
        emp2Data.put("EmpID", "2");
        emp2Data.put("EmpName", "Sabri");
        emp2Data.put("EmpJobTitle", "Tester");
        emp2Data.put("Salary", "15000");

        // Creating object
        Map<String, String> emp3Data = new HashMap<>();
        emp3Data.put("EmpID", "3");
        emp3Data.put("EmpName", "ALKAN");
        emp3Data.put("EmpJobTitle", "SDET");
        emp3Data.put("Salary", "20000");

        // Add the created object to List
        emplooyes.add(emp1Data);
        emplooyes.add(emp2Data);
        emplooyes.add(emp3Data);

        System.out.println();

        // print out the list.
        System.out.println(emplooyes.toString());

        System.out.println();

        // print out the list size()
        System.out.println("emplooyes.size() = " + emplooyes.size());

        System.out.println();

        // print out the list first element.
        System.out.println("emplooyes.get(0) = " + emplooyes.get(0));
        System.out.println("emplooyes.get(0).entrySet() = " + emplooyes.get(0).entrySet());
        emplooyes.forEach(x -> System.out.println(x));

        System.out.println();

        // retrieve employee name.
        // System.out.println("emplooyes.get(2) = " + emplooyes.get(2)); // {Salary=20000, EmpJobTitle=SDET, EmpID=3, EmpName=ALKAN}
        System.out.println("emplooyes.get(2).get(\"EmpName\") : " + emplooyes.get(2).get("EmpName"));

        System.out.println();

        // print out each employee job title with for each loop
        for (Map<String, String> emplooye : emplooyes) {
            System.out.println("emplooye.get(\"EmpJobTitle\") : -> " + emplooye.get("EmpJobTitle"));
        }

        System.out.println();

        // Looping with lambda expression.
        emplooyes.forEach((k) -> System.out.println(k.get("EmpJobTitle")) );

        System.out.println();

        // print out total salary for each employee
        int totalSalary = 0;
        for(Map<String, String> emp : emplooyes){
            totalSalary += Integer.parseInt(emp.get("Salary"));
        }
        System.out.println("totalSalary = " + totalSalary);
    }
}
