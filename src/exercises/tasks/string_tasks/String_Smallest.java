package exercises.tasks.string_tasks;

public class String_Smallest {
    /*
    Remove one letter from a word so that resulting string will be as small as possible (alphabetically).

    Write a function solution that, given a string S consisting of N characters,
    returns the alphabetically smallest string that can be obtained by removing exactly one letter from S.

    Examples:
        1. Given S = "acb", by removing one letter, you can obtain "ac", "ab" or "cb".
                Your function should return "ab" (after removing 'c') since it is alphabetically smaller than "ac" and "bc".
        2. Given S = "hot", your function should return "ho", which is alphabetically smaller than "ht" and "ot".
        3. Given S = "codility", your function should return "cdility", which can be obtained by removing the second letter.
        4. Given S = "aaaa", your function should return "aaa". Any occurrence of 'a' can be removed.
     */


    public static String smallestString(String s) {
        int l = s.length();
        String result = "";
        for (int i = 0; i < l-1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                for (int j = 0; j < l; j++) {
                    if (i != j) {
                        result += s.charAt(j);
                    }
                }
                return result;
            }
        }
        result = s.substring(0, l - 1);
        return result;
    }

}
