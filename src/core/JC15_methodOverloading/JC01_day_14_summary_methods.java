package core.JC15_methodOverloading;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC01_day_14_summary_methods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// No-Parameter Method
		System.out.println("// No-Parameter Method\nnonParameterMethod();\n");
		nonParameterMethod();

		System.out.println("\n+----------------------------+\n");

		// Parameter Method
		System.out.println("// Parameter Method\nparameterMethod(0, null);\n");
		parameterMethod(0, null);
		parameterMethod(6, "parameterMethod");

		// We Can not use Local to method variables
		// System.out.println(sum);
		// int x = sum + 10;

		System.out.println("\n+----------------------------+\n");

		// Value-Return Method
		System.out.println("// Value-Return Method\n");
		valueReturnMethod(6, "Apple"); // holding return value
		System.out.println();
		int x = valueReturnMethod(6, "Apple") + 5;
		System.out.println(x);
		System.out.println();
		System.out.println(valueReturnMethod(4, "Apple"));
		System.out.println();
		int y = valueReturnMethod(6, "Apple") % 2;
		if (y == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

	// No-Parameter Method
	public static void nonParameterMethod() {
		System.out.println("Hello");
	}

	// Parameter Method
	public static void parameterMethod(int n1, String str) {
		int sum = 4 + n1; // local to method
		System.out.println(sum + ", " + str);
	}

	// Value-Return Method
	public static int valueReturnMethod(int n1, String str) {
		System.out.println(str);
		int sum = 4 + n1; // local to method
		return sum;
	}

}
