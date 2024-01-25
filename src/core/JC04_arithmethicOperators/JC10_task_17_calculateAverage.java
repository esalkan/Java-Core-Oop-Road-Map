package core.JC04_arithmethicOperators;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC10_task_17_calculateAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
		// Sayıların ortalamasını hesaplamak ve yazdırmak için üç sayıyı girdi olarak alan bir Java programı yazın.

		double average;
		int num1, num2, num3;
		num1 = 15;
		num2 = 30;
		num3 = 50;

		average = (num1 + num2 + num3) / 3;
		System.out.println("Number 1 is : " + num1);
		System.out.println("Number 2 is : " + num2);
		System.out.println("Number 3 is : " + num3);
		System.out.println("Average of the 3 number is :" + average);
	}

}
