package exercises.interview_exercises.number_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Number_LovelyNumber {

   /*
           We consider a number to be lovely if it contains fewer than
        three instances of any distinct digit (in decimal representation).
                Examples of lovely numbers: 0, 100, 1232 and 9922;
                Examples of numbers that are not lovely: 1000 (contains three copies of digit '0'), 33533 (contains
                 four copies of digit '3').

        Write a function solution that, given integers A and B, returns
        the number of lovely integers in the range (A..B] (both ends
        included).

        Examples:
        1. Given A = 0, B = 0, your function should return 1, because o is
        lovely.
        2. Given A = 1, B = 111, your function should return 110, because
        the only integer in the range [1..111] that is not lovely is 111.
        3. Given A = 100000, B = 100000, your function should return 0,
        because 100000 is not lovely.
        Assume that:
            • A and B are integers within the range [0..100,000);
            • ASB.
        In your solution, focus on correctness. The performance of your
        solution will not be the focus of the assessment.

    */


    public static int countLovelyNumbers(int a, int b){
        int count = 0;
        for (int i = a; i <= b; i++) {
            List<String> list = new ArrayList<>(Arrays.asList((i+"").split("")));
            boolean result = false;

            for (String each : list) {
                if(Collections.frequency(list, each) < 3)
                    result = true;
            }
            if(result) {
                count++;
            }
        }

        return count;
    }


}
