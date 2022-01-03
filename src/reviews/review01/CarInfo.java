package reviews.review01;

/**
 * @author esalkan
 * @project java-notes
 */

public class CarInfo {
    public static void main(String[] args) {

        int year = 2021;
        String make = "Audi";
        String model = "Q8";
        String transmission = "Automatic";
        String color = "white\\black";
        int price = 100_000;

        System.out.println(year + " " + make + " " + model + " " + transmission + " "
                + " " + color + " " + price + "Euro");

    }
}