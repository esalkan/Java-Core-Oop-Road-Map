package oop.JOOP41_Abstraction.Practice;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Iphone extends Phone {

	@Override
	public void call() {
		// Code
	}

	/*
	 * That implementation will give error because text() Method is not in Phone
	 * Abstract class. it is in MobilePhone abstract class method.
	 * 
	 * @Override public void text(){ //code }
	 * 
	 */
}
