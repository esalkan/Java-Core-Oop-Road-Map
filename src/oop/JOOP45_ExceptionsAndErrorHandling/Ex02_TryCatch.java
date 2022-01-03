package oop.JOOP45_ExceptionsAndErrorHandling;

/**
 * @author esalkan
 * @project java-notes
 */
public class Ex02_TryCatch {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * Error Handling meaning; there is a code and giving error, I wrote the exception and jvm is not stop
         * just print the error message and keep running the code.
         */
        try {
            String str = "JAVA";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(5)); // Error will catch here.
            System.out.println(str.charAt(1)); // will not execute.
        } catch (Exception e) {
            System.out.println("Exception happen in try block was cought");
        }

        System.out.println("After try catch block");


    }
}