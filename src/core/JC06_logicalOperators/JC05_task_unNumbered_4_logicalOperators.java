package core.JC06_logicalOperators;

/**
 * @author esalkan
 *
 */
public class JC05_task_unNumbered_4_logicalOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare the variables
		boolean x = true, z = true;
		// Assign the value
		int y = 20;
		// Change the variable "x" Value
		// (True) || (False) = True
		x = (y != 10) || (z = false);

		System.out.println("// Declare the variables\n" + "boolean x = true, z = true;\n\n" + "// Assing the value\n"
				+ "int y = 20;\n\n" + "//  Change the variable \"x\" Value\n" + "x = (y!=10) || (z=false);\n"
				+ "//  (True)  || (False)  = True\n" + "");

		System.out.println("Result is : " + x);

	}

}
