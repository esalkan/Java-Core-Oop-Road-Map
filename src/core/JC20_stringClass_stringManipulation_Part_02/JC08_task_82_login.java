package core.JC20_stringClass_stringManipulation_Part_02;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC08_task_82_login {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Login Functionality Logic
		 * 
		 * UserName, Password
		 * 
		 * --> Program will ask to enter username and password
		 * 
		 * --> If both username and password are blank "UserName and Password Fields
		 * cannot be empty"
		 * 
		 * --> If userName is blank and password is not blank "UserName cannot be empty"
		 * 
		 * --> If userName is not blank and password is blank "Password cannot be empty"
		 * 
		 * --> If the username or password is not valid "UserName or password is not
		 * valid. Please verify"
		 * 
		 * --> If the username and password are both valid "User Logged in successfully"
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter Your 'username' : ");
		String username = sc.nextLine();

		System.out.println("Please Enter Your 'password' : ");
		String password = sc.nextLine();

		String userNameInSystem = "Mike";
		String passwordInSystem = "1234";

		if (username.equals("") && password.equals("")) {
			System.out.println("Username and password fields can not be empty");
		} else if (username.equals("") && !password.equals("")) {
			System.out.println("Username can not be empty");
		} else if (!username.equals("") && password.equals("")) {
			System.out.println("Password can not be empty");
		} else if (!username.equals(userNameInSystem) || !password.equals(passwordInSystem)) {
			System.out.println("Username or password not valid,please verify");
		} else if (username.equals(userNameInSystem) && password.equals(passwordInSystem)) {
			System.out.println("User logged in  successfully");
		}
	}

}
