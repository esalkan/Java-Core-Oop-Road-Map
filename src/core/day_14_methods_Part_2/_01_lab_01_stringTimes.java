package core.day_14_methods_Part_2;

/**
 * @author esalkan
 */
public class _01_lab_01_stringTimes {

	/*
	 * Write a method that accepts a string and a non-negative number, and prints a
	 * larger string that is number copies of the original String stringTimes("Hi",
	 * 2); = > HiHi stringTimes("Hi", 3); = > HiHiHi stringTimes("Hi", 1); = > Hi
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		stringTimes("Java", 3);
	}

	public static void stringTimes(String string, int number) {
		String str = "";
		for (int i = 0; i < number; i++) {
			str = str + string;
		}
		System.out.println(str);
	}
}
