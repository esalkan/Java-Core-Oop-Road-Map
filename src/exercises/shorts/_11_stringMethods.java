package exercises.shorts;

public class _11_stringMethods {
    /**
     * STRING METHODS
     *  - Index Numbers
     *      - Every character in string has an index number
     *          -- Stringlerde her karakter bir index numarasına sahiptir.
     *
     *      - Index numbers starts from ZERO
     *          -- Index numaraları SIFIR'dan başlar
     *
     * MOST USED STRING METHODS
     *         str.charAt();
     *         str.length();
     *         str.toLowerCase();
     *         str.toUpperCase();
     *         str.trim();
     *         str.indexOf();
     *         str.lastIndexOf();
     *         str.replace();
     *         str.replaceFirst();
     *         str.replaceAll();
     *         str.substring();
     *         str.isEmpty();
     *         str.isBlank();
     *         str.equals();
     *         str.equalsIgnoreCase();
     *         str.contains();
     *         str.startsWith();
     *         str.endsWith();
     *
     */

    public static void main(String[] args) {

        // charAt(int index);
        // returns the char at given index, r
        // eturn type ---> char
        String str = "Java";
        // indexes :  1234

        System.out.println("str.charAt(0) = " + str.charAt(0));
        System.out.println("str.charAt(2) = " + str.charAt(2));

        System.out.println("----------o----------o----------o----------o----------o----------");

        // length();
        // returns the total number of characters.
        // return type ---> int
        String str2 = "Java Master Class";

        System.out.println("str2 = " + str2);
        System.out.println("str2.length() = " + str2.length());

        // Find last index of the string.
        int lastIndex = str2.length()-1;
        System.out.println("lastIndex = " + lastIndex);
        
        System.out.println("----------o----------o----------o----------o----------o----------");

        // toLowerCase();
        // returns the all UPPERCASE letters to lower case version of the String
        // return type ---> String
        String str3 = "JaVa"; // Immutable
        str3 = str3.toLowerCase(); // thats why i assign it to variable

        System.out.println("str3 = " + str3); // now i can see the result of the toLowerCase()

        System.out.println("----------o----------o----------o----------o----------o----------");

        // toUpperCase();
        // returns the all lovercase letters to uppercase version of the String
        // return type ---> String
        String str4 = "JaVa"; // Immutable
        str4 = str4.toUpperCase(); // thats why i assign it to variable

        System.out.println("str4 = " + str4); // now i can see the result of the toUpperCase()

        System.out.println("----------o----------o----------o----------o----------o----------");

        // trim();
        // returns the String without all the white spaces (un-used spaces). from start and ends
        // return type ---> String

        String str5 = "     Java     Master Class   ";
        str5 = str5.trim(); // "Java     Master Class"
        System.out.println("str5 = " + str5);

        System.out.println("----------o----------o----------o----------o----------o----------");

        // indexOf();
        // returns the first matching character' index number
        // return type ---> int
        String str6 = "Java Master Class";
        int indexNumOfFirstA = str6.indexOf("a"); // first matched character in 1 index
        System.out.println("indexNumOfFirstA = " + indexNumOfFirstA);

        int indexNumOfSecondA = str6.indexOf("a "); // second matched character in 3 index, just give next string
        System.out.println("indexNumOfSecondA = " + indexNumOfSecondA);


        System.out.println("----------o----------o----------o----------o----------o----------");

        // lastIndexOf();
        // returns the last matching character' index number
        // return type --> int
        String str7 = "Java Master Class";
        int lastIndexOfA = str7.lastIndexOf("a");
        System.out.println("lastIndexOfA = " + lastIndexOfA);

        System.out.println("----------o----------o----------o----------o----------o----------");

        // replace(oldValue, newValue);
        // replaces all the matching character(s) of the string with the given new character(s)
        // return type ---> String

        String str8 = "Java Master Class";
        str8 = str8.replace("a","A"); // str8 immutable and assign it to the variable
        System.out.println("str8 = " + str8);

        String sentence1 = "I love Java, Java is the best programming language.";
        System.out.println("sentence1 Before Replace with python = " + sentence1);
        sentence1 = sentence1.replace("Java", "Python");
        System.out.println("sentence1 After Replace with python = " + sentence1);

        System.out.println("----------o----------o----------o----------o----------o----------");
        // ReplaceFirst(oldValue, newValue);
        // replaces the first matching character(s) of the string with the given new characters.
        // return type ---> String

        String str9 = "Java Master Class";
        str9 = str9.replaceFirst("a", "AA"); // that will change with first matched "a"
        System.out.println("str9 = " + str9);

        System.out.println("----------o----------o----------o----------o----------o----------");
        // subString(beginIndex);
        // creates substring starting from the given beginning index to the end of the String.
        // return type ---> String
        String str10 = "Java Master Class";
        String result = str10.substring(str10.indexOf("M"));
        System.out.println("result = " + result);

        System.out.println("----------o----------o----------o----------o----------o----------");
        // subString(beginingIndex, endingIndex);
        // creates substring starting from the given beginning index to the given ending index.
        // return type --> String
        // Note : Ending index always excluding. always add +1 if want last given character index too.

        String str11 = "Java Master Class";
        String result1 = str11.substring(str10.indexOf("M"), str11.lastIndexOf(" "));
        System.out.println("result1 = " + result1);

        System.out.println("----------o----------o----------o----------o----------o----------");

        // repeat(N);
        // repeats the string N number of times.
        // return type ---> String
        String str12 = "Java";
        str12 = str12.repeat(4);
        System.out.println("str12 = " + str12);

        System.out.println("----------o----------o----------o----------o----------o----------");
        // isEmpty();
        // checks if the string' length is zero
        // return type --> boolean
        String str13 = "   ";
        System.out.println("str13.isEmpty = " + str13.isEmpty());
        System.out.println("str12.isEmpty() = " + str12.isEmpty());
        

        System.out.println("----------o----------o----------o----------o----------o----------");

        // isBlank();
        // checks if the string is blank
        // return type ---> boolean
        String str14 = "   ";
        boolean result2 = str14.isBlank();
        System.out.println("str14.isBlank() = " + result2);

        System.out.println("----------o----------o----------o----------o----------o----------");

        // equals(String);
        // compate the content of the TWO Strings.
        // return type ---> boolean

        // They have same text but they are different objects.
        String str15 = "Java";
        String str16 = new String("Java");
        String str17 = "java";

        System.out.println("str15 == str16 = " + str15 == str16);

        System.out.println("str15.equals(str16) = " + str15.equals(str16));
        System.out.println("str15.equals(str17) = " + str15.equals(str17)); // case sensetive

        System.out.println("----------o----------o----------o----------o----------o----------");

        // equalsIgnoreCase(String);
        // compares the content of the two Strings irrespective of the case sensitivity.
        // return type ---> boolean

        String word1 = "JAVA";
        String word2 = "java";

        boolean result3 = word1.equalsIgnoreCase(word2);
        System.out.println("word1.equalsIgnoreCase(word2) = " + result3);

        System.out.println("----------o----------o----------o----------o----------o----------");

        // contains(String);
        // checks if the given string is contained in the String.
        // return type ---> boolean

        String sentence ="I love Java but at the same time Python too";
        boolean hasPython = sentence.contains("Python"); // Case sensitive
        System.out.println("sentence.contains(\"Python\") = " + hasPython);

        System.out.println("----------o----------o----------o----------o----------o----------");

        // startsWith();
        // checks if the string started with the given character(s)
        // return type ---> boolean

        String str18 = "Java Master Class";
        boolean result4 = str18.startsWith("Jav");

        System.out.println("str18.startsWith(\"Jav\") = " + result4);

        System.out.println("----------o----------o----------o----------o----------o----------");

        // endsWith();
        // check if the string ends with the given character(s)
        // return type ---> boolean

        String str19 = "Java Master Class";
        boolean result5 = str19.endsWith("lass");

        System.out.println("str19.endsWith(\"lass\") = " + result5);
        System.out.println("str19.endsWith(\" Class\") = " + str19.endsWith(" Class"));
        System.out.println("str19.endsWith(\"s\") = " + str19.endsWith("s"));


        System.out.println("----------o----------o----------o----------o----------o----------");

        System.out.println("----------o----------o----------o----------o----------o----------");

        System.out.println("----------o----------o----------o----------o----------o----------");



    }
}
