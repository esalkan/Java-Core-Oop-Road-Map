package day_13_methods_Part_1;

/**
 * @author esalkan
 */
public class _05_loopCallMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hello from the main method");
		for(int i=0;i<5;i++) {
			displayMessage();
			System.out.println("Back in the main method");
		}
	
	}
	

	public static void displayMessage() {
		   System.out.println("Hello from displayMessage() method");
	}
}
