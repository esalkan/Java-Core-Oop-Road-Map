package oop.JOOP33_Class_Objects_Constructors;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP05_StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		OOP06_StudentClass std1 = new OOP06_StudentClass("Alkan", 40, 'M', 1981, "Java");
		OOP06_StudentClass std2 = new OOP06_StudentClass("John", 30, 'M', 1990, "Java");

		System.out.println(std1.name);
		System.out.println(std1.age);
		System.out.println(std1.gender);
		System.out.println(std1.year);
		System.out.println(std1.course);
		System.out.println(std1.university);

		System.out.println();

		System.out.println(std2.name);
		System.out.println(std2.age);
		System.out.println(std2.gender);
		System.out.println(std2.year);
		System.out.println(std2.course);
		System.out.println(std2.university);

		System.out.println();

		std1.attendLab();
		std1.attendLectue();
		std1.submitAssignment();

		System.out.println();

		std2.attendLab();
		std2.attendLectue();

	}

}
