package oop.JOOP45_ExceptionsAndErrorHandling;

/**
 * @author esalkan
 * @project java-notes
 */
public class Ex08_CheckedVsUnChecked {
    /**
     * @param args
     */
    public static void main(String[] args) /* throws InterruptedException */ { // 2. Throws Declaration
        // Checked Exception : Need to handle to compile.
        // 1. way Try-Catch block
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
