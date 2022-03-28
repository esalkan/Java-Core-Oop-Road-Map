package exercises.interview_exercises.number_tasks;

public class Number_Fibonacci {

    public static int fibonacci(int num) {

        int result = 0;
        int j = 0;
        int z = 1;

        for (int i = 1; i < num; i++) {
            result = j + z;
            j = z;
            z = result;
        }

        return result;
    }


}
