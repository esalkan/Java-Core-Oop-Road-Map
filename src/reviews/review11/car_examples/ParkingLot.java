package reviews.review11.car_examples;

public class ParkingLot {

	public static void main(String[] args) {
		
	// 	Car car = new Car(); can not instantiate from abstract class
		
		Toyota camry = new Toyota("Camry", "White", 2019);
		
		camry.start();
		System.out.println(camry.toString());
		
		BMW M5 = new BMW("M5", "BMW", "Black", 2021);
		
		M5.start();
		System.out.println(M5);
		
		

	}

}
