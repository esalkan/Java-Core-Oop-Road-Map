package exercises.tasks.string_tasks;

public class String_RemoveExtraSpaces {

    /*
    Remove All Extra Space from String
        Input: "  Hello world      I      love      Java    "
        Output: Hello world I love Java

     */

    public static String removeExtraSpace(String sentence) {

        String[] words = sentence.trim().split(" ");
        String result = "";

        for (String each : words) {
            if (!each.isEmpty()) {
                result += each + " ";
            }
        }

        return result.trim();

    }


}
