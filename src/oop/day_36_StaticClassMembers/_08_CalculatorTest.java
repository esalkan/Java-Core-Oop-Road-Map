package oop.day_36_StaticClassMembers;

/**
 * @author esalkan
 *
 */
public class _08_CalculatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		_07_Calculator c1 = new _07_Calculator();
		System.out.println("c1.plus(2, 2) result is : " + c1.plus(2, 2));

		int i = Integer.parseInt("54");
		System.out.println(Character.isDigit('4'));

		// 1
		_08_CalculatorTest.mA();
		
		// 2
		_08_CalculatorTest ct = new _08_CalculatorTest();
		ct.mA();
		
		// 3
		mA();
	}

	public static void mA() {
		System.out.println("Hello");
	}

}
