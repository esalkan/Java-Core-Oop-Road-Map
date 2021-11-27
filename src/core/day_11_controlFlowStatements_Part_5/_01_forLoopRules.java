package core.day_11_controlFlowStatements_Part_5;

/**
 * @author esalkan
 *
 */
public class _01_forLoopRules {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 1-Creating an infinite loop
		// components of the for loop are each optional

//		for( ; ; ) {
//			System.out.println("Hello");
//		}

		int i = 1;
//		
//		for( ;i<=5;i++) {
//			System.out.println(i);
//		}

		for (;; i++) {
			System.out.println(i);
		}

//		for( ;i<=5;) {
//			System.out.println(i);
//		}

		// 2-Adding Multiple Terms to the for statement

//		int x=0;

//		for(long y=0,z=4 ; x<5 && y<10 ; x++,y++) {

//			System.out.print(y + " ");
//		}

//		System.out.println(x);

		// 3-Redeclaring a variable in the init block

//		int x = 0;
//		for(long y=0,x=4; x<5&&y<10; x++,y++) { //does not compile
//			System.out.println("Hello");
//		} 

//		int x = 0;
//		long y = 0;
//		
//		for(y=1,x=4 ; x<5 && y<10 ; x++,y++) {
//			System.out.println("Hello");
//		}

		// 4-Using incompatible data types in the init block
		// the variables in the init block must all be of the same data type

//		for(long y=0, int x=0; x<5 && y<10 ; x++,y++) {
//			System.out.println("Hello");
//		}

		// 5-Using loop variables outside the loop

//		for(long y=0,x=4; x<5&&y<10; x++,y++) {
//			System.out.println("Hello");
//		}
//		System.out.println(x); //does not compile

	}

}
