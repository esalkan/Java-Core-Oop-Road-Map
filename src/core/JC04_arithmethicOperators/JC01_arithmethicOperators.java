package core.JC04_arithmethicOperators;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC01_arithmethicOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Addition Operator +
		System.out.println("Addition = " + (55 + 5));
		int chairs = 140;

		System.out.println("chairs = " + chairs + 2);

		int moreChairs = chairs + 5;
		System.out.println("More Chairs = " + moreChairs);

		int tables = 130;
		int total = tables + chairs;
		System.out.println("Total = " + total);

		// Subtraction -
		double balance = 1200.50;
		double transaction = 56.44;
		System.out.println("Balance is = " + (balance - transaction));
		balance = balance - transaction;
		System.out.println("Balance is = " + balance);

		/*
		 * 
		 * Create a variable linesOfCode and assign 50 and print "Lines of code 50"
		 * delete 2 lines decrease the value of linesOfCode by 2 and print
		 * "Lines of code 48"
		 * 
		 */

		int linesOfCode = 50;
		System.out.println("Lines of Code " + linesOfCode);

		linesOfCode = linesOfCode - 2;
		System.out.println("Lines of Code " + linesOfCode);

		// Multiplication *
		System.out.println("22 x 2  = " + (22 * 2));

		int classes = 5;
		System.out.println("linesOfCode x classes = " + linesOfCode * classes);
		int totalLinesOfCode = linesOfCode + classes;
		System.out.println("Total Lines Of Codes = " + totalLinesOfCode);
	}

}
