package core.reviews.week_08;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Item {
	/*
	 * attributes : name, unitPrice, quantity
	 * 
	 * add a constructor to initiliaze all fields
	 * 
	 * toString() calCost(): calculates total price: unitPrice*quantity
	 */

	String name;
	double unitPrice;
	int quantity;

	public Item(String name, double unitPrice, int quantity) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public String toString() {
		return "Item [name=" + name + ", unitPrice=" + unitPrice + ", quantity=" + quantity + "]";
	}

	public double calCost() {

		return unitPrice * quantity;
	}

}
