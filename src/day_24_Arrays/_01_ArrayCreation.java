/**
 * 
 */
package day_24_Arrays;

/**
 * @author esalkan
 *
 */
public class _01_ArrayCreation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int score1 = 80;
		int score2 = 85;
		int score3 = 90;
		int score4 = 100;
		int score5 = 85;
		// ......
		// ......
		int score100 = 90;
		
		int avgScore = (score1 + score2 + score3 + score4 + score5) / 5;
		System.out.println(avgScore);
		
		int[] scores = new int[5];
		scores[0]=80;
		scores[1]=85;
		scores[2]=90;
		scores[3]=100;
		scores[4]=50;
		
		System.out.println("Index 0 : " + scores[0]);
		System.out.println("Index 1 : " + scores[1]);
		System.out.println("Index 2 : " + scores[2]);
		System.out.println("Index 3 : " + scores[3]);
		System.out.println("Index 4 : " + scores[4]);
		
		int avgScore2 = (scores[0] + scores[1] + scores[2] + scores[3] + scores[4]) / 2;
		System.out.println("Avg : " + avgScore2);
	}

}
