package exercises.tasks.collection_map_tasks;

import java.util.Iterator;
import java.util.List;

public class List_RemovePalindromeStrings {

   /*
        remove palindrome strings from a List of String
    */

    //solution 1:
    public static List<String> removePalindromes1(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String word = it.next();
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            if (word.equalsIgnoreCase(reversed)) {
                it.remove();
            }
        }
        return list;
    }



    //solution 2:
    public List<String> removePalindromes2(List<String> list) {
        list.removeIf(p -> isPalindrome(p));
        return list;
    }

    public static boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed.equalsIgnoreCase(str);
    }



}
