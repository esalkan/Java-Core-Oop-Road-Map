package core.JC05_unaryAssignmentRelationalLogicalOperators;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC06_assignmentOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// +------------------------------o------------------------------+
		// //
		// Assignment Operators //
		// //
		// NAME SHORTHAND OPERATOR MEANING //
		// Assignment x=y x=y //
		// Addition Assignment x += y x=x+y //
		// Subtraction Assignment x -= y x=x–y //
		// Multiplication Assignment x *= y x=x*y //
		// Division Assignment x /= y x=x/y //
		// Remainder Assignment x %= y x=x%y //
		// //
		// +------------------------------o------------------------------+

		int i = 100;
		System.out.println("int i = " + i);

		i += 1;
		System.out.println("i+=1; " + i);

		i -= 2;
		System.out.println("i-=2; " + i);

		i *= 3;
		System.out.println("i*=3; " + i);

		i /= 4;
		System.out.println("i/=4; " + i);

		i %= 5;
		System.out.println("i%=5; " + i);

	}

}
