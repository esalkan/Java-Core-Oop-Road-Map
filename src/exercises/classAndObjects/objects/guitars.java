package exercises.classAndObjects.objects;


// Importing our class from different package
// This class created in different package
import exercises.classAndObjects.classes.guitar;

/**
 * @author esalkan
 */
public class guitars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			guitar gtr1 = new guitar();
			
			gtr1.type = "Bass";
			gtr1.color = "Brown";
			gtr1.frets = 21;
			gtr1.keyboard = "Mahony";
			
			
			gtr1.guitarColor();
			gtr1.guitarType();
			gtr1.guitarFrets();
			gtr1.keyboardType();
			gtr1.guitarBody();
			gtr1.guitarSrings();
	}

}
