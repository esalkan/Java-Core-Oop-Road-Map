package oop.JOOP42_Interface;

/**
 * @author esalkan
 *
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
public class Tesla2 extends Vehicle implements Electric, SelfDriving {

	// After implements Interfaces we have to add unimplemented methods
	
	@Override
	public void selfDrive() {
		System.out.println("Tesla 2 Self driving now...");
	}

	@Override
	public void charge() {
		System.out.println("Tesla 2 is charging now");
	}

	@Override
	public void charge2() {
		System.out.println("Tesla 2 is charging2 method inside now.");
		
	}

	

}
