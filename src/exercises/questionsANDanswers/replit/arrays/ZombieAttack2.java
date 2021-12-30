package exercises.questionsANDanswers.replit.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class ZombieAttack2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * An array inhabitants represents cities and their respective populations. For
		 * example, the following arrays shows 8 cities and their respective
		 * populations:
		 * 
		 * [3, 6, 0, 4, 3, 2, 7, 0]
		 * 
		 * Some cities have a population of 0 due to a pandemic zombie disease that is
		 * wiping out the human lives. After each day, any city that is adjacent to a
		 * zombie-ridden city will lose half of its population (City that has a 0
		 * population).
		 * 
		 * Write a program to loop though each city population and make it lose half of
		 * its population if it is adjacent(right or left) to a city with zero people
		 * until all cities have no humans are left.
		 * 
		 * Make updates to each element in the array And print the array like below for
		 * each day:
		 * 
		 * Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
		 * 
		 * Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
		 * 
		 * Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
		 * 
		 * Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
		 * 
		 * Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
		 * 
		 * Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
		 * 
		 * ---- EXTINCT ----
		 * 
		 * Write the program in a way that it will handle any number of people in
		 * cities, above was just an example.
		 */

		Scanner input = new Scanner(System.in);
		int[] inhabitants = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt(), input.nextInt() };

		int j = 0;
		do {
			System.out.println("Day " + j + " " + Arrays.toString(inhabitants));
			j++;
			int sum = 0;
			for (int number : inhabitants) {
				sum += number;
			}
			int[] copyInh = Arrays.copyOf(inhabitants, inhabitants.length);
			if (sum != 0) {
				for (int i = 0; i < inhabitants.length; i++) {
					if (copyInh[i] == 0 && i != 0 && i != inhabitants.length - 1) {
						inhabitants[i - 1] /= 2;
						inhabitants[i + 1] /= 2;
					} else if (copyInh[i] == 0 && i == 0) {
						inhabitants[i + 1] /= 2;
					} else if (copyInh[i] == 0 && i == inhabitants.length - 1) {
						inhabitants[i - 1] /= 2;
					}
				}
			} else {
				break;
			}
		} while (true);
		System.out.println("---- EXTINCT ----");

	}

}
