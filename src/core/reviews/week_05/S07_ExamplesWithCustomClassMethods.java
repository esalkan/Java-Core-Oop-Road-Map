package core.reviews.week_05;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class S07_ExamplesWithCustomClassMethods {
	public static void main(String[] args) {
		S06_StringCustomMethods methods = new S06_StringCustomMethods();

		methods.setStr("JAVA");
		System.out.println(methods.reverse());

		methods.str = "Oscar";
		System.out.println(methods.reverse());

		methods.setStr("");
		System.out.println(methods.reverse());

		System.out.println("------Palindrom-----");

		methods.setStr("   Madam   ");
		System.out.println(methods.isPalindrome());

	}

}
