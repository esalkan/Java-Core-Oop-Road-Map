package core.JC05_unaryAssignmentRelationalLogicalOperators;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC01_unaryOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// + --> Unary Plus Operator --> Indicates positive value
		int i1 = +10;
		int i2 = -100;
		int i3 = -(i1 + i2);

		System.out.println("Sources values : \n" + "int i1 = +10;\n" + "int i2 = -100;\n" + "int i3 = -(i1+i2);\n");

		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3 + "\n");

		System.out.println("\n+------------------------------o------------------------------+\n");

		// ! --> Logical Complement Operator --> Inverts the value of a boolean
		boolean flag = true;
		System.out.println("! --> Logical Complement Operator --> Inverts the value of a boolean");
		System.out.println("boolean flag = true; \nresult is : " + !flag);

		System.out.println("\n+------------------------------o------------------------------+\n");

		// The difference between Pre and Post
		// --> Pre-Increment/Pre-Decrement: When the operator is placed before
		// an operand (++expr, --expr), the variable will be incremented or
		// decremented by 1 in the memory, and the new value is used in the
		// expression in which it appears.

		// --> Post-Increment/Post-Decrement: When the operator is placed
		// after an operand(expr++,expr--), the old value of the variable
		// will be used in the expression where it appears and then the
		// variable will be incremented or decremented by 1 in the memory.

		// ++ --> Increment Operator --> Increments a value by 1
		// -- --> Decrement Operator --> Decrements a value by 1
		int postInc = 10, postDec = 5;
		int preInc = 10, preDec = 5;

		// num1++; // same as num1 = num1 + 1;
		// --num2; // same as num2 = num2 - 1;

		System.out.println("Source variables and values :\n" + "int postInc = 10, postDec = 5;\n"
				+ "int preInc = 10, preDec = 5;\n");

		// Post increment
		System.out.println("POST-INCREMENT");
		System.out
				.println("int postInc = 10;\nPrint it to terminal and incremented in memory result is : " + postInc++);
		System.out.println(
				"After incremented postInc variable value came from memory and result is  : " + postInc + "\n");

		// Post Decrement
		System.out.println("POST-DECREMENT");
		System.out.println("int postDec = 5;\nPrint it to terminal and decrementd in memory result is : " + postDec--);
		System.out.println(
				"After decremented postDec variable value came from memory and result is  : " + postDec + "\n");

		// Pre-increment
		System.out.println("PRE-INCREMENT");
		System.out.println("int preInc = 10;\nFirstly increment it in memory and Print it to terminal result is : "
				+ ++preInc + "\n");

		// Pre-Decrement
		System.out.println("PRE-DECREMENT");
		System.out.println("int pretDec = 5;\nFirstly decrement it in memory and Print it to terminal result is : "
				+ --preDec + "\n");

		System.out.println("\n+------------------------------o------------------------------+\n");

		int i = 11;
		int j = 4;
		int res = i++ + --j;
		System.out.println("Just For Fun Question and it is so nice :\n" + " int i = 11;\n" + " int j = 4;\n"
				+ " int res = i++ + --j;\n");
		System.out.println("res = " + res);
		System.out.println("How it Happen : \n" + "\tres	= 11 + 3\n" + "\ti\t= 11 -> 12\n" + "\tj\t=  4 ->  3\n");
	}

}
