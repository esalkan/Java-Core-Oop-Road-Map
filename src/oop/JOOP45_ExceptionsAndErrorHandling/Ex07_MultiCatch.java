package oop.JOOP45_ExceptionsAndErrorHandling;

import java.beans.ExceptionListener;
import java.io.IOException;
import java.util.InputMismatchException;

/**
 * @author esalkan
 * @project java-notes
 */
public class Ex07_MultiCatch {
    /**
     * Multiple catch Blocks
     * -> In many cases, the code in the try block will be capable of throwing more than one type of exception.
     * In such a case, we need to write a catch clause for each type of exception that could potentially thrown.
     *
     * Rule
     * -> If you are handling multiple exceptions in the same try statement and some exceptions are related to
     * each other through inheritance, then you should handle the more specialized exception classes before the more
     * general exception classes.
     *
     * Example :
     *  Object <-- Throwable <-- Exception <-- RuntimeException <-- IllegalArgumentException <-- NumberFormatException
     */
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Multiple catch Blocks Example

        // Step by step debug it and see the catch block result.
        try {
            // System.out.println(4 / 0);

            // String str = null;
            // System.out.println(str.toUpperCase());

            int[] n = {10, 4};
            System.out.println(n[2]);
        } catch (ArithmeticException a) {
            System.out.println("Arithmetic exception happened");
        } catch (NullPointerException n) {
            System.out.println("NullPointer Exception happened...");
        } catch (RuntimeException r){
            System.out.println("Runtime Exception Happened...");
            r.printStackTrace();
        } catch (Exception e){

        }

        System.out.println("Keep working our code...");

    }
}
