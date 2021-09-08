package core.day_02_printingComments;
/**
 * @author esalkan
 *
 */
public class _06_escapeSequences {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * \n = New Line -> Advances the cursor to the next line for subsequent
		 * printing.
		 * 
		 * \t = Horizontal Tab -> Causes the cursor to skip over to the next tab stop.
		 * 
		 * \b = Backspace -> Causes the cursor to back up, or move left, one position.
		 * 
		 * \r = Return -> Causes the cursor to go to the beginning of the current line,
		 * not the next line.
		 * 
		 * \\ = Backslash -> Causes a backslash to be printed.
		 * 
		 * \' = Single quote -> Causes a single quotation mark to be printed.
		 * 
		 * \" = Double quote -> Causes a double quotation mark to be printed.
		 *
		 */

		System.out.println("Learn\tJava\n\tthe\nEasy\tWay\n\n");

		System.out.println("\tLearn Java the \"Easy\" Way!\n");

		System.out.println("\\ // -=- \\ //");

		System.out.println("\\\\ \\\\\\ \\\\\\\\");
	}

}
