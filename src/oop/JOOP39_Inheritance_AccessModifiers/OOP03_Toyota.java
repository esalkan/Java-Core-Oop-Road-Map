package oop.JOOP39_Inheritance_AccessModifiers;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP03_Toyota extends OOP02_Car {

	private int roadService;
	
	/*
	 * Parent constructor needs to be call from child class if we not call Toyota class will give error
	 * if we dont need some parameter which is shown in (parameters) we can delete because 
	 * we call super(String name, int size, int wheels, int doors etc...) and assign the value via
	 * hard coded...
	 * 
	public _03_Toyota(String name, int size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size, wheels, doors, gears, isManual);

	}
	*/
	
	
	// This is what i mean above :)
	// As like so we chain constructors via super() :)  
	public OOP03_Toyota(int roadService) {
		super("Toyota", 3, 4, 4, 4, false);
		this.roadService = roadService;
	}

	public void accelerate(int rate) {

		int newVelocity = getCurrentVelocity() + rate;

		if (newVelocity == 0) {
			stop();
			changeGear(1);
		} else if (newVelocity > 0 && newVelocity <= 10) {
			changeGear(1);
		} else if (newVelocity > 10 && newVelocity <= 20) {
			changeGear(2);
		} else if (newVelocity > 20 && newVelocity <= 30) {
			changeGear(3);
		} else {
			changeGear(4);
		}

		if (newVelocity > 0) {
			changeVelocity(newVelocity, getCurrentDriection());
		}
	}
}
