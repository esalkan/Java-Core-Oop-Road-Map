package oop.JOOP38_InheritanceContinue;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP09_StaticTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating an object from _08_StaticSub Class Constructor
		OOP08_StaticSub obj = new OOP08_StaticSub();

		// Reaching the 'public static num' instance variable from _07_StaticSuper Class
		// Constructor and assign it a value.
		obj.num = 5;

		// Reaching print() Method from _08_StaticSub
		obj.print();

		// _08_StaticSub not have num variable. but _08_StaticSub is in a relationship
		// with _07_StaticSuper and that num is come from there and that num is public
		// static created
		System.out.println(OOP08_StaticSub.num);

		// m1() Method is public static thats why it is reachable
		OOP08_StaticSub.m1();

		// m2() Method is just public not static thats why we can not reach to it.
		// _07_StaticSub.m2();

		// From SubClass we can reach m2() method because it is extends from superclass
		obj.m2();
	}

}
