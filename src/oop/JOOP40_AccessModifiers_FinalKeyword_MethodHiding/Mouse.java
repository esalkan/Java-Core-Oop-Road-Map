package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Mouse extends Rodent{
	
	protected int tailLength = 8;
	
	// if we use super.tailLength it will retrive the value from parent class.
	public void getMouseDetails() {
		System.out.println("tail : " + tailLength + ", parentTail : " + super.tailLength);
	}

}
