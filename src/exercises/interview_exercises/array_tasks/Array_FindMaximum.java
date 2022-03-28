package exercises.interview_exercises.array_tasks;

public class Array_FindMaximum {
    /*
        Write a function that can find the maximum number from an int Array
     */


    public static int maxValue(int[] n) {

        int max = Integer.MIN_VALUE;

        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }


}
