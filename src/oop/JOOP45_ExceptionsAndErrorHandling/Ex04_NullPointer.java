package oop.JOOP45_ExceptionsAndErrorHandling;

/**
 * @author esalkan
 * @project java-notes
 */
public class Ex04_NullPointer {
    static String name;

    /**
     * @param args
     */
    public static void main(String[] args) {
        try{
            System.out.println(name.toUpperCase());
        } catch (NullPointerException e){
            System.out.println("NullPointerException happened");
            // Output : NullPointerException happened

            System.out.println("Here is the message : " + e.getMessage());
            //  Output : Here is the message : null

            System.out.println("Here is the stack trace : ");
            e.printStackTrace();
            /*
             *  Output :
             *  Here is the stack trace :
             *  java.lang.NullPointerException at oop.JOOP45_ExceptionsAndErrorHandling.Ex04_NullPointer.main(Ex04_NullPointer.java:15)
             */
        }
    }
}
