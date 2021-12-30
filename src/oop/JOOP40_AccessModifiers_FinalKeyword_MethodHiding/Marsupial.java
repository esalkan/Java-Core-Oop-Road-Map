package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Marsupial {
	
	public static boolean isBiped() {
		return false;
	}
	
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on the two legs : " + isBiped());
	}

}
