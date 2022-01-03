package reviews.review02;

import java.util.Scanner;

/**
 * @author esalkan
 * @project java-notes
 */
public class SwitchInTestersLife {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Browser Type to Automate");
        String browser = input.next();
        switch (browser) {
            case ("chrome"):
                System.out.println("Doing chrome automation");
                break;
            case ("firefox"):
                System.out.println("Doing firefox automation");
                break;
            default:
                System.out.println("wrong entry");
        }
    }
}
