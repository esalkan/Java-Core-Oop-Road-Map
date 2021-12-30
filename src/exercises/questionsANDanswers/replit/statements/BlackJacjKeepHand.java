package exercises.questionsANDanswers.replit.statements;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class BlackJacjKeepHand {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// In blackjack after the player asks to keep the house 4 things may happen.

		// if the card total is bigger then 21 the player busts.
		// if the house score is bigger then the player, the player loses .
		// if the player score is equal to the house then they are a draw.
		// if the player score is bigger then the house the player wins.
		// player and house scores are represented by player and house int variables.
		//
		// check them using ifs to determine the result.
		//
		// Example:
		//
		// input:
		// 8
		// 21
		//
		// output: player win
		//
		// input:
		// 10

		// DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
		// Variables are already declared and given
		Scanner s = new Scanner(System.in);

		int house = s.nextInt();
		int player = s.nextInt();

		// Write your code here:

		if (player > house) {
			System.out.println("player win");
		} else if (player < house) {
			System.out.println("player loss ");
		} else if (player == house) {
			System.out.println("its a tie");
		} else {
			System.out.println("player bust\n");
		}
	}

}
