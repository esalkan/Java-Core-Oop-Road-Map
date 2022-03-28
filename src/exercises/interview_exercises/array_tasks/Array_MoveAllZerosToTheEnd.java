package exercises.interview_exercises.array_tasks;

public class Array_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of an array
     */

    public static int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }

        return result;

    }


}
