package exercises.shorts;

public class _03_ternary {

    public static void main(String[] args) {
        /**
         * Ternary :
         *          ? means if
         *          : means else
         *
         *          (Condition) ?   = if block
         *          : (Condition) ? = else if block
         *          :               = else block
         */

        int a = 100;
        int b = 200;
        int max;

        if (a > b){
            max = a;
            System.out.println("max = " + a);
        } else {
            max = b;
            System.out.println("max = " + b);
        }

        // Ternary style write

        max = (a > b) ? a : b; // When we write our condition done need it to assign a variable
        // or
        System.out.println((a > b) ? a : b); // Directly we can print it.

        System.out.println("max = " + max);


        System.out.println("-----o-----o-----o-----o-----");

        int score = 70;
        char grade;

        if (score > 98){
            grade = 'A';
        } else if (score >= 80){
            grade = 'B';
        } else if (score >= 70){
            grade = 'C';
        } else if (score >= 60){
            grade = 'D';
        } else {
            grade = 'F';
        }

        grade = (score > 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';
        System.out.println("grade = " + grade);
    }
}
