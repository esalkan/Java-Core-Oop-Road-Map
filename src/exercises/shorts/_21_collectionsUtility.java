package exercises.shorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _21_collectionsUtility {
    /**
     * COLLECTIONS UTILITY CLASS
     *
     *  Collections : Utility class of the Collection presented in "java.utility" package
     *
     *  Methods :
     *      sort(list) : sort the list in ASCENDING ORDER
     *      max(list) : returns the max number
     *      min(list) : returns the min number
     *      reverse(list) : sort reverse order
     *      swap(list, index1, index2) : swap to elements with given indexes in the list
     *      frequency(list, element) : returns the frequency(sıklık/adet) of the element from the list
     */

    public static void main(String[] args) {

        // ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(100, 200, 50, 150, 10, 20, 30, 40, 50, 60, 70));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,50,150,10,20,30,40,50,60,70));

        // sort(list);
        System.out.println("numbers Before Sort= " + numbers);
        Collections.sort(numbers);
        System.out.println("numbers After Sort= " + numbers);

        // max(list)
        System.out.println("Collections.max(numbers) = " + Collections.max(numbers));

        // min(list);
        System.out.println("Collections.min(numbers) = " + Collections.min(numbers));

        // reverse(list);
        Collections.reverse(numbers);
        System.out.println("Collections.reverse(numbers); = " + numbers);

        // swap(list, index1, index2)
        Collections.swap(numbers,0,1);
        System.out.println("Collections.swap(numbers,0,1) = " + numbers);

        // frequency(list, element9
        // return type --> always integer
        System.out.println("Collections.frequency(numbers, 50) = " + Collections.frequency(numbers, 50));
        


    }
}
