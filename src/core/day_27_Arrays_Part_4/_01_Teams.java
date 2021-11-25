/**
 * 
 */
package core.day_27_Arrays_Part_4;

/**
 * @author esalkan
 *
 */
public class _01_Teams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating 2D Array
		// Assume that; we have 2 teams and each teams have 4 players inside

		String[][] teams = new String[2][4];

		teams[0][0] = "Ronaldo";
		teams[0][1] = "Maradona";
		teams[0][2] = "Pele";
		teams[0][3] = "Iguita";

		teams[1][0] = "Hagi";
		teams[1][1] = "Messi";
		teams[1][2] = "Zidane";
		teams[1][3] = "Ronaldinho";

		System.out.println("First player of first team : ");
		System.out.println(teams[0][0]);

		System.out.println();

		System.out.println("Number of Teams : " + teams.length);
		System.out.println("Number of First Team Players : " + teams[0].length);
		System.out.println("Number of Second Team Players : " + teams[1].length);

	}

}
