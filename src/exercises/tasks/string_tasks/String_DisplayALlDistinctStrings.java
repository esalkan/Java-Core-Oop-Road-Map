package exercises.tasks.string_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_DisplayALlDistinctStrings {
    /*
   Display the Distinct Substring in a String
    Given a string, display all distinct substrings of the given string.

    Examples:
        Input : abcd
        Output : abcd abc ab a bcd bc b cd c d

        Input : aaa
        Output : aaa aa a aa a a


     */

    public static void main(String[] args) {
        String str = "abcd";
        List<String> list = new ArrayList<>();

        for (int j = 0; j < str.length(); j++) {
            for (int i = str.length()-1; i>=j; i--) {
                list.add(str.substring(j, i+1 ));
            }
        }

        System.out.println(list);

        
    }



}
