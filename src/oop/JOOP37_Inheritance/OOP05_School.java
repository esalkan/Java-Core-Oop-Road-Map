package oop.JOOP37_Inheritance;

/**
 * @author esalkan
 *
 */
public class OOP05_School {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		OOP01_Person person = new OOP01_Person();

		person.name = "Ildus";
		person.age = 40;
		person.gender = 'M';

		OOP02_Student student = new OOP02_Student();
		student.name = "Akbar"; // Assign Akbar to name variable in person class. Where is this name variable?
								// what is object? Student - belongs to Student Class
		student.age = 25;
		student.gender = 'M';
		student.studentId = 1312312;

	}

}
