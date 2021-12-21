package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding;

/**
 * @author esalkan
 *
 */
public class MethodHidingTestKangroo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Kangroo k = new Kangroo();
		// Here we call from Child Class which is Kangroo from Parent Class which is
		// Marsupial getMarsupialDescription() 
		k.getMarsupialDescription();
		
		k.getKangrooDescription();

	}

}
