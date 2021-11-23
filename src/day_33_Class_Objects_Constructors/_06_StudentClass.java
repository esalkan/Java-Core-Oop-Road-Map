package day_33_Class_Objects_Constructors;

/**
 * @author esalkan
 *
 */
public class _06_StudentClass {

	// Define the variables with default values.
	String name; // Default value is : null
	int age; // Default value is : 0
	char gender; // Default value is : 
	int year; // Default value is : 0
	String course; // Default value is : null
	String university = "METU"; // Default value is : METU

	
	// Creating a constructor with parameter type
	public _06_StudentClass(String name, int age, char gender, int year, String course) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
	}
	
	public void attendLectue() {
		System.out.println(this.name + " is attending lecture");
	}
	


	public void submitAssignment() {
		System.out.println(name + " is submitting assignment");
	}
	
	public void attendLab() {
		System.out.println(this.name + " is attending Lab");
	}

}
