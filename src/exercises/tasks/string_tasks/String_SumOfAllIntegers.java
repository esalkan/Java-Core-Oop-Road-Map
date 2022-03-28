package exercises.tasks.string_tasks;

public class String_SumOfAllIntegers {

    /*
    return the sum of all integers found in the parameter String
     */


    public static int getSumOfNumbers(String s) {
        /*
            Please implement this method to
            return the sum of all integers found in the parameter String.
            You can assume that integers are separated from other parts with one or more spaces (' ' symbol).

            For example, s="12 some text 3 7", result: 22 (12+3+7=22)
        */

        int sum = 0;

        String[] numbers = s.replaceAll("[\\D]+"," ").split(" ");

        for(String each : numbers){
                sum+=Integer.parseInt(each);
        }

        return sum;
    }



}
