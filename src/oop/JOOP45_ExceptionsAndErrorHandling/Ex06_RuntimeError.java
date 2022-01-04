package oop.JOOP45_ExceptionsAndErrorHandling;

/**
 * @author esalkan
 * @project java-notes
 */
public class Ex06_RuntimeError {
    /**
     * @param args
     */
    public static void main(String[] args) {
        go();
    }

    public static void go(){
        System.out.println("Going...");
        go(); // recursive
    }

    /**
     * If any exception it is not belong to "Error" and "RuntimeException" Classes
     * these exceptions called checked exception and if it is checked exception we NEED TO HANDLE.
     * how you need to handle ??? Two ways ;
     *      1. Handle: Try-Catch,
     *      2. Declare : throws declaration
     */
}
