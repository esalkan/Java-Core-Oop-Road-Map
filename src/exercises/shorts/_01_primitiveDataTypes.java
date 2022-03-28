package exercises.shorts;

public class _01_primitiveDataTypes {

    public static void main(String[] args) {

        /**
         *
         * There are 2 type data types.
         * 1. PRIMITIVE     : As shown below
         * 2. NON-PRIMITIVE : String, Array, Classes, Interfaces, etc...
         *
         *
         *
         * There are 8 PRIMITIVE DATA TYPES
         * And these 8 data types divided to 4
         * 1. INTEGER               : short, byte, int, long
         * 2. Float-Point Numbers   : double, float
         * 3. Characters            : char
         * 4. Boolean               : boolean
         */

        // Integer: age, year, salary, miles
        byte age = 40;              // Range : -127, +127. 128 will be compile error.
        short year = 1990;          // Range : -32.768, +32.767
        int salary = 100000;        // Range : -2,147,483,648 to 2,147,483,647
        long miles = 9999999999l;   // l or L

        // Decimal: tax, pi
        double tax = 0.26;          // preferred
        float pi = 3.14f;           // f or F

        // Symbols : @, #, *
        char ch1 = '@';              // '' just single quo can be used with char
        char ch2 = '#';
        char ch3 = '*';

        // boolean dataType
        boolean result1 = true;     // boolean accepts true or false
        boolean result2 = false;    // boolean accepts true or false
        boolean result3 = 5 > 2;    // That will return boolean.

        System.out.println("age = " + age);
        System.out.println("year = " + year);
        System.out.println("salary = " + salary);
        System.out.println("miles = " + miles);
        System.out.println("tax = " + tax);
        System.out.println("pi = " + pi);
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
        System.out.println("ch3 = " + ch3);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

    }
}
