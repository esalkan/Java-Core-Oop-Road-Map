package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding;

/**
 * ...:: Hiding Variables ::...
 * 
• Variable hiding happens when we define a variable with the same name as a variable in a parent class.

• This creates 2 copies of the variable within an instance of the child class: one instance defined for the parent reference and another defined for the child reference.

• If you are referencing the variable from within the parent class, the variable defined in the parent class is used.

• If you are referencing the the variable from within the child class, the variable defined in the child class is used.
 */

/**
 * @author esalkan
 *
 */
public class VariableHidingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Point is : We can not override the instance variables. Just we can hide them.
		Mouse mouse = new Mouse();

		// That method will go to parent class and get the value from there.
		mouse.getRodentDetails();

		// That method will go to child class which is Mouse. it will take value from
		// this class instance variable.
		mouse.getMouseDetails();

		/**
		 * 
		 * This codes in the Mouse Class. To see the difference just remove
		 * super.tailLength and write just tailLength it will write just Mouse class
		 * inside which is assigned and declared 8 instance variable value but if we use
		 * super.tailLength it will retrive the value from parent class. which is
		 * assigned 4
		 * 
		 * public void getMouseDetails() {
		 * 
		 * System.out.println("tail : " + tailLength + ", parentTail : " +
		 * super.tailLength);
		 * 
		 * }
		 */

	}

}
