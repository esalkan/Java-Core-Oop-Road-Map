package core.reviews.week_08;

/**
 * @author esalkan
 *
 */
public class ConstructorsPractice {
	/*
	 * no paramater constructor one arg with int constructor one arg with string
	 * constructor
	 */

	public ConstructorsPractice() {
		this(10);
		System.out.println("a");
	}

	public ConstructorsPractice(int num) { // call no arg constructor from here

		System.out.println("b");
	}

	public ConstructorsPractice(String str) {
		this();
		System.out.println("c");
	}

	public static void main(String[] args) {

		new ConstructorsPractice("hello"); // I am creating an object, I am calling constructor

	}
}
