package oop.day_36_StaticClassMembers;

/**
 * @author esalkan
 *
 */
public class _06_DinnerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		_05_Dinner mom = new _05_Dinner();
		_05_Dinner kid = new _05_Dinner();
		_05_Dinner dad = new _05_Dinner();
		
		System.out.println("Total Slices : " + _05_Dinner.pizzaSlice);
		
		dad.takeASlice();
		kid.takeASlice();
		mom.takeASlice();
		
		System.out.println("After Mom, Dad and Kid take 1 slice, Remain Slices are : " + _05_Dinner.pizzaSlice);
		
		kid.takeASlice(2);
		dad.takeASlice(3);
		
		System.out.println("After kid take 2, dad take 3 slices, Remain Slices are : " + _05_Dinner.pizzaSlice);

	}

}
