package core.JC22_stringClass_stringManipulation_Part_04;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC_isEmpty {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String userName = "";
		String password = "";

		if (userName.isEmpty()) {
			System.out.println("Username field can not be empty");
		} else {
			System.out.println("Username is not empty");
		}

		System.out.println("\n+--------------------------------+\n");

		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password can not be empty");
		} else {
			System.out.println("Username or password not empty");
		}
	}

}
