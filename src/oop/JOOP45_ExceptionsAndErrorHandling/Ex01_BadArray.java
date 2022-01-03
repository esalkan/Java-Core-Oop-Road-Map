package oop.JOOP45_ExceptionsAndErrorHandling;

/**
 * @author esalkan
 * @project java-notes
 */
public class Ex01_BadArray {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};

        for (int i = 0; i <= number.length; i++) {
            System.out.println(number[i]);
        }
        System.out.println("Exceptions and Error Handling");
    }
}
