package oop.day_39_Inheritance_AccessModifiers;

/**
 * @author esalkan
 *
 */
public class _01_Vehicle {

	// Encapsulation : Data Hiding, private variables, public getter and setter
	// methods.
	private String name;
	private String size;
	private int currentVelocity;
	private int currentDirection;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getCurrentVelocity() {
		return currentVelocity;
	}

	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}

}
