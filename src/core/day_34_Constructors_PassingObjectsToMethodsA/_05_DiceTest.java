package core.day_34_Constructors_PassingObjectsToMethodsA;

/**
 * @author esalkan
 *
 */
public class _05_DiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final int SIX_SIDES = 6;
		
		_05_Dice sixDice = new _05_Dice(SIX_SIDES);
		
		rollDice(sixDice);
	}
	
	public static void rollDice(_05_Dice d) {
		
		System.out.println("Rolling a " + d.getSides() + " sided dice.");
		
		
		System.out.println("The dice value " + d.getValue());
	}

}
