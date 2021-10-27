package day_13_methods_Part_1;

/**
 * @author esalkan
 */
public class _14_task_60_calculator {

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
	
	public static void calculator(int num1,int num2,String operator) {	
		switch(operator) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		}
	}
}
