package assignments.assignment_5_forLoop;

/**
 * @author esalkan
 */
public class Question_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//	Print following chessboard using nested for loops.
		//	W B W B W B W B
		//	B W B W B W B W
		//	W B W B W B W B
		//	B W B W B W B W
		//	W B W B W B W B
		//	B W B W B W B W
		//	W B W B W B W B
		//	B W B W B W B W
		//
		//	NOTE:
		//	1. Total 8 rows and 8 columns.
		//	2. "W" and "B" are in alternate positions (row-wise or column-wise), 
		//		you will not find consecutive W or B.
		
		for (int row = 1; row <= 8; row++) {
			// if the row number is odd
			if (row%2==1) {
				for (int i = 1; i <= 8; i++) {
					if (i%2==1) {
						System.out.print("W");
					} else {
						System.out.print("B");
					}
					System.out.print(" ");
				}
			}else {
				// if the row number is even
				for (int i = 1; i <= 8; i++) {
					if (i%2==1) {
						System.out.print("B");
					} else {
						System.out.print("W");
					}
					System.out.print(" ");
				}
			}
			
			
			System.out.println();
		}
	}

}
