package exercises.interview_exercises.number_tasks;

public class Number_ConsecutiveNumbers {


    /*
    Write a function:
    that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
    However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
    If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
    For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all
    three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

        For example, here is the output for N = 24:
                                    1
                                    Codility
                                    Test
                                    Codility
                                    Coders
                                    CodilityTest
                                    7
                                    Codility
                                    Test
                                    Codi1ityCoders
                                    11
                                    CodilityTest
                                    13
                                    Codility
                                    TestCoders
                                    Codility
                                    17
                                    ....
     */

    public static void consecutiveNums(int N) {

        String result = "";

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                result += "CodilityTestCoders\n";
            } else if (i % 2 == 0 && i % 3 == 0) {
                result += "CodilityTest\n";
            } else if (i % 2 == 0 && i % 5 == 0) {
                result += "CodilityCoders\n";
            } else if (i % 3 == 0 && i % 5 == 0) {
                result += "TestCoders\n";
            } else if (i % 2 == 0) {
                result += "Codility\n";
            } else if (i % 5 == 0) {
                result += "Coders\n";
            } else if (i % 3 == 0) {
                result += "Test\n";
            } else {
                result += i + "\n";
            }
        }

        System.out.println(result);
    }


}
