package oop.JOOP35_Encapsulation;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP04_CarpetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		OOP01_Floor f = new OOP01_Floor(10, 20);
		OOP02_Carpet c = new OOP02_Carpet(5.2);

		// _03_Calculator cal = new _03_Calculator(new _01_Floor(10, 20), new
		// _02_Carpet(5.2));

		OOP03_Calculator cal = new OOP03_Calculator(f, c); // Objects belongs to Floor and Carpet Class.

		System.out.println(cal.getTotalCost());
	}

}
