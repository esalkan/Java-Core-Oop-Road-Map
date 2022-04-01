package exercises.shorts;

import java.util.Arrays;

public class _12_arrays {
    /**
     *  ARRAYS
     *
     *  Array is one of the 3 Data Structures in java they are ARRAY, COLLECTION, MAP. We are use for managing and
     *  storing data's for organizing
     *
     *  - Array is special type of Variable
     *  -- Array özel tip bir değişkendir
     *
     *  - Holds multiple values of same data type
     *  -- Aynı data tipinden çoklu veri tutabilir.
     *
     *  - Size is fixed
     *  -- Boyutu sabittir.
     *
     *  - Supports both primitive and non-primitive
     *  -- Primitive ve non-primitive data tiplerini destekler.
     *
     *  - Every element has index numbers.
     *  -- Her eleman bir index numarasına sahiptir.
     *
     *  DECLARING ARRAYS
     *      Syntax ;
     *              int[] nums     or   int nums[]
     *
     *  INSTANCING ARRAYS
     *      Syntax:
     *              int[] scores = new int[4];
     *              or
     *              int[] scores;
     *              scores = new int[5];
     *
     * ACCESSING ARRAY ELEMENTS:
     *      Syntax:
     *              nums[0]; it will return first element of array
     *              nums[1]; it will return second element of array
     *              nums[n]; it will return N'th element of array
     */

    public static void main(String[] args) {
        // 1. Create a variable named numbers that can have 5 integers

        int[] numbers = new int[5]; // [0,0,0,0,0]

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println(Arrays.toString(numbers));

        System.out.println("----------o----------o----------");

        // 2. Create a variable named colors that has: "Yellow", "Red", "White", "Blue", "Green", "Black"
        String[] colors = {"Yellow", "Red", "White", "Blue", "Green", "Black"};

        System.out.println(colors); // That will give us stack memory address of the array variable
        System.out.println("colors.length = " + colors.length);

        System.out.println("Arrays.toString(colors) = " + Arrays.toString(colors)); // printing the array need to use Arrays.toString()
        System.out.println("colors[1] = " + colors[1]); // printing the array need to use Arrays.toString()

        System.out.println("----------o----------o----------");

        /**
         * ARRAY UTILS
         *
         * ARRAYS CLASS :   presented in "java.util" package
         *
         * Methods :
         *      toString();
         *      sort();
         *      equals();
         *      copyOf();
         *      copyOfRange();
         */


        // toString()
        // converts array object to String
        // returns ---> String
        String names[] = {"John","Smith","Shay","Brenna","Josh"};
        System.out.println(Arrays.toString(names));

        System.out.println("----------o----------o----------");

        // sort();
        // sorts the array in ascending order
        int nums[] = {5,3,4,1,2,0};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("----------o----------o----------");

        // equal():
        // compares two array objects if they have same elements in same order

        char[] arr1 = {'a','b','c'};
        char[] arr2 = {'a','b','c'};
        System.out.println(arr1 == arr2);
        System.out.println("Arrays.equals(arr1,arr2)" + Arrays.equals(arr1,arr2));

        char[] arr3 = {'c','b','a'};
        char[] arr4 = {'b','a','c'};
        System.out.println("Arrays.equals(arr3,arr4)" + Arrays.equals(arr3,arr4));
        Arrays.sort(arr3);
        Arrays.sort(arr4);
        System.out.println("Arrays.equals(arr3,arr4)" + Arrays.equals(arr3,arr4));

        System.out.println("----------o----------o----------");

        // copyOf(array, newLength);
        // copies the specified array elements and sets new length
        // returns new array

        int[] scores = {45, 55, 65, 75, 85};
        int[] scores2 = Arrays.copyOf(scores, 3);
        System.out.println("Arrays.toString(scores) = " + Arrays.toString(scores));
        System.out.println("Arrays.toString(scores2) = " + Arrays.toString(scores2));

        System.out.println("----------o----------o----------");

        // copyOfRange(array, beginIndex, endIndex)
        // copies the specified range of the array,
        // returns new array

        char[] elements = {'A','B','C','D','E','F'};
        // indexes      =   0   1   2   3   4   5

        char[] someElements = Arrays.copyOfRange(elements, 1, 4+1); // Last given index always excluded.
        System.out.println("Arrays.copyOfRange(elements, 1, 4+1) = " + Arrays.toString(someElements));

        System.out.println("----------o----------o----------");




    }
}
