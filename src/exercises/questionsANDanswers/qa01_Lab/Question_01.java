package exercises.questionsANDanswers.qa01_Lab;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_01 {

	/**
	 * QUESTION 1 :
	 * 
	 * Write a method that accepts a string and a non-negative number, and prints a
	 * larger string that is number copies of the original String
	 * 
	 * stringTimes("Hi", 2); = > HiHi stringTimes("Hi", 3); = > HiHiHi
	 * stringTimes("Hi", 1); = > Hi
	 * 
	 */

	public static void main(String[] args) {
		stringTimes("Hi", 20);
		System.out.println();
		stringTimes("Hi", 15);
		System.out.println();
		stringTimes("Hi", 10);
	}

	public static void stringTimes(String message, int multipler) {
		for (int i = 1; i <= multipler; i++) {
			System.out.print("No : " + i + " " + message + ", ");
		}
	}
}
