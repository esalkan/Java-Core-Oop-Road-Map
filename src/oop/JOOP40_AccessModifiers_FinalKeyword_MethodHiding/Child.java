package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding;

/**
 * @author esalkan
 *
 */
public class Child extends Parent {

	/**
	 * ...:: Inheriting Variables ::...
	 * 
	 * • We can not override instance variables; we can hide them.
	 * 
	 * ...:: Hiding Variables ::...
	 * 
	 * • Variable hiding happens when we define a variable with the same name as a
	 * variable in a parent class.
	 * 
	 * • This creates 2 copies of the variable within an instance of the child
	 * class: one instance defined for the parent reference and another defined for
	 * the child reference.
	 * 
	 * • If you are referencing the variable from within the parent class, the
	 * variable defined in the parent class is used.
	 * 
	 * • If you are referencing the the variable from within the child class, the
	 * variable defined in the child class is used.
	 */
	public int x = 200;

}
