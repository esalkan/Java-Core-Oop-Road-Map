/**
 * 
 */
package day_04_arithmethicOperators;

/**
 * @author esalkan
 *
 */
public class _02_additionConcat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Number + Number : Addition
		System.out.println("Number + Number : Addition");
		System.out.println("2 + 2 = " + (2+2));
		System.out.println("2 + 200 = " + (2+200));
		
		// Number + String : Concatenation
		System.out.println("\nNumber + String : Concatenation ");
		System.out.println("Hello " + 5);
		
		// String + Boolean : Concatenation
		System.out.println("\nString + Boolean : Concatenation");
		System.out.println(true + "Hello");
		
		// Boolean + Number 
		System.out.println("\nBoolean + Number will not work for addition");
		// System.out.println(true + 1);
		System.out.println("System.out.println(true + 1);");
		
		System.out.println(2+0+3+"Cybertek");
		System.out.println("Cybertek"+2+0+5);
		System.out.println(2+0+5+"Cybertek"+2+0+5);
	}

}
