package oop.day_36_StaticClassMembers;

/**
 * @author esalkan
 *
 */
public class _07_Calculator {

	int x;

	public static double plus(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}
	
	public static double minus(double num1, double num2) {
		double result = num1 - num2;
		return result;
	}
	
	public static double multiply(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}
	
	public static double divide(double num1, double num2) {
		double result = num1 / num2;
		return result;
	}
	
	public int m1() {
		int result = x+4;
		return result;
	}
}
