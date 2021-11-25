package core.day_07_controlFlowStatements_if_ifElse_Part_1;

/**
 * @author esalkan
 *
 */
public class _11_task_28_ifStatement2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Revenue can be calculated as the selling price of the product
		// times the quantity sold, i.e. revenue = price x quantity.
		// Write a program that asks the user to enter product price and
		// quantity and then calculate the revenue. If the revenue is more
		// than 5000 a discount is %10 offered.
		// Program should display the discount and net revenue.

		double price = 1250;
		int quantity = 20;

		double revenue;
		double discount = 0;

		revenue = price * quantity;

		if (revenue > 5000) {

			discount = revenue * 0.10;
			revenue = revenue - discount;

		}

		System.out.println("Discount : " + discount);
		System.out.println("Net Revenue is : " + revenue);

	}

}
