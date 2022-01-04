package oop.JOOP45_ExceptionsAndErrorHandling;

import java.util.Arrays;

/**
 * @author esalkan
 * @project java-notes
 */
public class Ex03_TryCatch2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {54,344,61};
        // System.out.println(nums{0]); // Compile time error, Syntax error.

        try{
            System.out.println(nums[6]);
        } catch (Exception e){
            // System.out.println("Wrong index");
            // System.out.println(Arrays.toString(e.getStackTrace()));
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }


        try{
            int j = 100;
            int n = j / 0;
        } catch (/*Exception*/ ArithmeticException e){
            // That above Exception which is in comment block, coming from ArithmeticException Class,
            // and we can write directly to place of Exception ArithmeticException too
            e.printStackTrace(); // printing stack trace error (yığın izleme)
            System.out.println(e.getMessage());
        }
    }
}
