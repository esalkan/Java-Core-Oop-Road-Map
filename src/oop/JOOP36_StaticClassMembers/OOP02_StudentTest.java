package oop.JOOP36_StaticClassMembers;

/**
 * @author esalkan
 *
 */
public class OOP02_StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Reaching directly static school variable which is assigned before Middle East
		// Technical University
		System.out.println(OOP01_Student.school.toString());
		
		// Changing Static variable value to AIBU
		String justForPrint = OOP01_Student.school = "AIBU";
		System.out.println(justForPrint);
		
		OOP01_Student std1 = new OOP01_Student("Aslı", 12, 1021);
		OOP01_Student std2 = new OOP01_Student("Zümra", 11, 1020);
		OOP01_Student std3 = new OOP01_Student("İpek", 6, 1019);
		
		System.out.println(std1.toString());
		System.out.println(std2.toString());
		System.out.println(std3.toString());

	}

}
