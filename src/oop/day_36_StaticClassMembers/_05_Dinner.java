package oop.day_36_StaticClassMembers;

/**
 * @author esalkan
 *
 */
public class _05_Dinner {

	static int pizzaSlice = 8;
	
	public void takeASlice() {
		pizzaSlice--;
	}
	
	public void takeASlice(int count) {
		pizzaSlice -= count;
	}
}
