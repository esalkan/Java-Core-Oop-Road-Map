package oop.JOOP34_Constructors_PassingObjectsToMethods;

/**
 * @author esalkan
 *
 */
public class OOP05_DiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final int SIX_SIDES = 6;

		OOP05_Dice sixDice = new OOP05_Dice(SIX_SIDES);

		rollDice(sixDice);
	}

	public static void rollDice(OOP05_Dice d) {

		System.out.println("Rolling a " + d.getSides() + " sided dice.");

		System.out.println("The dice value " + d.getValue());
	}

}
