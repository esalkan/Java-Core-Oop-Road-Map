package oop.JOOP39_Inheritance_AccessModifiers;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP04_ToyotaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		OOP03_Toyota toyota = new OOP03_Toyota(36);
		
		toyota.steer(40);
		System.out.println();
		toyota.accelerate(30);
		System.out.println();
		toyota.accelerate(20);
		
	}

}
