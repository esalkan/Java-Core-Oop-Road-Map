package oop.JOOP38_InheritanceContinue;

/**
 * @author esalkan
 *
 */
public class OOP18_Student extends OOP17_Person {

	@Override
	public void message() {
		System.out.println("This is student class");
	}

	void display() {
		// This method calling from _18_Student Class
		message();

		// This method calling from _17_Person Parent Class
		super.message();
	}
}
