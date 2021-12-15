package oop.JOOP36_StaticClassMembers;

/**
 * @author esalkan
 *
 */
public class OOP08_CalculatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		OOP07_Calculator c1 = new OOP07_Calculator();
		System.out.println("c1.plus(2, 2) result is : " + c1.plus(2, 2));

		int i = Integer.parseInt("54");
		System.out.println(Character.isDigit('4'));

		// 1
		OOP08_CalculatorTest.mA();
		
		// 2
		OOP08_CalculatorTest ct = new OOP08_CalculatorTest();
		ct.mA();
		
		// 3
		mA();
	}

	public static void mA() {
		System.out.println("Hello");
	}

}
