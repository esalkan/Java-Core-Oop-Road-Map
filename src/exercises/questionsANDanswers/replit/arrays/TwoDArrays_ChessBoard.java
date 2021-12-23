package exercises.questionsANDanswers.replit.arrays;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class TwoDArrays_ChessBoard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Given a 8x8 two-dimensional array of strings named chessboard. Initialize
		 * values inside an array accordingly to the chess board. So first element in
		 * the array, chessboard[0] should have a value "1a", and last element in the
		 * array, chessboard[7] should have a value "8h".
		 */

		String[][] chessBoard = new String[8][8];
		for (int i = 0; i < 8; i++) {
			char letters = 'a';
			for (int j = 0; j < 8; j++) {
				chessBoard[i][j] = "" + (i + 1) + letters;
				letters++;
			}
		}
		System.out.println(Arrays.deepToString(chessBoard));
	}

}
