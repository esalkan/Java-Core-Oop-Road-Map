package reviews.review01;

import java.util.Scanner;

/**
 * @author esalkan
 * @project java-notes
 */
public class ScannerExample {
    public static void main(String[] args) {
        // output console
        System.out.println("Output");

        //input from console: we use Scanner class and object we created that class
        // 1. create your scanner object
        Scanner input = new Scanner(System.in);

        // 2. prompt user
        System.out.println("Put your name: ");

        //3. get the input
        String name = input.next(); // nextInt(), nextDouble()

        //4. Use the value you got
        System.out.println("your name is: " + name);


    }
}
