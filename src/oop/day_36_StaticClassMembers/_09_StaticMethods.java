package oop.day_36_StaticClassMembers;

/**
 * @author esalkan
 *
 */
public class _09_StaticMethods {

	static String name = "Alkan";
	int age = 40;

	public static void show1() {
		show4();
		System.out.println(name); // name is static and we can call to static method
		// System.out.println(age); // age is instance variable and we can not call it
		// directly inside the static method

		_09_StaticMethods forTakeAge = new _09_StaticMethods();
		forTakeAge.age = 21;

	}

	public void show2() {
		show1(); // u can call static from instance method
		System.out.println(name); // static instance variable can be called from instance method
		System.out.println(age); // instance variable can be called from instance medhot
	}

	public void show3() {
		show2(); // instance method or variable can be called from instance method or variable
		show1();
		age = 20; // This is instance variable which is created line 10 and we call it
	}

	public static void show4() {

	}

}
