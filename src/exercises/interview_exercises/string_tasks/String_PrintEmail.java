package exercises.interview_exercises.string_tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_PrintEmail {
    /*
    String sentence = "I love Java name@gmail.com, I don't like python";
    print me only the email not using substring.
     */

    public static void main(String[] args) {

        String sentence = "I love Java name@gmail.com, I don't like python";

        //Solution 1:

        Matcher match = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(sentence);
        String result1 = match.find() ? match.group() : null;

        System.out.println(result1);

        System.out.println("-------------------------------");
        //Solution 2:

        String result2 = sentence.replaceAll(".*\\b(\\w\\S*@\\S*\\w)\\b.*", "$1");

        System.out.println(result2);



    }


}
