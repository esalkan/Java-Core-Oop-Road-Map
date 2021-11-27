/**
 * 
 */
package core.day_26_Arrays_Part_3A;

/**
 * @author esalkan
 *
 */
public class _08_Array2D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] scores = new int[3][4];
		
		System.out.println(scores);
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);

		System.out.println();
		
		scores[0][0] = 10;
		scores[0][1] = 20;
		scores[0][2] = 30;
		scores[0][3] = 40;
		
		scores[1][0] = 11;
		scores[1][1] = 22;
		scores[1][2] = 33;
		scores[1][3] = 44;
		
		scores[2][0] = 44;
		scores[2][1] = 33;
		scores[2][2] = 22;
		scores[2][3] = 11;
		
		
		
		// print first row 
		System.out.print(scores[0][0] + " ");
		System.out.print(scores[0][1] + " ");
		System.out.print(scores[0][2] + " ");
		System.out.print(scores[0][3] + " ");
		
		System.out.println();
		
		// print second row
		System.out.print(scores[1][0] + " ");
		System.out.print(scores[1][1] + " ");
		System.out.print(scores[1][2] + " ");
		System.out.print(scores[1][3] + " ");
		
		System.out.println();
		
		// print third row
		System.out.print(scores[2][0] + " ");
		System.out.print(scores[2][1] + " ");
		System.out.print(scores[2][2] + " ");
		System.out.print(scores[2][3] + " ");
				
		
	
	}

}
