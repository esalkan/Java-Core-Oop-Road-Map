package core.reviews.week_07;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class _03_ArraysLoopWithConditions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[] prices = { 22.9, 12.4, 43.12, 65.0, 150.9, 100.87, 90.5, 124.9, 234.56 };

		// we put a dummy variable with the same type
		for (double price : prices) {
			System.out.println(price);
		}

		// first condition: you want to print out prices over 100
		System.out.println("----prices over 100------");
		for (double price : prices) {
			if (price > 100) {
				System.out.println(price);
			}
		}

		// second condition: print the prices between 40 - 150
		// We have Arrays class that comes with some ready methods to implement
		Arrays.sort(prices);
		// System.out.println(Arrays.toString(prices));
		System.out.println("----second condition----");
		for (double each : prices) {
			if (each > 40 && each < 150) {
				System.out.println(each);
			}
		}

		// third condition: count the prices which are more than 60, result count
		System.out.println("-----count the prices which are more than 60------");
		int count = 0;
		for (double eachPrice : prices) {
			if (eachPrice > 60) {
				count++;
				;
			}
		}

		System.out.println(count);

	}

}
