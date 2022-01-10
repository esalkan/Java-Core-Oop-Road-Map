package reviews.review11.car_examples;

public abstract class Car extends Object{
	
	public String model,make,color;
	public int year;
	
	
	
	public Car(String model, String color, int year) {
		this.model = model;
		this.color = color;
		this.year = year;
	}



	public abstract void start();



	
	public String toString() {
		return "Car [model=" + model + ", make=" + make + ", color=" + color + ", year=" + year + "]";
	}
	
	
	

}
