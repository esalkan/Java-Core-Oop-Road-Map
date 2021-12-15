package oop.JOOP38_InheritanceContinue;

/**
 * @author esalkan
 *
 */

// _08_StaticSub is in a relationship with _07_StaticSuper
public class OOP08_StaticSub extends OOP07_StaticSuper {

	// Creating a method
	public void print() {
		// _07_StaticSuper is parent and _08_StaticSub is extended from it. thats whw we
		// can use in here it static instance variables.
		System.out.println(num);
	}
}
