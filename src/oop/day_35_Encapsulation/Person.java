package oop.day_35_Encapsulation;

/**
 * @author esalkan
 *
 */
public class Person {

	private String name;
	private int age;
	private char gender;

	// Creating a Setter age
	public void setAge(int age) {
		this.age = age;
	}

	// Creating a Getter for age
	public int getAge() {
		return age;
	}

	// Creating a Setter for name
	public void setName(String name) {
		this.name = name;
	}

	// Creating a Getter for name
	public String getName() {
		return name;
	}

	// Creating a Setter for gender
	public void setGender(char gender) {
		this.gender = gender;
	}

	// Creating a Getter for gender
	public char getGender() {
		return gender;
	}
}
