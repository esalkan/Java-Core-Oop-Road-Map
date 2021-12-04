package oop.day_36_StaticClassMembers;

/**
 * @author esalkan
 *
 */
public class _02_StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Reaching directly static school variable which is assigned before Middle East
		// Technical University
		System.out.println(_01_Student.school.toString());
		
		// Changing Static variable value to AIBU
		String justForPrint = _01_Student.school = "AIBU";
		System.out.println(justForPrint);
		
		_01_Student std1 = new _01_Student("Aslı", 12, 1021);
		_01_Student std2 = new _01_Student("Zümra", 11, 1020);
		_01_Student std3 = new _01_Student("İpek", 6, 1019);
		
		System.out.println(std1.toString());
		System.out.println(std2.toString());
		System.out.println(std3.toString());

	}

}
