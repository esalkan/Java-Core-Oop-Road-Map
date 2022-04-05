package exercises.shorts;

public class _45_String_vs_StringBuilder_vs_StringBuffer {
    /*
        String vs StringBuilder vs StringBuffer

        String
            - String is IMMUTABLE, once the object created, it CAN NOT be modified.
            - There are two ways to create String Object
                1. By String literal
                    String str = "Java";
                2. By new KeyWord
                    String str = new String("Java");

        StringBuilder
            - StringBuilder is MUTABLE, once the object created, it CAN be modified.
            - StringBuilder is NOT SYNCHRONIZED, therefore it's NOT thread-safe
            - One way to create StringBuilder
                1. By new Keyword
                    StringBuilder str = new StringBuilder("Java")

        StringBuffer
            - StringBuffer is MUTABLE, once the object created, it CAN be modified
            - StringBuffer is SYNCHRONIZED, therefore it's thread-safe
            - One way to create StringBuffer
                1. StringBuffer new Keyword
                    StringBuffer str = new StringBuffer("Java");
     */

    public static void main(String[] args) {

        // ----------o---------- String ----------o----------
        System.out.println("----------o----------     String    ----------o----------");

        String str = "Java"; // Immutable
        str.concat(" is BEST"); // "Java is BEST"
        System.out.println(str); // "Java"

        // For change the string object there is just one way, Creating a new object
        str = str.concat(" is BEST!"); // "Java is BEST"
        System.out.println(str); // "Java is BEST"

        // ----------o---------- StringBuilder ----------o----------
        System.out.println("----------o---------- StringBuilder ----------o----------");
        // Slower than StringBuffer
        StringBuilder strBuilder = new StringBuilder("Java");
        strBuilder.append(" is BEST!!");  // "Java is BEST"
        System.out.println(strBuilder); // "Java is BEST"

        // ----------o---------- StringBuffer ----------o----------
        System.out.println("----------o----------  StringBuffer ----------o----------");

        StringBuffer stringBuffer = new StringBuffer("Java");
        stringBuffer.append(" is BEST!!!");
        System.out.println(stringBuffer);
    }
}
