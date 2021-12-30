package oop.JOOP37_Inheritance;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP03_Employee extends OOP01_Person {

	String jobTitle;

	public void work() {

		System.out.println(name + " is working as " + jobTitle);

	}

	@Override
	public String toString() {

		return "Employee [jobTitle=" + jobTitle + " , name=" + name + ", age=" + age + ", gender=" + gender + "]";

	}

}
