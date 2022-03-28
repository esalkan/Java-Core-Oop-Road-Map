package exercises.interview_exercises.number_tasks;

public class Number_FactorialNumber {

    /*
    Write a return method that returns the factorial number of any given number

        Ex:
                Input: 5
                outPut: 120

                because 5 * 4 * 3 * 2 * 1 = 120
     */


    public static int factorialNumber(int n) {

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;

    }



}
