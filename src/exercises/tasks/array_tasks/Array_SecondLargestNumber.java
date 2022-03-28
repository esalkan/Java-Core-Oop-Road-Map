package exercises.tasks.array_tasks;

import java.util.Arrays;

public class Array_SecondLargestNumber {



    //solution1
    public static int secondLargestNumber(int[] arr){
        return Arrays.stream(arr).filter( p -> p != Arrays.stream(arr).max().getAsInt()).max().getAsInt();
    }

    //solution2
    public static int secondLargestNumber2(int[] arr){
        int max1 = arr[0];
        int max2 = arr[0];
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return max2;

    }

    //solution3:


}
