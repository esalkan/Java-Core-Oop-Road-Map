package oop.day_36_StaticClassMembers;

/**
 * @author esalkan
 *
 */
public class _01_Student {

	// Instanvce Variables
	String name;
	int age;
	int idNumber;

	// A static variable
	static String school = "Middle East Technical University";

	// Constructor with parameter
	public _01_Student(String name, int age, int idNumber) {
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
	}

	@Override
	public String toString() {
		return "_01_Student [name=" + name + ", age=" + age + ", idNumber=" + idNumber + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
