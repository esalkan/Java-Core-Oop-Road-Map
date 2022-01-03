import java.util.*;

/**
 * @author esalkan
 * @TODO: 01.01.2022 : Work smart
 * @plan test the world
 */

public class NewYear {
    public static void main(String[] args) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int newYear = 2022;
        if (year == newYear){
            System.out.println("Happy new Year DEVELOPERS :)");
        } else {
            System.out.println("Bye 2021");
        }
    }
}
