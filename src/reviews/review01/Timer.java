package reviews.review01;

import java.util.Scanner;

/**
 * @author esalkan
 * @project java-notes
 */
public class Timer {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the number of minutes");
        int minutes = scan.nextInt();
        scan.close();

        for (int i = minutes; i > 0; --i) {
            if (i < 0) {
                break;
            }
            for (int z = 59; z >= 0; --z) {
                System.out.print("Remaining Time: " + (i - 1) + " minutes and " + z + " seconds left\r");
                Thread.sleep(1000);  // pauses the execution of the code for given milli seconds

            }
        }

        System.out.println("\n\n");

        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t*       Times is Up, Please take your seats!      *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");

    }

}
