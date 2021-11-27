package core.reviewsA.week_03;

/**
 * @author esalkan
 */
public class _01_ternaryExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 10000;
		int biggerNumber;
		
	//	if (num1>num2) {
	//		biggerNumber = num1;
	//	} else {
	//		biggerNumber = num2;
	//	}
		
		biggerNumber = (num1>num2) ? num1 : num2;
		
		System.out.println(biggerNumber);
	}

}
