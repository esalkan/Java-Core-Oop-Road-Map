package exercises.interview_exercises.string_tasks;

import java.util.Arrays;

public class String_CountPossibleDistinctStrings {
    /*
    Count of substrings having all distinct characters
    Given a string str consisting of lowercase alphabets, the task is to find the number of possible substrings (not necessarily distinct) that consists of distinct characters only.
        Examples:
            Input: Str = “gffg”
            Output: 6
    Explanation:
        All possible substrings from the given string are,
        ( “g“, “gf“, “gff”, “gffg”, “f“, “ff”, “ffg”, “f“, “fg“, “g” )
        Among them, the highlighted ones ( “g“, “gf“, “f“, “f“, “fg“, “g” ) consists of distinct characters only.

            Input: str = “gfg”
            Output: 5
    Explanation:
        All possible substrings from the given string are,
        ( “g“, “gf“, “gfg”, “f“, “fg“, “g” )
        Among them, the highlighted ( “g“, “gf“, “f“, “fg“, “g” ) consists of distinct characters only.
     */

    public static void main(String[] args) {

        String str = "gffg";

        // solution 1
        int count1 = 0;
        for (int j = 0; j < str.length(); j++) {
            for (int i = j; i < str.length(); i++) {
                String temp = str.substring(j, i + 1);
                boolean isDistinct = true;
                char[] ch = temp.toCharArray();
                Arrays.sort(ch);
                for (int k = 0; k < ch.length - 1; k++) {
                    if (ch[k] == ch[k + 1])
                        isDistinct = false;
                }

                if (isDistinct)
                    count1++;
            }
        }

        System.out.println(count1);


        System.out.println("-----------------------------------------------");
        //solution 2
        int count2 = 0;
        for (int j = 0; j < str.length(); j++) {
            for (int i = j; i < str.length(); i++) {
                String temp = str.substring(j, i + 1);
                long s = Arrays.stream(temp.split("")).distinct().count(); // new size excluding duplicates
                if (s == temp.length()) { // if the substring consists distinct characters
                    count2++;
                }
            }
        }

        System.out.println(count2);


    }


}
