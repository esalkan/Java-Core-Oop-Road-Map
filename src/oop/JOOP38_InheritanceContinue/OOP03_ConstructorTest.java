package oop.JOOP38_InheritanceContinue;

/**
 * @author esalkan
 *
 */
public class OOP03_ConstructorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * In an inheritance relationship, the superclass constructor always executes
		 * before the subclass constructor.
		 * 
		 * Thats why firstly SuperClass constructor will run firstly and then after sub
		 * class constructor will start
		 * 
		 * Output:
		 * 
		 * This is the super class Constructur
		 * 
		 * This is the subclass constructor
		 */

		// When creating an object from SubClass if it is extends from
		// SuperClass(Parent) firstly Parent will start. if subclass constructor created
		// With super class constructor, firstly superclass(parent) constructor will
		// start then Subclass will start.
		
		OOP02_SubClass obj = new OOP02_SubClass();
	}

}
