package core.reviews.week_03;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class customMethod {
	public static void main(String[] args) {

		System.out.println(getAgeInDays(10) + " Days old. ");

		System.out.println(getAgeInDaysWithMSG(10));
	}

	public static int getAgeInDays(int years) {

		// int days = years * 365;

		return years * 365;
	}

	public static String getAgeInDaysWithMSG(int years) {

		return (years * 365) + " Days old.";

	}
}
