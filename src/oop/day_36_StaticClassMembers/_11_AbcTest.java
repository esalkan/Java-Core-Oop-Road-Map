package oop.day_36_StaticClassMembers;

/**
 * @author esalkan
 *
 */
public class _11_AbcTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		_10_Abc.m1();
		_10_Abc.m2();

		// _10_Abc obj1 = new _10_Abc(); // The constructor _10_Abc() is not visible //
		// Why? Because it is private
		// abj1.m1(); // Cant reachable any method

		// Whenever all of our methods in our class are static and we want everyone to
		// tall them static way - ClassName.methodName(), then you can simply make our
		// constructor private

	}

}
