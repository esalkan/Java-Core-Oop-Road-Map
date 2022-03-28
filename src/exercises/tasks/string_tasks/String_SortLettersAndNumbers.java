package exercises.tasks.string_tasks;

import java.util.Arrays;

public class String_SortLettersAndNumbers {

    /*
    Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
    sort the individual string and append them back together

        Ex:
            Input: "DC501GCCCA098911"
            Output: "CD015ACCCG011899"

     */

    public static String sortLettersAndNumbers(String str) {

        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            temp += "" + str.charAt(i);
            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    temp += ",";
                }
            }

            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isAlphabetic(str.charAt(i + 1))) {
                    temp += ",";
                }
            }
        }


        String[] arr = temp.split(",");
        str = "";

        for (String each : arr) {
            char[] chars = each.toCharArray();
            Arrays.sort(chars);
            for (char eachChar : chars) {
                str += "" + eachChar;
            }
        }

        return str;
    }


}
