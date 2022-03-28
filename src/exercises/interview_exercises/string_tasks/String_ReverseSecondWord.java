package exercises.interview_exercises.string_tasks;

public class String_ReverseSecondWord {

    /*
    Reverse the second word ONLY
        Ex:
            Input: I Love Java
            OutPut: I evoL Java
     */


    public static String reverseSecondWord(String sentence) {
        String[] words = sentence.split(" ");
        String reversed = "";

        for (int i = words[1].length() - 1; i >= 0; i--){
            reversed += words[1].charAt(i);
        }

        words[1] = reversed;
        String result = "";

        for (String each : words) {
            result += each + " ";
        }

        return result.trim();
    }

}
