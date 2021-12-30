package oop.JOOP37_Inheritance;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */

// That class extending from Parent Class and it can use the parent class methods and variables
public class OOP02_Student extends OOP01_Person {

	int studentId;
	String termClass;

	public void code(String lang) {

		System.out.println(name + " is coding " + lang);

	}

	public void attendClass() {

		System.out.println(name + " is attending " + termClass + " class");

	}

}
