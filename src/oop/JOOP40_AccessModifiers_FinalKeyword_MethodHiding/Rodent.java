package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Rodent {
	
	protected int tailLength = 4;
	
	public void getRodentDetails() {
		System.out.println("parentTail : " + tailLength);
	}

}
