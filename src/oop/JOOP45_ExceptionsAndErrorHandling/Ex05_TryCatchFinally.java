package oop.JOOP45_ExceptionsAndErrorHandling;

/**
 * @author esalkan
 * @project java-notes
 */
public class Ex05_TryCatchFinally {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String str = "Selenium";

        try {
            System.out.println(str.length());
            System.out.println(str.charAt(2));
        } catch (Exception e){
            System.out.println("Enter Correct Index Number");
        } finally {
            System.out.println("Finally Block");
        }

        System.out.println("Bye...");
    }
}
