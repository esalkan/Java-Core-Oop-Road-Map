package core.JC03_variables_dataTypes;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC08_task_08_variablesDataTypes {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * Write a Java Program code for: Assign the value "IN 1491 COLUMBUS SAILED THE
		 * OCEANBLUE" to an appropriate variable, write a program in Java to change the
		 * year in the statement above from 1491 to 1492.
		 *
		 * Bir Java Program kodu yazın: "IN 1491 COLUMBUS SAILED THE OCEANBLUE" değerini uygun bir değişkene atayın,
		 * yukarıdaki ifadede yılı 1491'den 1492'ye değiştirmek için Java'da bir program yazın.
		 */
		int date = 1492;
		String text = "IN " + date + " COLUMBUS SAILED THE OCEANBLUE";

		System.out.println(text);
	}

}
