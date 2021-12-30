package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
final public class FinalMethods {

	/**
	 * final methods
	 * 
	 * • When a method is declared with final keyword, it is called final method.
	 * 
	 * • A final method can not be overridden.
	 */
	// if we chance the "public void method1() to final public void method1()", line
	// 36 will complain. if our method is assigned final it CANNOT @Override
	public void method1() {
		System.out.println("Method - 1");
	}

	public static void staticMethod(String word) {
		System.out.println("Static Method");
	}

}

/**
 * TO SEE ERROR REMOVE THE COMMENT FROM "class Sub extends FinalMethods"
 */

// We can create different classes inside the same java class file. Point is Top class SHOULD be PUBLIC
// Now we extend Sub class from FinalMethods Class. Making Interitance. It is Now inherited.
/* class Sub extends FinalMethods {

	// This method is Overrided. If go anc check FinalMethods Class above. same
	// method same name we will find. We can understand it left side green arrow
	// which is show the up. it mean this is overrirded.
	@Override // @Override : it is annotation.
	public void method1() {
		System.out.println("Method - 1 in sub class");
	}

	public static void staticMethod(String word) {
		System.out.println("Static Method in Sub Class");
	}

}
*/
