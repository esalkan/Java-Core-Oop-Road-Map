package exercises.interview_exercises.string_tasks;

import java.util.InputMismatchException;

public class String_ConvertStringToInteger {

    /*
    write a program that can convert a string to integer. DO NOT use parse or valueOf methods
     */

    public static int convertToInteger(String str) {
        int result = 0;
        int factorTo10 = 1;
        try {
            for (int i = str.length() - 1; str.startsWith("-") ? i > 0 : i >= 0; i--) {
                char each = str.charAt(i);
                result += (each - '0') * factorTo10;
                factorTo10 *= 10;
            }
        } catch (InputMismatchException e) {
            return 0;
        }

        return result;

    }



}
