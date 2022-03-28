package exercises.interview_exercises.string_tasks;

public class String_Reverse {

    /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String StrReverse(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--) {
            reverse += str.toCharArray()[i];
        }
        return reverse;

    }


}
