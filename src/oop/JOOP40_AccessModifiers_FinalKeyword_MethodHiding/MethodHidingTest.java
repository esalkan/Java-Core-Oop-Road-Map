package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class MethodHidingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * ...:: Hiding Static Methods ::...
		 * 
		 * • We can not override static methods; we can hide them.
		 * 
		 * • A hidden method occurs when a child class defines a static method with the
		 * same name and signature as a static method defined in a parent class.
		 * 
		 * • Method hiding is similar but not exactly the same as method overriding.
		 * 
		 * • The four rules for overriding a method must be followed when a method is
		 * hidden. In addition, a new rule is added for hiding a method, namely that the
		 * usage of the static keyword must be the same between parent and child
		 * classes.
		 * 
		 * ...:: Hiding Static Methods ::...
		 * 
		 * 1. The method in the child class must have the same signature as the method
		 * in the parent class
		 * 
		 * 2. The method in the child class must be at least as accessible or more
		 * accessible than the method in the parent class
		 * 
		 * 3. The method in the child class may not throw a checked exception that is
		 * new or broader than the class of any exception thrown in the parent class
		 * method.
		 * 
		 * 4. If the method returns a value, it must be the same or a subclass of the
		 * method in the parent class, known as covariant return types.
		 * 
		 * 5. The method defined in the child class must be marked as static if it is
		 * marked as static in the parent class (method hiding). Likewise, the method
		 * must not be marked as static in the child class if it is not marked as static
		 * in the parent class (method overriding)
		 */

	}

}

class Bear {
	public static void eat() {
		System.out.println("Bear is eating");
	}

	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}

	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
}

// This class extends from Bear Class.
class Panda extends Bear {
	/**
	 * 5. The method defined in the child class must be marked as static if it is
	 * marked as static in the parent class (method hiding). Likewise, the method
	 * must not be marked as static in the child class if it is not marked as static
	 * in the parent class (method overriding)
	 */
	// This is not overriding. This is hiding. Static is hide the method.
	public static void eat() {
		System.out.println("Panda is eating");
	}

	/**
	 * Parent sneeze() method is static. and child must be static too. thats why
	 * this method is in Child complain and giving error. OR opposite way. if child
	 * is static parent must me statil as well too. This is important.
	 */
	/*
	 * public void sneeze() { System.out.println("Panda is sneezing"); }
	 */

	/**
	 * Child and Parent : public Child and Parent : return type "void" Child and
	 * Parent : have same method name Child and Parent : have not any parameter
	 * accepting
	 * 
	 * 4 rules are done. that means it is method OVERRIDING. if you look to the left
	 * side you will see green arrow which is shown up.
	 */
	public void hibernate() {
		System.out.println("Panda is hibernating");
	}
}
