package core.JC13_methods_Part_1;
/**
 * @author esalkan
 */
public class JC14_task_60_calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// calculator(int num1,int num2,String operator)
		calculator(6, 3, "+");
		calculator(6, 3, "-");
		calculator(6, 3, "*");
		calculator(6, 3, "/");
	}

	public static void calculator(int num1, int num2, String operator) {
		switch (operator) {
		case "+":
			System.out.println("Addition of num1 and num2 result : " + num1 + num2);
			break;
		case "-":
			System.out.println("Extraction of num1 and num2 result : " + (num1 - num2));
			break;
		case "*":
			System.out.println("Multiplication of num1 and num2 result : " + (num1 * num2));
			break;
		case "/":
			System.out.println("Division of num1 and num2 result : " + (num1 / num2));
			break;
		}
	}
}
