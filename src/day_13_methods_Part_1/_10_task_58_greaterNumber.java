package day_13_methods_Part_1;

/**
 * @author esalkan
 */
public class _10_task_58_greaterNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		findGreater();
	}
	
	public static void findGreater() {
		int num1=50;
		int num2=10;
		if(num1>num2) {
			System.out.println("num1 is greater");
		}else if(num2>num1) {
			System.out.println("num2 is greater");
		}else {
			System.out.println("numbers are equal");
		}
	}
}
