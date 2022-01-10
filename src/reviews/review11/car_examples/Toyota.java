package reviews.review11.car_examples;

public class Toyota extends Car {

	public Toyota(String model, String color, int year) {
		super(model, color, year);
		super.make = "Toyota";
	}

	@Override
	public void start() {
		
		System.out.println("Twist the key to ignite");
		
	}

	
	

}
