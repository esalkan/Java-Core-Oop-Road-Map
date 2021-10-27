/**
 * 
 */
package day_05_unaryAssignmentRelationalLogicalOperators;

/**
 * @author esalkan
 *
 */
public class _07_relationalOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// +------------------------------o------------------------------+
		//																//
		//						Relational Operators					//
		// All relational operators return Boolean(true or false)		//
		//																//
		// 		Description				Operator						//
		//		Greater than				>							//
		//		Greater than or equal		>=							//
		//		Less than					<							//
		//		Less than or equal			<=							//
		//		Equal						==							//
		//		Not equal					!=							//
		//																//
		// +------------------------------o------------------------------+
		
		byte b1 = 1;
		byte b2 = 2;
		double d1 = 3.5;
		int i1 = 17;
		float f1 = 67.0f;
		
		System.out.println("byte b1 = 1;\n"
				+ "byte b2 = 2;\n"
				+ "double d1 = 3.5;\n"
				+ "int i1 = 17;\n"
				+ "float f1 = 67.0f;\n");
		
		
		boolean test1 = b1<b2;
		System.out.println("test1 = b1<b2;\nresult is :" + test1 + "\n");
		
		boolean test2 = b1>b2;
		System.out.println("boolean test2 = b1>b2;\nresult is :" + test2 + "\n");
		
		boolean test3 = d1 != b1;
		System.out.println("test3 = d1 != b1;\nresult is :" + test3 + "\n");
		
		boolean test4 = (i1*d1) >= (f1-42);
		System.out.println("boolean test4 = (i1*d1) >= (f1-42);\nresult is :" + test4 + "\n");
		
		boolean test5 = (6*4) <= (3*8);
		System.out.println("boolean test5 = (6*4) <= (3*8);\nresult is :" + test5 + "\n");
		
		System.out.println("4 <= 212 ? result is : " + (4<=212));
		
		
	}

}
