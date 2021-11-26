package oop.day_35_Encapsulation;

/**
 * @author esalkan
 *
 */
public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Encapsulation is
		 * 
		 * cut the access - private
		 * 
		 * create setter method to initialize the value
		 * 
		 * create the getter method retrieve it
		 */
		Person alkan = new Person();

		alkan.setAge(40);
		alkan.setGender('M');

		// Printing alkan age
		System.out.println(alkan.getName());
		System.out.println(alkan.getAge());
		System.out.println(alkan.getGender());

	}

}
