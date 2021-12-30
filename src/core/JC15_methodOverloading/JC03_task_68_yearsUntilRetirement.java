package core.JC15_methodOverloading;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC03_task_68_yearsUntilRetirement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Write two methods:
		// 1- calculateAge(yearBirth); and returns the age
		// 2- yearsUntilRetirement(name,year); and displays in the console following :
		// "ALKAN retires in 36 years"
		// Example : yearsUntilRetirement("ALKAN", 1990);

		yearsUntilRetirement("ALKAN", 1981);

	}

	private static int calculateAge(int yearBirth) {

		int result = 2021 - yearBirth;
		return result;
		// return 2021-yearBirth;

	}

	private static void yearsUntilRetirement(String name, int year) {
		int retirementAge = 65 - calculateAge(year);
		System.out.println(name + " retires in " + retirementAge + " years ");
	}

}
