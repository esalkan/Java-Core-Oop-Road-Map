/**
 * 
 */
package core.JC19_stringClass_stringManipulation_Part_01;

/**
 * @author esalkan
 *
 */
public class JC05_task_77_EmojiProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Create a emoji program: 1- Check if emoji has 2 characters. If it is
		 * not,print “invalid emoji” 2- Valid emojis: Starting with : = > :) Smile, :(
		 * Sad, :/ Upset, :p Playful, Otherwise invalid Starting with ; = > ;) Wink, ;0
		 * Surprised, Otherwise invalid
		 */

		String emoji = "=C";
		// Check if it has 2 characters.
		if (emoji.length() == 2) {
			if (emoji.charAt(0) == ':') {
				if (emoji.charAt(1) == ')') {
					System.out.println("Smile");
				} else if (emoji.charAt(1) == '(') {
					System.out.println("Sad");
				} else if (emoji.charAt(1) == '/') {
					System.out.println("Upset");
				} else if (emoji.charAt(1) == 'p') {
					System.out.println("Playful");
				} else {
					System.out.println("Invalid Emoji");
				}
			} else if (emoji.charAt(0) == ';') {
				if (emoji.charAt(1) == ')') {
					System.out.println("Wink");
				} else if (emoji.charAt(1) == '0') {
					System.out.println("Suprised");
				} else {
					System.out.println("Invalid Emoji");
				}
			} else {
				System.out.println("Invalid Emoji");
			}
		}

	}

}
