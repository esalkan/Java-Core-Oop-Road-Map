package exercises.shorts;

import java.util.ArrayList;
import java.util.Arrays;

public class _20_arrayList {

    /**
     * ARRAY LIST
     * - ArrayList come from List Interface
     * - ArrayList implements from List Class
     * - Allow us store the OBJECTS
     * - Size is automatically adjusted
     * - Does not support Primitives
     * - Data Type Can not be primitive.
     *
     * import java.utils.ArrayList;
     *
     * Syntax :
     *      ArrayList <Data Type> name = new ArrayList<>();
     *
     *
     * ArrayList Methods;
     *
     *  - add(element)
     *  - size();
     *  - get(index);
     *  - set(index, newElement)
     *  - remove(int index)
     *  - remove(Object)
     *  - clear()
     *  - indexOf()
     *  - lastIndexOf()
     *  -
     */

    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> teamList = new ArrayList<>();

        // add(element);
        // add the element into the array list, size will be increased by 1
        teamList.add("Metin Oktay");
        teamList.add("Aykut");
        teamList.add("Şifo Mehmet");
        teamList.add("Hami");
        teamList.add("Prekazi");
        teamList.add("Hagi");
        teamList.add("Ünal");

        System.out.println("teamList = " + teamList);

        // size();
        // returns the total number of elements of the array list
        // return type ---> integer
        int teamListSize = teamList.size();
        System.out.println("teamListSize = " + teamListSize);

        // get();
        // returns the element at the given index from the array list
        String get2thElement = teamList.get(2);
        System.out.println("get2thElement = " + get2thElement);

        // set(index, newElement)
        // replace the element of the array list at given index to new element
        String setTheElement = "Feyyaz";
        teamList.set(teamList.size()-1,setTheElement);
        System.out.println("teamList = " + teamList);

        // remove(int index)
        // remove the element at the given index and remove and decrease array list size -1
        teamList.remove(4);
        System.out.println("teamList = " + teamList);

        // remove(Object)
        // remove the element at the given object name and decrease array list size -1
        teamList.remove("Feyyaz");
        System.out.println("teamList = " + teamList);

        // teamList.removeAll(teamList);
        // System.out.println("teamList = " + teamList);

        // clear()
        // clear all the objects from the array list
        teamList.clear();
        System.out.println("teamList = " + teamList);


        ArrayList<Integer> teamNums = new ArrayList<>();
        teamNums.add(54);
        teamNums.add(41);
        teamNums.add(61);
        teamNums.add(61);
        teamNums.add(01);
        teamNums.add(81);
        teamNums.add(42);

        System.out.println("teamNums = " + teamNums);

        // indexOf(element);
        // returns the index number of the first matching element
        // return type ---> int
        teamNums.indexOf(41);
        System.out.println("teamNums.indexOf(41) = " + teamNums.indexOf(41));

        // lastIndexOf(element);
        // returns the index number of the last matching element
        System.out.println("teamNums.indexOf(61) = " + teamNums.indexOf(61));
        System.out.println("teamNums.lastIndexOf(61) = " + teamNums.lastIndexOf(61));

        // contains(element)
        // checks if the array list contains given element
        // return type --> boolean
        System.out.println("teamNums.contains(61) = " + teamNums.contains(61));

        // equals(list);
        // checks if the array list is equal to given list
        // return type ---> boolean
        boolean equalsResult = teamNums.equals(teamList);
        System.out.println("equalsResult = " + equalsResult);

        // isEmpty();
        // checks if the array list is empty (size is 0)
        // return type --> boolean
        boolean teamNumsEmpty = teamNums.isEmpty();
        System.out.println("teamNumsEmpty = " + teamNumsEmpty);

        // BULK OPERATIONS WITH ARRAY LIST

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);

        // containsAll();
        // checks if the array list contains all the given Collection of values
        // return type ---> boolean
        // to convert given values to collection type we are using Arrays
        System.out.println("nums.containsAll(Arrays.asList(10,20,30)) = " + nums.containsAll(Arrays.asList(10, 20, 30)));

        // addAll(CollectionType);
        // Adds all the given collection of values to the ArrayList

        nums.addAll(Arrays.asList(70,80,90));
        System.out.println("nums.addAll(Arrays.asList(70,80,90)) = " + nums);

        // removeAll(CollectionType)
        // removes all the given collection of the values in the ArrayList
        nums.removeAll(Arrays.asList(10,20));
        System.out.println("nums.removeAll(Arrays.asList(10,20)) = " + nums);

        // retrainAll(CollectionType)
        // opposite of the remove all method
        // removes all the un-matched values from the ArrayList
        // Keeping all the matched values in the ArrayList
        nums.retainAll(Arrays.asList(70, 80, 90));
        System.out.println("nums.retainAll(Arrays.asList(70, 80, 90)) = " + nums);



        // ITERATING ARRAY LIST
        // for loop
        // variable.fori

        System.out.println("Normal iteration");
        for (int i = 0; i < nums.size(); i++) {
            System.out.println("nums.get(i) = " + nums.get(i));
        }
        // reverse iteration
        System.out.println("Reverse iteration");
        for (int i = nums.size() - 1; i >= 0; i--) {
            System.out.println("nums.get(i) = " + nums.get(i));
        }

        System.out.println("Using foreach loop");
        for (Integer num : nums) {
            System.out.println("num = " + num);
        }


        teamList.add("Metin Oktay");
        teamList.add("Aykut");
        teamList.add("Şifo Mehmet");
        teamList.add("Hami");
        teamList.add("Prekazi");
        teamList.add("Hagi");
        teamList.add("Ünal");

        // removeIf(Predicate)
        // Lambda expression
        // removes all the elements from the ArrayList that are matching with the given predicate condition
        System.out.println("teamList before removeIf() = " + teamList);
        teamList.removeIf( name -> name.startsWith("H"));

        System.out.println("teamList after removeIf(name -> name.startsWith('H')) = " + teamList);

        // Or with condition

        System.out.println("teamNums BEFORE teamNums.removeIf( each -> each < 61); = " + teamNums);
        teamNums.removeIf( each -> each < 61);
        System.out.println("teamNums AFTER teamNums.removeIf( each -> each < 61); = " + teamNums);


    }
}
