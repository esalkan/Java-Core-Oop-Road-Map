/**
 * 
 */
package core.JC27_Arrays_Part_4;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class JC05_Pizza2DArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[][] pizzas = { { "pineapple", "pepperoni" }, { "anchovies", "mushroom", "olives" }, { "4 Cheese" },
				{ "chicken", "tomatoes", "onions" }, { "green peppers", "zuccini", "brocoli", "spinach", "shripm" } };

		// System.out.println(Arrays.toString(pizzas[0]));

		for (String[] pizza : pizzas) {
			System.out.print(pizza.length + "-");
			System.out.println(Arrays.toString(pizza));
		}

		System.out.println("\n+----- print pizzas with for iterator loop -----+");

		for (int i = 0; i < pizzas.length; i++) {
			for (int j = 0; j < pizzas[i].length; j++) {
				System.out.print(pizzas[i][j] + " - ");
			}
			System.out.println();
		}

		System.out.println("\n+----- pizzas 3th array print -----+");

		for (String pizza : pizzas[3]) {
			System.out.print(pizza + " ");
		}

	}

}
