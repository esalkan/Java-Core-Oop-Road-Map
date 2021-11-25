package core.reviews.week_08;

/**
 * @author esalkan
 *
 */
public class _04_WrapperClassPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i1 = 100; // i1 primitive
		Integer i2 = new Integer("100"); // i2 is object
		Integer i3 = new Integer(100);
		Integer i4 = Integer.valueOf("100");
		Integer i5 = Integer.valueOf(100);

		// un-boxing, auto-boxing

		// primitive to object : Auto-boxing
		Integer i6 = 100;

		// object to primitive : un-boxing
		int i7 = i3;

		System.out.println("----------------------------");
		String str = "123";

		// parseInt method ---> this one return primitive
		int num = Integer.parseInt(str);
		System.out.println("num : " + num);

		// Integer.valuOf ----> returns object Integer
		Integer num2 = Integer.valueOf(str);
		System.out.println("num2 : " + num2);

		System.out.println(num2.equals(123));
		// System.out.println(num.equals(123)); We can not use primitive to reach
		// Wrapper class methods

	}

}
