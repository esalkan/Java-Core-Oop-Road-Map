package core.JC13_methods_Part_1;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC10_task_58_greaterNumber {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		findGreater();
	}

	public static void findGreater() {
		int num1 = 50;
		int num2 = 10;
		if (num1 > num2) {
			System.out.println("num1 is greater");
		} else if (num2 > num1) {
			System.out.println("num2 is greater");
		} else {
			System.out.println("numbers are equal");
		}
	}
}
