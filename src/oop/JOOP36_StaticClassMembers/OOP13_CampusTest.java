package oop.JOOP36_StaticClassMembers;

/**
 * @author esalkan
 *
 */
public class OOP13_CampusTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OOP12_Campus c1 = new OOP12_Campus("Metu");
		
		System.out.println("----");
		
		OOP12_Campus c2 = new OOP12_Campus("Itu");
		
		
		System.out.println("_12_Campus.country : " + OOP12_Campus.country);
		// System.out.println(_12_Campus.city); // city is private
		
		c1.setCity("Ankara");
		
		System.out.println("c1.setCity(\"Ankara\") after assign result is c1.getCity() : " + c1.getCity());
		
		

	}

}
