package oop.JOOP45_ExceptionsAndErrorHandling;

/**
 * @author esalkan
 * @project java-notes
 */
public class Ex09_OrCatchBlock {

    static String str;

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Handling Multiple Exceptions with One catch Block


        try {
            System.out.println(str.toUpperCase());
        } catch (IllegalArgumentException | NullPointerException e){ // or some more exceptions
            e.printStackTrace();
        }
    }
}
