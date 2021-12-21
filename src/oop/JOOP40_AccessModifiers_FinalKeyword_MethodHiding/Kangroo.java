package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding;

/**
 * @author esalkan
 *
 */
public class Kangroo extends Marsupial{

	// Becarefull Here there is Overriding
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
