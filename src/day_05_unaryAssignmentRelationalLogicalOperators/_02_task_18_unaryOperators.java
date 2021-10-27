/**
 * 
 */
package day_05_unaryAssignmentRelationalLogicalOperators;

/**
 * @author esalkan
 *
 */
public class _02_task_18_unaryOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variable "x" declarated and data type defined and value assigned
		int x = 2;
		// Variable "y" declarated and data type defined and "x" assigned 
		// to the "y"
		int y = x++;
		
		// all above 2 process happen step by step on the same line and  
		// variable "x" value is not change
		System.out.println("These 2 Steps in different line");
		System.out.println("\tint x = 2\n" + "\tint y = x++\n" + "\tfor y result is : " + y);

		System.out.println("\n+------------------------------o------------------------------+\n");

		// on "y" variable "x" increased and already placed in memory and below 
		// written increased value 
		System.out.println("This prosses in same line");
		System.out.println("\tint x = 2\n" + "\tfor x result is : " + x++);
		
		System.out.println("\n+------------------------------o------------------------------+\n");

		// Variable "x1" declerated and data type defined and value assigned
		int x1 = 2;
		// x1 value is decreased in memory and written from memory value
		System.out.println("This prosses in same line");
		System.out.println("\tx1 = 2;\n\tfor x result is : " + --x1);
		
		System.out.println("\n+------------------------------o------------------------------+\n");

		// Variable "x2" declarated and data type defined and value assigned
		int x2 = 8;
		// Variable "y2" declarated and data type defined and "x" assigned 
		// to the "y2"
		int y2 = x2--;
		
		// all above 2 process happen step by step on the same line and  
		// variable "y" it means "x2" value is not change
		System.out.println("These 2 Steps in different line");
		System.out.println("\tint x2 = 8\n" + "\tint y2 = x2--\n"+  "\tfor x result is : " + y2);
	}

}
