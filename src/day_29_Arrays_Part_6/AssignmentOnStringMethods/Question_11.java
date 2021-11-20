package day_29_Arrays_Part_6.AssignmentOnStringMethods;

/**
 * @author esalkan
 *
 */
public class Question_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * We have a message variable already declared and assigned value in this format
		 * 
		 * Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming
		 * and problem solving}
		 * 
		 * Declare variables: sender, phoneNumber, messageBody
		 * 
		 * By using String methods: retrieve related information from SMS message string
		 * and assign it to those 3 variables and print each variable in a separate line
		 * 
		 * Sample Output:
		 * 
		 * Sender: Mike Smith
		 * 
		 * Phone Number: 202-123-3456
		 * 
		 * Message body: I love programming and problem solving
		 */

		String[] messages = {
				"Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}" ,"Sender:<Jhon Doe>. From Number:[312-432-5433]. Message:{Why everybody use my namme for their template :)}" };

		for (String message : messages) {
			int sChar1 = message.indexOf("<");
			int sChar2 = message.indexOf(">");
			int pNChar1 = message.indexOf("[");
			int pNChar2 = message.indexOf("]");
			int mBChar1 = message.indexOf("{");
			int mBChar2 = message.indexOf("}");

			String sender = message.substring(sChar1 + 1, sChar2);
			String phoneNumber = message.substring(pNChar1 + 1, pNChar2);
			String messageBody = message.substring(mBChar1 + 1, mBChar2);

			System.out.println("Sender: " + sender);
			System.out.println("Phone Number: " + phoneNumber);
			System.out.println("Message body: " + messageBody);
			System.out.println();
		}
	}

}
