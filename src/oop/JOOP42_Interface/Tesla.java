package oop.JOOP42_Interface;

/**
 * @author esalkan
 *
 */

/**
 * Implementing Multiple Interfaces • Class can extend only one superclass, but
 * java allows a class to implement multiple interfaces.
 * 
 * • When a class implements multiple interfaces, it must provide the methods
 * specified by all of them
 * 
 * public class MyClass implements Interface1, Interface2, Interface3{
 * 
 * }
 *
 */
// Implementing multiple interfaces...
public class Tesla implements Electric, SelfDriving {

	// We have to impelement firstly unimplemented methods from Parent which is
	// Electric Interface
	@Override
	public void charge() {
	}

	@Override
	public void selfDrive() {
		// TODO Auto-generated method stub

	}

	@Override
	public void charge2() {
		// TODO Auto-generated method stub

	}

}
