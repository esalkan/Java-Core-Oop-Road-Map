package core.reviews.week_01;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class _06_primitivesReview {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaring and initializing

		byte num1 = 123;
		short num2 = 12398;
		int distance = 123123123;
		long distanceMore = 123123123123L;

		System.out.println(distanceMore);

		System.out.println("---------------------------------------");

		float rate = 1000.5F;
		double d1 = 123.6;

		num2 = (short) rate; // explicit casting

		System.out.println(num2);

		System.out.println("---------------------------------------");

		char ch1 = 'A';
		char ch2 = '%';

		System.out.println(ch1);
		System.out.println(ch2);

		System.out.println(ch1 + ch2); // A% 65 + 37 = 102
		// acts like addition

		System.out.println("-------------------------------------------");

		boolean isEmployed = true;
		boolean isMarried = true;
		boolean r1 = false;
		boolean r2 = true; //
		System.out.println(r1);
		System.out.println(r2);

		System.out.println("-------------------------------------------");

		String name = "EU7"; // collection of Chars

		String sentence = " is doing GREAT JOB ! ";

		System.out.println(name + sentence + r2); // not addition -- concatination

	}

}
