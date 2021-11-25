package assignments.Core.lab_01;

/**
 * @author esalkan
 */
public class Question_03 {

	/**
	 * QUESTION 3 :
	 * 
	 * We'll say a number is special if it is a multiple of 11 or if it is one more
	 * than a multiple of 11. Write a method that accepts a number and prints true
	 * if the given number is special.
	 * 
	 * specialEleven(22) → true specialEleven(23) → true specialEleven(24) → false
	 * 
	 */

	public static void main(String[] args) {
		specialEleven(154);
		specialEleven(155);
		specialEleven(88);
		specialEleven(17);
		specialEleven(8);
	}

	public static void specialEleven(int number) {
		if (number % 11 == 0 || number % 11 == 0 + 1) {
			System.out.println("specialEleven(" + number + "); → true");
		} else {
			System.out.println("specialEleven(" + number + "); → false");
		}
	}
}
