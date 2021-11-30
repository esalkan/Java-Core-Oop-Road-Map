package oop.day_37_Inheritance;

/**
 * @author esalkan
 *
 */

// That class extending from Parent Class and it can use the parent class methods and variables
public class _02_Student extends _01_Person{
	
	int studentId;
	String termClass;
	
	public void code(String lang) {
		System.out.println(name + " is coding " + lang);
	}
	
	public void attendClass() {
		System.out.println(name + " is attending " + termClass + " class");
	}
}
