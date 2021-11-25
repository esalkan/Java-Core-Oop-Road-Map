package core.day_34_Constructors_PassingObjectsToMethods;

import java.util.Random;

/**
 * @author esalkan
 *
 */
public class _05_Dice {

	int sides;
	int value;

	public _05_Dice(int numSides) {
		sides = numSides;
		roll();
	}

	public void roll() {
		Random rand = new Random();
		value = rand.nextInt(sides) + 1;
	}

	public int getSides() {
		return sides;
	}

	public int getValue() {
		return value;
	}
}
