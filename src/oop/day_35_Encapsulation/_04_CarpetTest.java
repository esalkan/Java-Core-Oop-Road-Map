package oop.day_35_Encapsulation;

/**
 * @author esalkan
 *
 */
public class _04_CarpetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		_01_Floor f = new _01_Floor(10, 20);
		_02_Carpet c = new _02_Carpet(5.2);

		// _03_Calculator cal = new _03_Calculator(new _01_Floor(10, 20), new
		// _02_Carpet(5.2));

		_03_Calculator cal = new _03_Calculator(f, c); // Objects belongs to Floor and Carpet Class.

		System.out.println(cal.getTotalCost());
	}

}
