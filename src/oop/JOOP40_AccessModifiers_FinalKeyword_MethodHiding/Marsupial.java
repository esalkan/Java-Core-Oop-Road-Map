package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding;

/**
 * @author esalkan
 *
 */
public class Marsupial {
	
	public static boolean isBiped() {
		return false;
	}
	
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on the two legs : " + isBiped());
	}

}
