package oop.JOOP45_ExceptionsAndErrorHandling;

/**
 * @author esalkan
 * @project java-notes
 */
public class Ex07_MultiCatch {
    /**
     * @param args
     */
    public static void main(String[] args) {
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
        }

        System.out.println("Keep working our code...");
    }
}
