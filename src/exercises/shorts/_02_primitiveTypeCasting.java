package exercises.shorts;

public class _02_primitiveTypeCasting {
    /**
     * Allows us to assign one primitive type value to another primitive type
     * There are two type of primitive type castings:
     *      1. Implicit Casting (Örtülü)
     *      2. Explicit Casting (Açık, Aleni)
     * Cast operator is needed to manually convert a value.
     * Example:
     *      int number;
     *      double doubleValue = 32.33;
     *      number = (int) doubleValue;
     *      (int) (etc...) this is casting variable
     *
     *      1. Implicit Casting
     *          - Casting from smaller primitive types to larger primitive types
     *          - Implicitly done by compiler
     *      Example:
     *          byte a = 25;                short x = 1000;
     *          int b = a;                  long y = (long) x;
     *
     *
     *      2. Explicit Casting
     *          - Casting larger primitive types to smaller primitive types
     *          - Must be done explicitly
     *
     *     Example:
     *          int a = 100;                long x = 2000;
     *          byte b = (byte) a;          short y = (short) x;
     */


    public static void main(String[] args) {
        // Implicit Casting (Örtülü Tür Dönüşümü)
        int a = 100;
        double b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // Explicit Casting (Açık / Aleni Tür Dönüşümü)
        double x = 20.5;
        int y = (int) x;
    }



}
