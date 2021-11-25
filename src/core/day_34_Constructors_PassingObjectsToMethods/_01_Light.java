package core.day_34_Constructors_PassingObjectsToMethods;

/**
 * @author esalkan
 *
 */
public class _01_Light {

	int noOfWatts;
	boolean indicator;
	String location;

	public _01_Light() {
		this(0, false);
		System.out.println("Returning from no-argument constructor no:1");
	}

	public _01_Light(int watt, boolean ind) {
		this(watt, ind, "Sakarya");
		System.out.println("Returning from constructor no:2");
	}

	public _01_Light(int noOfWatts, boolean indicator, String location) {
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
		System.out.println("Returning from constructor no:3");
	}

}
