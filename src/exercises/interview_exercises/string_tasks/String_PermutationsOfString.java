package exercises.interview_exercises.string_tasks;

import java.util.ArrayList;
import java.util.List;

public class String_PermutationsOfString {

    public static void main(String[] args) {
        String str = "ABC";
        List<String> partial = new ArrayList<>();
        partial.add(String.valueOf(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            for (int j = partial.size() - 1; j >= 0; j--) {
                String s = partial.remove(j);
                for (int k = 0; k <= s.length(); k++) {
                    partial.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
                }
            }
        }

        System.out.println(partial);

    }


}
