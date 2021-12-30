package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class TestParentChild {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Start that probram with debug mode and see whats happening.

		// Creating an object from Child Class
		Child c = new Child();

		// Printing the value of x, Which object created from Child class.
		System.out.println("Variable of Child Class x before increment : " + c.x);

		// Calling method from Child class object which is created. But Child Class dont
		// have any increment() method. Child class is extended from Parent Class. and
		// compiler will go to Parent class. for find the method.
		c.increment(); // This method is inside the Parent Class

		// Compiler will go to Parent class will find the increment() method it will
		// increase the instance variable which is assigned and declerated in parent.
		// But it will hide it and print which is called above with Child Class created
		// new object with c
		System.out.println("Variable of Child Class x After increment : " + c.x);
		
		
		// Inspect belov code to understand difference between above. How it is hide the variable.
		Parent p = new Parent();
		System.out.println("Variable of Parent Class x before increment : " + p.x);
		p.increment();
		System.out.println("Variable of Parent Class x After increment : " + p.x);
		
		

	}

}
