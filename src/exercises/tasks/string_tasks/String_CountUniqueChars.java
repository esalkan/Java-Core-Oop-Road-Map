package exercises.tasks.string_tasks;

import java.util.Arrays;
import java.util.Collections;

public class String_CountUniqueChars {
    /*
        Write a Java program to count unique Characters in string.
        Given a string as input, write Java code to count and print the number of unique characters in String.
        If there are no unique characters in the string, the method returns -1
     */

    public static void main(String[] args) {
        System.out.println(countUniqueChars2("aaaabbbbbccccc"));
    }

    //solution 1
    public static int countUniqueChars(String str) {
        int count = 0;

        for (int j = 0; j < str.length(); j++) {
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                count++;
            }
        }

        if (count == 0) {
            return -1;
        }
        return count;
    }


    //solution 2
    public static int countUniqueChars2(String str){
        int count = 0;
        for (String each : str.split("")) {
            int f = Collections.frequency(Arrays.asList(str.split("")) , each);
            if(f==1) {
                count++;
            }
        }
        return (count==0)? -1 : count;
    }


}
