package day_16_classObjects;

/**
 * @author esalkan
 */
public class _02_carClass {

	String make;
	String model;
	int currentSpeed;
	String color;

	public void printCarInfo() {

		String info = "Car make[" + make + "],model[" + model + "],color[" + color + "],current speed[" + currentSpeed
				+ "]";

		System.out.println(info);
	}

	public void showCurrentSpeed(int speedLimit) {

		if (currentSpeed <= speedLimit) {
			System.out.println(make + " is driving at " + currentSpeed + " mph,folowing the speed limit-" + speedLimit);
		} else {
			System.out.println(make + " is driving at " + currentSpeed + " mph,over the speed limit-" + speedLimit);
		}

	}

	public void drive() {

		System.out.println(make + " " + model + " is driving...");

	}

	public void accelerate(int mph) {

		currentSpeed = currentSpeed + mph;
	}

}
