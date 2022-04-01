package exercises.shorts;

import java.util.Arrays;

public class _14_multiDimensionalArray {
    /**
     * MULTI DIMENSIONAL ARRAY
     *
     * - This type array know, Array of Array
     * - A special variable that's used as a container of arrays.
     * - Dimensions of the array can be 2,3,4.....N dimension
     * - N dimensional array is container for N-1 dimensional array
     *
     *
     * DECLARING                             | Number of elements size.
     *          int[][] array2D = new int[3][];
     *          |  |                      |
     *          |  | n-dimension          | Number of dimensional arraySize
     *          |
     *          | Data type
     *
     *                              0 1   0 1 2   0 1 2 3
     *          int[][] array2D = {{1,2},{3,4,5},{6,7,8,9}}
     *                               0      1        2
     *
     *  2D means 1D arrays
     *  3D means 2D arrays
     *  .
     *  .
     *  N means N-1D arrays
     *
     *  ACCESSING THE ARRAY AND ELEMENTS
     *
     *      array2D[0]      ==> {1,2}
     *      array2D[2][1]   ==> {7}
     */

    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = { 40, 50 };
        int[] arr3 = { 60, 70, 80, 90 };

        /*
        int[][] array2D = new int[3][];

        array2D[0] = arr1;
        array2D[1] = arr2;
        array2D[2] = arr3;
        */

        // Creating and declaring 2D multi dimensional array. it have one dimensional arrays.
        int[][] arr2D = { {10,20,30}, {40,50}, {60,70,80,90} };

        // printing mmulti-dimensional arraywith Arrays.deepToString(arr) Method
        System.out.println("Arrays.deepToString(arr2D) = " + Arrays.deepToString(arr2D));

        // {40,50}
        System.out.println("Arrays.toString(arr2D[1]) = " + Arrays.toString(arr2D[1]));

        // {40,50} --> take 50 from that array
        System.out.println("arr2D[1][1] = " + arr2D[1][1]);

        System.out.println("----------o----------o----------o----------");

        String[][] groups2D = { {"Muhammed", "Ebubekir", "Ömer", "Ali" }, {"Gazali", "Rabbani", "Sani"}, {"Mevlana", "Şems"} };

        System.out.println("groups2D.length = " + groups2D.length);
        System.out.println("group2D[0].length = " + groups2D[0].length);
        System.out.println("group2D[1].length = " + groups2D[1].length);
        System.out.println("group2D[2].length = " + groups2D[2].length);

        // printing a group of array
        System.out.println("Arrays.toString(groups2D[1]) = " + Arrays.toString(groups2D[1]));

        // Printing just one element in an array
        System.out.println("groups2D[2][0] = " + groups2D[2][0]);

        // Printing entire of the arrays and elements in a multi-dimensional array.
        System.out.println("Arrays.deepToString(groups2D) = " + Arrays.deepToString(groups2D));

        System.out.println("----------o----------o----------o----------");

        for (String[] strings : groups2D) {
            System.out.println("Arrays.toString(strings) = " + Arrays.toString(strings));
            for (String string : strings) {
                System.out.println("string = " + string);
            }
        }

        System.out.println("----------o----------o----------o----------");

        /**
         * Sometimes you may need to find the minimum or maximum value in a Java array. Java does not have any built-in functions for finding minimum and maximum value, so I will show you how to code that yourself.
         */
        int[] ints = {0,2,4,6,8,10};

        int minVal = Integer.MAX_VALUE;

        for(int i=0; i < ints.length; i++){
            if(ints[i] < minVal){
                minVal = ints[i];
            }
        }

        System.out.println("minVal = " + minVal);


        int[] ints1 = {0,2,4,6,8,10};

        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i < ints1.length; i++){
            if(ints1[i] > maxVal){
                maxVal = ints1[i];
            }
        }
        System.out.println("maxVal = " + maxVal);


    }
}
