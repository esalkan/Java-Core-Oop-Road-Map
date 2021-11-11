/**
 * 
 */
package day_26_Arrays_Part_3;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class _06_task_93_HowManyWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * “As he crossed toward the pharmacy at the corner he involuntarily turned his
		 * head because of a burst of light that had ricocheted from his temple, and
		 * saw, with that quick smile with which we greet a rainbow or a rose, a
		 * blindingly white parallelogram of sky being unloaded from the van—a dresser
		 * with mirrors across which, as across a cinema screen, passed a flawlessly
		 * clear reflection of boughs sliding and swaying not arboreally, but with a
		 * human vacillation, produced by the nature of those who were carrying this
		 * sky, these boughs, this gliding façade.”
		 * 
		 * 
		 * Find how many words have above text.
		 * 
		 */

		String str = "As he crossed toward the pharmacy at the corner he involuntarily turned his head because of a burst of light that had ricocheted from his temple, and saw, with that quick smile with which we greet a rainbow or a rose, a blindingly white parallelogram of sky being unloaded from the van—a dresser with mirrors across which, as across a cinema screen, passed a flawlessly clear reflection of boughs sliding and swaying not arboreally, but with a human vacillation, produced by the nature of those who were carrying this sky, these boughs, this gliding façade.";

		String[] splt = str.split(" ");
		
		System.out.println("The number of words after the string is split. : " + splt.length);
		
		System.out.println(Arrays.toString(splt));
		
		System.out.println(splt[40]);
		
	}

}
