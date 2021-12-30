package oop.JOOP36_StaticClassMembers;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP11_AbcTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		OOP10_Abc.m1();
		OOP10_Abc.m2();

		// _10_Abc obj1 = new _10_Abc(); // The constructor _10_Abc() is not visible //
		// Why? Because it is private
		// abj1.m1(); // Cant reachable any method

		// Whenever all of our methods in our class are static and we want everyone to
		// tall them static way - ClassName.methodName(), then you can simply make our
		// constructor private

	}

}
