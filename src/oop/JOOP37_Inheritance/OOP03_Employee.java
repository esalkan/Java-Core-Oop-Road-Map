package oop.JOOP37_Inheritance;

/**
 * @author esalkan
 *
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
