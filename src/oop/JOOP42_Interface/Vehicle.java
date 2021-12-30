package oop.JOOP42_Interface;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */

/**
 * Implementing Interface
 * 
 * • A class can extends another class and implements interface(s) same time.
 * 
 * • If a class both extend a class and implement an interface, extends should
 * come first then implements keyword.
 * 
 * public class Student extends Person implements Teachable, Dreamer{
 * 
 * }
 *
 */
public class Vehicle {
	
	public void drive() {
		System.out.println("Whicle is driving...");
	}

}
