package oop.JOOP36_StaticClassMembers;

/**
 * @author esalkan
 *
 */
public class OOP06_DinnerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		OOP05_Dinner mom = new OOP05_Dinner();
		OOP05_Dinner kid = new OOP05_Dinner();
		OOP05_Dinner dad = new OOP05_Dinner();
		
		System.out.println("Total Slices : " + OOP05_Dinner.pizzaSlice);
		
		dad.takeASlice();
		kid.takeASlice();
		mom.takeASlice();
		
		System.out.println("After Mom, Dad and Kid take 1 slice, Remain Slices are : " + OOP05_Dinner.pizzaSlice);
		
		kid.takeASlice(2);
		dad.takeASlice(3);
		
		System.out.println("After kid take 2, dad take 3 slices, Remain Slices are : " + OOP05_Dinner.pizzaSlice);

	}

}
