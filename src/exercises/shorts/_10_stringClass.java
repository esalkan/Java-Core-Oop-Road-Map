package exercises.shorts;

public class _10_stringClass {
    /**
     * STRING CLASS
     * - Sequence of characters
     * -- Karakter dizileridir.
     *
     * - String is immutable, once the object is created it can not be modified.
     * -- String değişmez/sabittir. bir defa oluşturulduğu değiştirilemez.
     *
     * There are 2 way to create String object
     *  1. By String Literal
     *      String str = "Java Master";
     *
     *      - Created in special meemory, called STRING POOL
     *      -- STRING POOL adındaki özel bellekte oluşturulur.
     *
     *      - An allocation of memory in Java Heap memory
     *      -- Java'da bellek tahsisini, Heap yapar.
     *
     *  2. By new Keyword.
     *      String str = new String("Java Master");
     *
     *      - Creates new DIFFERENT object in the HEAP memory
     *      -- Heap memory içinde yeni değişik nesneler oluşturur.
     */

    public static void main(String[] args) {
        // 1. By String Literal
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "Java";

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);

        System.out.println("----------o----------o----------o----------");

        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = new String("Java");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println("----------o----------o----------o----------");

        String name = "Java Master"; // Immutable
        name.toUpperCase(); // JAVA MASTER

        System.out.println("name = " + name);

        name = name.toUpperCase();

        System.out.println("After The; name = name.toUpperCase() " + name);


    }
}
