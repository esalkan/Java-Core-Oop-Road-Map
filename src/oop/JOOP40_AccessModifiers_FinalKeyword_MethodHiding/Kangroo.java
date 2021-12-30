package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Kangroo extends Marsupial{

	// Careful Here there is Overriding
	/*
	@Override
	public boolean isBiped() {
		return true;
	}
	*/
	
	public static boolean isBiped() {
		return true;
	}
	
	public void getKangrooDescription() {
		System.out.println("Kangroo hops on two legs : " + isBiped());
	}
}
