package exercises.interview_exercises.string_tasks;

public class String_CountOfRepeatedChars {
    /*
        Write a method that compresses a string based on the count of repeated characters. aabcccddaaaa -->  a2b1c3d2a4
     */


    public static String solution(String str){
        String result = "";
        int count = 0;
        char temp = str.charAt(0);

        for (char c : str.toCharArray()) {
            if(temp == c) {
                count++;
            } else {
                result +=  ""+temp + count;
                temp = c;
                count = 1;
            }
        }
        result += ""+temp + count;

        return result;
    }


}
