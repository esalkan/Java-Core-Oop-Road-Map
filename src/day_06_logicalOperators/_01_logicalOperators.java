/**
 * 
 */
package day_06_logicalOperators;

/**
 * @author esalkan
 *
 */
public class _01_logicalOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
		//\\																//\\
		//\\					Logical Operators							//\\
		//\\																//\\
		//\\	OPERATOR				DESCRIPTION							//\\
		//\\		&					Logical "AND"						//\\
		//\\		&& 					Bitwise logical "AND"				//\\
		//\\		|					Logical "OR"						//\\
		//\\		||					Bitwise Logical Inclusive "OR" 		//\\
		//\\		^					Bitwise Logical Exlusive  "OR"		//\\
		//\\																//\\
		//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
	
		//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
		//\\																//\\
		//\\   Truth table for &&(logical AND) and &(Bitwise Logical AND)   //\\
		//\\																//\\
		//\\	Expression 1		Expression2		Returned Value			//\\
		//\\		False	 <-->		False	=		False				//\\
		//\\		False	 <-->		True	=		False				//\\
		//\\		True	 <-->		False	=		False				//\\
		//\\		True	 <-->		True	=		True				//\\
		//\\																//\\
		//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
		/* Difference between & and && 
		 * 		--> && operator supports short-circuit evaluations 
		 * 			but & operator does not.
		 * 		--> If the first operand to && operator evaluates to false, 
		 * 			the result can never be true, hence && does not evaluate 
		 * 			the second operand.
		 * 		--> But & operator evaluates both the operands before 
		 * 			returning an answer.
		 */
		//
		// Examples
		
		char c1 = 'A';
		char c2 = 65;
		int i1 = 5;
		int i2 = 10;
		
		System.out.println("+----------------------------o----------------------------+");
		
		System.out.println("Source Values & Variables;\nchar c1 = 'A';\n"
				+ "char c2 = 65;\n"
				+ "int i1 = 5;\n"
				+ "int i2 = 10;");
		System.out.println("+----------------------------o----------------------------+");
		
		System.out.println("\n& EXAMPLES ;\n");
		// False & False = False
		boolean res1 = (i1 == i2) & (c1 == c2); 
		System.out.println("Example 1 ;\nboolean res1 = (i1 == i2) & (c1 == c2); // False & False = False\nResult is : " + res1 + "\n");

		// False & True = False
		boolean res2 = (c1 == c2) & (i1 > i2) ; 
		System.out.println("Example 2 ;\nboolean res2 = (c1 == c2) & (i1 > i2) ; // False & True = False\nResult is :" + res2 + "\n");
		
		// True & False = True
		boolean res3 = (i1 < i2) & (c1 == c2); 
		System.out.println("Example 3 ;\nboolean res3 = (i1 == i2) & (c1 == c2); // True & False = False\nResult is : " + res3 + "\n");
		
		// True & True = True
		boolean res4 = (i2 > i1) & (i1 < c2);
		System.out.println("Example 4 ;\nboolean res4 = (i2 > i1) & (i1 < c2); // True & True = True\nResult is : " +  res4 + "\n");
		
		System.out.println("+----------------------------o----------------------------+");

		System.out.println("&& EXAMPLES ;\n");
		// False & False = False
		boolean res5 = (i1 == i2) && (c1 == c2); 
		System.out.println("Example 1 ;\nboolean res5 = (i1 == i2) && (c1 == c2); // False & False = False\nResult is : " + res5 + "\n");

		// False & True = True
		boolean res6 = (c1 == c2) && (i2 > i1) ; 
		System.out.println("Example 2 ;\nboolean res6 = (c1 == c2) && (i2 > i1) ; // False & True = True\nResult is :" + res6 + "\n");
		
		// True & False = True
		boolean res7 = (i1 < i2) && (c1 == c2); 
		System.out.println("Example 3 ;\nboolean res7 = (i1 == i2) && (c1 == c2); // True & False = False\nResult is : " + res7 + "\n");
		
		// True & True = True
		boolean res8 = (i2 > i1) & (i1 < c2);
		System.out.println("Example 4 ;\nboolean res8 = (i2 > i1) && (i1 < c2); // True & True = True\nResult is : " +  res8 + "\n");
		
		
		
		
		//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
		//\\																//\\
		//\\   Truth table for ||(logical OR) and |(Bitwise Logical OR)     //\\
		//\\																//\\
		//\\	Expression 1		Expression2		Returned Value			//\\
		//\\		False	  <-->		False	=		False				//\\
		//\\		False	  <--> 		True	=		True				//\\
		//\\		True	  <-->		False	=		True				//\\
		//\\		True	  <-->		True	=		True				//\\
		//\\																//\\
		//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
		/* Difference between | and || 
		 * 		--> || operator supports short-circuit evaluations but 
		 * 			| operator does not.
		 * 		--> If the first operand to || operator evaluates to true, 
		 * 			the result can never be false, hence || does not evaluate 
		 * 			the second operand.
		 * 		--> But | operator evaluates both the operands before returning 
		 * 			an answer.
		 */
		
		System.out.println("+----------------------------o----------------------------+");
		
		System.out.println("Source Values & Variables;\nchar c1 = 'A';\n"
				+ "char c2 = 65;\n"
				+ "int i1 = 5;\n"
				+ "int i2 = 10;");
		System.out.println("+----------------------------o----------------------------+");
		
		System.out.println("\n| EXAMPLES ;\n");
		// False | False = False
		boolean res9 = (i1 == i2) | (c1 == i2); 
		System.out.println("Example 1 ;\nboolean res9 = (i1 == i2) | (c1 == i2); // False | False = False\nResult is : " + res9 + "\n");

		// False | True = False
		boolean res10 = (c1 == c2) | (i1 > i2) ; 
		System.out.println("Example 2 ;\nboolean res10 = (c1 == c2) | (i1 > i2) ; // False | True = False\nResult is :" + res10 + "\n");
		
		// True | False = True
		boolean res11 = (i1 < i2) | (c1 == c2); 
		System.out.println("Example 3 ;\nboolean res11 = (i1 == i2) | (c1 == c2); // True | False = True\nResult is : " + res11 + "\n");
		
		// True | True = True
		boolean res12 = (i2 > i1) | (i1 < c2);
		System.out.println("Example 4 ;\nboolean res12 = (i2 > i1) | (i1 < c2); // True | True = True\nResult is : " +  res12 + "\n");
		
		System.out.println("+----------------------------o----------------------------+");

		System.out.println("|| EXAMPLES ;\n");
		// False || False = False
		boolean res13 = (i1 == i2) || (c1 == c2); 
		System.out.println("Example 1 ;\nboolean res13 = (i1 == i2) || (c1 == c2); // False || False = False\nResult is : " + res13 + "\n");

		// False || True = True
		boolean res14 = (c1 == c2) || (i2 > i1) ; 
		System.out.println("Example 2 ;\nboolean res14 = (c1 == c2) || (i2 > i1) ; // False || True = True\nResult is :" + res14 + "\n");

		// True || False = True
		boolean res15 = (i1 < i2) || (c1 == c2); 
		System.out.println("Example 3 ;\nboolean res15 = (i1 == i2) || (c1 == c2); // True || False = False\nResult is : " + res15 + "\n");
		
		// True || True = True
		boolean res16 = (i2 > i1) || (i1 < c2);
		System.out.println("Example 4 ;\nboolean res16 = (i2 > i1) || (i1 < c2); // True || True = True\nResult is : " +  res16 + "\n");
		
		
		
		
		//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
		//\\																//\\
		//\\   					Logical NOT Operator "!"     				//\\
		//\\																//\\
		//\\				Expression			Returned Value				//\\
		//\\					False				True					//\\
		//\\					True				False					//\\
		//\\																//\\
		//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
		
		
		
		//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
		//\\																//\\
		//\\   		Truth table for ^( Bitwise Logical Exclusive OR)	    //\\
		//\\																//\\
		//\\	Expression 1		Expression2		Returned Value			//\\
		//\\		False				False			False				//\\
		//\\		False				True			True				//\\
		//\\		True				False			True				//\\
		//\\		True				True			False				//\\
		//\\																//\\
		//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
		/*^(bitwise logical exclusive OR)
		 * 		--> The result of a bitwise logical exclusive OR operation is 
		 * 			true, if and only if one operand is true and the other 
		 * 			is false
		 * 		
		 * 		--> Note that both operands must always be evaluated in order 
		 * 			to calculate the result of a bitwise logical exclusive OR
		 */
		System.out.println("+----------------------------o----------------------------+");
		System.out.println("\n^ EXAMPLES ;\n");
		int num1 = 5;
		int num2 = 10;
		char ch1 = 'A';
		char ch2 = 65;
		
		System.out.println("Source Values and Variables;\nint num1 = 5;\n"
				+ "int num2 = 10;\n"
				+ "char ch1 = 'A';\n"
				+ "char ch2 = 65;\n");
		
		// False ^ False = False 
		boolean resu17 = (ch1 < ch2)^(num1>num2); 
		System.out.println("Example 1;\nboolean resu17 = (ch1 < ch2)^(num1 > num2); // False ^ False = False\nResult is : "+ resu17 + "\n");
		
		// False ^ True = True
		boolean resu18 = (ch1 < ch2)^(num1 < num2);  
		System.out.println("Example 2;\nboolean resu18 = (ch1 < ch2)^(num1 < num2); // False ^ True = True\nResult is : "+ resu18 + "\n");
		
		// True ^ False = True
		boolean resu19 = (ch1 == ch2)^(num1 > num2);  
		System.out.println("Example 2;\nboolean resu19 = (ch1 == ch2)^(num1 > num2); // True ^ False = True\nResult is : "+ resu19 + "\n");
		
		// True ^ True = False
		boolean resu20 = (ch1 == ch2)^(num1 < num2);  
		System.out.println("Example 2;\nboolean resu20 = (ch1 == ch2)^(num1 < num2); // True ^ True = False\nResult is : "+ resu20  + "\n");
		
		//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
		//\\																//\\
		//\\   				 Logical Operator Precedence	 				//\\
		//\\																//\\
		//\\	The operators at the top of the table have higher			//\\
		//\\	precedence than the ones below them							//\\
		//\\																//\\
		//\\	Precedence of logical operators (highest to lowest)			//\\
		//\\		Highest Precedence			!							//\\
		//\\									&&							//\\
		//\\		Lowest Precedence			||							//\\
		//\\																//\\
		//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
		
		
		// Precedence of all Operators
		// Order of Precedence	|	Operators			|  Description
		//		1				|	-(unary negation) !	|  Unary negation, 
		//												   logical NOT
		
		//		2				|		*/%				|  Multiplication, 
		//												   division, modulus
		// 		3				|		+-				|  Addition, subtraction
		//		4						< > <= >=		|  Less than, 
		//												|  Greater than, 
		//												|  Less than or Equal to, 
		//												|  Greater than or equal to
		//		5				|		== !=			|  Equal to, 
		// 												|  not equal to
		//		6				|		&&				|  Logical AND
		//		7				|		||				|  Logical OR
		//		8				|	= += -= *= /= %=	|  Assignment and 
		//												|  combined assignments
		
		
	}

}
