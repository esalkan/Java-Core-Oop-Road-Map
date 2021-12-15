package core.JC16_classObjects;

/**
 * @author esalkan
 */
public class JC06_dogObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JC01_dogClass dog1 = new JC01_dogClass();

		JC01_dogClass dog2 = new JC01_dogClass();

		JC01_dogClass dog3 = new JC01_dogClass();

		dog1.age = 10;
		dog1.color = "Red";
		dog1.breed = "Maltese";
		dog1.name = "Rover";

		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog1.breed);

		dog1.barking();
		dog1.hungry();
		dog1.sleeping();

	}

}
