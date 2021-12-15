package oop.JOOP33_Class_Objects_Constructors;

/**
 * @author esalkan
 *
 */
public class OOP10_MouseClass {

	int numTeeth;
	int numWhiskers;
	int weight;

	// 1
	public OOP10_MouseClass(int weight) { // i want to call constructor 2
		this(30, weight);
		this.weight = weight;
		System.out.println("Java");
	}

	// 2
	public OOP10_MouseClass(int numTeeth, int weight) { // i want to call constructor 3
		this(numTeeth, 20, weight);
		this.numTeeth = numTeeth;
		this.weight = weight;
		System.out.println("JS");
	}

	// 3
	public OOP10_MouseClass(int numTeeth, int numWhiskers, int weight) {
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
		System.out.println("TS");
	}

	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	}

}
