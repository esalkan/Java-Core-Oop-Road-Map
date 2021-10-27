/**
 * 
 */
package day_05_unaryAssignmentRelationalLogicalOperators;

/**
 * @author esalkan
 *
 */
public class _04_task_20_unaryOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		a =  -a-- + a++ / -a-- * --a;
	

		// a in memory 	=  1 - > 0 - >  0 - > -1
		// result		= -1  +  0  /  -1  *  -1 = -1 + 0 * -1 = -1 + 0 = -1
		
		System.out.println(a);
		
	}

}
