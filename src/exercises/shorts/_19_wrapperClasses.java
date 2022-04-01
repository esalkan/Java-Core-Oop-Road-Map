package exercises.shorts;

public class _19_wrapperClasses {
    /**
     * WRAPPER CLASSES
     * - Dedicated classes of eight primitives
     * - Presented in "java.lang" package
     * - Used to "wrap" the primitive data type into an object of that class
     * - Provide the mechanism to convert primitive into object and object to into primitive
     *
     *      PRIMITIVES                   WRAPPER CLASSES
     *        byte     --- auto boxing -->  Byte
     *                 <--- un boxing ----
     *        short    --- auto boxing -->  Short
     *                 <--- un boxing ----
     *        int      --- auto boxing -->  Int
     *                 <--- un boxing ----
     *        long     --- auto boxing -->  Long
     *                 <--- un boxing ----
     *        double   --- auto boxing -->  Double
     *                 <--- un boxing ----
     *        float    --- auto boxing -->  Float
     *                 <--- un boxing ----
     *        char     --- auto boxing -->  Char
     *                 <--- un boxing ----
     *        boolean  --- auto boxing -->  Boolean
     *
     *      Auto boxing : Converts PRIMITIVE to into WRAPPER class OBJECT
     *      Un-boxing   : Converts WRAPPER Class OBJECT into PRIMITIVE
     *
     *
     *      when we use auto-boxing at this time we can use wrapper class object methods.
     *      point is usage of special methods.
     *
     */

    public static void main(String[] args) {
        // primitives
        byte a = 10;
        short b = 20;
        int c = 30;
        // Auto-boxing now
        Byte x = a;
        Short y = b;
        Integer z = c;
        //un-boxing now
        byte q = x;
        short w = y;
        int s = z;

        // Parse methods
        // Using converting STRING to NUMBER
        // return type --> primitive
        String str = "1234";
        int num = Integer.parseInt(str);
        System.out.println("num = " + num);


        // valueOf()
        // converting strings to the wrapper class object
        // return type --> wrapper class object.
        String str1 = "1.54";
        Double dB = Double.valueOf(str1);








    }
}
